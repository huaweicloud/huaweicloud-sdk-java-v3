package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作负载资源池
 */
public class QueueResourceItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_resources")

    private List<WorkloadResourceItem> queueResources = null;

    public QueueResourceItem withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 资源池名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public QueueResourceItem withQueueResources(List<WorkloadResourceItem> queueResources) {
        this.queueResources = queueResources;
        return this;
    }

    public QueueResourceItem addQueueResourcesItem(WorkloadResourceItem queueResourcesItem) {
        if (this.queueResources == null) {
            this.queueResources = new ArrayList<>();
        }
        this.queueResources.add(queueResourcesItem);
        return this;
    }

    public QueueResourceItem withQueueResources(Consumer<List<WorkloadResourceItem>> queueResourcesSetter) {
        if (this.queueResources == null) {
            this.queueResources = new ArrayList<>();
        }
        queueResourcesSetter.accept(this.queueResources);
        return this;
    }

    /**
     * 资源配置队列。
     * @return queueResources
     */
    public List<WorkloadResourceItem> getQueueResources() {
        return queueResources;
    }

    public void setQueueResources(List<WorkloadResourceItem> queueResources) {
        this.queueResources = queueResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueResourceItem that = (QueueResourceItem) obj;
        return Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.queueResources, that.queueResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, queueResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueResourceItem {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    queueResources: ").append(toIndentedString(queueResources)).append("\n");
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
