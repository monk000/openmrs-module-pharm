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
public interface StockCenterService extends OpenmrsService {
    
    public StockCenter saveStockCenter(StockCenter sc);
    
    public StockCenter getStockCenter(Integer id);
    
}
