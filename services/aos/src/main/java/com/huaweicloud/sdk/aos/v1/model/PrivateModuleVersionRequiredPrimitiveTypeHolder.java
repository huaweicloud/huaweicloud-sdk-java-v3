package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateModuleVersionRequiredPrimitiveTypeHolder
 */
public class PrivateModuleVersionRequiredPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_version")

    private String moduleVersion;

    public PrivateModuleVersionRequiredPrimitiveTypeHolder withModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }

    /**
     * 模块的版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateModuleVersionRequiredPrimitiveTypeHolder that = (PrivateModuleVersionRequiredPrimitiveTypeHolder) obj;
        return Objects.equals(this.moduleVersion, that.moduleVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateModuleVersionRequiredPrimitiveTypeHolder {\n");
        sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
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
