package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SourceDMSMQParameters
 */
public class SourceDMSMQParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acl")

    private Boolean enableAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    /**
     * 消费方式，针对不同生产顺序消息类型，选择消费方式会导致不同结果，请严格按照需求选择消费方式。1、生产顺序为：设置消息组，保证消息顺序发送。消费方式为：顺序消费，实际消息处理结果：按照消息组粒度，严格保证消息顺序。 同一消息组内的消息的消费顺序和发送顺序完全一致。2、生产顺序为：设置消息组，保证消息顺序发送。消费方式为：并发消费，实际消息处理结果：并发消费，尽可能按时间顺序处理。3、生产顺序为：未设置消息组，消息乱序发送。消费方式为：顺序消费，实际消息处理结果：按队列存储粒度，严格顺序。 基于 Apache RocketMQ 本身队列的属性，消费顺序和队列存储的顺序一致，但不保证和发送顺序一致。4、生产顺序为：未设置消息组，消息乱序发送。消费方式为：并发消费，实际消息处理结果：并发消费，尽可能按照时间顺序处理。
     */
    public static final class MessageTypeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final MessageTypeEnum NORMAL = new MessageTypeEnum("NORMAL");

        /**
         * Enum ORDER for value: "ORDER"
         */
        public static final MessageTypeEnum ORDER = new MessageTypeEnum("ORDER");

        private static final Map<String, MessageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MessageTypeEnum> createStaticFields() {
            Map<String, MessageTypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("ORDER", ORDER);
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

    /**
     * mq实例版本
     */
    public static final class EngineVersionEnum {

        /**
         * Enum _4_X for value: "4.x"
         */
        public static final EngineVersionEnum _4_X = new EngineVersionEnum("4.x");

        /**
         * Enum _5_X for value: "5.x"
         */
        public static final EngineVersionEnum _5_X = new EngineVersionEnum("5.x");

        private static final Map<String, EngineVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineVersionEnum> createStaticFields() {
            Map<String, EngineVersionEnum> map = new HashMap<>();
            map.put("4.x", _4_X);
            map.put("5.x", _5_X);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineVersionEnum(String value) {
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
        public static EngineVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineVersionEnum(value));
        }

        public static EngineVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineVersionEnum) {
                return this.value.equals(((EngineVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private EngineVersionEnum engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_timeout")

    private Integer consumeTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_thread_nums")

    private Integer consumerThreadNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_batch_max_size")

    private Integer consumerBatchMaxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_reconsume_times")

    private Integer maxReconsumeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suspend_current_queue_time_millis")

    private Integer suspendCurrentQueueTimeMillis;

    public SourceDMSMQParameters withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称，仅dms的rockectMq需要该字段
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public SourceDMSMQParameters withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，仅dms的rockectMq需要该字段
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SourceDMSMQParameters withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 消费组
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public SourceDMSMQParameters withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * topic名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SourceDMSMQParameters withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public SourceDMSMQParameters withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * 开启SSL
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public SourceDMSMQParameters withEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
        return this;
    }

    /**
     * ACL访问控制
     * @return enableAcl
     */
    public Boolean getEnableAcl() {
        return enableAcl;
    }

    public void setEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
    }

    public SourceDMSMQParameters withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 用户名
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public SourceDMSMQParameters withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * 密码
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public SourceDMSMQParameters withMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 消费方式，针对不同生产顺序消息类型，选择消费方式会导致不同结果，请严格按照需求选择消费方式。1、生产顺序为：设置消息组，保证消息顺序发送。消费方式为：顺序消费，实际消息处理结果：按照消息组粒度，严格保证消息顺序。 同一消息组内的消息的消费顺序和发送顺序完全一致。2、生产顺序为：设置消息组，保证消息顺序发送。消费方式为：并发消费，实际消息处理结果：并发消费，尽可能按时间顺序处理。3、生产顺序为：未设置消息组，消息乱序发送。消费方式为：顺序消费，实际消息处理结果：按队列存储粒度，严格顺序。 基于 Apache RocketMQ 本身队列的属性，消费顺序和队列存储的顺序一致，但不保证和发送顺序一致。4、生产顺序为：未设置消息组，消息乱序发送。消费方式为：并发消费，实际消息处理结果：并发消费，尽可能按照时间顺序处理。
     * @return messageType
     */
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public SourceDMSMQParameters withEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * mq实例版本
     * @return engineVersion
     */
    public EngineVersionEnum getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
    }

    public SourceDMSMQParameters withConsumeTimeout(Integer consumeTimeout) {
        this.consumeTimeout = consumeTimeout;
        return this;
    }

    /**
     * 消费超时时间
     * minimum: 1000
     * maximum: 900000
     * @return consumeTimeout
     */
    public Integer getConsumeTimeout() {
        return consumeTimeout;
    }

    public void setConsumeTimeout(Integer consumeTimeout) {
        this.consumeTimeout = consumeTimeout;
    }

    public SourceDMSMQParameters withConsumerThreadNums(Integer consumerThreadNums) {
        this.consumerThreadNums = consumerThreadNums;
        return this;
    }

    /**
     * 线程消费数
     * minimum: 20
     * maximum: 64
     * @return consumerThreadNums
     */
    public Integer getConsumerThreadNums() {
        return consumerThreadNums;
    }

    public void setConsumerThreadNums(Integer consumerThreadNums) {
        this.consumerThreadNums = consumerThreadNums;
    }

    public SourceDMSMQParameters withConsumerBatchMaxSize(Integer consumerBatchMaxSize) {
        this.consumerBatchMaxSize = consumerBatchMaxSize;
        return this;
    }

    /**
     * 批量消费最大消息数
     * minimum: 1
     * maximum: 32
     * @return consumerBatchMaxSize
     */
    public Integer getConsumerBatchMaxSize() {
        return consumerBatchMaxSize;
    }

    public void setConsumerBatchMaxSize(Integer consumerBatchMaxSize) {
        this.consumerBatchMaxSize = consumerBatchMaxSize;
    }

    public SourceDMSMQParameters withMaxReconsumeTimes(Integer maxReconsumeTimes) {
        this.maxReconsumeTimes = maxReconsumeTimes;
        return this;
    }

    /**
     * 最大重试次数，-1表示一直重试
     * minimum: -1
     * @return maxReconsumeTimes
     */
    public Integer getMaxReconsumeTimes() {
        return maxReconsumeTimes;
    }

    public void setMaxReconsumeTimes(Integer maxReconsumeTimes) {
        this.maxReconsumeTimes = maxReconsumeTimes;
    }

    public SourceDMSMQParameters withSuspendCurrentQueueTimeMillis(Integer suspendCurrentQueueTimeMillis) {
        this.suspendCurrentQueueTimeMillis = suspendCurrentQueueTimeMillis;
        return this;
    }

    /**
     * 重试间隔，单位ms
     * minimum: 20
     * maximum: 30000
     * @return suspendCurrentQueueTimeMillis
     */
    public Integer getSuspendCurrentQueueTimeMillis() {
        return suspendCurrentQueueTimeMillis;
    }

    public void setSuspendCurrentQueueTimeMillis(Integer suspendCurrentQueueTimeMillis) {
        this.suspendCurrentQueueTimeMillis = suspendCurrentQueueTimeMillis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceDMSMQParameters that = (SourceDMSMQParameters) obj;
        return Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.group, that.group) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.sslEnable, that.sslEnable)
            && Objects.equals(this.enableAcl, that.enableAcl) && Objects.equals(this.accessKey, that.accessKey)
            && Objects.equals(this.secretKey, that.secretKey) && Objects.equals(this.messageType, that.messageType)
            && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.consumeTimeout, that.consumeTimeout)
            && Objects.equals(this.consumerThreadNums, that.consumerThreadNums)
            && Objects.equals(this.consumerBatchMaxSize, that.consumerBatchMaxSize)
            && Objects.equals(this.maxReconsumeTimes, that.maxReconsumeTimes)
            && Objects.equals(this.suspendCurrentQueueTimeMillis, that.suspendCurrentQueueTimeMillis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName,
            instanceId,
            group,
            topic,
            tag,
            sslEnable,
            enableAcl,
            accessKey,
            secretKey,
            messageType,
            engineVersion,
            consumeTimeout,
            consumerThreadNums,
            consumerBatchMaxSize,
            maxReconsumeTimes,
            suspendCurrentQueueTimeMillis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceDMSMQParameters {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    enableAcl: ").append(toIndentedString(enableAcl)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    consumeTimeout: ").append(toIndentedString(consumeTimeout)).append("\n");
        sb.append("    consumerThreadNums: ").append(toIndentedString(consumerThreadNums)).append("\n");
        sb.append("    consumerBatchMaxSize: ").append(toIndentedString(consumerBatchMaxSize)).append("\n");
        sb.append("    maxReconsumeTimes: ").append(toIndentedString(maxReconsumeTimes)).append("\n");
        sb.append("    suspendCurrentQueueTimeMillis: ")
            .append(toIndentedString(suspendCurrentQueueTimeMillis))
            .append("\n");
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
