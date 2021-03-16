package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ResetTracksTaskInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListResetTracksTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_array")
    
    private List<ResetTracksTaskInfo> taskArray = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_truncated")
    
    private Integer isTruncated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListResetTracksTaskResponse withTaskArray(List<ResetTracksTaskInfo> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    
    public ListResetTracksTaskResponse addTaskArrayItem(ResetTracksTaskInfo taskArrayItem) {
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListResetTracksTaskResponse withTaskArray(Consumer<List<ResetTracksTaskInfo>> taskArraySetter) {
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
    public List<ResetTracksTaskInfo> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<ResetTracksTaskInfo> taskArray) {
        this.taskArray = taskArray;
    }

    

    public ListResetTracksTaskResponse withIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    


    /**
     * 查询结果是否被截取。 - 1代表被截取，即还有结果未被返回，可以通过设置page和size参数继续查询。 - 0代表未被截取，即所有结果已被返回。 
     * @return isTruncated
     */
    public Integer getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
    }

    

    public ListResetTracksTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 查询结果的数量。 
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
        ListResetTracksTaskResponse listResetTracksTaskResponse = (ListResetTracksTaskResponse) o;
        return Objects.equals(this.taskArray, listResetTracksTaskResponse.taskArray) &&
            Objects.equals(this.isTruncated, listResetTracksTaskResponse.isTruncated) &&
            Objects.equals(this.total, listResetTracksTaskResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskArray, isTruncated, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResetTracksTaskResponse {\n");
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

