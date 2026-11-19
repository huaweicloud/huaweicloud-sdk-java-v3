package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CancelColdTableWaitingTasksReq
 */
public class CancelColdTableWaitingTasksReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_tasks")

    private List<CancelColdTableWaitingTask> cancelTasks = null;

    public CancelColdTableWaitingTasksReq withCancelTasks(List<CancelColdTableWaitingTask> cancelTasks) {
        this.cancelTasks = cancelTasks;
        return this;
    }

    public CancelColdTableWaitingTasksReq addCancelTasksItem(CancelColdTableWaitingTask cancelTasksItem) {
        if (this.cancelTasks == null) {
            this.cancelTasks = new ArrayList<>();
        }
        this.cancelTasks.add(cancelTasksItem);
        return this;
    }

    public CancelColdTableWaitingTasksReq withCancelTasks(
        Consumer<List<CancelColdTableWaitingTask>> cancelTasksSetter) {
        if (this.cancelTasks == null) {
            this.cancelTasks = new ArrayList<>();
        }
        cancelTasksSetter.accept(this.cancelTasks);
        return this;
    }

    /**
     * **参数解释**：  取消目标列表。  **约束限制**：  列表长度不超过50。
     * @return cancelTasks
     */
    public List<CancelColdTableWaitingTask> getCancelTasks() {
        return cancelTasks;
    }

    public void setCancelTasks(List<CancelColdTableWaitingTask> cancelTasks) {
        this.cancelTasks = cancelTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CancelColdTableWaitingTasksReq that = (CancelColdTableWaitingTasksReq) obj;
        return Objects.equals(this.cancelTasks, that.cancelTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cancelTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelColdTableWaitingTasksReq {\n");
        sb.append("    cancelTasks: ").append(toIndentedString(cancelTasks)).append("\n");
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
