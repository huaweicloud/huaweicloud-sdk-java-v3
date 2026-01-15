package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库趋势统计
 */
public class TrendStatusResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_time")

    private String generateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_type")

    private String statisticsType;

    public TrendStatusResponse withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 数据库ID
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public TrendStatusResponse withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public TrendStatusResponse withGenerateTime(String generateTime) {
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

    public TrendStatusResponse withStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }

    /**
     * 统计类型  - RISK：风险  - SESSION：SESSION  - SQL：SQL  - COUNT：数量  - INJECTION：注入 - OPERATION：操作
     * @return statisticsType
     */
    public String getStatisticsType() {
        return statisticsType;
    }

    public void setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrendStatusResponse that = (TrendStatusResponse) obj;
        return Objects.equals(this.dbId, that.dbId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.generateTime, that.generateTime)
            && Objects.equals(this.statisticsType, that.statisticsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, dbName, generateTime, statisticsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendStatusResponse {\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    generateTime: ").append(toIndentedString(generateTime)).append("\n");
        sb.append("    statisticsType: ").append(toIndentedString(statisticsType)).append("\n");
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
