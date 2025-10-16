package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OTA模块结构。
 */
public class ModuleDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_version")

    private String moduleVersion;

    public ModuleDTO withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 模块名称。
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ModuleDTO withModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }

    /**
     * 模块版本号。
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
        ModuleDTO that = (ModuleDTO) obj;
        return Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.moduleVersion, that.moduleVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleName, moduleVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModuleDTO {\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
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
