package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云堡垒机服务可用分区信息。
 */
public class AvailabilityZones {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public AvailabilityZones withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云堡垒机服务可用区ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AvailabilityZones withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 云堡垒机服务可用分区显示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AvailabilityZones withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 云堡垒机服务分区ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AvailabilityZones withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 云堡垒机服务可用区状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AvailabilityZones withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 云堡垒机服务可用区类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailabilityZones availabilityZones = (AvailabilityZones) o;
        return Objects.equals(this.id, availabilityZones.id)
            && Objects.equals(this.displayName, availabilityZones.displayName)
            && Objects.equals(this.regionId, availabilityZones.regionId)
            && Objects.equals(this.status, availabilityZones.status)
            && Objects.equals(this.type, availabilityZones.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName, regionId, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZones {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
