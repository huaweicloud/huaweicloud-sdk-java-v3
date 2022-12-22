package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListFlowLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    /**
     * 日志类型
     */
    public static final class LogTypeEnum {

        /**
         * Enum INTERNET for value: "internet"
         */
        public static final LogTypeEnum INTERNET = new LogTypeEnum("internet");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final LogTypeEnum VPC = new LogTypeEnum("vpc");

        /**
         * Enum NAT for value: "nat"
         */
        public static final LogTypeEnum NAT = new LogTypeEnum("nat");

        private static final Map<String, LogTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTypeEnum> createStaticFields() {
            Map<String, LogTypeEnum> map = new HashMap<>();
            map.put("internet", INTERNET);
            map.put("vpc", VPC);
            map.put("nat", NAT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogTypeEnum(String value) {
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
        public static LogTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LogTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogTypeEnum(value);
            }
            return result;
        }

        public static LogTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LogTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogTypeEnum) {
                return this.value.equals(((LogTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private LogTypeEnum logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private Integer srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private String dstIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private Integer dstPort;

    /**
     * 协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     */
    public static final class ProtocolEnum {

        /**
         * Enum _6 for value: "6"
         */
        public static final ProtocolEnum _6 = new ProtocolEnum("6");

        /**
         * Enum _17 for value: "17"
         */
        public static final ProtocolEnum _17 = new ProtocolEnum("17");

        /**
         * Enum _1 for value: "1"
         */
        public static final ProtocolEnum _1 = new ProtocolEnum("1");

        /**
         * Enum _58 for value: "58"
         */
        public static final ProtocolEnum _58 = new ProtocolEnum("58");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("6", _6);
            map.put("17", _17);
            map.put("1", _1);
            map.put("58", _58);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_date")

    private Long nextDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListFlowLogsRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用查询防火墙实例接口获得。具体可参考APIExlorer和帮助中心FAQ。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ListFlowLogsRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ListFlowLogsRequest withLogType(LogTypeEnum logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 日志类型
     * @return logType
     */
    public LogTypeEnum getLogType() {
        return logType;
    }

    public void setLogType(LogTypeEnum logType) {
        this.logType = logType;
    }

    public ListFlowLogsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListFlowLogsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListFlowLogsRequest withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public ListFlowLogsRequest withSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口
     * minimum: 0
     * maximum: 65535
     * @return srcPort
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public ListFlowLogsRequest withDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    /**
     * 目的IP
     * @return dstIp
     */
    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public ListFlowLogsRequest withDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * 目的端口
     * minimum: 0
     * maximum: 65535
     * @return dstPort
     */
    public Integer getDstPort() {
        return dstPort;
    }

    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    public ListFlowLogsRequest withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public ListFlowLogsRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用协议
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListFlowLogsRequest withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 文档ID，首页时为null，非首页时不为null
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public ListFlowLogsRequest withNextDate(Long nextDate) {
        this.nextDate = nextDate;
        return this;
    }

    /**
     * 日期，首页时为null，非首页时不为null
     * @return nextDate
     */
    public Long getNextDate() {
        return nextDate;
    }

    public void setNextDate(Long nextDate) {
        this.nextDate = nextDate;
    }

    public ListFlowLogsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFlowLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 1
     * maximum: 1024
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlowLogsRequest listFlowLogsRequest = (ListFlowLogsRequest) o;
        return Objects.equals(this.fwInstanceId, listFlowLogsRequest.fwInstanceId)
            && Objects.equals(this.direction, listFlowLogsRequest.direction)
            && Objects.equals(this.logType, listFlowLogsRequest.logType)
            && Objects.equals(this.startTime, listFlowLogsRequest.startTime)
            && Objects.equals(this.endTime, listFlowLogsRequest.endTime)
            && Objects.equals(this.srcIp, listFlowLogsRequest.srcIp)
            && Objects.equals(this.srcPort, listFlowLogsRequest.srcPort)
            && Objects.equals(this.dstIp, listFlowLogsRequest.dstIp)
            && Objects.equals(this.dstPort, listFlowLogsRequest.dstPort)
            && Objects.equals(this.protocol, listFlowLogsRequest.protocol)
            && Objects.equals(this.app, listFlowLogsRequest.app)
            && Objects.equals(this.logId, listFlowLogsRequest.logId)
            && Objects.equals(this.nextDate, listFlowLogsRequest.nextDate)
            && Objects.equals(this.offset, listFlowLogsRequest.offset)
            && Objects.equals(this.limit, listFlowLogsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId,
            direction,
            logType,
            startTime,
            endTime,
            srcIp,
            srcPort,
            dstIp,
            dstPort,
            protocol,
            app,
            logId,
            nextDate,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlowLogsRequest {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    nextDate: ").append(toIndentedString(nextDate)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
