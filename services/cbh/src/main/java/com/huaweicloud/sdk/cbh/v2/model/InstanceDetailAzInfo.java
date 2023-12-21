package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可用区信息。
 */
public class InstanceDetailAzInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_display")

    private String availabilityZoneDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_zone")

    private String slaveZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_zone_display")

    private String slaveZoneDisplay;

    public InstanceDetailAzInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 云堡垒机实例所在可用区ID。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceDetailAzInfo withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 云堡垒机实例所在可用分区ID。(实例为主备模式时作为主机实例所在可用分区)
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public InstanceDetailAzInfo withAvailabilityZoneDisplay(String availabilityZoneDisplay) {
        this.availabilityZoneDisplay = availabilityZoneDisplay;
        return this;
    }

    /**
     * 云堡垒机实例所在可用分区中文名称。(实例为主备模式时作为主机实例所在可用分区中文名称)
     * @return availabilityZoneDisplay
     */
    public String getAvailabilityZoneDisplay() {
        return availabilityZoneDisplay;
    }

    public void setAvailabilityZoneDisplay(String availabilityZoneDisplay) {
        this.availabilityZoneDisplay = availabilityZoneDisplay;
    }

    public InstanceDetailAzInfo withSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
        return this;
    }

    /**
     * 云堡垒机备机实例所在可用区。
     * @return slaveZone
     */
    public String getSlaveZone() {
        return slaveZone;
    }

    public void setSlaveZone(String slaveZone) {
        this.slaveZone = slaveZone;
    }

    public InstanceDetailAzInfo withSlaveZoneDisplay(String slaveZoneDisplay) {
        this.slaveZoneDisplay = slaveZoneDisplay;
        return this;
    }

    /**
     * 云堡垒机备机实例所在可用区中文名称。
     * @return slaveZoneDisplay
     */
    public String getSlaveZoneDisplay() {
        return slaveZoneDisplay;
    }

    public void setSlaveZoneDisplay(String slaveZoneDisplay) {
        this.slaveZoneDisplay = slaveZoneDisplay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetailAzInfo that = (InstanceDetailAzInfo) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.zone, that.zone)
            && Objects.equals(this.availabilityZoneDisplay, that.availabilityZoneDisplay)
            && Objects.equals(this.slaveZone, that.slaveZone)
            && Objects.equals(this.slaveZoneDisplay, that.slaveZoneDisplay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, zone, availabilityZoneDisplay, slaveZone, slaveZoneDisplay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetailAzInfo {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    availabilityZoneDisplay: ").append(toIndentedString(availabilityZoneDisplay)).append("\n");
        sb.append("    slaveZone: ").append(toIndentedString(slaveZone)).append("\n");
        sb.append("    slaveZoneDisplay: ").append(toIndentedString(slaveZoneDisplay)).append("\n");
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
