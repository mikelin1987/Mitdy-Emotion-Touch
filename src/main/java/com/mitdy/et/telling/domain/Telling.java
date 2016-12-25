package com.mitdy.et.telling.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mitdy.core.domain.AuditableEntity;

@Entity
@Table(name = "TELLING_TELLING")
public class Telling extends AuditableEntity {

    private static final long serialVersionUID = 1677728041847993425L;

}
