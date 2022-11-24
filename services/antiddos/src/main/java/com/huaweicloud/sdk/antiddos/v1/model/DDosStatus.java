package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ddos状态响应体
 */
public class DDosStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_id")

    private String floatingIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_address")

    private String floatingIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blackhole_endtime")

    private Long blackholeEndtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_threshold")

    private Long trafficThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_threshold")

    private Long httpThreshold;

    public DDosStatus withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    /**
     * EIP的ID
     * @return floatingIpId
     */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    public DDosStatus withFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    /**
     * 浮动IP地址
     * @return floatingIpAddress
     */
    public String getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    public DDosStatus withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * EIP所属类型，可选范围： - EIP：未绑定到ECS的EIP或绑定到ECS的EIP - ELB：绑定到ELB的EIP
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public DDosStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 防护状态，可选范围： - normal：表示正常 - configging：表示设置中 - notConfig：表示未设置 - packetcleaning：表示清洗 - packetdropping：表示黑洞
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DDosStatus withBlackholeEndtime(Long blackholeEndtime) {
        this.blackholeEndtime = blackholeEndtime;
        return this;
    }

    /**
     * 黑洞结束时间
     * @return blackholeEndtime
     */
    public Long getBlackholeEndtime() {
        return blackholeEndtime;
    }

    public void setBlackholeEndtime(Long blackholeEndtime) {
        this.blackholeEndtime = blackholeEndtime;
    }

    public DDosStatus withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * 防护类型
     * @return protectType
     */
    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public DDosStatus withTrafficThreshold(Long trafficThreshold) {
        this.trafficThreshold = trafficThreshold;
        return this;
    }

    /**
     * 流量阈值
     * @return trafficThreshold
     */
    public Long getTrafficThreshold() {
        return trafficThreshold;
    }

    public void setTrafficThreshold(Long trafficThreshold) {
        this.trafficThreshold = trafficThreshold;
    }

    public DDosStatus withHttpThreshold(Long httpThreshold) {
        this.httpThreshold = httpThreshold;
        return this;
    }

    /**
     * http流量阈值
     * @return httpThreshold
     */
    public Long getHttpThreshold() {
        return httpThreshold;
    }

    public void setHttpThreshold(Long httpThreshold) {
        this.httpThreshold = httpThreshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DDosStatus ddosStatus = (DDosStatus) o;
        return Objects.equals(this.floatingIpId, ddosStatus.floatingIpId)
            && Objects.equals(this.floatingIpAddress, ddosStatus.floatingIpAddress)
            && Objects.equals(this.networkType, ddosStatus.networkType)
            && Objects.equals(this.status, ddosStatus.status)
            && Objects.equals(this.blackholeEndtime, ddosStatus.blackholeEndtime)
            && Objects.equals(this.protectType, ddosStatus.protectType)
            && Objects.equals(this.trafficThreshold, ddosStatus.trafficThreshold)
            && Objects.equals(this.httpThreshold, ddosStatus.httpThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingIpId,
            floatingIpAddress,
            networkType,
            status,
            blackholeEndtime,
            protectType,
            trafficThreshold,
            httpThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DDosStatus {\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    blackholeEndtime: ").append(toIndentedString(blackholeEndtime)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    trafficThreshold: ").append(toIndentedString(trafficThreshold)).append("\n");
        sb.append("    httpThreshold: ").append(toIndentedString(httpThreshold)).append("\n");
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
