package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备位置信息
 */
public class LayoutLocation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rack_id")

    private String rackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_index")

    private Integer startIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private Integer unit;

    public LayoutLocation withRackId(String rackId) {
        this.rackId = rackId;
        return this;
    }

    /**
     * 机柜ID
     * @return rackId
     */
    public String getRackId() {
        return rackId;
    }

    public void setRackId(String rackId) {
        this.rackId = rackId;
    }

    public LayoutLocation withStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * 起始U位
     * @return startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public LayoutLocation withUnit(Integer unit) {
        this.unit = unit;
        return this;
    }

    /**
     * U位数
     * @return unit
     */
    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
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
        LayoutLocation that = (LayoutLocation) obj;
        return Objects.equals(this.rackId, that.rackId) && Objects.equals(this.startIndex, that.startIndex)
            && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rackId, startIndex, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayoutLocation {\n");
        sb.append("    rackId: ").append(toIndentedString(rackId)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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
