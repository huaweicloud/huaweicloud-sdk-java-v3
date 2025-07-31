package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群风险信息
 */
public class ListClusterRisksResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_id")

    private String riskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_name")

    private String riskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_category")

    private String riskCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_time")

    private Long lastScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remediation")

    private String remediation;

    public ListClusterRisksResponseInfoDataList withRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }

    /**
     * 风险id
     * @return riskId
     */
    public String getRiskId() {
        return riskId;
    }

    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    public ListClusterRisksResponseInfoDataList withRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }

    /**
     * 风险名称
     * @return riskName
     */
    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public ListClusterRisksResponseInfoDataList withClusterId(String clusterId) {
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

    public ListClusterRisksResponseInfoDataList withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListClusterRisksResponseInfoDataList withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险程度，包含如下   - high ：高危   - medium ：中危   - low ：低危   - tips ：提示
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ListClusterRisksResponseInfoDataList withRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
        return this;
    }

    /**
     * 风险分类，包含如下：   - control_plane：控制平面   - access_control：访问控制   - network：网络   - workload：工作负载   - secrets：密钥管理   - node_escape：节点逃逸
     * @return riskCategory
     */
    public String getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
    }

    public ListClusterRisksResponseInfoDataList withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * 风险数量
     * minimum: 0
     * maximum: 2000000
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ListClusterRisksResponseInfoDataList withLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
        return this;
    }

    /**
     * 最近一次扫描时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastScanTime
     */
    public Long getLastScanTime() {
        return lastScanTime;
    }

    public void setLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
    }

    public ListClusterRisksResponseInfoDataList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 风险描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListClusterRisksResponseInfoDataList withRemediation(String remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * 风险的处置建议
     * @return remediation
     */
    public String getRemediation() {
        return remediation;
    }

    public void setRemediation(String remediation) {
        this.remediation = remediation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterRisksResponseInfoDataList that = (ListClusterRisksResponseInfoDataList) obj;
        return Objects.equals(this.riskId, that.riskId) && Objects.equals(this.riskName, that.riskName)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.riskCategory, that.riskCategory)
            && Objects.equals(this.riskNum, that.riskNum) && Objects.equals(this.lastScanTime, that.lastScanTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.remediation, that.remediation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskId,
            riskName,
            clusterId,
            clusterName,
            riskLevel,
            riskCategory,
            riskNum,
            lastScanTime,
            description,
            remediation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterRisksResponseInfoDataList {\n");
        sb.append("    riskId: ").append(toIndentedString(riskId)).append("\n");
        sb.append("    riskName: ").append(toIndentedString(riskName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    riskCategory: ").append(toIndentedString(riskCategory)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    lastScanTime: ").append(toIndentedString(lastScanTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
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
