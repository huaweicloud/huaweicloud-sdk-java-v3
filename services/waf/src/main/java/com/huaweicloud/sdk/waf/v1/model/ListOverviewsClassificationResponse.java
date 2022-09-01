package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOverviewsClassificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private DomainClassificationItem domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    @JacksonXmlProperty(localName = "attack_type")

    private AttackTypeClassificationItem attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    @JacksonXmlProperty(localName = "ip")

    private IpClassificationItem ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private UrlClassificationItem url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geo")

    @JacksonXmlProperty(localName = "geo")

    private GeoClassificationItem geo;

    public ListOverviewsClassificationResponse withDomain(DomainClassificationItem domain) {
        this.domain = domain;
        return this;
    }

    public ListOverviewsClassificationResponse withDomain(Consumer<DomainClassificationItem> domainSetter) {
        if (this.domain == null) {
            this.domain = new DomainClassificationItem();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public DomainClassificationItem getDomain() {
        return domain;
    }

    public void setDomain(DomainClassificationItem domain) {
        this.domain = domain;
    }

    public ListOverviewsClassificationResponse withAttackType(AttackTypeClassificationItem attackType) {
        this.attackType = attackType;
        return this;
    }

    public ListOverviewsClassificationResponse withAttackType(Consumer<AttackTypeClassificationItem> attackTypeSetter) {
        if (this.attackType == null) {
            this.attackType = new AttackTypeClassificationItem();
            attackTypeSetter.accept(this.attackType);
        }

        return this;
    }

    /**
     * Get attackType
     * @return attackType
     */
    public AttackTypeClassificationItem getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackTypeClassificationItem attackType) {
        this.attackType = attackType;
    }

    public ListOverviewsClassificationResponse withIp(IpClassificationItem ip) {
        this.ip = ip;
        return this;
    }

    public ListOverviewsClassificationResponse withIp(Consumer<IpClassificationItem> ipSetter) {
        if (this.ip == null) {
            this.ip = new IpClassificationItem();
            ipSetter.accept(this.ip);
        }

        return this;
    }

    /**
     * Get ip
     * @return ip
     */
    public IpClassificationItem getIp() {
        return ip;
    }

    public void setIp(IpClassificationItem ip) {
        this.ip = ip;
    }

    public ListOverviewsClassificationResponse withUrl(UrlClassificationItem url) {
        this.url = url;
        return this;
    }

    public ListOverviewsClassificationResponse withUrl(Consumer<UrlClassificationItem> urlSetter) {
        if (this.url == null) {
            this.url = new UrlClassificationItem();
            urlSetter.accept(this.url);
        }

        return this;
    }

    /**
     * Get url
     * @return url
     */
    public UrlClassificationItem getUrl() {
        return url;
    }

    public void setUrl(UrlClassificationItem url) {
        this.url = url;
    }

    public ListOverviewsClassificationResponse withGeo(GeoClassificationItem geo) {
        this.geo = geo;
        return this;
    }

    public ListOverviewsClassificationResponse withGeo(Consumer<GeoClassificationItem> geoSetter) {
        if (this.geo == null) {
            this.geo = new GeoClassificationItem();
            geoSetter.accept(this.geo);
        }

        return this;
    }

    /**
     * Get geo
     * @return geo
     */
    public GeoClassificationItem getGeo() {
        return geo;
    }

    public void setGeo(GeoClassificationItem geo) {
        this.geo = geo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOverviewsClassificationResponse listOverviewsClassificationResponse =
            (ListOverviewsClassificationResponse) o;
        return Objects.equals(this.domain, listOverviewsClassificationResponse.domain)
            && Objects.equals(this.attackType, listOverviewsClassificationResponse.attackType)
            && Objects.equals(this.ip, listOverviewsClassificationResponse.ip)
            && Objects.equals(this.url, listOverviewsClassificationResponse.url)
            && Objects.equals(this.geo, listOverviewsClassificationResponse.geo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, attackType, ip, url, geo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOverviewsClassificationResponse {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
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
