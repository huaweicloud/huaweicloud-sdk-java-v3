package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 资源池信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class WorkloadQueueInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_queue_name")

    private String workloadQueueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_item_list")

    private List<WorkloadResourceItem> resourceItemList = null;

    public WorkloadQueueInfo withWorkloadQueueName(String workloadQueueName) {
        this.workloadQueueName = workloadQueueName;
        return this;
    }

    /**
     * **参数解释**： 资源池名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return workloadQueueName
     */
    public String getWorkloadQueueName() {
        return workloadQueueName;
    }

    public void setWorkloadQueueName(String workloadQueueName) {
        this.workloadQueueName = workloadQueueName;
    }

    public WorkloadQueueInfo withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public WorkloadQueueInfo withResourceItemList(List<WorkloadResourceItem> resourceItemList) {
        this.resourceItemList = resourceItemList;
        return this;
    }

    public WorkloadQueueInfo addResourceItemListItem(WorkloadResourceItem resourceItemListItem) {
        if (this.resourceItemList == null) {
            this.resourceItemList = new ArrayList<>();
        }
        this.resourceItemList.add(resourceItemListItem);
        return this;
    }

    public WorkloadQueueInfo withResourceItemList(Consumer<List<WorkloadResourceItem>> resourceItemListSetter) {
        if (this.resourceItemList == null) {
            this.resourceItemList = new ArrayList<>();
        }
        resourceItemListSetter.accept(this.resourceItemList);
        return this;
    }

    /**
     * **参数解释**： 资源配置队列。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return resourceItemList
     */
    public List<WorkloadResourceItem> getResourceItemList() {
        return resourceItemList;
    }

    public void setResourceItemList(List<WorkloadResourceItem> resourceItemList) {
        this.resourceItemList = resourceItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadQueueInfo that = (WorkloadQueueInfo) obj;
        return Objects.equals(this.workloadQueueName, that.workloadQueueName)
            && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.resourceItemList, that.resourceItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadQueueName, logicalClusterName, resourceItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadQueueInfo {\n");
        sb.append("    workloadQueueName: ").append(toIndentedString(workloadQueueName)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    resourceItemList: ").append(toIndentedString(resourceItemList)).append("\n");
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
