package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Ipv6Bandwidth
 */
public class Ipv6Bandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private String bandwidthType;

    public Ipv6Bandwidth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * IPv6带宽的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ipv6Bandwidth withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * 带宽类型。  指定带宽ID，则该参数不生效。 不指定带宽的情况下，如果当前带宽类型下没有带宽，自动在该带宽类型下创建带宽，有则使用最近创建的带宽。 约束：指定的bandwidth_type必须在对应弹性公网IP类型的allow_share_bandwidth_types中才能使用
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ipv6Bandwidth that = (Ipv6Bandwidth) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.bandwidthType, that.bandwidthType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bandwidthType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ipv6Bandwidth {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
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
