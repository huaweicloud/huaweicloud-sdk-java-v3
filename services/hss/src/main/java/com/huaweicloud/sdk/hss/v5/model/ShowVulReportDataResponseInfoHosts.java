package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowVulReportDataResponseInfoHosts
 */
public class ShowVulReportDataResponseInfoHosts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_total_num")

    private Integer vulTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    public ShowVulReportDataResponseInfoHosts withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 主机名称 **取值范围**： 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ShowVulReportDataResponseInfoHosts withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 服务器公网ip **取值范围**： 字符长度1-64位 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ShowVulReportDataResponseInfoHosts withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 服务器私网ip **取值范围**： 字符长度0-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ShowVulReportDataResponseInfoHosts withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最近扫描时间 **取值范围**： 最小值0，最大值9223372036854775807 
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

    public ShowVulReportDataResponseInfoHosts withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**： 漏洞风险等级 **取值范围**： - Critical：紧急。 - High：高危。 - Medium：中危。 - Low：低危。 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public ShowVulReportDataResponseInfoHosts withVulTotalNum(Integer vulTotalNum) {
        this.vulTotalNum = vulTotalNum;
        return this;
    }

    /**
     * **参数解释**： 漏洞数 **取值范围**： 最小值0，最大值10000000 
     * minimum: 0
     * maximum: 10000000
     * @return vulTotalNum
     */
    public Integer getVulTotalNum() {
        return vulTotalNum;
    }

    public void setVulTotalNum(Integer vulTotalNum) {
        this.vulTotalNum = vulTotalNum;
    }

    public ShowVulReportDataResponseInfoHosts withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-128位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulReportDataResponseInfoHosts that = (ShowVulReportDataResponseInfoHosts) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.vulTotalNum, that.vulTotalNum) && Objects.equals(this.hostId, that.hostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, publicIp, privateIp, scanTime, severityLevel, vulTotalNum, hostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulReportDataResponseInfoHosts {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    vulTotalNum: ").append(toIndentedString(vulTotalNum)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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
