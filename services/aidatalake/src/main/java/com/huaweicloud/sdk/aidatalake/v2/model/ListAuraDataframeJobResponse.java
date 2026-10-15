package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListAuraDataframeJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_list")

    private List<ShowDataframeJobResp> jobList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAuraDataframeJobResponse withJobList(List<ShowDataframeJobResp> jobList) {
        this.jobList = jobList;
        return this;
    }

    public ListAuraDataframeJobResponse addJobListItem(ShowDataframeJobResp jobListItem) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public ListAuraDataframeJobResponse withJobList(Consumer<List<ShowDataframeJobResp>> jobListSetter) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * **参数解释**：作业响应列表。 **约束限制**：不涉及。 **取值范围**：不涉及 **默认取值**：不涉及。
     * @return jobList
     */
    public List<ShowDataframeJobResp> getJobList() {
        return jobList;
    }

    public void setJobList(List<ShowDataframeJobResp> jobList) {
        this.jobList = jobList;
    }

    public ListAuraDataframeJobResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：作业总数。 **约束限制**：不涉及。 **取值范围**：不涉及 **默认取值**：不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuraDataframeJobResponse that = (ListAuraDataframeJobResponse) obj;
        return Objects.equals(this.jobList, that.jobList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuraDataframeJobResponse {\n");
        sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
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
