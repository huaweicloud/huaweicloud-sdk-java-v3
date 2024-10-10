package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Ips
 */
public class Ips {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_id")

    private String ipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "foreign_switch_status")

    private Integer foreignSwitchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udp_switch_status")

    private Integer udpSwitchStatus;

    public Ips withIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }

    /**
     * ip id
     * @return ipId
     */
    public String getIpId() {
        return ipId;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public Ips withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Ips withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 线路
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public Ips withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * 数据中心
     * @return dataCenter
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public Ips withForeignSwitchStatus(Integer foreignSwitchStatus) {
        this.foreignSwitchStatus = foreignSwitchStatus;
        return this;
    }

    /**
     * 海外区域封禁状态 0-关闭 1-开启
     * @return foreignSwitchStatus
     */
    public Integer getForeignSwitchStatus() {
        return foreignSwitchStatus;
    }

    public void setForeignSwitchStatus(Integer foreignSwitchStatus) {
        this.foreignSwitchStatus = foreignSwitchStatus;
    }

    public Ips withUdpSwitchStatus(Integer udpSwitchStatus) {
        this.udpSwitchStatus = udpSwitchStatus;
        return this;
    }

    /**
     * UDP协议禁用 0-关闭 1-开启
     * @return udpSwitchStatus
     */
    public Integer getUdpSwitchStatus() {
        return udpSwitchStatus;
    }

    public void setUdpSwitchStatus(Integer udpSwitchStatus) {
        this.udpSwitchStatus = udpSwitchStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ips that = (Ips) obj;
        return Objects.equals(this.ipId, that.ipId) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.dataCenter, that.dataCenter)
            && Objects.equals(this.foreignSwitchStatus, that.foreignSwitchStatus)
            && Objects.equals(this.udpSwitchStatus, that.udpSwitchStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipId, ip, isp, dataCenter, foreignSwitchStatus, udpSwitchStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ips {\n");
        sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    foreignSwitchStatus: ").append(toIndentedString(foreignSwitchStatus)).append("\n");
        sb.append("    udpSwitchStatus: ").append(toIndentedString(udpSwitchStatus)).append("\n");
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
