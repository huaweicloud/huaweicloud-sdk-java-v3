package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdhocQueryAnalysisField
 */
public class AdhocQueryAnalysisField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_type")

    private Object logicalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    public AdhocQueryAnalysisField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdhocQueryAnalysisField withLogicalType(Object logicalType) {
        this.logicalType = logicalType;
        return this;
    }

    /**
     * 字段类型
     * @return logicalType
     */
    public Object getLogicalType() {
        return logicalType;
    }

    public void setLogicalType(Object logicalType) {
        this.logicalType = logicalType;
    }

    public AdhocQueryAnalysisField withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 字段别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdhocQueryAnalysisField that = (AdhocQueryAnalysisField) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.logicalType, that.logicalType)
            && Objects.equals(this.alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, logicalType, alias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdhocQueryAnalysisField {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    logicalType: ").append(toIndentedString(logicalType)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
