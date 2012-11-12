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

package org.broadleafcommerce.admin.client.seo;

import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.i18n.client.LocalizableResource.DefaultLocale;

/**
 * @author Jerry Ocanas (jocanas)
 */
@DefaultLocale("en_US")
public interface SeoMessages extends ConstantsWithLookup {

    public String Seo_Meta_Description();
    public String Seo_Meta_Keywords();
    public String Seo_Meta_Robot();
    public String Seo_Title_Fragment();

    public String Seo_Group_Twitter();

    public String TwitterDataImpl_TwitterSite();
    public String TwitterDataImpl_TwitterCreator();
    public String TwitterDataImpl_TwitterCard();
    public String TwitterDataImpl_TwitterUrl();
    public String TwitterDataImpl_TwitterTitle();
    public String TwitterDataImpl_TwitterDescription();
    public String TwitterDataImpl_TwitterImage();
}
