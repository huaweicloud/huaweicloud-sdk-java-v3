package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateHookVersionDescriptionPrimitiveTypeHolder
 */
public class PrivateHookVersionDescriptionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version_description")

    private String hookVersionDescription;

    public PrivateHookVersionDescriptionPrimitiveTypeHolder withHookVersionDescription(String hookVersionDescription) {
        this.hookVersionDescription = hookVersionDescription;
        return this;
    }

    /**
     * 私有hook版本的描述。可用于客户识别创建私有hook的版本。注意：hook版本为不可更新（immutable），所以该字段不可更新，如果需要更新，请删除后重建。
     * @return hookVersionDescription
     */
    public String getHookVersionDescription() {
        return hookVersionDescription;
    }

    public void setHookVersionDescription(String hookVersionDescription) {
        this.hookVersionDescription = hookVersionDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateHookVersionDescriptionPrimitiveTypeHolder that = (PrivateHookVersionDescriptionPrimitiveTypeHolder) obj;
        return Objects.equals(this.hookVersionDescription, that.hookVersionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookVersionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateHookVersionDescriptionPrimitiveTypeHolder {\n");
        sb.append("    hookVersionDescription: ").append(toIndentedString(hookVersionDescription)).append("\n");
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
