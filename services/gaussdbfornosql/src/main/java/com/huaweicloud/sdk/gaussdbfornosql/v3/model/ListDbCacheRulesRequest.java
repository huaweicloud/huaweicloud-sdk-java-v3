package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDbCacheRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbcache_mapping_id")

    private String dbcacheMappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_schema")

    private String sourceDbSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_table")

    private String sourceDbTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListDbCacheRulesRequest withDbcacheMappingId(String dbcacheMappingId) {
        this.dbcacheMappingId = dbcacheMappingId;
        return this;
    }

    /**
     * 内存加速映射ID。
     * @return dbcacheMappingId
     */
    public String getDbcacheMappingId() {
        return dbcacheMappingId;
    }

    public void setDbcacheMappingId(String dbcacheMappingId) {
        this.dbcacheMappingId = dbcacheMappingId;
    }

    public ListDbCacheRulesRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 内存加速规则ID。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ListDbCacheRulesRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 内存加速规则名称。名称以“*”起始，表示按照“*”后面的值模糊匹配，否则，按照实际填写的名称精确匹配查询。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ListDbCacheRulesRequest withSourceDbSchema(String sourceDbSchema) {
        this.sourceDbSchema = sourceDbSchema;
        return this;
    }

    /**
     * 源端数据库名。名称以“*”起始，表示按照“*”后面的值模糊匹配，否则，按照实际填写的名称精确匹配查询。
     * @return sourceDbSchema
     */
    public String getSourceDbSchema() {
        return sourceDbSchema;
    }

    public void setSourceDbSchema(String sourceDbSchema) {
        this.sourceDbSchema = sourceDbSchema;
    }

    public ListDbCacheRulesRequest withSourceDbTable(String sourceDbTable) {
        this.sourceDbTable = sourceDbTable;
        return this;
    }

    /**
     * 源端数据表名。名称以“*”起始，表示按照“*”后面的值模糊匹配，否则，按照实际填写的名称精确匹配查询。
     * @return sourceDbTable
     */
    public String getSourceDbTable() {
        return sourceDbTable;
    }

    public void setSourceDbTable(String sourceDbTable) {
        this.sourceDbTable = sourceDbTable;
    }

    public ListDbCacheRulesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。 从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询）。 取值必须为数字，不能为负数。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListDbCacheRulesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询个数上限值。取值范围：1~100。不传该参数时，默认查询前100条信息。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDbCacheRulesRequest that = (ListDbCacheRulesRequest) obj;
        return Objects.equals(this.dbcacheMappingId, that.dbcacheMappingId) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.sourceDbSchema, that.sourceDbSchema)
            && Objects.equals(this.sourceDbTable, that.sourceDbTable) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbcacheMappingId, ruleId, ruleName, sourceDbSchema, sourceDbTable, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbCacheRulesRequest {\n");
        sb.append("    dbcacheMappingId: ").append(toIndentedString(dbcacheMappingId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    sourceDbSchema: ").append(toIndentedString(sourceDbSchema)).append("\n");
        sb.append("    sourceDbTable: ").append(toIndentedString(sourceDbTable)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
