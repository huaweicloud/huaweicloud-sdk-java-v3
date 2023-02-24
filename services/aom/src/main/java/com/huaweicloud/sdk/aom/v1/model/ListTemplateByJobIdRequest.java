package com.huaweicloud.sdk.aom.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.ListTemplateByJobIdRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTemplateByJobIdRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private ListTemplateByJobIdRequestBody body;

    public ListTemplateByJobIdRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public ListTemplateByJobIdRequest withBody(ListTemplateByJobIdRequestBody body) {
        this.body = body;
        return this;
    }

    public ListTemplateByJobIdRequest withBody(Consumer<ListTemplateByJobIdRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ListTemplateByJobIdRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ListTemplateByJobIdRequestBody getBody() {
        return body;
    }

    public void setBody(ListTemplateByJobIdRequestBody body) {
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
        ListTemplateByJobIdRequest listTemplateByJobIdRequest = (ListTemplateByJobIdRequest) o;
        return Objects.equals(this.jobId, listTemplateByJobIdRequest.jobId) &&
            Objects.equals(this.body, listTemplateByJobIdRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateByJobIdRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

