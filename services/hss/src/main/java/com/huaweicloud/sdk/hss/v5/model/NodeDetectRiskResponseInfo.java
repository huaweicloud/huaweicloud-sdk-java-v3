package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeDetectRiskResponseInfo
 */
public class NodeDetectRiskResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images_num")

    private Integer imagesNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_risk_num")

    private Integer baselineRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Integer vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_num")

    private Integer eventNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_node_num")

    private Integer protectNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_total_num")

    private Integer nodeTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    public NodeDetectRiskResponseInfo withImagesNum(Integer imagesNum) {
        this.imagesNum = imagesNum;
        return this;
    }

    /**
     * 有风险镜像数量
     * minimum: 0
     * maximum: 2147483647
     * @return imagesNum
     */
    public Integer getImagesNum() {
        return imagesNum;
    }

    public void setImagesNum(Integer imagesNum) {
        this.imagesNum = imagesNum;
    }

    public NodeDetectRiskResponseInfo withBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
        return this;
    }

    /**
     * 基线检查风险项总和
     * minimum: 0
     * maximum: 2147483647
     * @return baselineRiskNum
     */
    public Integer getBaselineRiskNum() {
        return baselineRiskNum;
    }

    public void setBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
    }

    public NodeDetectRiskResponseInfo withVulNum(Integer vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * 漏洞数量
     * minimum: 0
     * maximum: 2147483647
     * @return vulNum
     */
    public Integer getVulNum() {
        return vulNum;
    }

    public void setVulNum(Integer vulNum) {
        this.vulNum = vulNum;
    }

    public NodeDetectRiskResponseInfo withEventNum(Integer eventNum) {
        this.eventNum = eventNum;
        return this;
    }

    /**
     * 告警数量
     * minimum: 0
     * maximum: 2147483647
     * @return eventNum
     */
    public Integer getEventNum() {
        return eventNum;
    }

    public void setEventNum(Integer eventNum) {
        this.eventNum = eventNum;
    }

    public NodeDetectRiskResponseInfo withProtectNodeNum(Integer protectNodeNum) {
        this.protectNodeNum = protectNodeNum;
        return this;
    }

    /**
     * 集群开启防护节点数量
     * minimum: 0
     * maximum: 2147483647
     * @return protectNodeNum
     */
    public Integer getProtectNodeNum() {
        return protectNodeNum;
    }

    public void setProtectNodeNum(Integer protectNodeNum) {
        this.protectNodeNum = protectNodeNum;
    }

    public NodeDetectRiskResponseInfo withNodeTotalNum(Integer nodeTotalNum) {
        this.nodeTotalNum = nodeTotalNum;
        return this;
    }

    /**
     * 集群节点总数
     * minimum: 0
     * maximum: 2147483647
     * @return nodeTotalNum
     */
    public Integer getNodeTotalNum() {
        return nodeTotalNum;
    }

    public void setNodeTotalNum(Integer nodeTotalNum) {
        this.nodeTotalNum = nodeTotalNum;
    }

    public NodeDetectRiskResponseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public NodeDetectRiskResponseInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 付费模式包括： - on_demand：按需 - free：免费
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeDetectRiskResponseInfo that = (NodeDetectRiskResponseInfo) obj;
        return Objects.equals(this.imagesNum, that.imagesNum)
            && Objects.equals(this.baselineRiskNum, that.baselineRiskNum) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.eventNum, that.eventNum) && Objects.equals(this.protectNodeNum, that.protectNodeNum)
            && Objects.equals(this.nodeTotalNum, that.nodeTotalNum) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.chargingMode, that.chargingMode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(imagesNum, baselineRiskNum, vulNum, eventNum, protectNodeNum, nodeTotalNum, clusterId, chargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeDetectRiskResponseInfo {\n");
        sb.append("    imagesNum: ").append(toIndentedString(imagesNum)).append("\n");
        sb.append("    baselineRiskNum: ").append(toIndentedString(baselineRiskNum)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    eventNum: ").append(toIndentedString(eventNum)).append("\n");
        sb.append("    protectNodeNum: ").append(toIndentedString(protectNodeNum)).append("\n");
        sb.append("    nodeTotalNum: ").append(toIndentedString(nodeTotalNum)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
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
