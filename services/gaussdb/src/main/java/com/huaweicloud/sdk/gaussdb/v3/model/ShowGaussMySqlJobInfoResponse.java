package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.GetJobInfoDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlJobInfoResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job")
    

    private GetJobInfoDetail job;

    public ShowGaussMySqlJobInfoResponse withJob(GetJobInfoDetail job) {
        this.job = job;
        return this;
    }

    public ShowGaussMySqlJobInfoResponse withJob(Consumer<GetJobInfoDetail> jobSetter) {
        if(this.job == null ){
            this.job = new GetJobInfoDetail();
            jobSetter.accept(this.job);
        }
        
        return this;
    }


    /**
     * Get job
     * @return job
     */
    public GetJobInfoDetail getJob() {
        return job;
    }

    public void setJob(GetJobInfoDetail job) {
        this.job = job;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlJobInfoResponse showGaussMySqlJobInfoResponse = (ShowGaussMySqlJobInfoResponse) o;
        return Objects.equals(this.job, showGaussMySqlJobInfoResponse.job);
    }
    @Override
    public int hashCode() {
        return Objects.hash(job);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlJobInfoResponse {\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

