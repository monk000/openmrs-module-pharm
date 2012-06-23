/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.StudyParticipant;
import org.openmrs.module.pharm.StudyParticipantService;
import org.openmrs.module.pharm.db.StudyParticipantDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class StudyParticipantServiceImpl extends BaseOpenmrsService implements StudyParticipantService {
    
        /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private StudyParticipantDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(StudyParticipantDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public StudyParticipant getStudyParticipant(Integer id) {
        return dao.getStudyParticipant(id);
    }

    @Transactional
    public StudyParticipant saveStudyParticipant(StudyParticipant sp) {
        return dao.saveStudyParticipant(sp);
    }
    
}
