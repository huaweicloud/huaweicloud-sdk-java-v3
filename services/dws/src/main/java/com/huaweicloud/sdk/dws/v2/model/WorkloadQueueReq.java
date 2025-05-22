package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 资源池信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class WorkloadQueueReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_queue")

    private WorkloadQueue workloadQueue;

    public WorkloadQueueReq withWorkloadQueue(WorkloadQueue workloadQueue) {
        this.workloadQueue = workloadQueue;
        return this;
    }

    public WorkloadQueueReq withWorkloadQueue(Consumer<WorkloadQueue> workloadQueueSetter) {
        if (this.workloadQueue == null) {
            this.workloadQueue = new WorkloadQueue();
            workloadQueueSetter.accept(this.workloadQueue);
        }

        return this;
    }

    /**
     * Get workloadQueue
     * @return workloadQueue
     */
    public WorkloadQueue getWorkloadQueue() {
        return workloadQueue;
    }

    public void setWorkloadQueue(WorkloadQueue workloadQueue) {
        this.workloadQueue = workloadQueue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadQueueReq that = (WorkloadQueueReq) obj;
        return Objects.equals(this.workloadQueue, that.workloadQueue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadQueue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadQueueReq {\n");
        sb.append("    workloadQueue: ").append(toIndentedString(workloadQueue)).append("\n");
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
