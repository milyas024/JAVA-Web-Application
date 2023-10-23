/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.menu;

import com.ablamc.reports.DbUtils;
import com.ablamc.entity.MenuData;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuElement;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author wasim.abbas
 */
@SessionScoped
@ManagedBean
public class MenuBean {

    private DbUtils dbUtils = new DbUtils();
    List<MenuData> listMenudata;
//    private DefaultSubMenu subMenu;
//    DefaultMenuModel model;
    private MenuModel menuModel;
    
    private Map<String, MenuElement> mapArborescence;
    private String urlString = "reports/mainPage.xhtml";
    private String usrname;

   
    private MenuModel menu = new DefaultMenuModel();

	public MenuBean(){
            try {
                System.out.println("================ menu bean ===================");
                int usrid = Integer.valueOf(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("UserId").toString());
                 usrname = String.valueOf(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("UserName").toString());
                 System.out.println("================ username ==================="+usrname);
                listMenudata = dbUtils.MenuQuery(usrid);
                DefaultSubMenu subMenu = new DefaultSubMenu();
                DefaultMenuItem item = new DefaultMenuItem();
                System.out.println("================ menu bean ===================");
                for (MenuData md : listMenudata) {
                    
                    if(md.getParentid() >0 ) {
                        System.out.println("DB URL: "+md.getMenuLocation());
                        item = new DefaultMenuItem();
                        item.setValue(md.getMenuDesc());
                        item.setAjax(false);
                        item.setCommand("#{menuBean.openAction('"+md.getMenuLocation()+"')}");
                        item.setStyle("font-size:12px;");
//                        item.setUpdate("URLLocation");
                        subMenu.getElements().add(item);
                        
                    } else {
                        System.out.println("getMenuDesc: "+md.getMenuDesc());
                        subMenu = new DefaultSubMenu();
                        subMenu.setLabel(md.getMenuDesc());
                        menu.getElements().add(subMenu);
                        
//                        subMenu = new DefaultSubMenu();
                    }
                    
                }
                /**
		// Create submenu
		DefaultSubMenu file = new DefaultSubMenu();
		// Create submenu
		DefaultSubMenu help = new DefaultSubMenu();
		// Create menuitem
		DefaultMenuItem open = new DefaultMenuItem();
		// Create menuitem
		DefaultMenuItem edit = new DefaultMenuItem();
		// Create menuitem
		DefaultMenuItem exit = new DefaultMenuItem();

		// Create menuitem
		DefaultMenuItem about = new DefaultMenuItem();
		// Create menuitem
		DefaultMenuItem contact = new DefaultMenuItem();
		// Create menuitem
		DefaultMenuItem helpMenuItem = new DefaultMenuItem();		

		// Determine menuitem action
		open.setCommand("#{menuBean.openAction}");
                open.setStyle("font-size:12px;");
                open.setValue("ABC");
                open.setUrl(urlString);
		// Associate menuitem with submenu
		file.getElements().add(open);
		file.getElements().add(edit);
		file.getElements().add(exit);

		help.getElements().add(about);
		help.getElements().add(contact);
		help.getElements().add(helpMenuItem);

		// Associate submenu with menu
		menu.getElements().add(file);
		menu.getElements().add(help);
                **/
            }catch (Exception e) {
                e.printStackTrace();
            }
	}

	public MenuModel getMenu() {
		return menu;
	}

	public void setMenu(MenuModel menu) {
		this.menu = menu;
	}

	public String openAction(String url){
            System.out.println("============= open action ============" );
            System.out.println("url :"+url );
            urlString = url;
            PrimeFaces.current().ajax().update("URLLocation");
//		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Open action has activiated asynchrounsly !"));
		return "";
	}
        
