package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * JobBatchDelete
 */
public class JobBatchDelete  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id_list")
    
    
    private List<String> jobIdList = null;
    
    public JobBatchDelete withJobIdList(List<String> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }

    
    public JobBatchDelete addJobIdListItem(String jobIdListItem) {
        if(this.jobIdList == null) {
            this.jobIdList = new ArrayList<>();
        }
        this.jobIdList.add(jobIdListItem);
        return this;
    }

    public JobBatchDelete withJobIdList(Consumer<List<String>> jobIdListSetter) {
        if(this.jobIdList == null) {
            this.jobIdList = new ArrayList<>();
        }
        jobIdListSetter.accept(this.jobIdList);
        return this;
    }

    /**
     * 作业ID列表。获取方法，请参见[获取作业ID](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)。
     * @return jobIdList
     */
    public List<String> getJobIdList() {
        return jobIdList;
    }

    public void setJobIdList(List<String> jobIdList) {
        this.jobIdList = jobIdList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobBatchDelete jobBatchDelete = (JobBatchDelete) o;
        return Objects.equals(this.jobIdList, jobBatchDelete.jobIdList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobIdList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobBatchDelete {\n");
        sb.append("    jobIdList: ").append(toIndentedString(jobIdList)).append("\n");
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

