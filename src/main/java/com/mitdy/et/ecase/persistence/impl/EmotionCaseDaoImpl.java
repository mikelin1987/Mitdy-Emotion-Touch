package com.mitdy.et.ecase.persistence.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitdy.core.persistence.JpaAbstractEntityDao;
import com.mitdy.et.ecase.domain.EmotionCase;
import com.mitdy.et.ecase.persistence.EmotionCaseDao;

@Repository
@Transactional
public class EmotionCaseDaoImpl extends JpaAbstractEntityDao<EmotionCase> implements EmotionCaseDao {

}
