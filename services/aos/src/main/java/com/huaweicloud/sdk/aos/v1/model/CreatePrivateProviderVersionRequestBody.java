package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePrivateProviderVersionRequestBody
 */
public class CreatePrivateProviderVersionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_version")

    private String providerVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_graph_urn")

    private String functionGraphUrn;

    public CreatePrivateProviderVersionRequestBody withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 私有provider（private-provider）的唯一Id。  此Id由资源编排服务在生成provider的时候生成，为UUID。  由于私有provider名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的私有provider，删除，再重新创建一个同名私有provider。  对于团队并行开发，用户可能希望确保，当前我操作的私有provider就是我以为的那个，而不是其他队友删除后创建的同名私有provider。因此，使用Id就可以做到强匹配。  资源编排服务保证每次创建的私有provider所对应的Id都不相同，更新不会影响Id。如果给予的provider_id和当前provider的Id不一致，则返回400
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public CreatePrivateProviderVersionRequestBody withProviderVersion(String providerVersion) {
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

    public CreatePrivateProviderVersionRequestBody withVersionDescription(String versionDescription) {
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

    public CreatePrivateProviderVersionRequestBody withFunctionGraphUrn(String functionGraphUrn) {
        this.functionGraphUrn = functionGraphUrn;
        return this;
    }

    /**
     * FunctionGraph方法的统一资源标识，用于标识唯一的FunctionGraph方法。当前只支持和RFS同region的function_graph_urn，如果给予了关于其他region的，会报错400。  关于该参数的详细解释，请参考官方文档：https://support.huaweicloud.com/api-functiongraph/functiongraph_06_0102.html
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
        CreatePrivateProviderVersionRequestBody that = (CreatePrivateProviderVersionRequestBody) obj;
        return Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.providerVersion, that.providerVersion)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.functionGraphUrn, that.functionGraphUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, providerVersion, versionDescription, functionGraphUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateProviderVersionRequestBody {\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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
