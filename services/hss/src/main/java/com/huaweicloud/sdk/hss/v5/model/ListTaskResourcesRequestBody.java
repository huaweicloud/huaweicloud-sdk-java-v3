package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询当前任务关联的资源列表的请求体
 */
public class ListTaskResourcesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_scan_info")

    private ListTaskResourcesRequestBodyClusterScanInfo clusterScanInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iac_scan_info")

    private ListTaskResourcesRequestBodyIacScanInfo iacScanInfo;

    public ListTaskResourcesRequestBody withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，包含如下   - cluster_scan：集群扫描   - iac_scan：iac扫描
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ListTaskResourcesRequestBody withClusterScanInfo(
        ListTaskResourcesRequestBodyClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
        return this;
    }

    public ListTaskResourcesRequestBody withClusterScanInfo(
        Consumer<ListTaskResourcesRequestBodyClusterScanInfo> clusterScanInfoSetter) {
        if (this.clusterScanInfo == null) {
            this.clusterScanInfo = new ListTaskResourcesRequestBodyClusterScanInfo();
            clusterScanInfoSetter.accept(this.clusterScanInfo);
        }

        return this;
    }

    /**
     * Get clusterScanInfo
     * @return clusterScanInfo
     */
    public ListTaskResourcesRequestBodyClusterScanInfo getClusterScanInfo() {
        return clusterScanInfo;
    }

    public void setClusterScanInfo(ListTaskResourcesRequestBodyClusterScanInfo clusterScanInfo) {
        this.clusterScanInfo = clusterScanInfo;
    }

    public ListTaskResourcesRequestBody withIacScanInfo(ListTaskResourcesRequestBodyIacScanInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
        return this;
    }

    public ListTaskResourcesRequestBody withIacScanInfo(
        Consumer<ListTaskResourcesRequestBodyIacScanInfo> iacScanInfoSetter) {
        if (this.iacScanInfo == null) {
            this.iacScanInfo = new ListTaskResourcesRequestBodyIacScanInfo();
            iacScanInfoSetter.accept(this.iacScanInfo);
        }

        return this;
    }

    /**
     * Get iacScanInfo
     * @return iacScanInfo
     */
    public ListTaskResourcesRequestBodyIacScanInfo getIacScanInfo() {
        return iacScanInfo;
    }

    public void setIacScanInfo(ListTaskResourcesRequestBodyIacScanInfo iacScanInfo) {
        this.iacScanInfo = iacScanInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskResourcesRequestBody that = (ListTaskResourcesRequestBody) obj;
        return Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.clusterScanInfo, that.clusterScanInfo)
            && Objects.equals(this.iacScanInfo, that.iacScanInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType, clusterScanInfo, iacScanInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskResourcesRequestBody {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    clusterScanInfo: ").append(toIndentedString(clusterScanInfo)).append("\n");
        sb.append("    iacScanInfo: ").append(toIndentedString(iacScanInfo)).append("\n");
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
