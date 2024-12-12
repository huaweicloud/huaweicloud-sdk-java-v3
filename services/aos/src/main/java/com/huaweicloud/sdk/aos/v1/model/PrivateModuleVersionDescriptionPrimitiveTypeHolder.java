package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateModuleVersionDescriptionPrimitiveTypeHolder
 */
public class PrivateModuleVersionDescriptionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    public PrivateModuleVersionDescriptionPrimitiveTypeHolder withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * 模块版本（module version）的描述。可用于客户识别并管理模块的版本。注意：模块版本为不可更新（immutable），即描述不可更新，如果需要更新，请删除后重建
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateModuleVersionDescriptionPrimitiveTypeHolder that =
            (PrivateModuleVersionDescriptionPrimitiveTypeHolder) obj;
        return Objects.equals(this.versionDescription, that.versionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateModuleVersionDescriptionPrimitiveTypeHolder {\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
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
