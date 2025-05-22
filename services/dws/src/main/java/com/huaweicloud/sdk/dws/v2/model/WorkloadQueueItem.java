package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 工作负载资源池。 **取值范围**： 不涉及。
 */
public class WorkloadQueueItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_query_optimize")

    private String shortQueryOptimize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_query_concurrency_num")

    private Integer shortQueryConcurrencyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_item_list")

    private List<WorkloadResourceItem> resourceItemList = null;

    public WorkloadQueueItem withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * **参数解释**： 资源池名称。 **取值范围**： 不涉及。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public WorkloadQueueItem withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名称。 **取值范围**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public WorkloadQueueItem withShortQueryOptimize(String shortQueryOptimize) {
        this.shortQueryOptimize = shortQueryOptimize;
        return this;
    }

    /**
     * **参数解释**： 工作负载队列短查询加速开关。 **取值范围**： 不涉及。
     * @return shortQueryOptimize
     */
    public String getShortQueryOptimize() {
        return shortQueryOptimize;
    }

    public void setShortQueryOptimize(String shortQueryOptimize) {
        this.shortQueryOptimize = shortQueryOptimize;
    }

    public WorkloadQueueItem withShortQueryConcurrencyNum(Integer shortQueryConcurrencyNum) {
        this.shortQueryConcurrencyNum = shortQueryConcurrencyNum;
        return this;
    }

    /**
     * **参数解释**： 工作负载队列短查询并发数。 **取值范围**： 不涉及。
     * @return shortQueryConcurrencyNum
     */
    public Integer getShortQueryConcurrencyNum() {
        return shortQueryConcurrencyNum;
    }

    public void setShortQueryConcurrencyNum(Integer shortQueryConcurrencyNum) {
        this.shortQueryConcurrencyNum = shortQueryConcurrencyNum;
    }

    public WorkloadQueueItem withResourceItemList(List<WorkloadResourceItem> resourceItemList) {
        this.resourceItemList = resourceItemList;
        return this;
    }

    public WorkloadQueueItem addResourceItemListItem(WorkloadResourceItem resourceItemListItem) {
        if (this.resourceItemList == null) {
            this.resourceItemList = new ArrayList<>();
        }
        this.resourceItemList.add(resourceItemListItem);
        return this;
    }

    public WorkloadQueueItem withResourceItemList(Consumer<List<WorkloadResourceItem>> resourceItemListSetter) {
        if (this.resourceItemList == null) {
            this.resourceItemList = new ArrayList<>();
        }
        resourceItemListSetter.accept(this.resourceItemList);
        return this;
    }

    /**
     * **参数解释**： 资源配置队列。 **取值范围**： 不涉及。
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
        WorkloadQueueItem that = (WorkloadQueueItem) obj;
        return Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.shortQueryOptimize, that.shortQueryOptimize)
            && Objects.equals(this.shortQueryConcurrencyNum, that.shortQueryConcurrencyNum)
            && Objects.equals(this.resourceItemList, that.resourceItemList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(queueName, logicalClusterName, shortQueryOptimize, shortQueryConcurrencyNum, resourceItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadQueueItem {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    shortQueryOptimize: ").append(toIndentedString(shortQueryOptimize)).append("\n");
        sb.append("    shortQueryConcurrencyNum: ").append(toIndentedString(shortQueryConcurrencyNum)).append("\n");
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
