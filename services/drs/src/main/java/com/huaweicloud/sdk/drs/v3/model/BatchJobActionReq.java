package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 任务动作请求体
 */
public class BatchJobActionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property")
    
    private String property;

    public BatchJobActionReq withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 需要执行的特定操作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BatchJobActionReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public BatchJobActionReq withProperty(String property) {
        this.property = property;
        return this;
    }

    


    /**
     * 操作对应的参数
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchJobActionReq batchJobActionReq = (BatchJobActionReq) o;
        return Objects.equals(this.action, batchJobActionReq.action) &&
            Objects.equals(this.jobId, batchJobActionReq.jobId) &&
            Objects.equals(this.property, batchJobActionReq.property);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, jobId, property);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchJobActionReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

