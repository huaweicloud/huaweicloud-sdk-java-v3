package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyCollationRequestBody
 */
public class ModifyCollationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collation")

    private String collation;

    public ModifyCollationRequestBody withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * 字符集。 取值范围：根据查询SQL Server可用字符集查询可设置的字符集。
     * @return collation
     */
    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyCollationRequestBody that = (ModifyCollationRequestBody) obj;
        return Objects.equals(this.collation, that.collation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyCollationRequestBody {\n");
        sb.append("    collation: ").append(toIndentedString(collation)).append("\n");
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
