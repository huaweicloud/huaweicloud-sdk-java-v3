package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceSignatureExecutionSubtasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tasks")

    private List<SignatureExecutionSubTask> subTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceSignatureExecutionSubtasksResponse withSubTasks(List<SignatureExecutionSubTask> subTasks) {
        this.subTasks = subTasks;
        return this;
    }

    public ListInstanceSignatureExecutionSubtasksResponse addSubTasksItem(SignatureExecutionSubTask subTasksItem) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        this.subTasks.add(subTasksItem);
        return this;
    }

    public ListInstanceSignatureExecutionSubtasksResponse withSubTasks(
        Consumer<List<SignatureExecutionSubTask>> subTasksSetter) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        subTasksSetter.accept(this.subTasks);
        return this;
    }

    /**
     * 签名策略执行记录子任务列表
     * @return subTasks
     */
    public List<SignatureExecutionSubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SignatureExecutionSubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public ListInstanceSignatureExecutionSubtasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 签名策略执行记录子任务总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceSignatureExecutionSubtasksResponse that = (ListInstanceSignatureExecutionSubtasksResponse) obj;
        return Objects.equals(this.subTasks, that.subTasks) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subTasks, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceSignatureExecutionSubtasksResponse {\n");
        sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
