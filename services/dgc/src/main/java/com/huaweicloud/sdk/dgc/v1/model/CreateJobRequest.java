package com.huaweicloud.sdk.dgc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.JobInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateJobRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private JobInfo body = null;

    public CreateJobRequest withBody(JobInfo body) {
        this.body = body;
        return this;
    }

    public CreateJobRequest withBody(Consumer<JobInfo> bodySetter) {
        if(this.body == null ){
            this.body = new JobInfo();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public JobInfo getBody() {
        return body;
    }

    public void setBody(JobInfo body) {
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
        CreateJobRequest createJobRequest = (CreateJobRequest) o;
        return Objects.equals(this.body, createJobRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateJobRequest {\n");
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

