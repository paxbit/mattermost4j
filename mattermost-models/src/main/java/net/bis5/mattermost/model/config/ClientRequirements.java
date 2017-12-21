/*
 * @(#) net.bis5.mattermost.model.config.ClientRequirements
 * Copyright (c) 2017 Maruyama Takayuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */
package net.bis5.mattermost.model.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * TODO 型の説明
 * 
 * @author Maruyama Takayuki
 * @since Mattermost Server 4.2
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientRequirements {

	private String androidLatestVersion;
	private String androidMinVersion;
	private String desktopLatestVersion;
	private String desktopMinVersion;
	private String iosLatestVersion;
	private String iosMinVersion;

}