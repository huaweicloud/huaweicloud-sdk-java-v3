package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.EachEncryptRsp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEncryptTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_array")
    
    private List<EachEncryptRsp> taskArray = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_truncated")
    
    private Integer isTruncated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListEncryptTaskResponse withTaskArray(List<EachEncryptRsp> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    
    public ListEncryptTaskResponse addTaskArrayItem(EachEncryptRsp taskArrayItem) {
        if(this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListEncryptTaskResponse withTaskArray(Consumer<List<EachEncryptRsp>> taskArraySetter) {
        if(this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    /**
     * 任务列表
     * @return taskArray
     */
    public List<EachEncryptRsp> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<EachEncryptRsp> taskArray) {
        this.taskArray = taskArray;
    }

    

    public ListEncryptTaskResponse withIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    


    /**
     * 是否截断
     * minimum: 0
     * maximum: 2147483647
     * @return isTruncated
     */
    public Integer getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
    }

    

    public ListEncryptTaskResponse withTotal(Integer total) {
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
        ListEncryptTaskResponse listEncryptTaskResponse = (ListEncryptTaskResponse) o;
        return Objects.equals(this.taskArray, listEncryptTaskResponse.taskArray) &&
            Objects.equals(this.isTruncated, listEncryptTaskResponse.isTruncated) &&
            Objects.equals(this.total, listEncryptTaskResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskArray, isTruncated, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEncryptTaskResponse {\n");
        sb.append("    taskArray: ").append(toIndentedString(taskArray)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
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

