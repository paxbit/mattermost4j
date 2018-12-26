/*
 * @(#) net.bis5.mattermost.model.config.ExperimentalSettings
 * Copyright (c) 2018 Takayuki Maruyama
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

import lombok.Data;

/**
 * Experimental settings
 * 
 * @author Takayuki Maruyama
 * @since Mattermost Server 5.1
 */
@Data
public class ExperimentalSettings {

	private boolean clientSideCertEnable;
	private String clientSideCertCheck;
	/** @since Mattermost Server 5.6 */
	private boolean enablePostMetadata;

}
