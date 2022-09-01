package com.huaweicloud.sdk.mrs.v1.model;





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
public class ShowJobExesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_exe_id")
    
    @JacksonXmlProperty(localName = "job_exe_id")
    
    private String jobExeId;

    public ShowJobExesRequest withJobExeId(String jobExeId) {
        this.jobExeId = jobExeId;
        return this;
    }

    


    /**
     * 作业ID。
     * @return jobExeId
     */
    public String getJobExeId() {
        return jobExeId;
    }

    public void setJobExeId(String jobExeId) {
        this.jobExeId = jobExeId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobExesRequest showJobExesRequest = (ShowJobExesRequest) o;
        return Objects.equals(this.jobExeId, showJobExesRequest.jobExeId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobExeId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobExesRequest {\n");
        sb.append("    jobExeId: ").append(toIndentedString(jobExeId)).append("\n");
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

