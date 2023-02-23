package com.huaweicloud.sdk.mrs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListExecuteJobRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    

    private String pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="current_page")
    

    private String currentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    public ListExecuteJobRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 分页查询每页返回的最大作业数量。  取值范围：[1～100]
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    

    public ListExecuteJobRequest withCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    


    /**
     * 当前查询页码。
     * @return currentPage
     */
    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    

    public ListExecuteJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public ListExecuteJobRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群编号。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public ListExecuteJobRequest withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 作业状态编码：  - 1：Terminated表示已终止的作业状态 - 2：Running表示运行中的作业状态 - 3：Completed表示已完成的作业状态 - 4：Abnormal表示异常的作业状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    public ListExecuteJobRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 作业执行对象的编号。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListExecuteJobRequest listExecuteJobRequest = (ListExecuteJobRequest) o;
        return Objects.equals(this.pageSize, listExecuteJobRequest.pageSize) &&
            Objects.equals(this.currentPage, listExecuteJobRequest.currentPage) &&
            Objects.equals(this.jobName, listExecuteJobRequest.jobName) &&
            Objects.equals(this.clusterId, listExecuteJobRequest.clusterId) &&
            Objects.equals(this.state, listExecuteJobRequest.state) &&
            Objects.equals(this.id, listExecuteJobRequest.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pageSize, currentPage, jobName, clusterId, state, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExecuteJobRequest {\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

