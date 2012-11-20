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

import java.io.Serializable;

import javax.annotation.Nullable;

/**
 * @author Jerry Ocanas (jocanas)
 */
public interface SeoMetaData extends Serializable {

    /**
     * Gets the meta-description.
     *
     * @return the metaDescription
     */
    @Nullable
    public String getMetaDescription();

    /**
     * Sets the metaDescription.
     *
     * @param metaDescription
     */
    public void setMetaDescription(@Nullable String metaDescription);

    /**
     * Gets the meta-keywords.
     *
     * @return metaKeywords
     */
    @Nullable
    public String getMetaKeywords();

    /**
     * Sets the metaKeywords.
     *
     * @param metaKeywords
     */
    public void setMetaKeywords(@Nullable String metaKeywords);

    /**
     * Gets the meta-Robot.
     *
     * @return metaRobot
     */
    @Nullable
    public String getMetaRobot();

    /**
     * Sets the metaRobot.
     *
     * @param metaRobot
     */
    public void setMetaRobot(@Nullable String metaRobot);

    /**
     * Gets the title fragment.
     *
     * @return titleFragment
     */
    @Nullable
    public String getTitleFragment();

    /**
     *  Sets the titleFragment.
     *
     * @param titleFragment
     */
    public void setTitleFragment(@Nullable String titleFragment);
}
