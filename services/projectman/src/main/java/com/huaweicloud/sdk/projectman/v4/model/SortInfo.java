package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SortInfo
 */
public class SortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    public SortInfo withAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    /**
     * 是否升序
     * @return asc
     */
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public SortInfo withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 排序字段
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SortInfo that = (SortInfo) obj;
        return Objects.equals(this.asc, that.asc) && Objects.equals(this.field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asc, field);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SortInfo {\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
