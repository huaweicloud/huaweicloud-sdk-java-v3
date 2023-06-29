package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 受配置检测影响的服务器信息
 */
public class SecurityCheckHostInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_public_ip")

    private String hostPublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_private_ip")

    private String hostPrivateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passed_num")

    private Integer passedNum;

    public SecurityCheckHostInfoResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public SecurityCheckHostInfoResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public SecurityCheckHostInfoResponseInfo withHostPublicIp(String hostPublicIp) {
        this.hostPublicIp = hostPublicIp;
        return this;
    }

    /**
     * 服务器公网IP
     * @return hostPublicIp
     */
    public String getHostPublicIp() {
        return hostPublicIp;
    }

    public void setHostPublicIp(String hostPublicIp) {
        this.hostPublicIp = hostPublicIp;
    }

    public SecurityCheckHostInfoResponseInfo withHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
        return this;
    }

    /**
     * 服务器私网IP
     * @return hostPrivateIp
     */
    public String getHostPrivateIp() {
        return hostPrivateIp;
    }

    public void setHostPrivateIp(String hostPrivateIp) {
        this.hostPrivateIp = hostPrivateIp;
    }

    public SecurityCheckHostInfoResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * 扫描时间
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

    public SecurityCheckHostInfoResponseInfo withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 风险项数量
     * minimum: 0
     * maximum: 2147483647
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public SecurityCheckHostInfoResponseInfo withPassedNum(Integer passedNum) {
        this.passedNum = passedNum;
        return this;
    }

    /**
     * 通过项数量
     * minimum: 0
     * maximum: 2147483647
     * @return passedNum
     */
    public Integer getPassedNum() {
        return passedNum;
    }

    public void setPassedNum(Integer passedNum) {
        this.passedNum = passedNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckHostInfoResponseInfo that = (SecurityCheckHostInfoResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostPublicIp, that.hostPublicIp)
            && Objects.equals(this.hostPrivateIp, that.hostPrivateIp) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.failedNum, that.failedNum) && Objects.equals(this.passedNum, that.passedNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, hostPublicIp, hostPrivateIp, scanTime, failedNum, passedNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckHostInfoResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostPublicIp: ").append(toIndentedString(hostPublicIp)).append("\n");
        sb.append("    hostPrivateIp: ").append(toIndentedString(hostPrivateIp)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    passedNum: ").append(toIndentedString(passedNum)).append("\n");
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
