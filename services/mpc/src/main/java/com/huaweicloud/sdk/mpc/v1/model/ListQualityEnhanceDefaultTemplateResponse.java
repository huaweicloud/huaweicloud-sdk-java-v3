package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListQualityEnhanceDefaultTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_array")

    private List<QualityEnhanceTemplateInfo> taskArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListQualityEnhanceDefaultTemplateResponse withTaskArray(List<QualityEnhanceTemplateInfo> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    public ListQualityEnhanceDefaultTemplateResponse addTaskArrayItem(QualityEnhanceTemplateInfo taskArrayItem) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListQualityEnhanceDefaultTemplateResponse withTaskArray(
        Consumer<List<QualityEnhanceTemplateInfo>> taskArraySetter) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    /** 任务列表
     * 
     * @return taskArray */
    public List<QualityEnhanceTemplateInfo> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<QualityEnhanceTemplateInfo> taskArray) {
        this.taskArray = taskArray;
    }

    public ListQualityEnhanceDefaultTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 查询结果数量 minimum: 0 maximum: 2147483647
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQualityEnhanceDefaultTemplateResponse listQualityEnhanceDefaultTemplateResponse =
            (ListQualityEnhanceDefaultTemplateResponse) o;
        return Objects.equals(this.taskArray, listQualityEnhanceDefaultTemplateResponse.taskArray)
            && Objects.equals(this.total, listQualityEnhanceDefaultTemplateResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskArray, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQualityEnhanceDefaultTemplateResponse {\n");
        sb.append("    taskArray: ").append(toIndentedString(taskArray)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
