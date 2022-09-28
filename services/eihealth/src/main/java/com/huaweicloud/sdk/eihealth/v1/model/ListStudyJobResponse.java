package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListStudyJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<StudyJobRsp> jobs = null;

    public ListStudyJobResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 作业总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListStudyJobResponse withJobs(List<StudyJobRsp> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListStudyJobResponse addJobsItem(StudyJobRsp jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListStudyJobResponse withJobs(Consumer<List<StudyJobRsp>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 作业列表
     * @return jobs
     */
    public List<StudyJobRsp> getJobs() {
        return jobs;
    }

    public void setJobs(List<StudyJobRsp> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStudyJobResponse listStudyJobResponse = (ListStudyJobResponse) o;
        return Objects.equals(this.count, listStudyJobResponse.count)
            && Objects.equals(this.jobs, listStudyJobResponse.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStudyJobResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
