package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreatePrivateProviderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_source")

    private String providerSource;

    public CreatePrivateProviderResponse withProviderId(String providerId) {
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

    public CreatePrivateProviderResponse withProviderSource(String providerSource) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateProviderResponse that = (CreatePrivateProviderResponse) obj;
        return Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.providerSource, that.providerSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, providerSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateProviderResponse {\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    providerSource: ").append(toIndentedString(providerSource)).append("\n");
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
