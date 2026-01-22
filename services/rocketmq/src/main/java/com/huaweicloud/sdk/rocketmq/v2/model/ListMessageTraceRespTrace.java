package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ListMessageTraceRespTrace
 */
public class ListMessageTraceRespTrace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    /**
     * **参数解释**： 轨迹类型。 **约束限制**： 不涉及。 **取值范围**： - Pub：生产者成功发送消息。 - SubBefore：消费者准备消费消息。 - SubAfter：消费者完成消息消费。 - EndTransaction：事务消息被提交或回滚。 - Receive：服务侧接收消息。 - Ack：消费者手动确认消费。 **默认取值**： 不涉及。
     */
    public static final class TraceTypeEnum {

        /**
         * Enum PUB for value: "Pub"
         */
        public static final TraceTypeEnum PUB = new TraceTypeEnum("Pub");

        /**
         * Enum SUBBEFORE for value: "SubBefore"
         */
        public static final TraceTypeEnum SUBBEFORE = new TraceTypeEnum("SubBefore");

        /**
         * Enum SUBAFTER for value: "SubAfter"
         */
        public static final TraceTypeEnum SUBAFTER = new TraceTypeEnum("SubAfter");

        /**
         * Enum ENDTRANSACTION for value: "EndTransaction"
         */
        public static final TraceTypeEnum ENDTRANSACTION = new TraceTypeEnum("EndTransaction");

        /**
         * Enum RECEIVE for value: "Receive"
         */
        public static final TraceTypeEnum RECEIVE = new TraceTypeEnum("Receive");

        /**
         * Enum ACK for value: "Ack"
         */
        public static final TraceTypeEnum ACK = new TraceTypeEnum("Ack");

        private static final Map<String, TraceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TraceTypeEnum> createStaticFields() {
            Map<String, TraceTypeEnum> map = new HashMap<>();
            map.put("Pub", PUB);
            map.put("SubBefore", SUBBEFORE);
            map.put("SubAfter", SUBAFTER);
            map.put("EndTransaction", ENDTRANSACTION);
            map.put("Receive", RECEIVE);
            map.put("Ack", ACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TraceTypeEnum(String value) {
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
        public static TraceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TraceTypeEnum(value));
        }

        public static TraceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TraceTypeEnum) {
                return this.value.equals(((TraceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_type")

    private TraceTypeEnum traceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private BigDecimal timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time")

    private BigDecimal costTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_status")

    private BigDecimal consumeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id")

    private String msgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset_msg_id")

    private String offsetMsgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private String keys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_host")

    private String storeHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_host")

    private String clientHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times")

    private Integer retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_length")

    private BigDecimal bodyLength;

    /**
     * **参数解释**： 消息类型。 **约束限制**： 不涉及。 **取值范围**： - Normal_Msg：普通消息。 - Trans_Msg_Half：事务半消息。 - Trans_msg_Commit：事务提交消息。 - Delay_Msg：延迟消息。 - Order_Msg：顺序消息。 **默认取值** 不涉及。
     */
    public static final class MsgTypeEnum {

        /**
         * Enum NORMAL_MSG for value: "Normal_Msg"
         */
        public static final MsgTypeEnum NORMAL_MSG = new MsgTypeEnum("Normal_Msg");

        /**
         * Enum TRANS_MSG_HALF for value: "Trans_Msg_Half"
         */
        public static final MsgTypeEnum TRANS_MSG_HALF = new MsgTypeEnum("Trans_Msg_Half");

        /**
         * Enum TRANS_MSG_COMMIT for value: "Trans_msg_Commit"
         */
        public static final MsgTypeEnum TRANS_MSG_COMMIT = new MsgTypeEnum("Trans_msg_Commit");

        /**
         * Enum DELAY_MSG for value: "Delay_Msg"
         */
        public static final MsgTypeEnum DELAY_MSG = new MsgTypeEnum("Delay_Msg");

        /**
         * Enum ORDER_MSG for value: "Order_Msg"
         */
        public static final MsgTypeEnum ORDER_MSG = new MsgTypeEnum("Order_Msg");

        private static final Map<String, MsgTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MsgTypeEnum> createStaticFields() {
            Map<String, MsgTypeEnum> map = new HashMap<>();
            map.put("Normal_Msg", NORMAL_MSG);
            map.put("Trans_Msg_Half", TRANS_MSG_HALF);
            map.put("Trans_msg_Commit", TRANS_MSG_COMMIT);
            map.put("Delay_Msg", DELAY_MSG);
            map.put("Order_Msg", ORDER_MSG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MsgTypeEnum(String value) {
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
        public static MsgTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MsgTypeEnum(value));
        }

        public static MsgTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MsgTypeEnum) {
                return this.value.equals(((MsgTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_type")

    private MsgTypeEnum msgType;

    /**
     * **参数解释**： 事务状态。 **约束限制**： 不涉及。 **取值范围**： - COMMIT_MESSAGE - ROLLBACK_MESSAGE - UNKNOW **默认取值** 不涉及。
     */
    public static final class TransactionStateEnum {

        /**
         * Enum COMMIT_MESSAGE for value: "COMMIT_MESSAGE"
         */
        public static final TransactionStateEnum COMMIT_MESSAGE = new TransactionStateEnum("COMMIT_MESSAGE");

        /**
         * Enum ROLLBACK_MESSAGE for value: "ROLLBACK_MESSAGE"
         */
        public static final TransactionStateEnum ROLLBACK_MESSAGE = new TransactionStateEnum("ROLLBACK_MESSAGE");

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final TransactionStateEnum UNKNOW = new TransactionStateEnum("UNKNOW");

        private static final Map<String, TransactionStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TransactionStateEnum> createStaticFields() {
            Map<String, TransactionStateEnum> map = new HashMap<>();
            map.put("COMMIT_MESSAGE", COMMIT_MESSAGE);
            map.put("ROLLBACK_MESSAGE", ROLLBACK_MESSAGE);
            map.put("UNKNOW", UNKNOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TransactionStateEnum(String value) {
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
        public static TransactionStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TransactionStateEnum(value));
        }

        public static TransactionStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransactionStateEnum) {
                return this.value.equals(((TransactionStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_state")

    private TransactionStateEnum transactionState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_transaction_check")

    private Boolean fromTransactionCheck;

    public ListMessageTraceRespTrace withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * **参数解释**： 是否成功。 **约束限制**： 不涉及。 **取值范围**： - true：成功。 - false：失败。 **默认取值**： 不涉及。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ListMessageTraceRespTrace withTraceType(TraceTypeEnum traceType) {
        this.traceType = traceType;
        return this;
    }

    /**
     * **参数解释**： 轨迹类型。 **约束限制**： 不涉及。 **取值范围**： - Pub：生产者成功发送消息。 - SubBefore：消费者准备消费消息。 - SubAfter：消费者完成消息消费。 - EndTransaction：事务消息被提交或回滚。 - Receive：服务侧接收消息。 - Ack：消费者手动确认消费。 **默认取值**： 不涉及。
     * @return traceType
     */
    public TraceTypeEnum getTraceType() {
        return traceType;
    }

    public void setTraceType(TraceTypeEnum traceType) {
        this.traceType = traceType;
    }

    public ListMessageTraceRespTrace withTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * **参数解释**： 时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return timestamp
     */
    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public ListMessageTraceRespTrace withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 生产组或消费组。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ListMessageTraceRespTrace withCostTime(BigDecimal costTime) {
        this.costTime = costTime;
        return this;
    }

    /**
     * **参数解释**： 耗时。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return costTime
     */
    public BigDecimal getCostTime() {
        return costTime;
    }

    public void setCostTime(BigDecimal costTime) {
        this.costTime = costTime;
    }

    public ListMessageTraceRespTrace withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListMessageTraceRespTrace withConsumeStatus(BigDecimal consumeStatus) {
        this.consumeStatus = consumeStatus;
        return this;
    }

    /**
     * **参数解释**： 消费状态： **约束限制**： 不涉及。 **取值范围**：  - 0-消费成功  - 1-消费超时  - 2-消费发生异常   - 3-消费返回NULL  - 5-消费失败 **默认取值**： 不涉及。
     * @return consumeStatus
     */
    public BigDecimal getConsumeStatus() {
        return consumeStatus;
    }

    public void setConsumeStatus(BigDecimal consumeStatus) {
        this.consumeStatus = consumeStatus;
    }

    public ListMessageTraceRespTrace withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： 主题名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ListMessageTraceRespTrace withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * **参数解释**： 消息ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return msgId
     */
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public ListMessageTraceRespTrace withOffsetMsgId(String offsetMsgId) {
        this.offsetMsgId = offsetMsgId;
        return this;
    }

    /**
     * **参数解释**： offset消息ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return offsetMsgId
     */
    public String getOffsetMsgId() {
        return offsetMsgId;
    }

    public void setOffsetMsgId(String offsetMsgId) {
        this.offsetMsgId = offsetMsgId;
    }

    public ListMessageTraceRespTrace withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * **参数解释**： 消息的标签。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListMessageTraceRespTrace withKeys(String keys) {
        this.keys = keys;
        return this;
    }

    /**
     * **参数解释**： 消息的keys。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return keys
     */
    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public ListMessageTraceRespTrace withStoreHost(String storeHost) {
        this.storeHost = storeHost;
        return this;
    }

    /**
     * **参数解释**： 存储消息的主机IP。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return storeHost
     */
    public String getStoreHost() {
        return storeHost;
    }

    public void setStoreHost(String storeHost) {
        this.storeHost = storeHost;
    }

    public ListMessageTraceRespTrace withClientHost(String clientHost) {
        this.clientHost = clientHost;
        return this;
    }

    /**
     * **参数解释**： 产生消息的主机IP。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return clientHost
     */
    public String getClientHost() {
        return clientHost;
    }

    public void setClientHost(String clientHost) {
        this.clientHost = clientHost;
    }

    public ListMessageTraceRespTrace withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * **参数解释**： 重试次数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public ListMessageTraceRespTrace withBodyLength(BigDecimal bodyLength) {
        this.bodyLength = bodyLength;
        return this;
    }

    /**
     * **参数解释**： 消息体长度。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return bodyLength
     */
    public BigDecimal getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(BigDecimal bodyLength) {
        this.bodyLength = bodyLength;
    }

    public ListMessageTraceRespTrace withMsgType(MsgTypeEnum msgType) {
        this.msgType = msgType;
        return this;
    }

    /**
     * **参数解释**： 消息类型。 **约束限制**： 不涉及。 **取值范围**： - Normal_Msg：普通消息。 - Trans_Msg_Half：事务半消息。 - Trans_msg_Commit：事务提交消息。 - Delay_Msg：延迟消息。 - Order_Msg：顺序消息。 **默认取值** 不涉及。
     * @return msgType
     */
    public MsgTypeEnum getMsgType() {
        return msgType;
    }

    public void setMsgType(MsgTypeEnum msgType) {
        this.msgType = msgType;
    }

    public ListMessageTraceRespTrace withTransactionState(TransactionStateEnum transactionState) {
        this.transactionState = transactionState;
        return this;
    }

    /**
     * **参数解释**： 事务状态。 **约束限制**： 不涉及。 **取值范围**： - COMMIT_MESSAGE - ROLLBACK_MESSAGE - UNKNOW **默认取值** 不涉及。
     * @return transactionState
     */
    public TransactionStateEnum getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(TransactionStateEnum transactionState) {
        this.transactionState = transactionState;
    }

    public ListMessageTraceRespTrace withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * **参数解释**： 事务ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值** 不涉及。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ListMessageTraceRespTrace withFromTransactionCheck(Boolean fromTransactionCheck) {
        this.fromTransactionCheck = fromTransactionCheck;
        return this;
    }

    /**
     * **参数解释**： 是否为事务回查的响应。 **约束限制**： 不涉及。 **取值范围**： - true：是事务回查的响应。 - false：不是事务回查的响应。 **默认取值** 不涉及。
     * @return fromTransactionCheck
     */
    public Boolean getFromTransactionCheck() {
        return fromTransactionCheck;
    }

    public void setFromTransactionCheck(Boolean fromTransactionCheck) {
        this.fromTransactionCheck = fromTransactionCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMessageTraceRespTrace that = (ListMessageTraceRespTrace) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.traceType, that.traceType)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.costTime, that.costTime) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.consumeStatus, that.consumeStatus) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.msgId, that.msgId) && Objects.equals(this.offsetMsgId, that.offsetMsgId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.keys, that.keys)
            && Objects.equals(this.storeHost, that.storeHost) && Objects.equals(this.clientHost, that.clientHost)
            && Objects.equals(this.retryTimes, that.retryTimes) && Objects.equals(this.bodyLength, that.bodyLength)
            && Objects.equals(this.msgType, that.msgType)
            && Objects.equals(this.transactionState, that.transactionState)
            && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.fromTransactionCheck, that.fromTransactionCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success,
            traceType,
            timestamp,
            groupName,
            costTime,
            requestId,
            consumeStatus,
            topic,
            msgId,
            offsetMsgId,
            tags,
            keys,
            storeHost,
            clientHost,
            retryTimes,
            bodyLength,
            msgType,
            transactionState,
            transactionId,
            fromTransactionCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageTraceRespTrace {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    traceType: ").append(toIndentedString(traceType)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    consumeStatus: ").append(toIndentedString(consumeStatus)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    offsetMsgId: ").append(toIndentedString(offsetMsgId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    storeHost: ").append(toIndentedString(storeHost)).append("\n");
        sb.append("    clientHost: ").append(toIndentedString(clientHost)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    bodyLength: ").append(toIndentedString(bodyLength)).append("\n");
        sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
        sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    fromTransactionCheck: ").append(toIndentedString(fromTransactionCheck)).append("\n");
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
