package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建弹性公网IP的带宽参数
 */
public class CreatePublicIpBandwidthOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private String bandwidthType;

    public CreatePublicIpBandwidthOption withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 带宽id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreatePublicIpBandwidthOption withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * 带宽类型。  指定带宽ID，则该参数不生效。 不指定带宽的情况下，如果当前带宽类型下没有带宽，自动在该带宽类型下创建带宽，有则使用最近创建的带宽。
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
        CreatePublicIpBandwidthOption that = (CreatePublicIpBandwidthOption) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.bandwidthType, that.bandwidthType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bandwidthType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicIpBandwidthOption {\n");
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
