/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.seo.domain.catalog;

import org.broadleafcommerce.common.presentation.AdminPresentation;

import javax.annotation.Nullable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Jerry Ocanas (jocanas)
 */
@Embeddable
public class SeoMetaDataImpl implements SeoMetaData {

    private static final long serialVersionUID = 1L;

    @Column(name = "META_DESCRIPTION")
    @AdminPresentation(friendlyName = "Seo_Meta_Description", order=3, group = "Seo_Group",groupOrder=2)
    protected String metaDescription;

    @Column(name = "META_KEYWORDS")
    @AdminPresentation(friendlyName = "Seo_Meta_Keywords", order=4, group = "Seo_Group",groupOrder=2)
    protected String metaKeywords;

    @Column(name = "META_ROBOT")
    @AdminPresentation(friendlyName = "Seo_Meta_Robot", order=5, group = "Seo_Group",groupOrder=2)
    protected String metaRobot;

    @Column(name = "TITLE_FRAGMENT")
    @AdminPresentation(friendlyName = "Seo_Title_Fragment", order=6, group = "Seo_Group",groupOrder=2)
    protected String titleFragment;

    @Override
    @Nullable
    public String getMetaDescription() {
        return metaDescription;
    }

    @Override
    public void setMetaDescription(@Nullable String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @Override
    @Nullable
    public String getMetaKeywords() {
        return metaKeywords;
    }

    @Override
    public void setMetaKeywords(@Nullable String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    @Override
    @Nullable
    public String getMetaRobot() {
        return metaRobot;
    }

    @Override
    public void setMetaRobot(@Nullable String metaRobot) {
        this.metaRobot = metaRobot;
    }

    @Override
    @Nullable
    public String getTitleFragment() {
        return titleFragment;
    }

    @Override
    public void setTitleFragment(@Nullable String titleFragment) {
        this.titleFragment = titleFragment;
    }

}
