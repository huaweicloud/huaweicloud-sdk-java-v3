package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StartKafkaLogTaskReq
 */
public class StartKafkaLogTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_task_list")

    private List<StartKafkaLogTaskReqEntity> logTaskList = null;

    public StartKafkaLogTaskReq withLogTaskList(List<StartKafkaLogTaskReqEntity> logTaskList) {
        this.logTaskList = logTaskList;
        return this;
    }

    public StartKafkaLogTaskReq addLogTaskListItem(StartKafkaLogTaskReqEntity logTaskListItem) {
        if (this.logTaskList == null) {
            this.logTaskList = new ArrayList<>();
        }
        this.logTaskList.add(logTaskListItem);
        return this;
    }

    public StartKafkaLogTaskReq withLogTaskList(Consumer<List<StartKafkaLogTaskReqEntity>> logTaskListSetter) {
        if (this.logTaskList == null) {
            this.logTaskList = new ArrayList<>();
        }
        logTaskListSetter.accept(this.logTaskList);
        return this;
    }

    /**
     * **参数解释**： 日志任务列表。
     * @return logTaskList
     */
    public List<StartKafkaLogTaskReqEntity> getLogTaskList() {
        return logTaskList;
    }

    public void setLogTaskList(List<StartKafkaLogTaskReqEntity> logTaskList) {
        this.logTaskList = logTaskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartKafkaLogTaskReq that = (StartKafkaLogTaskReq) obj;
        return Objects.equals(this.logTaskList, that.logTaskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logTaskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartKafkaLogTaskReq {\n");
        sb.append("    logTaskList: ").append(toIndentedString(logTaskList)).append("\n");
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
