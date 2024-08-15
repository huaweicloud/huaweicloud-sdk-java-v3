package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群的可用区。
 */
public class CdmClusterAvailabilityZone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableZoneId")

    private String availableZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableZoneName")

    private String availableZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableZoneCode")

    private String availableZoneCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azStatus")

    private String azStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Object tags;

    public CdmClusterAvailabilityZone withAvailableZoneId(String availableZoneId) {
        this.availableZoneId = availableZoneId;
        return this;
    }

    /**
     * 可用区ID。
     * @return availableZoneId
     */
    public String getAvailableZoneId() {
        return availableZoneId;
    }

    public void setAvailableZoneId(String availableZoneId) {
        this.availableZoneId = availableZoneId;
    }

    public CdmClusterAvailabilityZone withAvailableZoneName(String availableZoneName) {
        this.availableZoneName = availableZoneName;
        return this;
    }

    /**
     * 可用区名称。
     * @return availableZoneName
     */
    public String getAvailableZoneName() {
        return availableZoneName;
    }

    public void setAvailableZoneName(String availableZoneName) {
        this.availableZoneName = availableZoneName;
    }

    public CdmClusterAvailabilityZone withAvailableZoneCode(String availableZoneCode) {
        this.availableZoneCode = availableZoneCode;
        return this;
    }

    /**
     * 可用区码。
     * @return availableZoneCode
     */
    public String getAvailableZoneCode() {
        return availableZoneCode;
    }

    public void setAvailableZoneCode(String availableZoneCode) {
        this.availableZoneCode = availableZoneCode;
    }

    public CdmClusterAvailabilityZone withAzStatus(String azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    /**
     * 可用区状态。
     * @return azStatus
     */
    public String getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(String azStatus) {
        this.azStatus = azStatus;
    }

    public CdmClusterAvailabilityZone withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 可用区类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CdmClusterAvailabilityZone withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 可用区tag。
     * @return tags
     */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmClusterAvailabilityZone that = (CdmClusterAvailabilityZone) obj;
        return Objects.equals(this.availableZoneId, that.availableZoneId)
            && Objects.equals(this.availableZoneName, that.availableZoneName)
            && Objects.equals(this.availableZoneCode, that.availableZoneCode)
            && Objects.equals(this.azStatus, that.azStatus) && Objects.equals(this.type, that.type)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableZoneId, availableZoneName, availableZoneCode, azStatus, type, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmClusterAvailabilityZone {\n");
        sb.append("    availableZoneId: ").append(toIndentedString(availableZoneId)).append("\n");
        sb.append("    availableZoneName: ").append(toIndentedString(availableZoneName)).append("\n");
        sb.append("    availableZoneCode: ").append(toIndentedString(availableZoneCode)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
