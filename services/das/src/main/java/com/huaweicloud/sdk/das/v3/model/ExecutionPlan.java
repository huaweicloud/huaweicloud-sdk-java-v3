package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExecutionPlan
 */
public class ExecutionPlan {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_type")

    @JacksonXmlProperty(localName = "select_type")

    private String selectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    @JacksonXmlProperty(localName = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    @JacksonXmlProperty(localName = "partitions")

    private String partitions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "possible_keys")

    @JacksonXmlProperty(localName = "possible_keys")

    private String possibleKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_len")

    @JacksonXmlProperty(localName = "key_len")

    private String keyLen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    @JacksonXmlProperty(localName = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    @JacksonXmlProperty(localName = "rows")

    private String rows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filtered")

    @JacksonXmlProperty(localName = "filtered")

    private String filtered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra")

    @JacksonXmlProperty(localName = "extra")

    private String extra;

    public ExecutionPlan withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExecutionPlan withSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }

    /**
     * select子句的类型
     * @return selectType
     */
    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public ExecutionPlan withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 数据库表
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public ExecutionPlan withPartitions(String partitions) {
        this.partitions = partitions;
        return this;
    }

    /**
     * 查询将匹配记录的分区
     * @return partitions
     */
    public String getPartitions() {
        return partitions;
    }

    public void setPartitions(String partitions) {
        this.partitions = partitions;
    }

    public ExecutionPlan withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 访问类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExecutionPlan withPossibleKeys(String possibleKeys) {
        this.possibleKeys = possibleKeys;
        return this;
    }

    /**
     * 可能使用的键(索引)
     * @return possibleKeys
     */
    public String getPossibleKeys() {
        return possibleKeys;
    }

    public void setPossibleKeys(String possibleKeys) {
        this.possibleKeys = possibleKeys;
    }

    public ExecutionPlan withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 实际使用的键(索引)
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ExecutionPlan withKeyLen(String keyLen) {
        this.keyLen = keyLen;
        return this;
    }

    /**
     * 决定使用的键的长度
     * @return keyLen
     */
    public String getKeyLen() {
        return keyLen;
    }

    public void setKeyLen(String keyLen) {
        this.keyLen = keyLen;
    }

    public ExecutionPlan withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * 使用哪个列或常数与键一起来选择行
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public ExecutionPlan withRows(String rows) {
        this.rows = rows;
        return this;
    }

    /**
     * MySQL认为它执行查询时必须检查的行数
     * @return rows
     */
    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public ExecutionPlan withFiltered(String filtered) {
        this.filtered = filtered;
        return this;
    }

    /**
     * 按表条件过滤的表行的估计百分比
     * @return filtered
     */
    public String getFiltered() {
        return filtered;
    }

    public void setFiltered(String filtered) {
        this.filtered = filtered;
    }

    public ExecutionPlan withExtra(String extra) {
        this.extra = extra;
        return this;
    }

    /**
     * 其他信息
     * @return extra
     */
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionPlan executionPlan = (ExecutionPlan) o;
        return Objects.equals(this.id, executionPlan.id) && Objects.equals(this.selectType, executionPlan.selectType)
            && Objects.equals(this.table, executionPlan.table)
            && Objects.equals(this.partitions, executionPlan.partitions)
            && Objects.equals(this.type, executionPlan.type)
            && Objects.equals(this.possibleKeys, executionPlan.possibleKeys)
            && Objects.equals(this.key, executionPlan.key) && Objects.equals(this.keyLen, executionPlan.keyLen)
            && Objects.equals(this.ref, executionPlan.ref) && Objects.equals(this.rows, executionPlan.rows)
            && Objects.equals(this.filtered, executionPlan.filtered) && Objects.equals(this.extra, executionPlan.extra);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, selectType, table, partitions, type, possibleKeys, key, keyLen, ref, rows, filtered, extra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlan {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    possibleKeys: ").append(toIndentedString(possibleKeys)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyLen: ").append(toIndentedString(keyLen)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
        sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
