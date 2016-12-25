package com.mitdy.et.article.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.mitdy.core.domain.AuditableEntity;

@Entity
@Table(name = "ARTICLE_ARTICLE")
public class Article extends AuditableEntity {

    private static final long serialVersionUID = 6921765044880144268L;
    

}
