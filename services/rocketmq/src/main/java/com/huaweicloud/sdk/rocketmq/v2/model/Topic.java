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
 * Topic
 */
public class Topic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_read_queue_num")

    private BigDecimal totalReadQueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_write_queue_num")

    private BigDecimal totalWriteQueueNum;

    /**
     * **参数解释**： 权限。 **约束限制**： 不涉及。 **取值范围**： - sub：拥有订阅权限。 - pub：拥有发布权限。 - all：拥有发布、订阅权限。       **默认取值**： 不涉及。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<TopicBrokers> brokers = null;

    /**
     * **参数解释**： 消息类型（RocketMQ实例5.x版本才包含此参数）。 **约束限制**： 不涉及。 **取值范围**： - NORMAL：普通消息。 - FIFO：顺序消息。 - DELAY：定时消息。 - TRANSACTION：事务消息。 **默认取值**： 不涉及。
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

    public Topic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： Topic名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic withTotalReadQueueNum(BigDecimal totalReadQueueNum) {
        this.totalReadQueueNum = totalReadQueueNum;
        return this;
    }

    /**
     * **参数解释**： 总读队列个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return totalReadQueueNum
     */
    public BigDecimal getTotalReadQueueNum() {
        return totalReadQueueNum;
    }

    public void setTotalReadQueueNum(BigDecimal totalReadQueueNum) {
        this.totalReadQueueNum = totalReadQueueNum;
    }

    public Topic withTotalWriteQueueNum(BigDecimal totalWriteQueueNum) {
        this.totalWriteQueueNum = totalWriteQueueNum;
        return this;
    }

    /**
     * **参数解释**： 总写队列个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return totalWriteQueueNum
     */
    public BigDecimal getTotalWriteQueueNum() {
        return totalWriteQueueNum;
    }

    public void setTotalWriteQueueNum(BigDecimal totalWriteQueueNum) {
        this.totalWriteQueueNum = totalWriteQueueNum;
    }

    public Topic withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * **参数解释**： 权限。 **约束限制**： 不涉及。 **取值范围**： - sub：拥有订阅权限。 - pub：拥有发布权限。 - all：拥有发布、订阅权限。       **默认取值**： 不涉及。
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public Topic withBrokers(List<TopicBrokers> brokers) {
        this.brokers = brokers;
        return this;
    }

    public Topic addBrokersItem(TopicBrokers brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public Topic withBrokers(Consumer<List<TopicBrokers>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * **参数解释**： 关联的代理。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokers
     */
    public List<TopicBrokers> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<TopicBrokers> brokers) {
        this.brokers = brokers;
    }

    public Topic withMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * **参数解释**： 消息类型（RocketMQ实例5.x版本才包含此参数）。 **约束限制**： 不涉及。 **取值范围**： - NORMAL：普通消息。 - FIFO：顺序消息。 - DELAY：定时消息。 - TRANSACTION：事务消息。 **默认取值**： 不涉及。
     * @return messageType
     */
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Topic that = (Topic) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.totalReadQueueNum, that.totalReadQueueNum)
            && Objects.equals(this.totalWriteQueueNum, that.totalWriteQueueNum)
            && Objects.equals(this.permission, that.permission) && Objects.equals(this.brokers, that.brokers)
            && Objects.equals(this.messageType, that.messageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalReadQueueNum, totalWriteQueueNum, permission, brokers, messageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Topic {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalReadQueueNum: ").append(toIndentedString(totalReadQueueNum)).append("\n");
        sb.append("    totalWriteQueueNum: ").append(toIndentedString(totalWriteQueueNum)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
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
