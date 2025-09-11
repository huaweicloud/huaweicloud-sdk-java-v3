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
public class CountSqlTrendStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_statistics")

    private List<CountStatisticsBean> countStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CountSqlTrendStatisticsResponse withCountStatistics(List<CountStatisticsBean> countStatistics) {
        this.countStatistics = countStatistics;
        return this;
    }

    public CountSqlTrendStatisticsResponse addCountStatisticsItem(CountStatisticsBean countStatisticsItem) {
        if (this.countStatistics == null) {
            this.countStatistics = new ArrayList<>();
        }
        this.countStatistics.add(countStatisticsItem);
        return this;
    }

    public CountSqlTrendStatisticsResponse withCountStatistics(
        Consumer<List<CountStatisticsBean>> countStatisticsSetter) {
        if (this.countStatistics == null) {
            this.countStatistics = new ArrayList<>();
        }
        countStatisticsSetter.accept(this.countStatistics);
        return this;
    }

    /**
     * 列表数据
     * @return countStatistics
     */
    public List<CountStatisticsBean> getCountStatistics() {
        return countStatistics;
    }

    public void setCountStatistics(List<CountStatisticsBean> countStatistics) {
        this.countStatistics = countStatistics;
    }

    public CountSqlTrendStatisticsResponse withGenerateTime(String generateTime) {
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

    public CountSqlTrendStatisticsResponse withStatus(String status) {
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
        CountSqlTrendStatisticsResponse that = (CountSqlTrendStatisticsResponse) obj;
        return Objects.equals(this.countStatistics, that.countStatistics)
            && Objects.equals(this.generateTime, that.generateTime) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countStatistics, generateTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountSqlTrendStatisticsResponse {\n");
        sb.append("    countStatistics: ").append(toIndentedString(countStatistics)).append("\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
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