    /**
    public MenuBean() {
        try {
            System.out.println("============ Menu Data =============");
            int usrid = Integer.valueOf(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("UserId").toString());
            listMenudata = dbUtils.MenuQuery(usrid);

            setMenuModel(new DefaultMenuModel());

            setSubMenu(new DefaultSubMenu());
//            getSubMenu().setLabel("Home");
//            getSubMenu().setExpanded(Boolean.FALSE);
            Random randomGenerator = new Random();
            for (MenuData md : listMenudata) {
                System.out.println("============ md.getMenuId() =============" + md.getMenuId());
                
//                DefaultSubMenu submenuitem0 = new DefaultSubMenu();
//                submenuitem0.setLabel(md.getMenuDesc());
//                submenuitem0.setId(String.valueOf(md.getMenuId())); //I arbitrarily put 0_0 to match with client side ID. No problem here
//                submenuitem0.setStyleClass("maClassJS");
                
                
                
                DefaultSubMenu submenuitem0 = DefaultSubMenu.builder()
                .label(md.getMenuDesc())
                        .id(String.valueOf(md.getMenuId()))
                .build();

//                UIMenuItem menuItem = new UIMenuItem();
//                menuItem.addActionListener(this);
//                menuItem.setUrl(md.getMenuLocation());
//                menuItem.setValue(md.getMenuDesc());
//                DefaultMenuItem item = new DefaultMenuItem();
                
                DefaultMenuItem item = DefaultMenuItem.builder()
                .value("Internal")
                .icon("pi pi-upload")
                .command("#{menuView.redirect}")
                .build();
                
                
//                item.setValue(md.getMenuDesc());
//                System.out.println("============ randomGenerator.nextInt() =============" + randomGenerator.nextInt());
//                item.setId(String.valueOf(randomGenerator.nextInt()));
//
//                item.setCommand("#{menuBean.redirect}");
////            item.setCommand("#{menuBean.panelURL("+md.getMenuLocation()+")}");
//                //         urlString =md.getMenuLocation();
////                item.setUrl(md.getMenuLocation());
//                //  item.setOnclick("test('"+md.getMenuLocation()+"')");
////                item.setAjax(true);
//                item.setStyle("font-size:12px;");
//                item.setUpdate("URLLocation");

                submenuitem0.getElements().add(item);

                getSubMenu().getElements().add(submenuitem0);

//            getSubMenu().setExpanded(true);
            }

            getMenuModel().getElements().add(getSubMenu());
            menuModel.generateUniqueIds();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
**/
    public void redirect() {
        System.out.println(" ======== redirect =============");
//        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
//        ec.redirect(ec.getRequestContextPath());
    }

    public String panelURL(String url) {
        System.out.println("setPanelURL : " + url);
        return urlString = url;
    }

    public void addSubMenuChildrenTo(DefaultSubMenu parentmenuElement) {
        if (parentmenuElement.getElementsCount() == 0) {
            String idChild = parentmenuElement.getId() + "_0";
            DefaultSubMenu submenuChild = new DefaultSubMenu();
            submenuChild.setLabel("Child" + idChild);
            submenuChild.setId(idChild);
            submenuChild.setStyleClass("maClassJS");
            parentmenuElement.getElements().add(submenuChild);
            getMapArborescence().put(submenuChild.getId(), submenuChild);
        }
    }

    public void onCallBackFromJS() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> requestParamMap = context.getExternalContext().getRequestParameterMap();
        String clientId = requestParamMap.get("ClientId");
        DefaultSubMenu submenParent = (DefaultSubMenu) findComponent(clientId);
        if (submenParent != null) {
            addSubMenuChildrenTo(submenParent);
        }
    }
    
    public String home() {
        System.out.println("----- home ------");
        urlString = "reports/mainPage.xhtml";
        PrimeFaces.current().ajax().update("URLLocation");
        return "";
    }

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public MenuElement findComponent(final String id) {
        return getMapArborescence().get(id);
    }

    public Map<String, MenuElement> getMapArborescence() {
        return mapArborescence;
    }

    public void setMapArborescence(Map<String, MenuElement> mapArborescence) {
        this.mapArborescence = mapArborescence;
    }

//    public DefaultSubMenu getSubMenu() {
//        return subMenu;
//    }
//
//    public void setSubMenu(DefaultSubMenu subMenu) {
//        this.subMenu = subMenu;
//    }
 public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }
    public MenuModel getMenuModel() {
        return menuModel;
    }

    public void setMenuModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }
}
