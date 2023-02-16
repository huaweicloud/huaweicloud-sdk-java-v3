package com.huaweicloud.sdk.mrs.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.JobQueryBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobExeListNewResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_record")
    
    
    private Integer totalRecord;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_list")
    
    
    private List<JobQueryBean> jobList = null;
    
    public ShowJobExeListNewResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    


    /**
     * 总记录数
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    

    public ShowJobExeListNewResponse withJobList(List<JobQueryBean> jobList) {
        this.jobList = jobList;
        return this;
    }

    
    public ShowJobExeListNewResponse addJobListItem(JobQueryBean jobListItem) {
        if(this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public ShowJobExeListNewResponse withJobList(Consumer<List<JobQueryBean>> jobListSetter) {
        if(this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * 作业列表。
     * @return jobList
     */
    public List<JobQueryBean> getJobList() {
        return jobList;
    }

    public void setJobList(List<JobQueryBean> jobList) {
        this.jobList = jobList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobExeListNewResponse showJobExeListNewResponse = (ShowJobExeListNewResponse) o;
        return Objects.equals(this.totalRecord, showJobExeListNewResponse.totalRecord) &&
            Objects.equals(this.jobList, showJobExeListNewResponse.jobList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalRecord, jobList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobExeListNewResponse {\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
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

