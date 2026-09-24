package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSqlRecommendRulesResponseResult
 */
public class ListSqlRecommendRulesResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_type")

    private String recommendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_model")

    private String sqlModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_keyword")

    private String sqlKeyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_exec_time")

    private Double avgExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_exec_time")

    private Double maxExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_count")

    private Integer execCount;

    public ListSqlRecommendRulesResponseResult withRecommendType(String recommendType) {
        this.recommendType = recommendType;
        return this;
    }

    /**
     * **参数解释**: 推荐类型。 **取值范围**: - all：全部 - exec_count：执行次数 - avg_exec_time：平均执行时间 - max_exec_time：最大执行时间
     * @return recommendType
     */
    public String getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(String recommendType) {
        this.recommendType = recommendType;
    }

    public ListSqlRecommendRulesResponseResult withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: SQL ID。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public ListSqlRecommendRulesResponseResult withSqlModel(String sqlModel) {
        this.sqlModel = sqlModel;
        return this;
    }

    /**
     * **参数解释**: SQL模板。 **取值范围**: 不涉及。
     * @return sqlModel
     */
    public String getSqlModel() {
        return sqlModel;
    }

    public void setSqlModel(String sqlModel) {
        this.sqlModel = sqlModel;
    }

    public ListSqlRecommendRulesResponseResult withSqlKeyword(String sqlKeyword) {
        this.sqlKeyword = sqlKeyword;
        return this;
    }

    /**
     * **参数解释**: SQL关键字。 **取值范围**: 不涉及。
     * @return sqlKeyword
     */
    public String getSqlKeyword() {
        return sqlKeyword;
    }

    public void setSqlKeyword(String sqlKeyword) {
        this.sqlKeyword = sqlKeyword;
    }

    public ListSqlRecommendRulesResponseResult withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * **参数解释**: SQL类型。 **取值范围**: - SELECT - INSERT - UPDATE - DELETE - MERGE - OTHER
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public ListSqlRecommendRulesResponseResult withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **取值范围**: 不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ListSqlRecommendRulesResponseResult withAvgExecTime(Double avgExecTime) {
        this.avgExecTime = avgExecTime;
        return this;
    }

    /**
     * **参数解释**: 平均执行时间。 **取值范围**: 不涉及。
     * @return avgExecTime
     */
    public Double getAvgExecTime() {
        return avgExecTime;
    }

    public void setAvgExecTime(Double avgExecTime) {
        this.avgExecTime = avgExecTime;
    }

    public ListSqlRecommendRulesResponseResult withMaxExecTime(Double maxExecTime) {
        this.maxExecTime = maxExecTime;
        return this;
    }

    /**
     * **参数解释**: 最长执行时间。 **取值范围**: 不涉及。
     * @return maxExecTime
     */
    public Double getMaxExecTime() {
        return maxExecTime;
    }

    public void setMaxExecTime(Double maxExecTime) {
        this.maxExecTime = maxExecTime;
    }

    public ListSqlRecommendRulesResponseResult withExecCount(Integer execCount) {
        this.execCount = execCount;
        return this;
    }

    /**
     * **参数解释**: 执行次数。 **取值范围**: 不涉及。
     * @return execCount
     */
    public Integer getExecCount() {
        return execCount;
    }

    public void setExecCount(Integer execCount) {
        this.execCount = execCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlRecommendRulesResponseResult that = (ListSqlRecommendRulesResponseResult) obj;
        return Objects.equals(this.recommendType, that.recommendType) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.sqlModel, that.sqlModel) && Objects.equals(this.sqlKeyword, that.sqlKeyword)
            && Objects.equals(this.sqlType, that.sqlType) && Objects.equals(this.database, that.database)
            && Objects.equals(this.avgExecTime, that.avgExecTime) && Objects.equals(this.maxExecTime, that.maxExecTime)
            && Objects.equals(this.execCount, that.execCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(recommendType, sqlId, sqlModel, sqlKeyword, sqlType, database, avgExecTime, maxExecTime, execCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlRecommendRulesResponseResult {\n");
        sb.append("    recommendType: ").append(toIndentedString(recommendType)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlModel: ").append(toIndentedString(sqlModel)).append("\n");
        sb.append("    sqlKeyword: ").append(toIndentedString(sqlKeyword)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    avgExecTime: ").append(toIndentedString(avgExecTime)).append("\n");
        sb.append("    maxExecTime: ").append(toIndentedString(maxExecTime)).append("\n");
        sb.append("    execCount: ").append(toIndentedString(execCount)).append("\n");
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
