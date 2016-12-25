package com.mitdy.et.telling.persistence.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitdy.core.persistence.JpaAbstractEntityDao;
import com.mitdy.et.telling.domain.Telling;
import com.mitdy.et.telling.persistence.TellingDao;

@Repository
@Transactional
public class TellingDaoImpl extends JpaAbstractEntityDao<Telling> implements TellingDao {

}
