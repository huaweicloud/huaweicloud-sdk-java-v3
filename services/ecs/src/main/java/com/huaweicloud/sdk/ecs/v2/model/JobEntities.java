package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class JobEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs")

    @JacksonXmlProperty(localName = "sub_jobs")

    private List<SubJob> subJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs_total")

    @JacksonXmlProperty(localName = "sub_jobs_total")

    private Integer subJobsTotal;

    public JobEntities withSubJobs(List<SubJob> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public JobEntities addSubJobsItem(SubJob subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public JobEntities withSubJobs(Consumer<List<SubJob>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 每个子任务的执行信息。
     * @return subJobs
     */
    public List<SubJob> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJob> subJobs) {
        this.subJobs = subJobs;
    }

    public JobEntities withSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
        return this;
    }

    /**
     * 子任务数量。
     * @return subJobsTotal
     */
    public Integer getSubJobsTotal() {
        return subJobsTotal;
    }

    public void setSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobEntities jobEntities = (JobEntities) o;
        return Objects.equals(this.subJobs, jobEntities.subJobs)
            && Objects.equals(this.subJobsTotal, jobEntities.subJobsTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subJobs, subJobsTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEntities {\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
        sb.append("    subJobsTotal: ").append(toIndentedString(subJobsTotal)).append("\n");
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
