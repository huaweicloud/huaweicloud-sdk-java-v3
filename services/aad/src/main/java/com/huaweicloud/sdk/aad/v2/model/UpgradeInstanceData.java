package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradeInstanceData
 */
public class UpgradeInstanceData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_bandwidth")

    private String basicBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_bandwidth")

    private String elasticBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_bandwidth")

    private Integer serviceBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_num")

    private Integer portNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_domain_num")

    private Integer bindDomainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_service_bandwidth_type")

    private Integer elasticServiceBandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_service_bandwidth")

    private Integer elasticServiceBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_qps")

    private Integer basicQps;

    public UpgradeInstanceData withBasicBandwidth(String basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
        return this;
    }

    /**
     * 保底带宽(G)
     * @return basicBandwidth
     */
    public String getBasicBandwidth() {
        return basicBandwidth;
    }

    public void setBasicBandwidth(String basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
    }

    public UpgradeInstanceData withElasticBandwidth(String elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }

    /**
     * 弹性带宽(G)
     * @return elasticBandwidth
     */
    public String getElasticBandwidth() {
        return elasticBandwidth;
    }

    public void setElasticBandwidth(String elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
    }

    public UpgradeInstanceData withServiceBandwidth(Integer serviceBandwidth) {
        this.serviceBandwidth = serviceBandwidth;
        return this;
    }

    /**
     * 业务带宽
     * @return serviceBandwidth
     */
    public Integer getServiceBandwidth() {
        return serviceBandwidth;
    }

    public void setServiceBandwidth(Integer serviceBandwidth) {
        this.serviceBandwidth = serviceBandwidth;
    }

    public UpgradeInstanceData withPortNum(Integer portNum) {
        this.portNum = portNum;
        return this;
    }

    /**
     * 端口数
     * @return portNum
     */
    public Integer getPortNum() {
        return portNum;
    }

    public void setPortNum(Integer portNum) {
        this.portNum = portNum;
    }

    public UpgradeInstanceData withBindDomainNum(Integer bindDomainNum) {
        this.bindDomainNum = bindDomainNum;
        return this;
    }

    /**
     * 域名数
     * @return bindDomainNum
     */
    public Integer getBindDomainNum() {
        return bindDomainNum;
    }

    public void setBindDomainNum(Integer bindDomainNum) {
        this.bindDomainNum = bindDomainNum;
    }

    public UpgradeInstanceData withElasticServiceBandwidthType(Integer elasticServiceBandwidthType) {
        this.elasticServiceBandwidthType = elasticServiceBandwidthType;
        return this;
    }

    /**
     * 弹性业务带宽,0-关闭，3-月95
     * @return elasticServiceBandwidthType
     */
    public Integer getElasticServiceBandwidthType() {
        return elasticServiceBandwidthType;
    }

    public void setElasticServiceBandwidthType(Integer elasticServiceBandwidthType) {
        this.elasticServiceBandwidthType = elasticServiceBandwidthType;
    }

    public UpgradeInstanceData withElasticServiceBandwidth(Integer elasticServiceBandwidth) {
        this.elasticServiceBandwidth = elasticServiceBandwidth;
        return this;
    }

    /**
     * 弹性业务带宽增加值
     * @return elasticServiceBandwidth
     */
    public Integer getElasticServiceBandwidth() {
        return elasticServiceBandwidth;
    }

    public void setElasticServiceBandwidth(Integer elasticServiceBandwidth) {
        this.elasticServiceBandwidth = elasticServiceBandwidth;
    }

    public UpgradeInstanceData withBasicQps(Integer basicQps) {
        this.basicQps = basicQps;
        return this;
    }

    /**
     * 业务QPS(如果实例没购买过QPS，需要在页面上升级一次规格开通QPS，之后才可以通过接口修改规格)
     * @return basicQps
     */
    public Integer getBasicQps() {
        return basicQps;
    }

    public void setBasicQps(Integer basicQps) {
        this.basicQps = basicQps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeInstanceData that = (UpgradeInstanceData) obj;
        return Objects.equals(this.basicBandwidth, that.basicBandwidth)
            && Objects.equals(this.elasticBandwidth, that.elasticBandwidth)
            && Objects.equals(this.serviceBandwidth, that.serviceBandwidth)
            && Objects.equals(this.portNum, that.portNum) && Objects.equals(this.bindDomainNum, that.bindDomainNum)
            && Objects.equals(this.elasticServiceBandwidthType, that.elasticServiceBandwidthType)
            && Objects.equals(this.elasticServiceBandwidth, that.elasticServiceBandwidth)
            && Objects.equals(this.basicQps, that.basicQps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicBandwidth,
            elasticBandwidth,
            serviceBandwidth,
            portNum,
            bindDomainNum,
            elasticServiceBandwidthType,
            elasticServiceBandwidth,
            basicQps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeInstanceData {\n");
        sb.append("    basicBandwidth: ").append(toIndentedString(basicBandwidth)).append("\n");
        sb.append("    elasticBandwidth: ").append(toIndentedString(elasticBandwidth)).append("\n");
        sb.append("    serviceBandwidth: ").append(toIndentedString(serviceBandwidth)).append("\n");
        sb.append("    portNum: ").append(toIndentedString(portNum)).append("\n");
        sb.append("    bindDomainNum: ").append(toIndentedString(bindDomainNum)).append("\n");
        sb.append("    elasticServiceBandwidthType: ")
            .append(toIndentedString(elasticServiceBandwidthType))
            .append("\n");
        sb.append("    elasticServiceBandwidth: ").append(toIndentedString(elasticServiceBandwidth)).append("\n");
        sb.append("    basicQps: ").append(toIndentedString(basicQps)).append("\n");
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
