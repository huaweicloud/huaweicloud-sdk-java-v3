package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作负载队列
 */
public class WorkloadQueue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_queue_name")

    private String workloadQueueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_resource_item_list")

    private List<WorkloadResource> workloadResourceItemList = null;

    public WorkloadQueue withWorkloadQueueName(String workloadQueueName) {
        this.workloadQueueName = workloadQueueName;
        return this;
    }

    /**
     * 工作负载队列名称。
     * @return workloadQueueName
     */
    public String getWorkloadQueueName() {
        return workloadQueueName;
    }

    public void setWorkloadQueueName(String workloadQueueName) {
        this.workloadQueueName = workloadQueueName;
    }

    public WorkloadQueue withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * 逻辑集群名称。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public WorkloadQueue withWorkloadResourceItemList(List<WorkloadResource> workloadResourceItemList) {
        this.workloadResourceItemList = workloadResourceItemList;
        return this;
    }

    public WorkloadQueue addWorkloadResourceItemListItem(WorkloadResource workloadResourceItemListItem) {
        if (this.workloadResourceItemList == null) {
            this.workloadResourceItemList = new ArrayList<>();
        }
        this.workloadResourceItemList.add(workloadResourceItemListItem);
        return this;
    }

    public WorkloadQueue withWorkloadResourceItemList(Consumer<List<WorkloadResource>> workloadResourceItemListSetter) {
        if (this.workloadResourceItemList == null) {
            this.workloadResourceItemList = new ArrayList<>();
        }
        workloadResourceItemListSetter.accept(this.workloadResourceItemList);
        return this;
    }

    /**
     * 资源配置队列。
     * @return workloadResourceItemList
     */
    public List<WorkloadResource> getWorkloadResourceItemList() {
        return workloadResourceItemList;
    }

    public void setWorkloadResourceItemList(List<WorkloadResource> workloadResourceItemList) {
        this.workloadResourceItemList = workloadResourceItemList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkloadQueue workloadQueue = (WorkloadQueue) o;
        return Objects.equals(this.workloadQueueName, workloadQueue.workloadQueueName)
            && Objects.equals(this.logicalClusterName, workloadQueue.logicalClusterName)
            && Objects.equals(this.workloadResourceItemList, workloadQueue.workloadResourceItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadQueueName, logicalClusterName, workloadResourceItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadQueue {\n");
        sb.append("    workloadQueueName: ").append(toIndentedString(workloadQueueName)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    workloadResourceItemList: ").append(toIndentedString(workloadResourceItemList)).append("\n");
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
