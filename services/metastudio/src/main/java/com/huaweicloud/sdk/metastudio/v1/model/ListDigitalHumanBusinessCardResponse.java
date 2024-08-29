package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListDigitalHumanBusinessCardResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<DigitalHumanBusinessCardJobInfo> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListDigitalHumanBusinessCardResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数字人名片制作任务总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListDigitalHumanBusinessCardResponse withJobs(List<DigitalHumanBusinessCardJobInfo> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListDigitalHumanBusinessCardResponse addJobsItem(DigitalHumanBusinessCardJobInfo jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListDigitalHumanBusinessCardResponse withJobs(Consumer<List<DigitalHumanBusinessCardJobInfo>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 数字人名片制作任务列表。
     * @return jobs
     */
    public List<DigitalHumanBusinessCardJobInfo> getJobs() {
        return jobs;
    }

    public void setJobs(List<DigitalHumanBusinessCardJobInfo> jobs) {
        this.jobs = jobs;
    }

    public ListDigitalHumanBusinessCardResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDigitalHumanBusinessCardResponse that = (ListDigitalHumanBusinessCardResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.jobs, that.jobs)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, jobs, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDigitalHumanBusinessCardResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
