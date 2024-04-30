package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateProviderIdPrimitiveTypeHolder
 */
public class PrivateProviderIdPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    public PrivateProviderIdPrimitiveTypeHolder withProviderId(String providerId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateProviderIdPrimitiveTypeHolder that = (PrivateProviderIdPrimitiveTypeHolder) obj;
        return Objects.equals(this.providerId, that.providerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateProviderIdPrimitiveTypeHolder {\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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
