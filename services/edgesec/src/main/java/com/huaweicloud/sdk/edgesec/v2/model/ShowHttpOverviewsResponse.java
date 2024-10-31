package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHttpOverviewsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private DomainClassificationItem domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private AttackTypeClassificationItem attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private IpClassificationItem ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private UrlClassificationItem url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geo")

    private GeoClassificationItem geo;

    public ShowHttpOverviewsResponse withDomain(DomainClassificationItem domain) {
        this.domain = domain;
        return this;
    }

    public ShowHttpOverviewsResponse withDomain(Consumer<DomainClassificationItem> domainSetter) {
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

    public ShowHttpOverviewsResponse withAttackType(AttackTypeClassificationItem attackType) {
        this.attackType = attackType;
        return this;
    }

    public ShowHttpOverviewsResponse withAttackType(Consumer<AttackTypeClassificationItem> attackTypeSetter) {
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

    public ShowHttpOverviewsResponse withIp(IpClassificationItem ip) {
        this.ip = ip;
        return this;
    }

    public ShowHttpOverviewsResponse withIp(Consumer<IpClassificationItem> ipSetter) {
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

    public ShowHttpOverviewsResponse withUrl(UrlClassificationItem url) {
        this.url = url;
        return this;
    }

    public ShowHttpOverviewsResponse withUrl(Consumer<UrlClassificationItem> urlSetter) {
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

    public ShowHttpOverviewsResponse withGeo(GeoClassificationItem geo) {
        this.geo = geo;
        return this;
    }

    public ShowHttpOverviewsResponse withGeo(Consumer<GeoClassificationItem> geoSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpOverviewsResponse that = (ShowHttpOverviewsResponse) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.attackType, that.attackType)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.url, that.url)
            && Objects.equals(this.geo, that.geo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, attackType, ip, url, geo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpOverviewsResponse {\n");
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
