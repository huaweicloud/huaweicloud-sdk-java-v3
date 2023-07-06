package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 域名回源HOST配置。
 */
public class DomainOriginHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_host_type")

    private String originHostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customize_domain")

    private String customizeDomain;

    public DomainOriginHost withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DomainOriginHost withOriginHostType(String originHostType) {
        this.originHostType = originHostType;
        return this;
    }

    /**
     * 回源host的类型,accelerate：选择加速域名作为回源host域名， customize：使用自定义的域名作为回源host域名。
     * @return originHostType
     */
    public String getOriginHostType() {
        return originHostType;
    }

    public void setOriginHostType(String originHostType) {
        this.originHostType = originHostType;
    }

    public DomainOriginHost withCustomizeDomain(String customizeDomain) {
        this.customizeDomain = customizeDomain;
        return this;
    }

    /**
     * 自定义回源host域名。
     * @return customizeDomain
     */
    public String getCustomizeDomain() {
        return customizeDomain;
    }

    public void setCustomizeDomain(String customizeDomain) {
        this.customizeDomain = customizeDomain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainOriginHost that = (DomainOriginHost) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.originHostType, that.originHostType)
            && Objects.equals(this.customizeDomain, that.customizeDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, originHostType, customizeDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainOriginHost {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    originHostType: ").append(toIndentedString(originHostType)).append("\n");
        sb.append("    customizeDomain: ").append(toIndentedString(customizeDomain)).append("\n");
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
