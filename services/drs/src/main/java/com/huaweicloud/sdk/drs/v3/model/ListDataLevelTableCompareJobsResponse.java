package com.huaweicloud.sdk.drs.v3.model;

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
public class ListDataLevelTableCompareJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_jobs")

    private List<CompareJobInfo> compareJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListDataLevelTableCompareJobsResponse withCompareJobs(List<CompareJobInfo> compareJobs) {
        this.compareJobs = compareJobs;
        return this;
    }

    public ListDataLevelTableCompareJobsResponse addCompareJobsItem(CompareJobInfo compareJobsItem) {
        if (this.compareJobs == null) {
            this.compareJobs = new ArrayList<>();
        }
        this.compareJobs.add(compareJobsItem);
        return this;
    }

    public ListDataLevelTableCompareJobsResponse withCompareJobs(Consumer<List<CompareJobInfo>> compareJobsSetter) {
        if (this.compareJobs == null) {
            this.compareJobs = new ArrayList<>();
        }
        compareJobsSetter.accept(this.compareJobs);
        return this;
    }

    /**
     * 表对比任务信息
     * @return compareJobs
     */
    public List<CompareJobInfo> getCompareJobs() {
        return compareJobs;
    }

    public void setCompareJobs(List<CompareJobInfo> compareJobs) {
        this.compareJobs = compareJobs;
    }

    public ListDataLevelTableCompareJobsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 任务数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataLevelTableCompareJobsResponse that = (ListDataLevelTableCompareJobsResponse) obj;
        return Objects.equals(this.compareJobs, that.compareJobs) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareJobs, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataLevelTableCompareJobsResponse {\n");
        sb.append("    compareJobs: ").append(toIndentedString(compareJobs)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
