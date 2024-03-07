package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSqlLimitRuleReqV3
 */
public class CreateSqlLimitRuleReqV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private Long queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_string")

    private String queryString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency")

    private Integer maxConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_waiting")

    private Integer maxWaiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_path")

    private String searchPath;

    public CreateSqlLimitRuleReqV3 withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public CreateSqlLimitRuleReqV3 withQueryId(Long queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 由SQL的语法解析树计算出的内部哈希码，默认为0，取值范围（-9223372036854775808~ 9223372036854775807）。
     * @return queryId
     */
    public Long getQueryId() {
        return queryId;
    }

    public void setQueryId(Long queryId) {
        this.queryId = queryId;
    }

    public CreateSqlLimitRuleReqV3 withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * SQL语句的文本形式。（注：query_id与query_string只可以存在一个）
     * @return queryString
     */
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public CreateSqlLimitRuleReqV3 withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * 同时执行的SQL数量，小于等于0表示不限制，默认为0，取值范围（-1~50000）。
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public CreateSqlLimitRuleReqV3 withMaxWaiting(Integer maxWaiting) {
        this.maxWaiting = maxWaiting;
        return this;
    }

    /**
     * 最大等待时间，单位为秒。
     * @return maxWaiting
     */
    public Integer getMaxWaiting() {
        return maxWaiting;
    }

    public void setMaxWaiting(Integer maxWaiting) {
        this.maxWaiting = maxWaiting;
    }

    public CreateSqlLimitRuleReqV3 withSearchPath(String searchPath) {
        this.searchPath = searchPath;
        return this;
    }

    /**
     * 为不是模式限定的名称设置模式搜索顺序，默认为public。
     * @return searchPath
     */
    public String getSearchPath() {
        return searchPath;
    }

    public void setSearchPath(String searchPath) {
        this.searchPath = searchPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSqlLimitRuleReqV3 that = (CreateSqlLimitRuleReqV3) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.queryId, that.queryId)
            && Objects.equals(this.queryString, that.queryString)
            && Objects.equals(this.maxConcurrency, that.maxConcurrency)
            && Objects.equals(this.maxWaiting, that.maxWaiting) && Objects.equals(this.searchPath, that.searchPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, queryId, queryString, maxConcurrency, maxWaiting, searchPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlLimitRuleReqV3 {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
        sb.append("    maxWaiting: ").append(toIndentedString(maxWaiting)).append("\n");
        sb.append("    searchPath: ").append(toIndentedString(searchPath)).append("\n");
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
