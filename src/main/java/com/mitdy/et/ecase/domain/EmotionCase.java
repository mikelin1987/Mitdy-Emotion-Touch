package com.mitdy.et.ecase.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mitdy.core.domain.AuditableEntity;

@Entity
@Table(name = "ECASE_EMOTION_CASE")
public class EmotionCase extends AuditableEntity {

    private static final long serialVersionUID = 2352904536579043667L;

}
