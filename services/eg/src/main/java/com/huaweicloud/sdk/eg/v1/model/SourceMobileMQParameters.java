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
 * 事件流移动云rockectMq事件源参数
 */
public class SourceMobileMQParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_required")

    private Boolean authenticationRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_trace_switch")

    private Boolean msgTraceSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    /**
     * 订阅方式
     */
    public static final class MessageModelEnum {

        /**
         * Enum CLUSTERING for value: "CLUSTERING"
         */
        public static final MessageModelEnum CLUSTERING = new MessageModelEnum("CLUSTERING");

        /**
         * Enum BROADCASTING for value: "BROADCASTING"
         */
        public static final MessageModelEnum BROADCASTING = new MessageModelEnum("BROADCASTING");

        private static final Map<String, MessageModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MessageModelEnum> createStaticFields() {
            Map<String, MessageModelEnum> map = new HashMap<>();
            map.put("CLUSTERING", CLUSTERING);
            map.put("BROADCASTING", BROADCASTING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MessageModelEnum(String value) {
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
        public static MessageModelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MessageModelEnum(value));
        }

        public static MessageModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MessageModelEnum) {
                return this.value.equals(((MessageModelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_model")

    private MessageModelEnum messageModel;

    /**
     * 接入点类型
     */
    public static final class AddrTypeEnum {

        /**
         * Enum PUBLIC for value: "PUBLIC"
         */
        public static final AddrTypeEnum PUBLIC = new AddrTypeEnum("PUBLIC");

        /**
         * Enum PRIVATE for value: "PRIVATE"
         */
        public static final AddrTypeEnum PRIVATE = new AddrTypeEnum("PRIVATE");

        private static final Map<String, AddrTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AddrTypeEnum> createStaticFields() {
            Map<String, AddrTypeEnum> map = new HashMap<>();
            map.put("PUBLIC", PUBLIC);
            map.put("PRIVATE", PRIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AddrTypeEnum(String value) {
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
        public static AddrTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AddrTypeEnum(value));
        }

        public static AddrTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddrTypeEnum) {
                return this.value.equals(((AddrTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr_type")

    private AddrTypeEnum addrType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sdk_url")

    private String sdkUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_timeout")

    private Integer consumeTimeout;

    /**
     * 消息类型
     */
    public static final class MessageTypeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final MessageTypeEnum NORMAL = new MessageTypeEnum("NORMAL");

        private static final Map<String, MessageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MessageTypeEnum> createStaticFields() {
            Map<String, MessageTypeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
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
    @JsonProperty(value = "suspend_time")

    private Integer suspendTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_reconsumer_times")

    private Integer maxReconsumerTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_thread_nums")

    private Integer consumerThreadNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_batch_max_size")

    private Integer consumerBatchMaxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_max_wait")

    private Integer consumerMaxWait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    public SourceMobileMQParameters withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 消费组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public SourceMobileMQParameters withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SourceMobileMQParameters withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * topic
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SourceMobileMQParameters withTag(String tag) {
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

    public SourceMobileMQParameters withAuthenticationRequired(Boolean authenticationRequired) {
        this.authenticationRequired = authenticationRequired;
        return this;
    }

    /**
     * 鉴权认证
     * @return authenticationRequired
     */
    public Boolean getAuthenticationRequired() {
        return authenticationRequired;
    }

    public void setAuthenticationRequired(Boolean authenticationRequired) {
        this.authenticationRequired = authenticationRequired;
    }

    public SourceMobileMQParameters withMsgTraceSwitch(Boolean msgTraceSwitch) {
        this.msgTraceSwitch = msgTraceSwitch;
        return this;
    }

    /**
     * 保存消息轨迹
     * @return msgTraceSwitch
     */
    public Boolean getMsgTraceSwitch() {
        return msgTraceSwitch;
    }

    public void setMsgTraceSwitch(Boolean msgTraceSwitch) {
        this.msgTraceSwitch = msgTraceSwitch;
    }

    public SourceMobileMQParameters withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * AccessKey
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public SourceMobileMQParameters withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * SecretKey
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public SourceMobileMQParameters withMessageModel(MessageModelEnum messageModel) {
        this.messageModel = messageModel;
        return this;
    }

    /**
     * 订阅方式
     * @return messageModel
     */
    public MessageModelEnum getMessageModel() {
        return messageModel;
    }

    public void setMessageModel(MessageModelEnum messageModel) {
        this.messageModel = messageModel;
    }

    public SourceMobileMQParameters withAddrType(AddrTypeEnum addrType) {
        this.addrType = addrType;
        return this;
    }

    /**
     * 接入点类型
     * @return addrType
     */
    public AddrTypeEnum getAddrType() {
        return addrType;
    }

    public void setAddrType(AddrTypeEnum addrType) {
        this.addrType = addrType;
    }

    public SourceMobileMQParameters withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 地址
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public SourceMobileMQParameters withSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }

    /**
     * 依赖SDK
     * @return sdkUrl
     */
    public String getSdkUrl() {
        return sdkUrl;
    }

    public void setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
    }

    public SourceMobileMQParameters withConsumeTimeout(Integer consumeTimeout) {
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

    public SourceMobileMQParameters withMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 消息类型
     * @return messageType
     */
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public SourceMobileMQParameters withSuspendTime(Integer suspendTime) {
        this.suspendTime = suspendTime;
        return this;
    }

    /**
     * 失败重试的等待时间
     * minimum: 10
     * maximum: 1800
     * @return suspendTime
     */
    public Integer getSuspendTime() {
        return suspendTime;
    }

    public void setSuspendTime(Integer suspendTime) {
        this.suspendTime = suspendTime;
    }

    public SourceMobileMQParameters withMaxReconsumerTimes(Integer maxReconsumerTimes) {
        this.maxReconsumerTimes = maxReconsumerTimes;
        return this;
    }

    /**
     * 最大重试次数
     * minimum: 1
     * maximum: 16
     * @return maxReconsumerTimes
     */
    public Integer getMaxReconsumerTimes() {
        return maxReconsumerTimes;
    }

    public void setMaxReconsumerTimes(Integer maxReconsumerTimes) {
        this.maxReconsumerTimes = maxReconsumerTimes;
    }

    public SourceMobileMQParameters withConsumerThreadNums(Integer consumerThreadNums) {
        this.consumerThreadNums = consumerThreadNums;
        return this;
    }

    /**
     * 消费线程数
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

    public SourceMobileMQParameters withConsumerBatchMaxSize(Integer consumerBatchMaxSize) {
        this.consumerBatchMaxSize = consumerBatchMaxSize;
        return this;
    }

    /**
     * 批量消费最大消息数
     * minimum: 1
     * maximum: 1024
     * @return consumerBatchMaxSize
     */
    public Integer getConsumerBatchMaxSize() {
        return consumerBatchMaxSize;
    }

    public void setConsumerBatchMaxSize(Integer consumerBatchMaxSize) {
        this.consumerBatchMaxSize = consumerBatchMaxSize;
    }

    public SourceMobileMQParameters withConsumerMaxWait(Integer consumerMaxWait) {
        this.consumerMaxWait = consumerMaxWait;
        return this;
    }

    /**
     * 批量消费最大等待时长，单位：秒
     * minimum: 0
     * maximum: 450
     * @return consumerMaxWait
     */
    public Integer getConsumerMaxWait() {
        return consumerMaxWait;
    }

    public void setConsumerMaxWait(Integer consumerMaxWait) {
        this.consumerMaxWait = consumerMaxWait;
    }

    public SourceMobileMQParameters withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public SourceMobileMQParameters withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceMobileMQParameters that = (SourceMobileMQParameters) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.authenticationRequired, that.authenticationRequired)
            && Objects.equals(this.msgTraceSwitch, that.msgTraceSwitch)
            && Objects.equals(this.accessKey, that.accessKey) && Objects.equals(this.secretKey, that.secretKey)
            && Objects.equals(this.messageModel, that.messageModel) && Objects.equals(this.addrType, that.addrType)
            && Objects.equals(this.addr, that.addr) && Objects.equals(this.sdkUrl, that.sdkUrl)
            && Objects.equals(this.consumeTimeout, that.consumeTimeout)
            && Objects.equals(this.messageType, that.messageType) && Objects.equals(this.suspendTime, that.suspendTime)
            && Objects.equals(this.maxReconsumerTimes, that.maxReconsumerTimes)
            && Objects.equals(this.consumerThreadNums, that.consumerThreadNums)
            && Objects.equals(this.consumerBatchMaxSize, that.consumerBatchMaxSize)
            && Objects.equals(this.consumerMaxWait, that.consumerMaxWait) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            instanceId,
            topic,
            tag,
            authenticationRequired,
            msgTraceSwitch,
            accessKey,
            secretKey,
            messageModel,
            addrType,
            addr,
            sdkUrl,
            consumeTimeout,
            messageType,
            suspendTime,
            maxReconsumerTimes,
            consumerThreadNums,
            consumerBatchMaxSize,
            consumerMaxWait,
            vpcId,
            subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceMobileMQParameters {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    authenticationRequired: ").append(toIndentedString(authenticationRequired)).append("\n");
        sb.append("    msgTraceSwitch: ").append(toIndentedString(msgTraceSwitch)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    messageModel: ").append(toIndentedString(messageModel)).append("\n");
        sb.append("    addrType: ").append(toIndentedString(addrType)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    sdkUrl: ").append(toIndentedString(sdkUrl)).append("\n");
        sb.append("    consumeTimeout: ").append(toIndentedString(consumeTimeout)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
        sb.append("    suspendTime: ").append(toIndentedString(suspendTime)).append("\n");
        sb.append("    maxReconsumerTimes: ").append(toIndentedString(maxReconsumerTimes)).append("\n");
        sb.append("    consumerThreadNums: ").append(toIndentedString(consumerThreadNums)).append("\n");
        sb.append("    consumerBatchMaxSize: ").append(toIndentedString(consumerBatchMaxSize)).append("\n");
        sb.append("    consumerMaxWait: ").append(toIndentedString(consumerMaxWait)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
