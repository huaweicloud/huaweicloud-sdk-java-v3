package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AvailabilityZones
 */
public class AvailabilityZones {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private String primary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby")

    private String standby;

    public AvailabilityZones withPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    /**
     * - 参数解释：ESW实例默认主节点所在的可用区。 - 约束限制：1-128字符。 - 取值范围：当前区域可用区id。 - 默认取值：不涉及。
     * @return primary
     */
    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public AvailabilityZones withStandby(String standby) {
        this.standby = standby;
        return this;
    }

    /**
     * - 参数解释：ESW实例默认备节点所在的可用区。 - 约束限制：1-128字符。 - 取值范围：当前区域可用区id。 - 默认取值：不涉及。
     * @return standby
     */
    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailabilityZones that = (AvailabilityZones) obj;
        return Objects.equals(this.primary, that.primary) && Objects.equals(this.standby, that.standby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primary, standby);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZones {\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
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
