package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Explain
 */
public class Explain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_type")

    private String selectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "possible_keys")

    private String possibleKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_len")

    private String keyLen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private Long rows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filtered")

    private Double filtered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra")

    private String extra;

    public Explain withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * select子句的编号
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Explain withSelectType(String selectType) {
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

    public Explain withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * SQL优化器选择的表join顺序。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Explain withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 查找表中行的访问类型(从好到坏依次为：null>system>const>eq_ref>ref>range>index>all)。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Explain withPossibleKeys(String possibleKeys) {
        this.possibleKeys = possibleKeys;
        return this;
    }

    /**
     * 有助于高效查找行的索引。
     * @return possibleKeys
     */
    public String getPossibleKeys() {
        return possibleKeys;
    }

    public void setPossibleKeys(String possibleKeys) {
        this.possibleKeys = possibleKeys;
    }

    public Explain withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 出于最小化查询成本考虑，SQL优化器实际使用的索引
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Explain withKeyLen(String keyLen) {
        this.keyLen = keyLen;
        return this;
    }

    /**
     * key列所示索引的长度（字节）
     * @return keyLen
     */
    public String getKeyLen() {
        return keyLen;
    }

    public void setKeyLen(String keyLen) {
        this.keyLen = keyLen;
    }

    public Explain withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * 在使用key列所示索引查找数据时用到的列或常量
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Explain withRows(Long rows) {
        this.rows = rows;
        return this;
    }

    /**
     * key列所示索引的长度（字节）
     * @return rows
     */
    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public Explain withFiltered(Double filtered) {
        this.filtered = filtered;
        return this;
    }

    /**
     * sql解析的额外信息：当出现using index时，说明SQL使用覆盖索引，性能较好；而当出现 using filesort、using temporary、using where时，说明查询需要优化。
     * @return filtered
     */
    public Double getFiltered() {
        return filtered;
    }

    public void setFiltered(Double filtered) {
        this.filtered = filtered;
    }

    public Explain withExtra(String extra) {
        this.extra = extra;
        return this;
    }

    /**
     * sql解析的额外信息：当出现using index时，说明SQL使用覆盖索引，性能较好；而当出现 using filesort、using temporary、using where时，说明查询需要优化。
     * @return extra
     */
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Explain that = (Explain) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.selectType, that.selectType)
            && Objects.equals(this.table, that.table) && Objects.equals(this.type, that.type)
            && Objects.equals(this.possibleKeys, that.possibleKeys) && Objects.equals(this.key, that.key)
            && Objects.equals(this.keyLen, that.keyLen) && Objects.equals(this.ref, that.ref)
            && Objects.equals(this.rows, that.rows) && Objects.equals(this.filtered, that.filtered)
            && Objects.equals(this.extra, that.extra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, selectType, table, type, possibleKeys, key, keyLen, ref, rows, filtered, extra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Explain {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
