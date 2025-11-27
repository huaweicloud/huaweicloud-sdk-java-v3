package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 针对单个特定集群的综合状态概览
 */
public class ClusterReconcileStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configSetTotalNum")

    private Integer configSetTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthStatusNum")

    private Integer healthStatusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedStatusNum")

    private Integer failedStatusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknownStatusNum")

    private Integer unknownStatusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progressingStatusNum")

    private Integer progressingStatusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "k8sResourceNum")

    private Integer k8sResourceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceRepoNum")

    private Integer sourceRepoNum;

    public ClusterReconcileStatus withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 集群id
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public ClusterReconcileStatus withConfigSetTotalNum(Integer configSetTotalNum) {
        this.configSetTotalNum = configSetTotalNum;
        return this;
    }

    /**
     * 集群中配置集合的总数
     * @return configSetTotalNum
     */
    public Integer getConfigSetTotalNum() {
        return configSetTotalNum;
    }

    public void setConfigSetTotalNum(Integer configSetTotalNum) {
        this.configSetTotalNum = configSetTotalNum;
    }

    public ClusterReconcileStatus withHealthStatusNum(Integer healthStatusNum) {
        this.healthStatusNum = healthStatusNum;
        return this;
    }

    /**
     * 健康状态的配置集合数量
     * @return healthStatusNum
     */
    public Integer getHealthStatusNum() {
        return healthStatusNum;
    }

    public void setHealthStatusNum(Integer healthStatusNum) {
        this.healthStatusNum = healthStatusNum;
    }

    public ClusterReconcileStatus withFailedStatusNum(Integer failedStatusNum) {
        this.failedStatusNum = failedStatusNum;
        return this;
    }

    /**
     * 失败状态的配置集合数量
     * @return failedStatusNum
     */
    public Integer getFailedStatusNum() {
        return failedStatusNum;
    }

    public void setFailedStatusNum(Integer failedStatusNum) {
        this.failedStatusNum = failedStatusNum;
    }

    public ClusterReconcileStatus withUnknownStatusNum(Integer unknownStatusNum) {
        this.unknownStatusNum = unknownStatusNum;
        return this;
    }

    /**
     * 未知状态的配置集合数量
     * @return unknownStatusNum
     */
    public Integer getUnknownStatusNum() {
        return unknownStatusNum;
    }

    public void setUnknownStatusNum(Integer unknownStatusNum) {
        this.unknownStatusNum = unknownStatusNum;
    }

    public ClusterReconcileStatus withProgressingStatusNum(Integer progressingStatusNum) {
        this.progressingStatusNum = progressingStatusNum;
        return this;
    }

    /**
     * 正在处理中的配置集合数量
     * @return progressingStatusNum
     */
    public Integer getProgressingStatusNum() {
        return progressingStatusNum;
    }

    public void setProgressingStatusNum(Integer progressingStatusNum) {
        this.progressingStatusNum = progressingStatusNum;
    }

    public ClusterReconcileStatus withK8sResourceNum(Integer k8sResourceNum) {
        this.k8sResourceNum = k8sResourceNum;
        return this;
    }

    /**
     * 与集群关联的Kubernetes资源数量
     * @return k8sResourceNum
     */
    public Integer getK8sResourceNum() {
        return k8sResourceNum;
    }

    public void setK8sResourceNum(Integer k8sResourceNum) {
        this.k8sResourceNum = k8sResourceNum;
    }

    public ClusterReconcileStatus withSourceRepoNum(Integer sourceRepoNum) {
        this.sourceRepoNum = sourceRepoNum;
        return this;
    }

    /**
     * 与集群关联的源代码仓库数量
     * @return sourceRepoNum
     */
    public Integer getSourceRepoNum() {
        return sourceRepoNum;
    }

    public void setSourceRepoNum(Integer sourceRepoNum) {
        this.sourceRepoNum = sourceRepoNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterReconcileStatus that = (ClusterReconcileStatus) obj;
        return Objects.equals(this.clusterID, that.clusterID)
            && Objects.equals(this.configSetTotalNum, that.configSetTotalNum)
            && Objects.equals(this.healthStatusNum, that.healthStatusNum)
            && Objects.equals(this.failedStatusNum, that.failedStatusNum)
            && Objects.equals(this.unknownStatusNum, that.unknownStatusNum)
            && Objects.equals(this.progressingStatusNum, that.progressingStatusNum)
            && Objects.equals(this.k8sResourceNum, that.k8sResourceNum)
            && Objects.equals(this.sourceRepoNum, that.sourceRepoNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID,
            configSetTotalNum,
            healthStatusNum,
            failedStatusNum,
            unknownStatusNum,
            progressingStatusNum,
            k8sResourceNum,
            sourceRepoNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterReconcileStatus {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    configSetTotalNum: ").append(toIndentedString(configSetTotalNum)).append("\n");
        sb.append("    healthStatusNum: ").append(toIndentedString(healthStatusNum)).append("\n");
        sb.append("    failedStatusNum: ").append(toIndentedString(failedStatusNum)).append("\n");
        sb.append("    unknownStatusNum: ").append(toIndentedString(unknownStatusNum)).append("\n");
        sb.append("    progressingStatusNum: ").append(toIndentedString(progressingStatusNum)).append("\n");
        sb.append("    k8sResourceNum: ").append(toIndentedString(k8sResourceNum)).append("\n");
        sb.append("    sourceRepoNum: ").append(toIndentedString(sourceRepoNum)).append("\n");
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
