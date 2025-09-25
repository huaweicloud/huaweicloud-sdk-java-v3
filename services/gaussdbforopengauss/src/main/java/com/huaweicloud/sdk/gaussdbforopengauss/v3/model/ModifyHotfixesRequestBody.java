package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyHotfixesRequestBody
 */
public class ModifyHotfixesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfixes")

    private Object hotfixes;

    public ModifyHotfixesRequestBody withHotfixes(Object hotfixes) {
        this.hotfixes = hotfixes;
        return this;
    }

    /**
     * **参数解释**: 热补丁属性信息。 **约束限制**: 不涉及。
     * @return hotfixes
     */
    public Object getHotfixes() {
        return hotfixes;
    }

    public void setHotfixes(Object hotfixes) {
        this.hotfixes = hotfixes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyHotfixesRequestBody that = (ModifyHotfixesRequestBody) obj;
        return Objects.equals(this.hotfixes, that.hotfixes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotfixes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyHotfixesRequestBody {\n");
        sb.append("    hotfixes: ").append(toIndentedString(hotfixes)).append("\n");
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
