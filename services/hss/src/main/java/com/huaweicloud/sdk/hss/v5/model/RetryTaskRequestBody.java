package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重新运行任务的请求体
 */
public class RetryTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_scan_info")

    private RetryTaskRequestBodyClusterScanInfo clusterScanInfo;

    public RetryTaskRequestBody withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * **参数解释**： 任务类型 **约束限制**: 必填 **取值范围**: - cluster_scan：集群扫描。  **默认取值**: 不涉及 
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public RetryTaskRequestBody withClusterScanInfo(RetryTaskRequestBodyClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
        return this;
    }

    public RetryTaskRequestBody withClusterScanInfo(
        Consumer<RetryTaskRequestBodyClusterScanInfo> clusterScanInfoSetter) {
        if (this.clusterScanInfo == null) {
            this.clusterScanInfo = new RetryTaskRequestBodyClusterScanInfo();
            clusterScanInfoSetter.accept(this.clusterScanInfo);
        }

        return this;
    }

    /**
     * Get clusterScanInfo
     * @return clusterScanInfo
     */
    public RetryTaskRequestBodyClusterScanInfo getClusterScanInfo() {
        return clusterScanInfo;
    }

    public void setClusterScanInfo(RetryTaskRequestBodyClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryTaskRequestBody that = (RetryTaskRequestBody) obj;
        return Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.clusterScanInfo, that.clusterScanInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType, clusterScanInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryTaskRequestBody {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    clusterScanInfo: ").append(toIndentedString(clusterScanInfo)).append("\n");
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
