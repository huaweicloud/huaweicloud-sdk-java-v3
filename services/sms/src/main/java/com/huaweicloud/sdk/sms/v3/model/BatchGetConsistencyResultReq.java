package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 所有需要获取一致性校验结果任务的请求参数
 */
public class BatchGetConsistencyResultReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_info")

    private List<BatchConsistencyReq> taskInfo = null;

    public BatchGetConsistencyResultReq withTaskInfo(List<BatchConsistencyReq> taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public BatchGetConsistencyResultReq addTaskInfoItem(BatchConsistencyReq taskInfoItem) {
        if (this.taskInfo == null) {
            this.taskInfo = new ArrayList<>();
        }
        this.taskInfo.add(taskInfoItem);
        return this;
    }

    public BatchGetConsistencyResultReq withTaskInfo(Consumer<List<BatchConsistencyReq>> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new ArrayList<>();
        }
        taskInfoSetter.accept(this.taskInfo);
        return this;
    }

    /**
     * 所有任务信息
     * @return taskInfo
     */
    public List<BatchConsistencyReq> getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(List<BatchConsistencyReq> taskInfo) {
        this.taskInfo = taskInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchGetConsistencyResultReq that = (BatchGetConsistencyResultReq) obj;
        return Objects.equals(this.taskInfo, that.taskInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGetConsistencyResultReq {\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
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
