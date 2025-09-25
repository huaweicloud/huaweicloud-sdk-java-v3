package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowEpsRemainingQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_quota_remaining")

    private List<EpsRemainingQuotaResult> epsQuotaRemaining = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowEpsRemainingQuotaResponse withEpsQuotaRemaining(List<EpsRemainingQuotaResult> epsQuotaRemaining) {
        this.epsQuotaRemaining = epsQuotaRemaining;
        return this;
    }

    public ShowEpsRemainingQuotaResponse addEpsQuotaRemainingItem(EpsRemainingQuotaResult epsQuotaRemainingItem) {
        if (this.epsQuotaRemaining == null) {
            this.epsQuotaRemaining = new ArrayList<>();
        }
        this.epsQuotaRemaining.add(epsQuotaRemainingItem);
        return this;
    }

    public ShowEpsRemainingQuotaResponse withEpsQuotaRemaining(
        Consumer<List<EpsRemainingQuotaResult>> epsQuotaRemainingSetter) {
        if (this.epsQuotaRemaining == null) {
            this.epsQuotaRemaining = new ArrayList<>();
        }
        epsQuotaRemainingSetter.accept(this.epsQuotaRemaining);
        return this;
    }

    /**
     * **参数解释**: 剩余企业项目配额组。
     * @return epsQuotaRemaining
     */
    public List<EpsRemainingQuotaResult> getEpsQuotaRemaining() {
        return epsQuotaRemaining;
    }

    public void setEpsQuotaRemaining(List<EpsRemainingQuotaResult> epsQuotaRemaining) {
        this.epsQuotaRemaining = epsQuotaRemaining;
    }

    public ShowEpsRemainingQuotaResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**: 任务ID。 **取值范围**: 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowEpsRemainingQuotaResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 返回的企业项目个数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEpsRemainingQuotaResponse that = (ShowEpsRemainingQuotaResponse) obj;
        return Objects.equals(this.epsQuotaRemaining, that.epsQuotaRemaining) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsQuotaRemaining, jobId, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEpsRemainingQuotaResponse {\n");
        sb.append("    epsQuotaRemaining: ").append(toIndentedString(epsQuotaRemaining)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
