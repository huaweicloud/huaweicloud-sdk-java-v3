package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateModuleDescriptionPrimitiveTypeHolder
 */
public class PrivateModuleDescriptionPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_description")

    private String moduleDescription;

    public PrivateModuleDescriptionPrimitiveTypeHolder withModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
        return this;
    }

    /**
     * 私有模块（private-module）的描述。可用于客户识别被管理的私有模块。如果想要更新私有模块的描述，可以通过UpdatePrivateModuleMetadata API。
     * @return moduleDescription
     */
    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateModuleDescriptionPrimitiveTypeHolder that = (PrivateModuleDescriptionPrimitiveTypeHolder) obj;
        return Objects.equals(this.moduleDescription, that.moduleDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateModuleDescriptionPrimitiveTypeHolder {\n");
        sb.append("    moduleDescription: ").append(toIndentedString(moduleDescription)).append("\n");
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
