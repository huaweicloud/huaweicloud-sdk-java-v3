package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainIpv6SwitchReq
 */
public class DomainIpv6SwitchReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ipv6")

    private Boolean isIpv6;

    public DomainIpv6SwitchReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DomainIpv6SwitchReq withIsIpv6(Boolean isIpv6) {
        this.isIpv6 = isIpv6;
        return this;
    }

    /**
     * IPV6开关配置，默认关闭，true为开启，false为关闭
     * @return isIpv6
     */
    public Boolean getIsIpv6() {
        return isIpv6;
    }

    public void setIsIpv6(Boolean isIpv6) {
        this.isIpv6 = isIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainIpv6SwitchReq that = (DomainIpv6SwitchReq) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.isIpv6, that.isIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, isIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainIpv6SwitchReq {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    isIpv6: ").append(toIndentedString(isIpv6)).append("\n");
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
