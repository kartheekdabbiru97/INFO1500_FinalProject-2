/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class LabOrganization extends Organization {

    public LabOrganization() {
        super(Organization.OrganizationType.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAdminRole());
        return roles;
    }

}
