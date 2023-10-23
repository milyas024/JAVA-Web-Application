/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.FolioInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class FolioInfoRowMapper implements RowMapper {

    @Override
    public FolioInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        FolioInfo fi = new FolioInfo();
        fi.setNicPassport(rs.getString("NIC_PASSPORT"));
        fi.setTitle(rs.getString("TITLE"));
        fi.setAddress1(rs.getString("ADDRESS1"));
        fi.setPhoneMobile(rs.getString("PHONE_MOBILE"));
        fi.setLandLine(rs.getString("LAND_LINE"));
        fi.setDateOfBirth(String.valueOf(rs.getDate("DATE_OF_BIRTH")));
        fi.setOpeningDate(String.valueOf(rs.getDate("OPENING_DATE")));
        fi.setZakatCertificate(rs.getString("ZAKAT_CERTIFICATE"));
        fi.setAccountType(rs.getString("ACCOUNT_TYPE"));
        fi.setRiskProduct(rs.getString("RISK_PRODUCT"));
        fi.setPlanName(rs.getString("PLAN_NAME"));
        fi.setAccountNumber(rs.getString("ACCOUNT_NUMBER"));
        fi.setDividendOrBonus(rs.getString("DIVIDEND_OR_BONUS"));
        fi.setHoldMail(rs.getString("HOLD_MAIL"));
        fi.setAccStatus(rs.getString("ACC_STATUS"));
        fi.setNominee(rs.getString("NOMINEE"));
        fi.setJointAcc(rs.getString("JOINT_ACC"));
        fi.setCnicExpiryDate(String.valueOf(rs.getDate("CNIC_EXPIRY_DATE")));
        fi.setRedInstr(rs.getString("RED_INSTR"));
        return fi;
    }
}
