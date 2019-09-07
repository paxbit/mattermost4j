/*
 * Copyright (c) 2016-present, Takayuki Maruyama
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package net.bis5.mattermost.model.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * SAML settings.
 * 
 * @author Takayuki Maruyama
 */
@Data
public class SamlSettings {

  // Basic
  private boolean enable;
  /* @since Mattermost Server 5.3.0 */
  private boolean enableSyncWithLdapIncludeAuth;

  private boolean verify;
  private boolean encrypt;
  /* @since Mattermost Server 5.14.0 */
  private boolean signRequest;

  private String idpUrl;
  private String idpDescriptorUrl;
  private String assertionConsumerServiceUrl;

  private String idpCertificateFile;
  private String publicCertificateFile;
  private String privateKeyFile;

  // User Mapping
  /* @since Mattermost Server 5.3.0 */
  private String idAttribute;
  private String firstNameAttribute;
  private String lastNameAttribute;
  private String emailAttribute;
  private String usernameAttribute;
  private String nicknameAttribute;
  private String localeAttribute;
  private String positionAttribute;

  private String loginButtonText;

  /* @since Mattermost Server 4.4 (Enterprise Edition) */
  private boolean enableSyncWithLdap;
  /* @since Mattermost Server 4.6 (Enterprise Edition) */
  private String loginButtonColor;
  /* @since Mattermost Server 4.6 (Enterprise Edition) */
  private String loginButtonBorderColor;
  /* @since Mattermost Server 4.6 (Enterprise Edition) */
  private String loginButtonTextColor;
  /* @since Mattermost Server 4.9 */
  private String scopingIdpProviderId;
  /* @since Mattermost Server 4.9 */
  private String scopingIdpName;

  @Getter(onMethod = @__({@Deprecated}))
  @Setter(onMethod = @__({@Deprecated}))
  private boolean enableSync;
}
