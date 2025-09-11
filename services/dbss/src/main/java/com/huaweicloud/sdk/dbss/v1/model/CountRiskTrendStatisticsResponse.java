package com.huaweicloud.sdk.dbss.v1.model;

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
public class CountRiskTrendStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_statistics")

    private List<RiskStatisticsBean> riskStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CountRiskTrendStatisticsResponse withGenerateTime(String generateTime) {
        this.generateTime = generateTime;
        return this;
    }

    /**
     * 生成时间
     * @return generateTime
     */
    public String getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
    }

    public CountRiskTrendStatisticsResponse withRiskStatistics(List<RiskStatisticsBean> riskStatistics) {
        this.riskStatistics = riskStatistics;
        return this;
    }

    public CountRiskTrendStatisticsResponse addRiskStatisticsItem(RiskStatisticsBean riskStatisticsItem) {
        if (this.riskStatistics == null) {
            this.riskStatistics = new ArrayList<>();
        }
        this.riskStatistics.add(riskStatisticsItem);
        return this;
    }

    public CountRiskTrendStatisticsResponse withRiskStatistics(
        Consumer<List<RiskStatisticsBean>> riskStatisticsSetter) {
        if (this.riskStatistics == null) {
            this.riskStatistics = new ArrayList<>();
        }
        riskStatisticsSetter.accept(this.riskStatistics);
        return this;
    }

    /**
     * 数据列表
     * @return riskStatistics
     */
    public List<RiskStatisticsBean> getRiskStatistics() {
        return riskStatistics;
    }

    public void setRiskStatistics(List<RiskStatisticsBean> riskStatistics) {
        this.riskStatistics = riskStatistics;
    }

    public CountRiskTrendStatisticsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态  - FINISHED：已完成  - RUNNING：运行中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountRiskTrendStatisticsResponse that = (CountRiskTrendStatisticsResponse) obj;
        return Objects.equals(this.generateTime, that.generateTime)
            && Objects.equals(this.riskStatistics, that.riskStatistics) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generateTime, riskStatistics, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountRiskTrendStatisticsResponse {\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
        sb.append("    riskStatistics: ").append(toIndentedString(riskStatistics)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
