package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 一个az对象
 */
public class AzInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zoneName")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zoneState")

    private ZoneState zoneState;

    public AzInfo withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 可用分区的名字。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public AzInfo withZoneState(ZoneState zoneState) {
        this.zoneState = zoneState;
        return this;
    }

    public AzInfo withZoneState(Consumer<ZoneState> zoneStateSetter) {
        if (this.zoneState == null) {
            this.zoneState = new ZoneState();
            zoneStateSetter.accept(this.zoneState);
        }

        return this;
    }

    /**
     * Get zoneState
     * @return zoneState
     */
    public ZoneState getZoneState() {
        return zoneState;
    }

    public void setZoneState(ZoneState zoneState) {
        this.zoneState = zoneState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AzInfo that = (AzInfo) obj;
        return Objects.equals(this.zoneName, that.zoneName) && Objects.equals(this.zoneState, that.zoneState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneName, zoneState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzInfo {\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    zoneState: ").append(toIndentedString(zoneState)).append("\n");
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
