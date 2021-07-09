package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.QueryTranscodingsTaskResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTranscodingTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_array")
    
    private List<QueryTranscodingsTaskResponse> taskArray = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_truncated")
    
    private Integer isTruncated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListTranscodingTaskResponse withTaskArray(List<QueryTranscodingsTaskResponse> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    
    public ListTranscodingTaskResponse addTaskArrayItem(QueryTranscodingsTaskResponse taskArrayItem) {
        if(this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListTranscodingTaskResponse withTaskArray(Consumer<List<QueryTranscodingsTaskResponse>> taskArraySetter) {
        if(this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    /**
     * 返回任务组
     * @return taskArray
     */
    public List<QueryTranscodingsTaskResponse> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<QueryTranscodingsTaskResponse> taskArray) {
        this.taskArray = taskArray;
    }

    

    public ListTranscodingTaskResponse withIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    


    /**
     * 查询结果是否被截取。 - 1：表示被截取，即还有结果未被返回，可以通过设置page和size参数继续查询。 - 0：表示未被截取，即所有结果已被返回。 
     * minimum: 0
     * maximum: 1
     * @return isTruncated
     */
    public Integer getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
    }

    

    public ListTranscodingTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 查询结果的数量。 
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
        ListTranscodingTaskResponse listTranscodingTaskResponse = (ListTranscodingTaskResponse) o;
        return Objects.equals(this.taskArray, listTranscodingTaskResponse.taskArray) &&
            Objects.equals(this.isTruncated, listTranscodingTaskResponse.isTruncated) &&
            Objects.equals(this.total, listTranscodingTaskResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskArray, isTruncated, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodingTaskResponse {\n");
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

