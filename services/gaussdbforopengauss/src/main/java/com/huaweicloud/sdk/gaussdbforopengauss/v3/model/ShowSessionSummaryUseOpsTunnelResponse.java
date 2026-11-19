package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSessionSummaryUseOpsTunnelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_count")

    private Integer activeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_query_time_cost")

    private Integer maxQueryTimeCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_transaction_time_cost")

    private Integer maxTransactionTimeCost;

    public ShowSessionSummaryUseOpsTunnelResponse withActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
        return this;
    }

    /**
     * **参数解释**: 活跃会话数量。 **取值范围**: 不涉及。
     * @return activeCount
     */
    public Integer getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
    }

    public ShowSessionSummaryUseOpsTunnelResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 会话总数量。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowSessionSummaryUseOpsTunnelResponse withMaxQueryTimeCost(Integer maxQueryTimeCost) {
        this.maxQueryTimeCost = maxQueryTimeCost;
        return this;
    }

    /**
     * **参数解释**: 最大SQL执行时间。单位：秒。 **取值范围**: 不涉及。
     * @return maxQueryTimeCost
     */
    public Integer getMaxQueryTimeCost() {
        return maxQueryTimeCost;
    }

    public void setMaxQueryTimeCost(Integer maxQueryTimeCost) {
        this.maxQueryTimeCost = maxQueryTimeCost;
    }

    public ShowSessionSummaryUseOpsTunnelResponse withMaxTransactionTimeCost(Integer maxTransactionTimeCost) {
        this.maxTransactionTimeCost = maxTransactionTimeCost;
        return this;
    }

    /**
     * **参数解释**: 最大事务执行时间。单位：秒。 **取值范围**: 不涉及。
     * @return maxTransactionTimeCost
     */
    public Integer getMaxTransactionTimeCost() {
        return maxTransactionTimeCost;
    }

    public void setMaxTransactionTimeCost(Integer maxTransactionTimeCost) {
        this.maxTransactionTimeCost = maxTransactionTimeCost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSessionSummaryUseOpsTunnelResponse that = (ShowSessionSummaryUseOpsTunnelResponse) obj;
        return Objects.equals(this.activeCount, that.activeCount) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.maxQueryTimeCost, that.maxQueryTimeCost)
            && Objects.equals(this.maxTransactionTimeCost, that.maxTransactionTimeCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeCount, totalCount, maxQueryTimeCost, maxTransactionTimeCost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSessionSummaryUseOpsTunnelResponse {\n");
        sb.append("    activeCount: ").append(toIndentedString(activeCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    maxQueryTimeCost: ").append(toIndentedString(maxQueryTimeCost)).append("\n");
        sb.append("    maxTransactionTimeCost: ").append(toIndentedString(maxTransactionTimeCost)).append("\n");
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
