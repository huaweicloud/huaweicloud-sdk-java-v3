package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 带宽值，单位Mbps。
 */
public class SiteNetworkQuotaKey {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_key")

    private SiteNetworkQuotaKeyEnum quotaKey;

    public SiteNetworkQuotaKey withQuotaKey(SiteNetworkQuotaKeyEnum quotaKey) {
        this.quotaKey = quotaKey;
        return this;
    }

    /**
     * Get quotaKey
     * @return quotaKey
     */
    public SiteNetworkQuotaKeyEnum getQuotaKey() {
        return quotaKey;
    }

    public void setQuotaKey(SiteNetworkQuotaKeyEnum quotaKey) {
        this.quotaKey = quotaKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteNetworkQuotaKey that = (SiteNetworkQuotaKey) obj;
        return Objects.equals(this.quotaKey, that.quotaKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteNetworkQuotaKey {\n");
        sb.append("    quotaKey: ").append(toIndentedString(quotaKey)).append("\n");
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
