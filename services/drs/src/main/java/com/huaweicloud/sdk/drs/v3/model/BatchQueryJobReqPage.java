package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 带分页的批量查询任务详情请求体
 */
public class BatchQueryJobReqPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    @JacksonXmlProperty(localName = "jobs")

    private List<String> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_req")

    @JacksonXmlProperty(localName = "page_req")

    private PageReq pageReq;

    public BatchQueryJobReqPage withJobs(List<String> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchQueryJobReqPage addJobsItem(String jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchQueryJobReqPage withJobs(Consumer<List<String>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量查询任务详情
     * @return jobs
     */
    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    public BatchQueryJobReqPage withPageReq(PageReq pageReq) {
        this.pageReq = pageReq;
        return this;
    }

    public BatchQueryJobReqPage withPageReq(Consumer<PageReq> pageReqSetter) {
        if (this.pageReq == null) {
            this.pageReq = new PageReq();
            pageReqSetter.accept(this.pageReq);
        }

        return this;
    }

    /**
     * Get pageReq
     * @return pageReq
     */
    public PageReq getPageReq() {
        return pageReq;
    }

    public void setPageReq(PageReq pageReq) {
        this.pageReq = pageReq;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchQueryJobReqPage batchQueryJobReqPage = (BatchQueryJobReqPage) o;
        return Objects.equals(this.jobs, batchQueryJobReqPage.jobs)
            && Objects.equals(this.pageReq, batchQueryJobReqPage.pageReq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, pageReq);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchQueryJobReqPage {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    pageReq: ").append(toIndentedString(pageReq)).append("\n");
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
