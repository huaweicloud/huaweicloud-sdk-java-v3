package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DecServiceFlavorItemDetail
 */
public class DecServiceFlavorItemDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_code")

    private String typeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public DecServiceFlavorItemDetail withTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    /**
     * **参数解释**: 类型编码。 **取值范围**: 不涉及。
     * @return typeCode
     */
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public DecServiceFlavorItemDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**: 规格编码。 **取值范围**: 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecServiceFlavorItemDetail that = (DecServiceFlavorItemDetail) obj;
        return Objects.equals(this.typeCode, that.typeCode) && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeCode, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecServiceFlavorItemDetail {\n");
        sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
