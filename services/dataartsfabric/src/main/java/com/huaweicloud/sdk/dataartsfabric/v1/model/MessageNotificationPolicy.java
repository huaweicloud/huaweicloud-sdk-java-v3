package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 消息通知策略
 */
public class MessageNotificationPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 消息类型。job:任务执行结果。
     */
    public static final class MessageTypeEnum {

        /**
         * Enum JOB for value: "job"
         */
        public static final MessageTypeEnum JOB = new MessageTypeEnum("job");

        private static final Map<String, MessageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MessageTypeEnum> createStaticFields() {
            Map<String, MessageTypeEnum> map = new HashMap<>();
            map.put("job", JOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MessageTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MessageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MessageTypeEnum(value));
        }

        public static MessageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MessageTypeEnum) {
                return this.value.equals(((MessageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_type")

    private MessageTypeEnum messageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_pattern")

    private String namePattern;

    /**
     * Gets or Sets notificationTypes
     */
    public static final class NotificationTypesEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final NotificationTypesEnum SUCCESS = new NotificationTypesEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final NotificationTypesEnum FAILED = new NotificationTypesEnum("FAILED");

        private static final Map<String, NotificationTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationTypesEnum> createStaticFields() {
            Map<String, NotificationTypesEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationTypesEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NotificationTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationTypesEnum(value));
        }

        public static NotificationTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationTypesEnum) {
                return this.value.equals(((NotificationTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_types")

    private List<NotificationTypesEnum> notificationTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    public MessageNotificationPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MessageNotificationPolicy withMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 消息类型。job:任务执行结果。
     * @return messageType
     */
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public MessageNotificationPolicy withNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    /**
     * 名称样式，用来匹配消息类型中所有符合该样式的消息。比如，message_type设置为job，name_pattern设置为ray_job*，表示匹配到所有以\"ray_job\"开头的job发出的消息。
     * @return namePattern
     */
    public String getNamePattern() {
        return namePattern;
    }

    public void setNamePattern(String namePattern) {
        this.namePattern = namePattern;
    }

    public MessageNotificationPolicy withNotificationTypes(List<NotificationTypesEnum> notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }

    public MessageNotificationPolicy addNotificationTypesItem(NotificationTypesEnum notificationTypesItem) {
        if (this.notificationTypes == null) {
            this.notificationTypes = new ArrayList<>();
        }
        this.notificationTypes.add(notificationTypesItem);
        return this;
    }

    public MessageNotificationPolicy withNotificationTypes(
        Consumer<List<NotificationTypesEnum>> notificationTypesSetter) {
        if (this.notificationTypes == null) {
            this.notificationTypes = new ArrayList<>();
        }
        notificationTypesSetter.accept(this.notificationTypes);
        return this;
    }

    /**
     * 通知类型。SUCCESS:成功通知；FAILED：失败通知
     * @return notificationTypes
     */
    public List<NotificationTypesEnum> getNotificationTypes() {
        return notificationTypes;
    }

    public void setNotificationTypes(List<NotificationTypesEnum> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }

    public MessageNotificationPolicy withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 消息通知主题。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MessageNotificationPolicy that = (MessageNotificationPolicy) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.messageType, that.messageType)
            && Objects.equals(this.namePattern, that.namePattern)
            && Objects.equals(this.notificationTypes, that.notificationTypes)
            && Objects.equals(this.topicUrn, that.topicUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, messageType, namePattern, notificationTypes, topicUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageNotificationPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
        sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
