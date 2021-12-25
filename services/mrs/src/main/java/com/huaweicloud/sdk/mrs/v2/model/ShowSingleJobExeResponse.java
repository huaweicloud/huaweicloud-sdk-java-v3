package com.huaweicloud.sdk.mrs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.JobQueryBean;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSingleJobExeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_detail")
    
    
    private JobQueryBean jobDetail;

    public ShowSingleJobExeResponse withJobDetail(JobQueryBean jobDetail) {
        this.jobDetail = jobDetail;
        return this;
    }

    public ShowSingleJobExeResponse withJobDetail(Consumer<JobQueryBean> jobDetailSetter) {
        if(this.jobDetail == null ){
            this.jobDetail = new JobQueryBean();
            jobDetailSetter.accept(this.jobDetail);
        }
        
        return this;
    }


    /**
     * Get jobDetail
     * @return jobDetail
     */
    public JobQueryBean getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(JobQueryBean jobDetail) {
        this.jobDetail = jobDetail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSingleJobExeResponse showSingleJobExeResponse = (ShowSingleJobExeResponse) o;
        return Objects.equals(this.jobDetail, showSingleJobExeResponse.jobDetail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobDetail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSingleJobExeResponse {\n");
        sb.append("    jobDetail: ").append(toIndentedString(jobDetail)).append("\n");
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

