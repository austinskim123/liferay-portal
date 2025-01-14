/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.delivery.client.serdes.v1_0;

import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardMessage;
import com.liferay.headless.delivery.client.dto.v1_0.RelatedContent;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class MessageBoardMessageSerDes {

	public static MessageBoardMessage toDTO(String json) {
		MessageBoardMessageJSONParser messageBoardMessageJSONParser =
			new MessageBoardMessageJSONParser();

		return messageBoardMessageJSONParser.parseToDTO(json);
	}

	public static MessageBoardMessage[] toDTOs(String json) {
		MessageBoardMessageJSONParser messageBoardMessageJSONParser =
			new MessageBoardMessageJSONParser();

		return messageBoardMessageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(MessageBoardMessage messageBoardMessage) {
		if (messageBoardMessage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (messageBoardMessage.getAggregateRating() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"aggregateRating\": ");

			sb.append(String.valueOf(messageBoardMessage.getAggregateRating()));
		}

		if (messageBoardMessage.getAnonymous() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"anonymous\": ");

			sb.append(messageBoardMessage.getAnonymous());
		}

		if (messageBoardMessage.getArticleBody() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"articleBody\": ");

			sb.append("\"");

			sb.append(_escape(messageBoardMessage.getArticleBody()));

			sb.append("\"");
		}

		if (messageBoardMessage.getCreator() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creator\": ");

			sb.append(String.valueOf(messageBoardMessage.getCreator()));
		}

		if (messageBoardMessage.getDateCreated() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateCreated\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					messageBoardMessage.getDateCreated()));

			sb.append("\"");
		}

		if (messageBoardMessage.getDateModified() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateModified\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					messageBoardMessage.getDateModified()));

			sb.append("\"");
		}

		if (messageBoardMessage.getEncodingFormat() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"encodingFormat\": ");

			sb.append("\"");

			sb.append(_escape(messageBoardMessage.getEncodingFormat()));

			sb.append("\"");
		}

		if (messageBoardMessage.getHeadline() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"headline\": ");

			sb.append("\"");

			sb.append(_escape(messageBoardMessage.getHeadline()));

			sb.append("\"");
		}

		if (messageBoardMessage.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append(messageBoardMessage.getId());
		}

		if (messageBoardMessage.getKeywords() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"keywords\": ");

			sb.append("[");

			for (int i = 0; i < messageBoardMessage.getKeywords().length; i++) {
				sb.append("\"");

				sb.append(_escape(messageBoardMessage.getKeywords()[i]));

				sb.append("\"");

				if ((i + 1) < messageBoardMessage.getKeywords().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (messageBoardMessage.getNumberOfMessageBoardAttachments() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfMessageBoardAttachments\": ");

			sb.append(messageBoardMessage.getNumberOfMessageBoardAttachments());
		}

		if (messageBoardMessage.getNumberOfMessageBoardMessages() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numberOfMessageBoardMessages\": ");

			sb.append(messageBoardMessage.getNumberOfMessageBoardMessages());
		}

		if (messageBoardMessage.getRelatedContents() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relatedContents\": ");

			sb.append("[");

			for (int i = 0; i < messageBoardMessage.getRelatedContents().length;
				 i++) {

				sb.append(
					String.valueOf(
						messageBoardMessage.getRelatedContents()[i]));

				if ((i + 1) < messageBoardMessage.getRelatedContents().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (messageBoardMessage.getShowAsAnswer() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"showAsAnswer\": ");

			sb.append(messageBoardMessage.getShowAsAnswer());
		}

		if (messageBoardMessage.getSiteId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"siteId\": ");

			sb.append(messageBoardMessage.getSiteId());
		}

		if (messageBoardMessage.getViewableBy() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"viewableBy\": ");

			sb.append("\"");

			sb.append(messageBoardMessage.getViewableBy());

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, String> toMap(
		MessageBoardMessage messageBoardMessage) {

		if (messageBoardMessage == null) {
			return null;
		}

		Map<String, String> map = new HashMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (messageBoardMessage.getAggregateRating() == null) {
			map.put("aggregateRating", null);
		}
		else {
			map.put(
				"aggregateRating",
				String.valueOf(messageBoardMessage.getAggregateRating()));
		}

		if (messageBoardMessage.getAnonymous() == null) {
			map.put("anonymous", null);
		}
		else {
			map.put(
				"anonymous",
				String.valueOf(messageBoardMessage.getAnonymous()));
		}

		if (messageBoardMessage.getArticleBody() == null) {
			map.put("articleBody", null);
		}
		else {
			map.put(
				"articleBody",
				String.valueOf(messageBoardMessage.getArticleBody()));
		}

		if (messageBoardMessage.getCreator() == null) {
			map.put("creator", null);
		}
		else {
			map.put(
				"creator", String.valueOf(messageBoardMessage.getCreator()));
		}

		map.put(
			"dateCreated",
			liferayToJSONDateFormat.format(
				messageBoardMessage.getDateCreated()));

		map.put(
			"dateModified",
			liferayToJSONDateFormat.format(
				messageBoardMessage.getDateModified()));

		if (messageBoardMessage.getEncodingFormat() == null) {
			map.put("encodingFormat", null);
		}
		else {
			map.put(
				"encodingFormat",
				String.valueOf(messageBoardMessage.getEncodingFormat()));
		}

		if (messageBoardMessage.getHeadline() == null) {
			map.put("headline", null);
		}
		else {
			map.put(
				"headline", String.valueOf(messageBoardMessage.getHeadline()));
		}

		if (messageBoardMessage.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(messageBoardMessage.getId()));
		}

		if (messageBoardMessage.getKeywords() == null) {
			map.put("keywords", null);
		}
		else {
			map.put(
				"keywords", String.valueOf(messageBoardMessage.getKeywords()));
		}

		if (messageBoardMessage.getNumberOfMessageBoardAttachments() == null) {
			map.put("numberOfMessageBoardAttachments", null);
		}
		else {
			map.put(
				"numberOfMessageBoardAttachments",
				String.valueOf(
					messageBoardMessage.getNumberOfMessageBoardAttachments()));
		}

		if (messageBoardMessage.getNumberOfMessageBoardMessages() == null) {
			map.put("numberOfMessageBoardMessages", null);
		}
		else {
			map.put(
				"numberOfMessageBoardMessages",
				String.valueOf(
					messageBoardMessage.getNumberOfMessageBoardMessages()));
		}

		if (messageBoardMessage.getRelatedContents() == null) {
			map.put("relatedContents", null);
		}
		else {
			map.put(
				"relatedContents",
				String.valueOf(messageBoardMessage.getRelatedContents()));
		}

		if (messageBoardMessage.getShowAsAnswer() == null) {
			map.put("showAsAnswer", null);
		}
		else {
			map.put(
				"showAsAnswer",
				String.valueOf(messageBoardMessage.getShowAsAnswer()));
		}

		if (messageBoardMessage.getSiteId() == null) {
			map.put("siteId", null);
		}
		else {
			map.put("siteId", String.valueOf(messageBoardMessage.getSiteId()));
		}

		if (messageBoardMessage.getViewableBy() == null) {
			map.put("viewableBy", null);
		}
		else {
			map.put(
				"viewableBy",
				String.valueOf(messageBoardMessage.getViewableBy()));
		}

		return map;
	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		return string.replaceAll("\"", "\\\\\"");
	}

	private static class MessageBoardMessageJSONParser
		extends BaseJSONParser<MessageBoardMessage> {

		@Override
		protected MessageBoardMessage createDTO() {
			return new MessageBoardMessage();
		}

		@Override
		protected MessageBoardMessage[] createDTOArray(int size) {
			return new MessageBoardMessage[size];
		}

		@Override
		protected void setField(
			MessageBoardMessage messageBoardMessage, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "aggregateRating")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setAggregateRating(
						AggregateRatingSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "anonymous")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setAnonymous(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "articleBody")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setArticleBody(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "creator")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setCreator(
						CreatorSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateCreated")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setDateCreated(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateModified")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setDateModified(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "encodingFormat")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setEncodingFormat(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "headline")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setHeadline(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "keywords")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setKeywords(
						toStrings((Object[])jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName,
						"numberOfMessageBoardAttachments")) {

				if (jsonParserFieldValue != null) {
					messageBoardMessage.setNumberOfMessageBoardAttachments(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "numberOfMessageBoardMessages")) {

				if (jsonParserFieldValue != null) {
					messageBoardMessage.setNumberOfMessageBoardMessages(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "relatedContents")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setRelatedContents(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> RelatedContentSerDes.toDTO((String)object)
						).toArray(
							size -> new RelatedContent[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "showAsAnswer")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setShowAsAnswer(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "siteId")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setSiteId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "viewableBy")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage.setViewableBy(
						MessageBoardMessage.ViewableBy.create(
							(String)jsonParserFieldValue));
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}