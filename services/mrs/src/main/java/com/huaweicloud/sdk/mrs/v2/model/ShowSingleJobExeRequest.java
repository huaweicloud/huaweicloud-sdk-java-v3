package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowSingleJobExeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_execution_id")
    
    @JacksonXmlProperty(localName = "job_execution_id")
    
    private String jobExecutionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    @JacksonXmlProperty(localName = "cluster_id")
    
    private String clusterId;

    public ShowSingleJobExeRequest withJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }

    


    /**
     * 作业ID。获取方法，请参见[获取作业ID](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)。
     * @return jobExecutionId
     */
    public String getJobExecutionId() {
        return jobExecutionId;
    }

    public void setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    

    public ShowSingleJobExeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID。获取方法，请参见[获取集群ID](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSingleJobExeRequest showSingleJobExeRequest = (ShowSingleJobExeRequest) o;
        return Objects.equals(this.jobExecutionId, showSingleJobExeRequest.jobExecutionId) &&
            Objects.equals(this.clusterId, showSingleJobExeRequest.clusterId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobExecutionId, clusterId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSingleJobExeRequest {\n");
        sb.append("    jobExecutionId: ").append(toIndentedString(jobExecutionId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

