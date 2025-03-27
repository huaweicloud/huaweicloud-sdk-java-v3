package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConsistencyResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_list")

    private List<ConsistencyResultRequestBodyResultList> resultList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public ShowConsistencyResultResponse withResultList(List<ConsistencyResultRequestBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }

    public ShowConsistencyResultResponse addResultListItem(ConsistencyResultRequestBodyResultList resultListItem) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        this.resultList.add(resultListItem);
        return this;
    }

    public ShowConsistencyResultResponse withResultList(
        Consumer<List<ConsistencyResultRequestBodyResultList>> resultListSetter) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        resultListSetter.accept(this.resultList);
        return this;
    }

    /**
     * 一致性校验结果列表
     * @return resultList
     */
    public List<ConsistencyResultRequestBodyResultList> getResultList() {
        return resultList;
    }

    public void setResultList(List<ConsistencyResultRequestBodyResultList> resultList) {
        this.resultList = resultList;
    }

    public ShowConsistencyResultResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConsistencyResultResponse that = (ShowConsistencyResultResponse) obj;
        return Objects.equals(this.resultList, that.resultList) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultList, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsistencyResultResponse {\n");
        sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
