package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePrivateModuleRequestBody
 */
public class CreatePrivateModuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_version")

    private String moduleVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_description")

    private String moduleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_uri")

    private String moduleUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    public CreatePrivateModuleRequestBody withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 私有模块（private-module）的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public CreatePrivateModuleRequestBody withModuleVersion(String moduleVersion) {
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

    public CreatePrivateModuleRequestBody withModuleDescription(String moduleDescription) {
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

    public CreatePrivateModuleRequestBody withModuleUri(String moduleUri) {
        this.moduleUri = moduleUri;
        return this;
    }

    /**
     * 模块（module）包的OBS地址。模块允许用户将可复用的代码编辑在一起供模块使用。  OBS地址支持同类型Region之间进行互相访问（Region分为通用Region和专属Region，通用Region指面向公共租户提供通用云服务的Region；专属Region指只承载同一类业务或只面向特定租户提供业务服务的专用Region）  模块包只支持zip压缩包，文件需要以\".zip\"结尾。关于模块包的校验要求如下：   * 模块包中不得包含以\".tfvars\"结尾的文件   * 模块包解压前后的大小均应控制在1MB以内   * 模块包内的文件数量不能超过100个   * 模块包内的文件路径不允许以正斜线（/）开头   * 模块包内的文件路径分隔符之间不允许为空、`.`和`..`   * 模块包内的文件路径最长为2048   * 模块包内的文件名最长为255   * 模块包内应至少有一份模板文件（以`.tf`或`.tf.json`结尾的文件）  **注意：**   * 模块中的内容不支持敏感数据加密，资源编排服务会直接明文使用、log、展示、存储module_uri对应的模块包。
     * @return moduleUri
     */
    public String getModuleUri() {
        return moduleUri;
    }

    public void setModuleUri(String moduleUri) {
        this.moduleUri = moduleUri;
    }

    public CreatePrivateModuleRequestBody withVersionDescription(String versionDescription) {
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
        CreatePrivateModuleRequestBody that = (CreatePrivateModuleRequestBody) obj;
        return Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.moduleVersion, that.moduleVersion)
            && Objects.equals(this.moduleDescription, that.moduleDescription)
            && Objects.equals(this.moduleUri, that.moduleUri)
            && Objects.equals(this.versionDescription, that.versionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleName, moduleVersion, moduleDescription, moduleUri, versionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateModuleRequestBody {\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
        sb.append("    moduleDescription: ").append(toIndentedString(moduleDescription)).append("\n");
        sb.append("    moduleUri: ").append(toIndentedString(moduleUri)).append("\n");
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
