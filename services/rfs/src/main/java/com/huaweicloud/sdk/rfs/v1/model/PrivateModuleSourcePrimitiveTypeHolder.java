package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateModuleSourcePrimitiveTypeHolder
 */
public class PrivateModuleSourcePrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_source")

    private String moduleSource;

    public PrivateModuleSourcePrimitiveTypeHolder withModuleSource(String moduleSource) {
        this.moduleSource = moduleSource;
        return this;
    }

    /**
     * 在模板中使用模块需要定义如下格式：   module \"my_hello_word_module\" {     source = {module_source}   }  其中{module_source}为本参数
     * @return moduleSource
     */
    public String getModuleSource() {
        return moduleSource;
    }

    public void setModuleSource(String moduleSource) {
        this.moduleSource = moduleSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateModuleSourcePrimitiveTypeHolder that = (PrivateModuleSourcePrimitiveTypeHolder) obj;
        return Objects.equals(this.moduleSource, that.moduleSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateModuleSourcePrimitiveTypeHolder {\n");
        sb.append("    moduleSource: ").append(toIndentedString(moduleSource)).append("\n");
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
