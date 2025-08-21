package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SessionVO
 */
public class SessionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes")

    private Double bytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_associate_instance_type")

    private String dstAssociateInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_device_name")

    private String dstDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private String dstIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private String dstPort;

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
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_byte")

    private Double requestByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_byte")

    private Double responseByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessions")

    private Long sessions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_associate_instance_type")

    private String srcAssociateInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_device_name")

    private String srcDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_id")

    private String srcRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_name")

    private String srcRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    public SessionVO withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * **参数解释**： 应用 **取值范围**： 不涉及
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public SessionVO withBytes(Double bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * **参数解释**： 字节数 **取值范围**： 不涉及
     * @return bytes
     */
    public Double getBytes() {
        return bytes;
    }

    public void setBytes(Double bytes) {
        this.bytes = bytes;
    }

    public SessionVO withDstAssociateInstanceType(String dstAssociateInstanceType) {
        this.dstAssociateInstanceType = dstAssociateInstanceType;
        return this;
    }

    /**
     * **参数解释**： 目的IP关联资产类型 **取值范围**： 不涉及
     * @return dstAssociateInstanceType
     */
    public String getDstAssociateInstanceType() {
        return dstAssociateInstanceType;
    }

    public void setDstAssociateInstanceType(String dstAssociateInstanceType) {
        this.dstAssociateInstanceType = dstAssociateInstanceType;
    }

    public SessionVO withDstDeviceName(String dstDeviceName) {
        this.dstDeviceName = dstDeviceName;
        return this;
    }

    /**
     * **参数解释**： 目的IP关联资产名称 **取值范围**： 不涉及
     * @return dstDeviceName
     */
    public String getDstDeviceName() {
        return dstDeviceName;
    }

    public void setDstDeviceName(String dstDeviceName) {
        this.dstDeviceName = dstDeviceName;
    }

    public SessionVO withDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    /**
     * **参数解释**： 目的IP **取值范围**： 不涉及
     * @return dstIp
     */
    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public SessionVO withDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * **参数解释**： 目的端口 **取值范围**： 不涉及
     * @return dstPort
     */
    public String getDstPort() {
        return dstPort;
    }

    public void setDstPort(String dstPort) {
        this.dstPort = dstPort;
    }

    public SessionVO withDstHost(String dstHost) {
        this.dstHost = dstHost;
        return this;
    }

    /**
     * **参数解释**： 目的域名 **取值范围**： 不涉及
     * @return dstHost
     */
    public String getDstHost() {
        return dstHost;
    }

    public void setDstHost(String dstHost) {
        this.dstHost = dstHost;
    }

    public SessionVO withDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
        return this;
    }

    /**
     * **参数解释**： 目的regionID **取值范围**： 不涉及
     * @return dstRegionId
     */
    public String getDstRegionId() {
        return dstRegionId;
    }

    public void setDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
    }

    public SessionVO withDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
        return this;
    }

    /**
     * **参数解释**： 目的地区 **取值范围**： 不涉及
     * @return dstRegionName
     */
    public String getDstRegionName() {
        return dstRegionName;
    }

    public void setDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
    }

    public SessionVO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间 **取值范围**： 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SessionVO withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议 **取值范围**： 不涉及
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public SessionVO withRequestByte(Double requestByte) {
        this.requestByte = requestByte;
        return this;
    }

    /**
     * **参数解释**： 请求字节数 **取值范围**： 不涉及
     * @return requestByte
     */
    public Double getRequestByte() {
        return requestByte;
    }

    public void setRequestByte(Double requestByte) {
        this.requestByte = requestByte;
    }

    public SessionVO withResponseByte(Double responseByte) {
        this.responseByte = responseByte;
        return this;
    }

    /**
     * **参数解释**： 响应字节数 **取值范围**： 不涉及
     * @return responseByte
     */
    public Double getResponseByte() {
        return responseByte;
    }

    public void setResponseByte(Double responseByte) {
        this.responseByte = responseByte;
    }

    public SessionVO withSessions(Long sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * **参数解释**： 会话数量 **取值范围**： 不涉及
     * @return sessions
     */
    public Long getSessions() {
        return sessions;
    }

    public void setSessions(Long sessions) {
        this.sessions = sessions;
    }

    public SessionVO withSrcAssociateInstanceType(String srcAssociateInstanceType) {
        this.srcAssociateInstanceType = srcAssociateInstanceType;
        return this;
    }

    /**
     * **参数解释**： 源IP关联资产类型 **取值范围**： 不涉及
     * @return srcAssociateInstanceType
     */
    public String getSrcAssociateInstanceType() {
        return srcAssociateInstanceType;
    }

    public void setSrcAssociateInstanceType(String srcAssociateInstanceType) {
        this.srcAssociateInstanceType = srcAssociateInstanceType;
    }

    public SessionVO withSrcDeviceName(String srcDeviceName) {
        this.srcDeviceName = srcDeviceName;
        return this;
    }

    /**
     * **参数解释**： 源IP关联资产名称 **取值范围**： 不涉及
     * @return srcDeviceName
     */
    public String getSrcDeviceName() {
        return srcDeviceName;
    }

    public void setSrcDeviceName(String srcDeviceName) {
        this.srcDeviceName = srcDeviceName;
    }

    public SessionVO withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * **参数解释**： 源IP **取值范围**： 不涉及
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public SessionVO withSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
        return this;
    }

    /**
     * **参数解释**： 源地区 ID **取值范围**： 不涉及
     * @return srcRegionId
     */
    public String getSrcRegionId() {
        return srcRegionId;
    }

    public void setSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
    }

    public SessionVO withSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
        return this;
    }

    /**
     * **参数解释**： 源地区 **取值范围**： 不涉及
     * @return srcRegionName
     */
    public String getSrcRegionName() {
        return srcRegionName;
    }

    public void setSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
    }

    public SessionVO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 会话开始时间 **取值范围**： 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionVO that = (SessionVO) obj;
        return Objects.equals(this.app, that.app) && Objects.equals(this.bytes, that.bytes)
            && Objects.equals(this.dstAssociateInstanceType, that.dstAssociateInstanceType)
            && Objects.equals(this.dstDeviceName, that.dstDeviceName) && Objects.equals(this.dstIp, that.dstIp)
            && Objects.equals(this.dstPort, that.dstPort) && Objects.equals(this.dstHost, that.dstHost)
            && Objects.equals(this.dstRegionId, that.dstRegionId)
            && Objects.equals(this.dstRegionName, that.dstRegionName) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.requestByte, that.requestByte)
            && Objects.equals(this.responseByte, that.responseByte) && Objects.equals(this.sessions, that.sessions)
            && Objects.equals(this.srcAssociateInstanceType, that.srcAssociateInstanceType)
            && Objects.equals(this.srcDeviceName, that.srcDeviceName) && Objects.equals(this.srcIp, that.srcIp)
            && Objects.equals(this.srcRegionId, that.srcRegionId)
            && Objects.equals(this.srcRegionName, that.srcRegionName) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app,
            bytes,
            dstAssociateInstanceType,
            dstDeviceName,
            dstIp,
            dstPort,
            dstHost,
            dstRegionId,
            dstRegionName,
            endTime,
            protocol,
            requestByte,
            responseByte,
            sessions,
            srcAssociateInstanceType,
            srcDeviceName,
            srcIp,
            srcRegionId,
            srcRegionName,
            startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionVO {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    dstAssociateInstanceType: ").append(toIndentedString(dstAssociateInstanceType)).append("\n");
        sb.append("    dstDeviceName: ").append(toIndentedString(dstDeviceName)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    dstHost: ").append(toIndentedString(dstHost)).append("\n");
        sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
        sb.append("    dstRegionName: ").append(toIndentedString(dstRegionName)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    requestByte: ").append(toIndentedString(requestByte)).append("\n");
        sb.append("    responseByte: ").append(toIndentedString(responseByte)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("    srcAssociateInstanceType: ").append(toIndentedString(srcAssociateInstanceType)).append("\n");
        sb.append("    srcDeviceName: ").append(toIndentedString(srcDeviceName)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
        sb.append("    srcRegionName: ").append(toIndentedString(srcRegionName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
