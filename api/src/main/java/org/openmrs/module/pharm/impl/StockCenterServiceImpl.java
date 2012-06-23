/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.StockCenter;
import org.openmrs.module.pharm.StockCenterService;
import org.openmrs.module.pharm.db.StockCenterDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class StockCenterServiceImpl extends BaseOpenmrsService implements StockCenterService {
    
        /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private StockCenterDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(StockCenterDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public StockCenter getStockCenter(Integer id) {
        return dao.getStockCenter(id);
    }

    @Transactional
    public StockCenter saveStockCenter(StockCenter sc) {
        return dao.saveStockCenter(sc);
    }
    
}
