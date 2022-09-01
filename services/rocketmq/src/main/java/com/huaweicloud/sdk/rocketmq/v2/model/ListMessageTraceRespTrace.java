package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "success")

    private Boolean success;

    /**
     * 轨迹类型
     */
    public static final class TraceTypeEnum {

        /**
         * Enum PUB for value: "Pub"
         */
        public static final TraceTypeEnum PUB = new TraceTypeEnum("Pub");

        /**
         * Enum SUB for value: "Sub"
         */
        public static final TraceTypeEnum SUB = new TraceTypeEnum("Sub");

        /**
         * Enum ENDTRANSACTION for value: "EndTransaction"
         */
        public static final TraceTypeEnum ENDTRANSACTION = new TraceTypeEnum("EndTransaction");

        private static final Map<String, TraceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TraceTypeEnum> createStaticFields() {
            Map<String, TraceTypeEnum> map = new HashMap<>();
            map.put("Pub", PUB);
            map.put("Sub", SUB);
            map.put("EndTransaction", ENDTRANSACTION);
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
            TraceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TraceTypeEnum(value);
            }
            return result;
        }

        public static TraceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TraceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "trace_type")

    private TraceTypeEnum traceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    @JacksonXmlProperty(localName = "timestamp")

    private BigDecimal timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time")

    @JacksonXmlProperty(localName = "cost_time")

    private BigDecimal costTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_status")

    @JacksonXmlProperty(localName = "consume_status")

    private BigDecimal consumeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    @JacksonXmlProperty(localName = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id")

    @JacksonXmlProperty(localName = "msg_id")

    private String msgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset_msg_id")

    @JacksonXmlProperty(localName = "offset_msg_id")

    private String offsetMsgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    @JacksonXmlProperty(localName = "keys")

    private String keys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_host")

    @JacksonXmlProperty(localName = "store_host")

    private String storeHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_host")

    @JacksonXmlProperty(localName = "client_host")

    private String clientHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times")

    @JacksonXmlProperty(localName = "retry_times")

    private String retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_length")

    @JacksonXmlProperty(localName = "body_length")

    private BigDecimal bodyLength;

    /**
     * 消息类型。
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

        private static final Map<String, MsgTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MsgTypeEnum> createStaticFields() {
            Map<String, MsgTypeEnum> map = new HashMap<>();
            map.put("Normal_Msg", NORMAL_MSG);
            map.put("Trans_Msg_Half", TRANS_MSG_HALF);
            map.put("Trans_msg_Commit", TRANS_MSG_COMMIT);
            map.put("Delay_Msg", DELAY_MSG);
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
            MsgTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MsgTypeEnum(value);
            }
            return result;
        }

        public static MsgTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MsgTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "msg_type")

    private MsgTypeEnum msgType;

    /**
     * 事务状态。
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
            TransactionStateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TransactionStateEnum(value);
            }
            return result;
        }

        public static TransactionStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TransactionStateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "transaction_state")

    private TransactionStateEnum transactionState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    @JacksonXmlProperty(localName = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_transaction_check")

    @JacksonXmlProperty(localName = "from_transaction_check")

    private Boolean fromTransactionCheck;

    public ListMessageTraceRespTrace withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 是否成功。
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
     * 轨迹类型
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
     * 时间。
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
     * 生产组或消费组。
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
     * 耗时。
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
     * 请求ID。
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
     * 消费状态。
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
     * 主题名称。
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
     * 消息ID。
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
     * offset消息ID。
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
     * 消息的标签。
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
     * 消息的keys。
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
     * 存储消息的主机IP。
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
     * 产生消息的主机IP。
     * @return clientHost
     */
    public String getClientHost() {
        return clientHost;
    }

    public void setClientHost(String clientHost) {
        this.clientHost = clientHost;
    }

    public ListMessageTraceRespTrace withRetryTimes(String retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * 重试次数。
     * @return retryTimes
     */
    public String getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(String retryTimes) {
        this.retryTimes = retryTimes;
    }

    public ListMessageTraceRespTrace withBodyLength(BigDecimal bodyLength) {
        this.bodyLength = bodyLength;
        return this;
    }

    /**
     * 消息体长度。
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
     * 消息类型。
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
     * 事务状态。
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
     * 事务ID。
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
     * 是否为事务回查的响应。
     * @return fromTransactionCheck
     */
    public Boolean getFromTransactionCheck() {
        return fromTransactionCheck;
    }

    public void setFromTransactionCheck(Boolean fromTransactionCheck) {
        this.fromTransactionCheck = fromTransactionCheck;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMessageTraceRespTrace listMessageTraceRespTrace = (ListMessageTraceRespTrace) o;
        return Objects.equals(this.success, listMessageTraceRespTrace.success)
            && Objects.equals(this.traceType, listMessageTraceRespTrace.traceType)
            && Objects.equals(this.timestamp, listMessageTraceRespTrace.timestamp)
            && Objects.equals(this.groupName, listMessageTraceRespTrace.groupName)
            && Objects.equals(this.costTime, listMessageTraceRespTrace.costTime)
            && Objects.equals(this.requestId, listMessageTraceRespTrace.requestId)
            && Objects.equals(this.consumeStatus, listMessageTraceRespTrace.consumeStatus)
            && Objects.equals(this.topic, listMessageTraceRespTrace.topic)
            && Objects.equals(this.msgId, listMessageTraceRespTrace.msgId)
            && Objects.equals(this.offsetMsgId, listMessageTraceRespTrace.offsetMsgId)
            && Objects.equals(this.tags, listMessageTraceRespTrace.tags)
            && Objects.equals(this.keys, listMessageTraceRespTrace.keys)
            && Objects.equals(this.storeHost, listMessageTraceRespTrace.storeHost)
            && Objects.equals(this.clientHost, listMessageTraceRespTrace.clientHost)
            && Objects.equals(this.retryTimes, listMessageTraceRespTrace.retryTimes)
            && Objects.equals(this.bodyLength, listMessageTraceRespTrace.bodyLength)
            && Objects.equals(this.msgType, listMessageTraceRespTrace.msgType)
            && Objects.equals(this.transactionState, listMessageTraceRespTrace.transactionState)
            && Objects.equals(this.transactionId, listMessageTraceRespTrace.transactionId)
            && Objects.equals(this.fromTransactionCheck, listMessageTraceRespTrace.fromTransactionCheck);
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
