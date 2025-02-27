package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AllowIpRangesOptionIPv6 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_range")

    private String ipRange;

    public AllowIpRangesOptionIPv6 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AllowIpRangesOptionIPv6 withIpRange(String ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    /**
     * IPv6地址区间，例如： 0000:0000:0000:0000:0000:0000:0000:0000-FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF:FFFF。
     * @return ipRange
     */
    public String getIpRange() {
        return ipRange;
    }

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AllowIpRangesOptionIPv6 that = (AllowIpRangesOptionIPv6) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.ipRange, that.ipRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, ipRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowIpRangesOptionIPv6 {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
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
