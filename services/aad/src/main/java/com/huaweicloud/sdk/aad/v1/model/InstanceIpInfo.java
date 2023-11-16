package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceIpInfo
 */
public class InstanceIpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_id")

    private String ipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_bandwidth")

    private Integer basicBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_bandwidth")

    private Integer elasticBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_status")

    private Integer ipStatus;

    public InstanceIpInfo withIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }

    /**
     * IP ID
     * @return ipId
     */
    public String getIpId() {
        return ipId;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public InstanceIpInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public InstanceIpInfo withBasicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
        return this;
    }

    /**
     * 保底带宽
     * @return basicBandwidth
     */
    public Integer getBasicBandwidth() {
        return basicBandwidth;
    }

    public void setBasicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
    }

    public InstanceIpInfo withElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }

    /**
     * 弹性带宽
     * @return elasticBandwidth
     */
    public Integer getElasticBandwidth() {
        return elasticBandwidth;
    }

    public void setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
    }

    public InstanceIpInfo withIpStatus(Integer ipStatus) {
        this.ipStatus = ipStatus;
        return this;
    }

    /**
     * IP状态
     * @return ipStatus
     */
    public Integer getIpStatus() {
        return ipStatus;
    }

    public void setIpStatus(Integer ipStatus) {
        this.ipStatus = ipStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceIpInfo that = (InstanceIpInfo) obj;
        return Objects.equals(this.ipId, that.ipId) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.basicBandwidth, that.basicBandwidth)
            && Objects.equals(this.elasticBandwidth, that.elasticBandwidth)
            && Objects.equals(this.ipStatus, that.ipStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipId, ip, basicBandwidth, elasticBandwidth, ipStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceIpInfo {\n");
        sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    basicBandwidth: ").append(toIndentedString(basicBandwidth)).append("\n");
        sb.append("    elasticBandwidth: ").append(toIndentedString(elasticBandwidth)).append("\n");
        sb.append("    ipStatus: ").append(toIndentedString(ipStatus)).append("\n");
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
