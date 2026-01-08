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
    @JsonProperty(value = "eps_remaining_quotas")

    private List<EpsRemainingQuotaResult> epsRemainingQuotas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowEpsRemainingQuotaResponse withEpsRemainingQuotas(List<EpsRemainingQuotaResult> epsRemainingQuotas) {
        this.epsRemainingQuotas = epsRemainingQuotas;
        return this;
    }

    public ShowEpsRemainingQuotaResponse addEpsRemainingQuotasItem(EpsRemainingQuotaResult epsRemainingQuotasItem) {
        if (this.epsRemainingQuotas == null) {
            this.epsRemainingQuotas = new ArrayList<>();
        }
        this.epsRemainingQuotas.add(epsRemainingQuotasItem);
        return this;
    }

    public ShowEpsRemainingQuotaResponse withEpsRemainingQuotas(
        Consumer<List<EpsRemainingQuotaResult>> epsRemainingQuotasSetter) {
        if (this.epsRemainingQuotas == null) {
            this.epsRemainingQuotas = new ArrayList<>();
        }
        epsRemainingQuotasSetter.accept(this.epsRemainingQuotas);
        return this;
    }

    /**
     * **参数解释**: 剩余企业项目配额组。
     * @return epsRemainingQuotas
     */
    public List<EpsRemainingQuotaResult> getEpsRemainingQuotas() {
        return epsRemainingQuotas;
    }

    public void setEpsRemainingQuotas(List<EpsRemainingQuotaResult> epsRemainingQuotas) {
        this.epsRemainingQuotas = epsRemainingQuotas;
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
        return Objects.equals(this.epsRemainingQuotas, that.epsRemainingQuotas)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsRemainingQuotas, jobId, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEpsRemainingQuotaResponse {\n");
        sb.append("    epsRemainingQuotas: ").append(toIndentedString(epsRemainingQuotas)).append("\n");
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
