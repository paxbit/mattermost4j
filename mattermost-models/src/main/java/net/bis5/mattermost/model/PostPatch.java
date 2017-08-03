/*
 * @(#) net.bis5.mattermost.model.PostPatch
 * Copyright (c) 2017 Maruyama Takayuki <bis5.wsys@gmail.com>
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
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * TODO 型の説明
 * 
 * @author Maruyama Takayuki
 * @since 2017/06/09
 */
@Data
public class PostPatch {

	@JsonProperty("is_pinned")
	private boolean isPinned;
	@JsonProperty("message")
	private String message;
	@JsonProperty("proprs")
	private Map<String, String> props;
	@JsonProperty("file_ids")
	private List<String> fileIds;
	@JsonProperty("has_reactions")
	private boolean hasReactions;

}