package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModuleURIPrimitiveTypeHolder
 */
public class ModuleURIPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_uri")

    private String moduleUri;

    public ModuleURIPrimitiveTypeHolder withModuleUri(String moduleUri) {
        this.moduleUri = moduleUri;
        return this;
    }

    /**
     * 模块（module）包的OBS地址。模块允许用户将可复用的代码编辑在一起供模块使用。  OBS地址支持同类型Region之间进行互相访问（Region分为通用Region和专属Region，通用Region指面向公共租户提供通用云服务的Region；专属Region指只承载同一类业务或只面向特定租户提供业务服务的专用Region）  模块包只支持zip压缩包，文件需要以\".zip\"结尾。关于模块包的校验要求如下：   * 模块包中不得包含以\".tfvars\"结尾的文件   * 模块包解压前后的大小均应控制在1MB以内   * 模块包内的文件数量不能超过100个   * 模块包内的文件路径不允许以正斜线（/）开头   * 模块包内的文件路径分隔符之间不允许为空格、\".\"和\"..\"   * 模块包内的文件路径最长为2048   * 模块包内的文件名最长为255   * 模块包内应至少有一份模板文件（以\".tf\"或\".tf.json\"结尾的文件）  **注意：**   * 模块中的内容不支持敏感数据加密，资源编排服务会直接明文使用、log、展示、存储module_uri对应的模块包。
     * @return moduleUri
     */
    public String getModuleUri() {
        return moduleUri;
    }

    public void setModuleUri(String moduleUri) {
        this.moduleUri = moduleUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModuleURIPrimitiveTypeHolder that = (ModuleURIPrimitiveTypeHolder) obj;
        return Objects.equals(this.moduleUri, that.moduleUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModuleURIPrimitiveTypeHolder {\n");
        sb.append("    moduleUri: ").append(toIndentedString(moduleUri)).append("\n");
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
