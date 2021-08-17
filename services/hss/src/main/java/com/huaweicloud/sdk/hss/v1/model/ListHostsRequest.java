package com.huaweicloud.sdk.hss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListHostsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_result")

    private String detectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListHostsRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 主机开通的版本，包含如下5种输入。 - hss.version.null ：无。 - hss.version.basic ：基础版。 - hss.version.enterprise ：企业版。 -
     * hss.version.premium ：旗舰版。 - hss.version.wtp ：网页防篡改版。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListHostsRequest withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /** Agent状态，包含如下3种。 - not_register ：未注册。 - online ：在线。 - offline ：离线。
     * 
     * @return agentStatus */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ListHostsRequest withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /** Agent状态，包含如下4种。 - ACTIVE ：正在运行。 - SHUTOFF ：关机。 - BUILDING ：创建中。 - ERROR ：故障。
     * 
     * @return hostStatus */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ListHostsRequest withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /** 防护状态，包含如下2种。 - closed ：关闭。 - opened ：开启。
     * 
     * @return protectStatus */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ListHostsRequest withDetectResult(String detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    /** 防护状态，包含如下3种。 - undetect ：未检测。 - clean ：无风险。 - risk ：有风险。
     * 
     * @return detectResult */
    public String getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(String detectResult) {
        this.detectResult = detectResult;
    }

    public ListHostsRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /** 云主机名称
     * 
     * @return hostName */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListHostsRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /** 云主机私有IP
     * 
     * @return hostIp */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ListHostsRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /** 云主机公网IP
     * 
     * @return publicIp */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ListHostsRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /** 操作系统类型
     * 
     * @return osType */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListHostsRequest withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /** 收费模式，包含如下2种。 - packet_cycle ：包年/包月。 - on_demand ：按需。
     * 
     * @return chargingMode */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListHostsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 默认10 minimum: 0 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHostsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 默认0 minimum: 0 maximum: 100000
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostsRequest listHostsRequest = (ListHostsRequest) o;
        return Objects.equals(this.version, listHostsRequest.version)
            && Objects.equals(this.agentStatus, listHostsRequest.agentStatus)
            && Objects.equals(this.hostStatus, listHostsRequest.hostStatus)
            && Objects.equals(this.protectStatus, listHostsRequest.protectStatus)
            && Objects.equals(this.detectResult, listHostsRequest.detectResult)
            && Objects.equals(this.hostName, listHostsRequest.hostName)
            && Objects.equals(this.hostIp, listHostsRequest.hostIp)
            && Objects.equals(this.publicIp, listHostsRequest.publicIp)
            && Objects.equals(this.osType, listHostsRequest.osType)
            && Objects.equals(this.chargingMode, listHostsRequest.chargingMode)
            && Objects.equals(this.limit, listHostsRequest.limit)
            && Objects.equals(this.offset, listHostsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            agentStatus,
            hostStatus,
            protectStatus,
            detectResult,
            hostName,
            hostIp,
            publicIp,
            osType,
            chargingMode,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsRequest {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
