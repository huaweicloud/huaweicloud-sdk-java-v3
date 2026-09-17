package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 解析SQL限流规则请求体
 */
public class ParseSqlLimitRuleNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_sql")

    private String originalSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_template")

    private Boolean useTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_operators")

    private Boolean keepOperators;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ParseSqlLimitRuleNewRequestBody withOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }

    /**
     * 原始SQL语句
     * @return originalSql
     */
    public String getOriginalSql() {
        return originalSql;
    }

    public void setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
    }

    public ParseSqlLimitRuleNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ParseSqlLimitRuleNewRequestBody withUseTemplate(Boolean useTemplate) {
        this.useTemplate = useTemplate;
        return this;
    }

    /**
     * 是否校验SQL语句
     * @return useTemplate
     */
    public Boolean getUseTemplate() {
        return useTemplate;
    }

    public void setUseTemplate(Boolean useTemplate) {
        this.useTemplate = useTemplate;
    }

    public ParseSqlLimitRuleNewRequestBody withKeepOperators(Boolean keepOperators) {
        this.keepOperators = keepOperators;
        return this;
    }

    /**
     * 是否保留操作符
     * @return keepOperators
     */
    public Boolean getKeepOperators() {
        return keepOperators;
    }

    public void setKeepOperators(Boolean keepOperators) {
        this.keepOperators = keepOperators;
    }

    public ParseSqlLimitRuleNewRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * SQL类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParseSqlLimitRuleNewRequestBody that = (ParseSqlLimitRuleNewRequestBody) obj;
        return Objects.equals(this.originalSql, that.originalSql) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.useTemplate, that.useTemplate)
            && Objects.equals(this.keepOperators, that.keepOperators) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalSql, engineType, useTemplate, keepOperators, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseSqlLimitRuleNewRequestBody {\n");
        sb.append("    originalSql: ").append(toIndentedString(originalSql)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    useTemplate: ").append(toIndentedString(useTemplate)).append("\n");
        sb.append("    keepOperators: ").append(toIndentedString(keepOperators)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
