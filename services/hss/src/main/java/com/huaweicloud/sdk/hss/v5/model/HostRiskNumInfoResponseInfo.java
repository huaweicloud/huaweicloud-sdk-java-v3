package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器风险数量信息
 */
public class HostRiskNumInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk_num")

    private Integer highRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_risk_num")

    private Integer mediumRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risk_num")

    private Integer lowRiskNum;

    public HostRiskNumInfoResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HostRiskNumInfoResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HostRiskNumInfoResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**: 服务器IP **取值范围**: 字符长度1-128位 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public HostRiskNumInfoResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**: 扫描时间(ms)。 **取值范围**: 取值0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public HostRiskNumInfoResponseInfo withHighRiskNum(Integer highRiskNum) {
        this.highRiskNum = highRiskNum;
        return this;
    }

    /**
     * **参数解释**: 高危风险数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return highRiskNum
     */
    public Integer getHighRiskNum() {
        return highRiskNum;
    }

    public void setHighRiskNum(Integer highRiskNum) {
        this.highRiskNum = highRiskNum;
    }

    public HostRiskNumInfoResponseInfo withMediumRiskNum(Integer mediumRiskNum) {
        this.mediumRiskNum = mediumRiskNum;
        return this;
    }

    /**
     * **参数解释**: 中危风险数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return mediumRiskNum
     */
    public Integer getMediumRiskNum() {
        return mediumRiskNum;
    }

    public void setMediumRiskNum(Integer mediumRiskNum) {
        this.mediumRiskNum = mediumRiskNum;
    }

    public HostRiskNumInfoResponseInfo withLowRiskNum(Integer lowRiskNum) {
        this.lowRiskNum = lowRiskNum;
        return this;
    }

    /**
     * **参数解释**: 低危风险数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return lowRiskNum
     */
    public Integer getLowRiskNum() {
        return lowRiskNum;
    }

    public void setLowRiskNum(Integer lowRiskNum) {
        this.lowRiskNum = lowRiskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostRiskNumInfoResponseInfo that = (HostRiskNumInfoResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.highRiskNum, that.highRiskNum)
            && Objects.equals(this.mediumRiskNum, that.mediumRiskNum)
            && Objects.equals(this.lowRiskNum, that.lowRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, hostIp, scanTime, highRiskNum, mediumRiskNum, lowRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostRiskNumInfoResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    highRiskNum: ").append(toIndentedString(highRiskNum)).append("\n");
        sb.append("    mediumRiskNum: ").append(toIndentedString(mediumRiskNum)).append("\n");
        sb.append("    lowRiskNum: ").append(toIndentedString(lowRiskNum)).append("\n");
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
