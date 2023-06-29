package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 别名记录。
 */
public class AliasTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_domain_name")

    private String resourceDomainName;

    public AliasTarget withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源服务类型，支持别名记录的服务。取值：  cloudsite：云速建站 waf：Web应用防火墙
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public AliasTarget withResourceDomainName(String resourceDomainName) {
        this.resourceDomainName = resourceDomainName;
        return this;
    }

    /**
     * 对应服务下的域名，由各服务提供。
     * @return resourceDomainName
     */
    public String getResourceDomainName() {
        return resourceDomainName;
    }

    public void setResourceDomainName(String resourceDomainName) {
        this.resourceDomainName = resourceDomainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AliasTarget that = (AliasTarget) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceDomainName, that.resourceDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceDomainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AliasTarget {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceDomainName: ").append(toIndentedString(resourceDomainName)).append("\n");
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
