package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 物理服务器部署位置信息
 */
public class Location {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc")

    private String dc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack")

    private String rack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public Location withDc(String dc) {
        this.dc = dc;
        return this;
    }

    /**
     * 服务器所在的机房名称
     * @return dc
     */
    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public Location withRack(String rack) {
        this.rack = rack;
        return this;
    }

    /**
     * 服务器所在的iRack名称
     * @return rack
     */
    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }

    public Location withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 服务器所在的U位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location that = (Location) obj;
        return Objects.equals(this.dc, that.dc) && Objects.equals(this.rack, that.rack)
            && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dc, rack, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");
        sb.append("    dc: ").append(toIndentedString(dc)).append("\n");
        sb.append("    rack: ").append(toIndentedString(rack)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
