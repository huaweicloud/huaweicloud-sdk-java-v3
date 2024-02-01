package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePrivateProviderRequestBody
 */
public class CreatePrivateProviderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_description")

    private String providerDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_version")

    private String providerVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_graph_urn")

    private String functionGraphUrn;

    public CreatePrivateProviderRequestBody withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 私有provider（private-provider）的名称。此名字在domain_id+region下应唯一，可以使用小写英文、数字、中划线。仅支持以小写英文、数字开头结尾。  按照HCL最佳实践，该名称推荐为在模板中定义的provider的本地名称（local_name）。  创建私有Provider（CreatePrivateProvider）API 还会以 “huawei.com/private-provider”为固定前缀，并以“huawei.com/private-provider/{provider_name}”的形式返回provider_source字段。关于provider_name和provider_source字段在模板中的使用细节，详见创建私有Provider的API描述。
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public CreatePrivateProviderRequestBody withProviderDescription(String providerDescription) {
        this.providerDescription = providerDescription;
        return this;
    }

    /**
     * 私有provider（private-provider）的描述。可用于客户识别被管理的私有provider。
     * @return providerDescription
     */
    public String getProviderDescription() {
        return providerDescription;
    }

    public void setProviderDescription(String providerDescription) {
        this.providerDescription = providerDescription;
    }

    public CreatePrivateProviderRequestBody withProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion;
        return this;
    }

    /**
     * provider的版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义
     * @return providerVersion
     */
    public String getProviderVersion() {
        return providerVersion;
    }

    public void setProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion;
    }

    public CreatePrivateProviderRequestBody withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * 私有provider版本（provider version）的描述。可用于客户识别并管理私有provider的版本。注意：provider版本为不可更新（immutable），所以该字段不可更新，如果需要更新，请删除后重建
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public CreatePrivateProviderRequestBody withFunctionGraphUrn(String functionGraphUrn) {
        this.functionGraphUrn = functionGraphUrn;
        return this;
    }

    /**
     * FunctionGraph方法的统一资源标识，用于唯一标识的FunctionGraph方法。当前只支持和RFS同region的function_graph_urn，如果给与了关于其他region的，会报错400。  关于该参数的详细解释，请参考官方文档：https://support.huaweicloud.com/api-functiongraph/functiongraph_06_0102.html
     * @return functionGraphUrn
     */
    public String getFunctionGraphUrn() {
        return functionGraphUrn;
    }

    public void setFunctionGraphUrn(String functionGraphUrn) {
        this.functionGraphUrn = functionGraphUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateProviderRequestBody that = (CreatePrivateProviderRequestBody) obj;
        return Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.providerDescription, that.providerDescription)
            && Objects.equals(this.providerVersion, that.providerVersion)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.functionGraphUrn, that.functionGraphUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerName, providerDescription, providerVersion, versionDescription, functionGraphUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateProviderRequestBody {\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    providerDescription: ").append(toIndentedString(providerDescription)).append("\n");
        sb.append("    providerVersion: ").append(toIndentedString(providerVersion)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    functionGraphUrn: ").append(toIndentedString(functionGraphUrn)).append("\n");
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
