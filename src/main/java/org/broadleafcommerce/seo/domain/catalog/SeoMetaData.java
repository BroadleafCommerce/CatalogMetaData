package org.broadleafcommerce.seo.domain.catalog;

import javax.annotation.Nullable;

/**
 * @author Jerry Ocanas (jocanas)
 */
public interface SeoMetaData {

    @Nullable
    public String getMetaDescription();

    public void setMetaDescription(@Nullable String metaDescription);

    @Nullable
    public String getMetaKeywords();

    public void setMetaKeywords(@Nullable String metaKeywords);

    @Nullable
    public String getMetaRobot();

    public void setMetaRobot(@Nullable String metaRobot);

    @Nullable
    public String getTitleFragment();

    public void setTitleFragment(@Nullable String titleFragment);
}
