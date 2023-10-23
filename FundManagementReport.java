/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.File;
import java.io.Serializable;
import javafx.scene.control.CheckBox;

/**
 *
 * @author Zunair.Sarwar
 */
public class FundManagementReport implements Serializable {

    private String declarationPeriod;
    private CheckBox checkBox;
    private String nameOfSecurity;
    private Integer quantity;
    private String pledged;
    private String indirectAccount;
    private File uploadSupportingDocument;

    // Following broker relationships have been maintained
    private String nameOfBroker;
    private String accountNo;
    private String indirectAccountRelation;
    private CheckBox check;
}
