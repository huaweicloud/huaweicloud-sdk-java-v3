package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowDeadLockTopologyGraphRespLockedData
 */
public class ShowDeadLockTopologyGraphRespLockedData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_index")

    private Long fieldIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hex")

    private String hex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decoded")

    private String decoded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    public ShowDeadLockTopologyGraphRespLockedData withFieldIndex(Long fieldIndex) {
        this.fieldIndex = fieldIndex;
        return this;
    }

    /**
     * 字段序号
     * @return fieldIndex
     */
    public Long getFieldIndex() {
        return fieldIndex;
    }

    public void setFieldIndex(Long fieldIndex) {
        this.fieldIndex = fieldIndex;
    }

    public ShowDeadLockTopologyGraphRespLockedData withHex(String hex) {
        this.hex = hex;
        return this;
    }

    /**
     * 十六进制原始值
     * @return hex
     */
    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public ShowDeadLockTopologyGraphRespLockedData withDecoded(String decoded) {
        this.decoded = decoded;
        return this;
    }

    /**
     * 可读解码值
     * @return decoded
     */
    public String getDecoded() {
        return decoded;
    }

    public void setDecoded(String decoded) {
        this.decoded = decoded;
    }

    public ShowDeadLockTopologyGraphRespLockedData withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockTopologyGraphRespLockedData that = (ShowDeadLockTopologyGraphRespLockedData) obj;
        return Objects.equals(this.fieldIndex, that.fieldIndex) && Objects.equals(this.hex, that.hex)
            && Objects.equals(this.decoded, that.decoded) && Objects.equals(this.columnName, that.columnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldIndex, hex, decoded, columnName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockTopologyGraphRespLockedData {\n");
        sb.append("    fieldIndex: ").append(toIndentedString(fieldIndex)).append("\n");
        sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
        sb.append("    decoded: ").append(toIndentedString(decoded)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
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
