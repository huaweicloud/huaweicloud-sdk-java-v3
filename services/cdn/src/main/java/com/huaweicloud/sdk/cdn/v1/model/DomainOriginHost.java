package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DomainOriginHost
 */
public class DomainOriginHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_host_type")

    @JacksonXmlProperty(localName = "origin_host_type")

    private String originHostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customize_domain")

    @JacksonXmlProperty(localName = "customize_domain")

    private String customizeDomain;

    public DomainOriginHost withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名ID。获取方法请参见查询加速域名。
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
     * 回源host的类型。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainOriginHost domainOriginHost = (DomainOriginHost) o;
        return Objects.equals(this.domainId, domainOriginHost.domainId)
            && Objects.equals(this.originHostType, domainOriginHost.originHostType)
            && Objects.equals(this.customizeDomain, domainOriginHost.customizeDomain);
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
