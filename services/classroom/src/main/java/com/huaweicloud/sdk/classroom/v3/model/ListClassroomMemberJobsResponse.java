package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.classroom.v3.model.MemberJobCard;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListClassroomMemberJobsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private List<MemberJobCard> jobs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListClassroomMemberJobsResponse withJobs(List<MemberJobCard> jobs) {
        this.jobs = jobs;
        return this;
    }

    
    public ListClassroomMemberJobsResponse addJobsItem(MemberJobCard jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListClassroomMemberJobsResponse withJobs(Consumer<List<MemberJobCard>> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 课堂下作业列表信息
     * @return jobs
     */
    public List<MemberJobCard> getJobs() {
        return jobs;
    }

    public void setJobs(List<MemberJobCard> jobs) {
        this.jobs = jobs;
    }

    public ListClassroomMemberJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 学生作业总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClassroomMemberJobsResponse listClassroomMemberJobsResponse = (ListClassroomMemberJobsResponse) o;
        return Objects.equals(this.jobs, listClassroomMemberJobsResponse.jobs) &&
            Objects.equals(this.total, listClassroomMemberJobsResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClassroomMemberJobsResponse {\n");
            sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
            sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

