/*
 * @(#) net.bis5.mattermost.model.CommandResponse
 * Copyright (c) 2016 takayuki
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
package net.bis5.mattermost.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * TODO 型の説明
 * 
 * @author takayuki
 * @since 2016/10/08
 */
@Data
public class CommandResponse {

	@JsonProperty("response_type")
	private CommandResponseType responseType;
	@JsonProperty("text")
	private String text;
	@JsonProperty("username")
	private String username;
	@JsonProperty("icon_url")
	private String iconUrl;
	@JsonProperty("goto_location")
	private String gotoLocation;
	@JsonProperty("attachments")
	private List<SlackAttachment> attachments;

}