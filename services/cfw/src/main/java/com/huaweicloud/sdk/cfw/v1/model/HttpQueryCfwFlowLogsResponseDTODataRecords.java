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
 * HttpQueryCfwFlowLogsResponseDTODataRecords
 */
public class HttpQueryCfwFlowLogsResponseDTODataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes")

    private Double bytes;

    /**
     * 方向，有内到外和外到内两种
     */
    public static final class DirectionEnum {

        /**
         * Enum OUT2IN for value: "out2in"
         */
        public static final DirectionEnum OUT2IN = new DirectionEnum("out2in");

        /**
         * Enum IN2OUT for value: "in2out"
         */
        public static final DirectionEnum IN2OUT = new DirectionEnum("in2out");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("out2in", OUT2IN);
            map.put("in2out", IN2OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packets")

    private Integer packets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

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
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private Integer dstPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_host")

    private String dstHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_id")

    private String dstRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_name")

    private String dstRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_id")

    private String srcRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_name")

    private String srcRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_province_id")

    private String dstProvinceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_province_name")

    private String dstProvinceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_city_id")

    private String dstCityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_city_name")

    private String dstCityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_province_id")

    private String srcProvinceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_province_name")

    private String srcProvinceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_city_id")

    private String srcCityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_city_name")

    private String srcCityName;

    public HttpQueryCfwFlowLogsResponseDTODataRecords withBytes(Double bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * 字节
     * @return bytes
     */
    public Double getBytes() {
        return bytes;
    }

    public void setBytes(Double bytes) {
        this.bytes = bytes;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，有内到外和外到内两种
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withPackets(Integer packets) {
        this.packets = packets;
        return this;
    }

    /**
     * 包
     * @return packets
     */
    public Integer getPackets() {
        return packets;
    }

    public void setPackets(Integer packets) {
        this.packets = packets;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，以毫秒为单位的时间戳，如1718936272648
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，以毫秒为单位的时间戳，如1718936272648
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 文档ID
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcIp(String srcIp) {
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

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口
     * @return srcPort
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstIp(String dstIp) {
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

    public HttpQueryCfwFlowLogsResponseDTODataRecords withApp(String app) {
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

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * 目的端口
     * @return dstPort
     */
    public Integer getDstPort() {
        return dstPort;
    }

    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6,UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstHost(String dstHost) {
        this.dstHost = dstHost;
        return this;
    }

    /**
     * 目标主机
     * @return dstHost
     */
    public String getDstHost() {
        return dstHost;
    }

    public void setDstHost(String dstHost) {
        this.dstHost = dstHost;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
        return this;
    }

    /**
     * 目的地域id
     * @return dstRegionId
     */
    public String getDstRegionId() {
        return dstRegionId;
    }

    public void setDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
        return this;
    }

    /**
     * 目的地域名称
     * @return dstRegionName
     */
    public String getDstRegionName() {
        return dstRegionName;
    }

    public void setDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
        return this;
    }

    /**
     * 源地域id
     * @return srcRegionId
     */
    public String getSrcRegionId() {
        return srcRegionId;
    }

    public void setSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
        return this;
    }

    /**
     * 源地域名称
     * @return srcRegionName
     */
    public String getSrcRegionName() {
        return srcRegionName;
    }

    public void setSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstProvinceId(String dstProvinceId) {
        this.dstProvinceId = dstProvinceId;
        return this;
    }

    /**
     * 目的省份id
     * @return dstProvinceId
     */
    public String getDstProvinceId() {
        return dstProvinceId;
    }

    public void setDstProvinceId(String dstProvinceId) {
        this.dstProvinceId = dstProvinceId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstProvinceName(String dstProvinceName) {
        this.dstProvinceName = dstProvinceName;
        return this;
    }

    /**
     * 目的省份名称
     * @return dstProvinceName
     */
    public String getDstProvinceName() {
        return dstProvinceName;
    }

    public void setDstProvinceName(String dstProvinceName) {
        this.dstProvinceName = dstProvinceName;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
        return this;
    }

    /**
     * 目的城市id
     * @return dstCityId
     */
    public String getDstCityId() {
        return dstCityId;
    }

    public void setDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withDstCityName(String dstCityName) {
        this.dstCityName = dstCityName;
        return this;
    }

    /**
     * 目的城市名称
     * @return dstCityName
     */
    public String getDstCityName() {
        return dstCityName;
    }

    public void setDstCityName(String dstCityName) {
        this.dstCityName = dstCityName;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
        return this;
    }

    /**
     * 源省份id
     * @return srcProvinceId
     */
    public String getSrcProvinceId() {
        return srcProvinceId;
    }

    public void setSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcProvinceName(String srcProvinceName) {
        this.srcProvinceName = srcProvinceName;
        return this;
    }

    /**
     * 源省份名称
     * @return srcProvinceName
     */
    public String getSrcProvinceName() {
        return srcProvinceName;
    }

    public void setSrcProvinceName(String srcProvinceName) {
        this.srcProvinceName = srcProvinceName;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
        return this;
    }

    /**
     * 源城市id
     * @return srcCityId
     */
    public String getSrcCityId() {
        return srcCityId;
    }

    public void setSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
    }

    public HttpQueryCfwFlowLogsResponseDTODataRecords withSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
        return this;
    }

    /**
     * 源城市名称
     * @return srcCityName
     */
    public String getSrcCityName() {
        return srcCityName;
    }

    public void setSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpQueryCfwFlowLogsResponseDTODataRecords that = (HttpQueryCfwFlowLogsResponseDTODataRecords) obj;
        return Objects.equals(this.bytes, that.bytes) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.packets, that.packets) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.logId, that.logId)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.srcPort, that.srcPort)
            && Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.app, that.app)
            && Objects.equals(this.dstPort, that.dstPort) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.dstHost, that.dstHost) && Objects.equals(this.dstRegionId, that.dstRegionId)
            && Objects.equals(this.dstRegionName, that.dstRegionName)
            && Objects.equals(this.srcRegionId, that.srcRegionId)
            && Objects.equals(this.srcRegionName, that.srcRegionName)
            && Objects.equals(this.dstProvinceId, that.dstProvinceId)
            && Objects.equals(this.dstProvinceName, that.dstProvinceName)
            && Objects.equals(this.dstCityId, that.dstCityId) && Objects.equals(this.dstCityName, that.dstCityName)
            && Objects.equals(this.srcProvinceId, that.srcProvinceId)
            && Objects.equals(this.srcProvinceName, that.srcProvinceName)
            && Objects.equals(this.srcCityId, that.srcCityId) && Objects.equals(this.srcCityName, that.srcCityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bytes,
            direction,
            packets,
            startTime,
            endTime,
            logId,
            srcIp,
            srcPort,
            dstIp,
            app,
            dstPort,
            protocol,
            dstHost,
            dstRegionId,
            dstRegionName,
            srcRegionId,
            srcRegionName,
            dstProvinceId,
            dstProvinceName,
            dstCityId,
            dstCityName,
            srcProvinceId,
            srcProvinceName,
            srcCityId,
            srcCityName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpQueryCfwFlowLogsResponseDTODataRecords {\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    packets: ").append(toIndentedString(packets)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    dstHost: ").append(toIndentedString(dstHost)).append("\n");
        sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
        sb.append("    dstRegionName: ").append(toIndentedString(dstRegionName)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
        sb.append("    srcRegionName: ").append(toIndentedString(srcRegionName)).append("\n");
        sb.append("    dstProvinceId: ").append(toIndentedString(dstProvinceId)).append("\n");
        sb.append("    dstProvinceName: ").append(toIndentedString(dstProvinceName)).append("\n");
        sb.append("    dstCityId: ").append(toIndentedString(dstCityId)).append("\n");
        sb.append("    dstCityName: ").append(toIndentedString(dstCityName)).append("\n");
        sb.append("    srcProvinceId: ").append(toIndentedString(srcProvinceId)).append("\n");
        sb.append("    srcProvinceName: ").append(toIndentedString(srcProvinceName)).append("\n");
        sb.append("    srcCityId: ").append(toIndentedString(srcCityId)).append("\n");
        sb.append("    srcCityName: ").append(toIndentedString(srcCityName)).append("\n");
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
