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
public class CountSqlStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statistics")

    private List<SQLStatisticsBean> sqlStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CountSqlStatisticsResponse withGenerateTime(String generateTime) {
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

    public CountSqlStatisticsResponse withSqlStatistics(List<SQLStatisticsBean> sqlStatistics) {
        this.sqlStatistics = sqlStatistics;
        return this;
    }

    public CountSqlStatisticsResponse addSqlStatisticsItem(SQLStatisticsBean sqlStatisticsItem) {
        if (this.sqlStatistics == null) {
            this.sqlStatistics = new ArrayList<>();
        }
        this.sqlStatistics.add(sqlStatisticsItem);
        return this;
    }

    public CountSqlStatisticsResponse withSqlStatistics(Consumer<List<SQLStatisticsBean>> sqlStatisticsSetter) {
        if (this.sqlStatistics == null) {
            this.sqlStatistics = new ArrayList<>();
        }
        sqlStatisticsSetter.accept(this.sqlStatistics);
        return this;
    }

    /**
     * SQL统计数据
     * @return sqlStatistics
     */
    public List<SQLStatisticsBean> getSqlStatistics() {
        return sqlStatistics;
    }

    public void setSqlStatistics(List<SQLStatisticsBean> sqlStatistics) {
        this.sqlStatistics = sqlStatistics;
    }

    public CountSqlStatisticsResponse withStatus(String status) {
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
        CountSqlStatisticsResponse that = (CountSqlStatisticsResponse) obj;
        return Objects.equals(this.generateTime, that.generateTime)
            && Objects.equals(this.sqlStatistics, that.sqlStatistics) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generateTime, sqlStatistics, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountSqlStatisticsResponse {\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
        sb.append("    sqlStatistics: ").append(toIndentedString(sqlStatistics)).append("\n");
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
