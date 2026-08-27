package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListInstanceStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unconfigured_model_count")

    private Long unconfiguredModelCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unconfigured_channel_count")

    private Long unconfiguredChannelCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_count")

    private Long riskCount;

    public ListInstanceStatisticsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 桌面总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListInstanceStatisticsResponse withUnconfiguredModelCount(Long unconfiguredModelCount) {
        this.unconfiguredModelCount = unconfiguredModelCount;
        return this;
    }

    /**
     * 未配置模型桌面数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return unconfiguredModelCount
     */
    public Long getUnconfiguredModelCount() {
        return unconfiguredModelCount;
    }

    public void setUnconfiguredModelCount(Long unconfiguredModelCount) {
        this.unconfiguredModelCount = unconfiguredModelCount;
    }

    public ListInstanceStatisticsResponse withUnconfiguredChannelCount(Long unconfiguredChannelCount) {
        this.unconfiguredChannelCount = unconfiguredChannelCount;
        return this;
    }

    /**
     * 未配置通道桌面数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return unconfiguredChannelCount
     */
    public Long getUnconfiguredChannelCount() {
        return unconfiguredChannelCount;
    }

    public void setUnconfiguredChannelCount(Long unconfiguredChannelCount) {
        this.unconfiguredChannelCount = unconfiguredChannelCount;
    }

    public ListInstanceStatisticsResponse withRiskCount(Long riskCount) {
        this.riskCount = riskCount;
        return this;
    }

    /**
     * 存在风险桌面数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return riskCount
     */
    public Long getRiskCount() {
        return riskCount;
    }

    public void setRiskCount(Long riskCount) {
        this.riskCount = riskCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceStatisticsResponse that = (ListInstanceStatisticsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.unconfiguredModelCount, that.unconfiguredModelCount)
            && Objects.equals(this.unconfiguredChannelCount, that.unconfiguredChannelCount)
            && Objects.equals(this.riskCount, that.riskCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, unconfiguredModelCount, unconfiguredChannelCount, riskCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceStatisticsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    unconfiguredModelCount: ").append(toIndentedString(unconfiguredModelCount)).append("\n");
        sb.append("    unconfiguredChannelCount: ").append(toIndentedString(unconfiguredChannelCount)).append("\n");
        sb.append("    riskCount: ").append(toIndentedString(riskCount)).append("\n");
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
