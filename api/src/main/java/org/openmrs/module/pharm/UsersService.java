/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;

/**
 *
 * @author Yan
 */
public interface UsersService extends OpenmrsService {
    
    public Users saveUsers(Users users);
    
    public Users getUsers(Integer id);
    
}
