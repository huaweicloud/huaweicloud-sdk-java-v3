package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateSqlLimitRuleReqV3
 */
public class UpdateSqlLimitRuleReqV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency")

    private Integer maxConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_waiting")

    private Integer maxWaiting;

    public UpdateSqlLimitRuleReqV3 withDbName(String dbName) {
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

    public UpdateSqlLimitRuleReqV3 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SQL限流ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateSqlLimitRuleReqV3 withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * 同时执行的sql数量，小于等于0表示不限制，默认为0，取值范围（-1~50000）。
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public UpdateSqlLimitRuleReqV3 withMaxWaiting(Integer maxWaiting) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSqlLimitRuleReqV3 that = (UpdateSqlLimitRuleReqV3) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.maxConcurrency, that.maxConcurrency)
            && Objects.equals(this.maxWaiting, that.maxWaiting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, id, maxConcurrency, maxWaiting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSqlLimitRuleReqV3 {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
        sb.append("    maxWaiting: ").append(toIndentedString(maxWaiting)).append("\n");
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
