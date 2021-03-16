package com.huaweicloud.sdk.dgc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.StartJobReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class StartJobRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private StartJobReq body;

    public StartJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * Get jobName
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public StartJobRequest withBody(StartJobReq body) {
        this.body = body;
        return this;
    }

    public StartJobRequest withBody(Consumer<StartJobReq> bodySetter) {
        if(this.body == null ){
            this.body = new StartJobReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public StartJobReq getBody() {
        return body;
    }

    public void setBody(StartJobReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartJobRequest startJobRequest = (StartJobRequest) o;
        return Objects.equals(this.jobName, startJobRequest.jobName) &&
            Objects.equals(this.body, startJobRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartJobRequest {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

