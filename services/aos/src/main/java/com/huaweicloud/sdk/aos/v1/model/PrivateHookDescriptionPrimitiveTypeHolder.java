package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateHookDescriptionPrimitiveTypeHolder
 */
public class PrivateHookDescriptionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_description")

    private String hookDescription;

    public PrivateHookDescriptionPrimitiveTypeHolder withHookDescription(String hookDescription) {
        this.hookDescription = hookDescription;
        return this;
    }

    /**
     * 私有hook的描述。可用于客户识别创建的私有hook。可通过UpdatePrivateHook API更新私有hook的描述。
     * @return hookDescription
     */
    public String getHookDescription() {
        return hookDescription;
    }

    public void setHookDescription(String hookDescription) {
        this.hookDescription = hookDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateHookDescriptionPrimitiveTypeHolder that = (PrivateHookDescriptionPrimitiveTypeHolder) obj;
        return Objects.equals(this.hookDescription, that.hookDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateHookDescriptionPrimitiveTypeHolder {\n");
        sb.append("    hookDescription: ").append(toIndentedString(hookDescription)).append("\n");
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
