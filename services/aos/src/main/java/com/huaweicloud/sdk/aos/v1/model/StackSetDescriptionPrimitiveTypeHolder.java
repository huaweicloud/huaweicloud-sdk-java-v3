package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StackSetDescriptionPrimitiveTypeHolder
 */
public class StackSetDescriptionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_description")

    private String stackSetDescription;

    public StackSetDescriptionPrimitiveTypeHolder withStackSetDescription(String stackSetDescription) {
        this.stackSetDescription = stackSetDescription;
        return this;
    }

    /**
     * 资源栈集的描述。可用于客户识别自己的资源栈集。
     * @return stackSetDescription
     */
    public String getStackSetDescription() {
        return stackSetDescription;
    }

    public void setStackSetDescription(String stackSetDescription) {
        this.stackSetDescription = stackSetDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackSetDescriptionPrimitiveTypeHolder that = (StackSetDescriptionPrimitiveTypeHolder) obj;
        return Objects.equals(this.stackSetDescription, that.stackSetDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackSetDescriptionPrimitiveTypeHolder {\n");
        sb.append("    stackSetDescription: ").append(toIndentedString(stackSetDescription)).append("\n");
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
