package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改内存加速规则请求体。
 */
public class UpdateDbCacheRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbcache_rule_id")

    private String dbcacheRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_columns")

    private List<String> valueColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private String ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_separator")

    private String valueSeparator;

    public UpdateDbCacheRuleRequestBody withDbcacheRuleId(String dbcacheRuleId) {
        this.dbcacheRuleId = dbcacheRuleId;
        return this;
    }

    /**
     * 内存加速规则ID。
     * @return dbcacheRuleId
     */
    public String getDbcacheRuleId() {
        return dbcacheRuleId;
    }

    public void setDbcacheRuleId(String dbcacheRuleId) {
        this.dbcacheRuleId = dbcacheRuleId;
    }

    public UpdateDbCacheRuleRequestBody withValueColumns(List<String> valueColumns) {
        this.valueColumns = valueColumns;
        return this;
    }

    public UpdateDbCacheRuleRequestBody addValueColumnsItem(String valueColumnsItem) {
        if (this.valueColumns == null) {
            this.valueColumns = new ArrayList<>();
        }
        this.valueColumns.add(valueColumnsItem);
        return this;
    }

    public UpdateDbCacheRuleRequestBody withValueColumns(Consumer<List<String>> valueColumnsSetter) {
        if (this.valueColumns == null) {
            this.valueColumns = new ArrayList<>();
        }
        valueColumnsSetter.accept(this.valueColumns);
        return this;
    }

    /**
     * 映射的value使用的column列表。
     * @return valueColumns
     */
    public List<String> getValueColumns() {
        return valueColumns;
    }

    public void setValueColumns(List<String> valueColumns) {
        this.valueColumns = valueColumns;
    }

    public UpdateDbCacheRuleRequestBody withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * key的生存时间。单位:ms。不传该值，默认取2592000000，表示30天。
     * @return ttl
     */
    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public UpdateDbCacheRuleRequestBody withValueSeparator(String valueSeparator) {
        this.valueSeparator = valueSeparator;
        return this;
    }

    /**
     * 映射的value分隔符。只允许一个字符。
     * @return valueSeparator
     */
    public String getValueSeparator() {
        return valueSeparator;
    }

    public void setValueSeparator(String valueSeparator) {
        this.valueSeparator = valueSeparator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDbCacheRuleRequestBody that = (UpdateDbCacheRuleRequestBody) obj;
        return Objects.equals(this.dbcacheRuleId, that.dbcacheRuleId)
            && Objects.equals(this.valueColumns, that.valueColumns) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.valueSeparator, that.valueSeparator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbcacheRuleId, valueColumns, ttl, valueSeparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDbCacheRuleRequestBody {\n");
        sb.append("    dbcacheRuleId: ").append(toIndentedString(dbcacheRuleId)).append("\n");
        sb.append("    valueColumns: ").append(toIndentedString(valueColumns)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    valueSeparator: ").append(toIndentedString(valueSeparator)).append("\n");
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
