package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateProviderSummary
 */
public class PrivateProviderSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_description")

    private String providerDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_source")

    private String providerSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_agency_urn")

    private String providerAgencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_agency_name")

    private String providerAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public PrivateProviderSummary withProviderId(String providerId) {
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

    public PrivateProviderSummary withProviderName(String providerName) {
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

    public PrivateProviderSummary withProviderDescription(String providerDescription) {
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

    public PrivateProviderSummary withProviderSource(String providerSource) {
        this.providerSource = providerSource;
        return this;
    }

    /**
     * 用户使用私有provider，在Terraform模板中定义required_providers信息时，需要指明的source参数。  该参数按照“huawei.com/private-provider/{provider_name}”的形式拼接。关于provider_name和provider_source字段在模板中的使用细节，详见创建私有Provider的API描述。
     * @return providerSource
     */
    public String getProviderSource() {
        return providerSource;
    }

    public void setProviderSource(String providerSource) {
        this.providerSource = providerSource;
    }

    public PrivateProviderSummary withProviderAgencyUrn(String providerAgencyUrn) {
        this.providerAgencyUrn = providerAgencyUrn;
        return this;
    }

    /**
     * 自定义provider所绑定的IAM委托URN，provider_agency_name和provider_agency_urn最多只能提供一个。
     * @return providerAgencyUrn
     */
    public String getProviderAgencyUrn() {
        return providerAgencyUrn;
    }

    public void setProviderAgencyUrn(String providerAgencyUrn) {
        this.providerAgencyUrn = providerAgencyUrn;
    }

    public PrivateProviderSummary withProviderAgencyName(String providerAgencyName) {
        this.providerAgencyName = providerAgencyName;
        return this;
    }

    /**
     * 自定义provider所绑定的IAM委托名称，provider_agency_name和provider_agency_urn最多只能提供一个。
     * @return providerAgencyName
     */
    public String getProviderAgencyName() {
        return providerAgencyName;
    }

    public void setProviderAgencyName(String providerAgencyName) {
        this.providerAgencyName = providerAgencyName;
    }

    public PrivateProviderSummary withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 私有provider（private-provider）的生成时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PrivateProviderSummary withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 私有provider（private-provider）的更新时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateProviderSummary that = (PrivateProviderSummary) obj;
        return Objects.equals(this.providerId, that.providerId) && Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.providerDescription, that.providerDescription)
            && Objects.equals(this.providerSource, that.providerSource)
            && Objects.equals(this.providerAgencyUrn, that.providerAgencyUrn)
            && Objects.equals(this.providerAgencyName, that.providerAgencyName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId,
            providerName,
            providerDescription,
            providerSource,
            providerAgencyUrn,
            providerAgencyName,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateProviderSummary {\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    providerDescription: ").append(toIndentedString(providerDescription)).append("\n");
        sb.append("    providerSource: ").append(toIndentedString(providerSource)).append("\n");
        sb.append("    providerAgencyUrn: ").append(toIndentedString(providerAgencyUrn)).append("\n");
        sb.append("    providerAgencyName: ").append(toIndentedString(providerAgencyName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
