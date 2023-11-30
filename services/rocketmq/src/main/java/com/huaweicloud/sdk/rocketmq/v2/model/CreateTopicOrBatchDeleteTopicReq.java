package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTopicOrBatchDeleteTopicReq
 */
public class CreateTopicOrBatchDeleteTopicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<String> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_num")

    private BigDecimal queueNum;

    /**
     * 权限。
     */
    public static final class PermissionEnum {

        /**
         * Enum SUB for value: "sub"
         */
        public static final PermissionEnum SUB = new PermissionEnum("sub");

        /**
         * Enum PUB for value: "pub"
         */
        public static final PermissionEnum PUB = new PermissionEnum("pub");

        /**
         * Enum ALL for value: "all"
         */
        public static final PermissionEnum ALL = new PermissionEnum("all");

        private static final Map<String, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionEnum> createStaticFields() {
            Map<String, PermissionEnum> map = new HashMap<>();
            map.put("sub", SUB);
            map.put("pub", PUB);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionEnum(String value) {
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
        public static PermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionEnum(value));
        }

        public static PermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionEnum) {
                return this.value.equals(((PermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionEnum permission;

    /**
     * 消息类型（RocketMQ实例5.x版本才包含此参数）。
     */
    public static final class MessageTypeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final MessageTypeEnum NORMAL = new MessageTypeEnum("NORMAL");

        /**
         * Enum FIFO for value: "FIFO"
         */
        public static final MessageTypeEnum FIFO = new MessageTypeEnum("FIFO");

        /**
         * Enum DELAY for value: "DELAY"
         */
        public static final MessageTypeEnum DELAY = new MessageTypeEnum("DELAY");

        /**
         * Enum TRANSACTION for value: "TRANSACTION"
         */
        public static final MessageTypeEnum TRANSACTION = new MessageTypeEnum("TRANSACTION");

        private static final Map<String, MessageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MessageTypeEnum> createStaticFields() {
            Map<String, MessageTypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("FIFO", FIFO);
            map.put("DELAY", DELAY);
            map.put("TRANSACTION", TRANSACTION);
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
    @JsonProperty(value = "topics")

    private List<String> topics = null;

    public CreateTopicOrBatchDeleteTopicReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主题名称，只能由英文字母、数字、百分号、竖线、中划线、下划线组成，长度3~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTopicOrBatchDeleteTopicReq withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public CreateTopicOrBatchDeleteTopicReq addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public CreateTopicOrBatchDeleteTopicReq withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 关联的代理。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public CreateTopicOrBatchDeleteTopicReq withQueueNum(BigDecimal queueNum) {
        this.queueNum = queueNum;
        return this;
    }

    /**
     * 队列数，范围1~50。
     * @return queueNum
     */
    public BigDecimal getQueueNum() {
        return queueNum;
    }

    public void setQueueNum(BigDecimal queueNum) {
        this.queueNum = queueNum;
    }

    public CreateTopicOrBatchDeleteTopicReq withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * 权限。
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public CreateTopicOrBatchDeleteTopicReq withMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 消息类型（RocketMQ实例5.x版本才包含此参数）。
     * @return messageType
     */
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public CreateTopicOrBatchDeleteTopicReq withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public CreateTopicOrBatchDeleteTopicReq addTopicsItem(String topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public CreateTopicOrBatchDeleteTopicReq withTopics(Consumer<List<String>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 主题列表，当批量删除主题时使用。
     * @return topics
     */
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTopicOrBatchDeleteTopicReq that = (CreateTopicOrBatchDeleteTopicReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.brokers, that.brokers)
            && Objects.equals(this.queueNum, that.queueNum) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.messageType, that.messageType) && Objects.equals(this.topics, that.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brokers, queueNum, permission, messageType, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTopicOrBatchDeleteTopicReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    queueNum: ").append(toIndentedString(queueNum)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
