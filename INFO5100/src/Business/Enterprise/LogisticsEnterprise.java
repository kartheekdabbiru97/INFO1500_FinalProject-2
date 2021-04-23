/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.DriverOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class LogisticsEnterprise extends Enterprise {

    public LogisticsEnterprise(String name) {
        super(name, EnterpriseType.Transport);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    //Add driver role
    @Override
    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> organ = new ArrayList();
        organ.add(new DriverOrganization());
        return organ;
    }
}
