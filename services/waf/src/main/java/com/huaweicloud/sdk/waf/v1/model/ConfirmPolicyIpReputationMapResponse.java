package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ConfirmPolicyIpReputationMapResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_reputation_map")

    private IpReputationMapResponseBodyIpReputationMap ipReputationMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private IpReputationMapResponseBodyLocale locale;

    public ConfirmPolicyIpReputationMapResponse withIpReputationMap(
        IpReputationMapResponseBodyIpReputationMap ipReputationMap) {
        this.ipReputationMap = ipReputationMap;
        return this;
    }

    public ConfirmPolicyIpReputationMapResponse withIpReputationMap(
        Consumer<IpReputationMapResponseBodyIpReputationMap> ipReputationMapSetter) {
        if (this.ipReputationMap == null) {
            this.ipReputationMap = new IpReputationMapResponseBodyIpReputationMap();
            ipReputationMapSetter.accept(this.ipReputationMap);
        }

        return this;
    }

    /**
     * Get ipReputationMap
     * @return ipReputationMap
     */
    public IpReputationMapResponseBodyIpReputationMap getIpReputationMap() {
        return ipReputationMap;
    }

    public void setIpReputationMap(IpReputationMapResponseBodyIpReputationMap ipReputationMap) {
        this.ipReputationMap = ipReputationMap;
    }

    public ConfirmPolicyIpReputationMapResponse withLocale(IpReputationMapResponseBodyLocale locale) {
        this.locale = locale;
        return this;
    }

    public ConfirmPolicyIpReputationMapResponse withLocale(Consumer<IpReputationMapResponseBodyLocale> localeSetter) {
        if (this.locale == null) {
            this.locale = new IpReputationMapResponseBodyLocale();
            localeSetter.accept(this.locale);
        }

        return this;
    }

    /**
     * Get locale
     * @return locale
     */
    public IpReputationMapResponseBodyLocale getLocale() {
        return locale;
    }

    public void setLocale(IpReputationMapResponseBodyLocale locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmPolicyIpReputationMapResponse that = (ConfirmPolicyIpReputationMapResponse) obj;
        return Objects.equals(this.ipReputationMap, that.ipReputationMap) && Objects.equals(this.locale, that.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipReputationMap, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmPolicyIpReputationMapResponse {\n");
        sb.append("    ipReputationMap: ").append(toIndentedString(ipReputationMap)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
