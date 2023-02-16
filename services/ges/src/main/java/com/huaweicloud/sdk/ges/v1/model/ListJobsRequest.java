package com.huaweicloud.sdk.ges.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListJobsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_name")
    
    
    private String graphName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;

    public ListJobsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 任务结束日期，当前只支持日期，不支持时间。格式为：yyyy-MM-dd，比如2019-03-27。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ListJobsRequest withGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }

    


    /**
     * 关联的图名称
     * @return graphName
     */
    public String getGraphName() {
        return graphName;
    }

    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    

    public ListJobsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页资源数量的最大值，默认为10。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListJobsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 本次请求的起始位置，默认为0。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListJobsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 任务开始日期，当前只支持日期，不支持时间。格式为：yyyy-MM-dd，比如2019-03-27。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListJobsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态。取值为：  - running - waiting - success - failed
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobsRequest listJobsRequest = (ListJobsRequest) o;
        return Objects.equals(this.endTime, listJobsRequest.endTime) &&
            Objects.equals(this.graphName, listJobsRequest.graphName) &&
            Objects.equals(this.limit, listJobsRequest.limit) &&
            Objects.equals(this.offset, listJobsRequest.offset) &&
            Objects.equals(this.startTime, listJobsRequest.startTime) &&
            Objects.equals(this.status, listJobsRequest.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endTime, graphName, limit, offset, startTime, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsRequest {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    graphName: ").append(toIndentedString(graphName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

