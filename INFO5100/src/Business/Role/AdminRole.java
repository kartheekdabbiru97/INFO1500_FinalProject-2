/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AdministrativeCampRole.AdminWorkCampAreaJPanel;
import ui.AdministrativeEventRole.AdminWorkEventAreaJPanel;
import ui.AdministrativeHospitalRole.AdminWorkHospitalAreaJPanel;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Camp)) {
            return new AdminWorkCampAreaJPanel(userProcessContainer, enterprise, account, network, business);
        } else if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
            return new AdminWorkEventAreaJPanel(userProcessContainer, enterprise, account, network, business);
        } else {
            return new AdminWorkHospitalAreaJPanel(userProcessContainer, enterprise, account, network, business);
        }
    }

}
