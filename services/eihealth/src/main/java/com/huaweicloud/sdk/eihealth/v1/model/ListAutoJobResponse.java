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
public class ListAutoJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_jobs")

    private List<AutoJobListDto> autoJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAutoJobResponse withAutoJobs(List<AutoJobListDto> autoJobs) {
        this.autoJobs = autoJobs;
        return this;
    }

    public ListAutoJobResponse addAutoJobsItem(AutoJobListDto autoJobsItem) {
        if (this.autoJobs == null) {
            this.autoJobs = new ArrayList<>();
        }
        this.autoJobs.add(autoJobsItem);
        return this;
    }

    public ListAutoJobResponse withAutoJobs(Consumer<List<AutoJobListDto>> autoJobsSetter) {
        if (this.autoJobs == null) {
            this.autoJobs = new ArrayList<>();
        }
        autoJobsSetter.accept(this.autoJobs);
        return this;
    }

    /**
     * 自动作业列表
     * @return autoJobs
     */
    public List<AutoJobListDto> getAutoJobs() {
        return autoJobs;
    }

    public void setAutoJobs(List<AutoJobListDto> autoJobs) {
        this.autoJobs = autoJobs;
    }

    public ListAutoJobResponse withCount(Integer count) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAutoJobResponse listAutoJobResponse = (ListAutoJobResponse) o;
        return Objects.equals(this.autoJobs, listAutoJobResponse.autoJobs)
            && Objects.equals(this.count, listAutoJobResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoJobs, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoJobResponse {\n");
        sb.append("    autoJobs: ").append(toIndentedString(autoJobs)).append("\n");
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
