package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubJobsInfo
 */
public class SubJobsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs")

    private List<Object> subJobs = null;

    public SubJobsInfo withSubJobs(List<Object> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public SubJobsInfo addSubJobsItem(Object subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public SubJobsInfo withSubJobs(Consumer<List<Object>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子job信息，类型与主job一致
     * @return subJobs
     */
    public List<Object> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<Object> subJobs) {
        this.subJobs = subJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubJobsInfo subJobsInfo = (SubJobsInfo) o;
        return Objects.equals(this.subJobs, subJobsInfo.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJobsInfo {\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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
