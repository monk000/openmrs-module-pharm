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
public interface StudyParticipantService extends OpenmrsService{
    
    public StudyParticipant saveStudyParticipant(StudyParticipant sp);
    
    public StudyParticipant getStudyParticipant(Integer id);
    
}
