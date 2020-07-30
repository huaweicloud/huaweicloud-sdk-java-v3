package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.QualityEnhanceTemplateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListQualityEnhanceTemplateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_array")
    
    private List<QualityEnhanceTemplateInfo> taskArray = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListQualityEnhanceTemplateResponse withTaskArray(List<QualityEnhanceTemplateInfo> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    
    public ListQualityEnhanceTemplateResponse addTaskArrayItem(QualityEnhanceTemplateInfo taskArrayItem) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListQualityEnhanceTemplateResponse withTaskArray(Consumer<List<QualityEnhanceTemplateInfo>> taskArraySetter) {
        if(this.taskArray == null ){
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    /**
     * 任务列表
     * @return taskArray
     */
    public List<QualityEnhanceTemplateInfo> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<QualityEnhanceTemplateInfo> taskArray) {
        this.taskArray = taskArray;
    }

    public ListQualityEnhanceTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 查询结果数量
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
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
        ListQualityEnhanceTemplateResponse listQualityEnhanceTemplateResponse = (ListQualityEnhanceTemplateResponse) o;
        return Objects.equals(this.taskArray, listQualityEnhanceTemplateResponse.taskArray) &&
            Objects.equals(this.total, listQualityEnhanceTemplateResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskArray, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQualityEnhanceTemplateResponse {\n");
        sb.append("    taskArray: ").append(toIndentedString(taskArray)).append("\n");
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

