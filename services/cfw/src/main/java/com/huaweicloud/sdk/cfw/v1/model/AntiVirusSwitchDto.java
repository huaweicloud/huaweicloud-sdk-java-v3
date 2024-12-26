package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AntiVirusSwitchDto
 */
public class AntiVirusSwitchDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti_virus_status")

    private Integer antiVirusStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    public AntiVirusSwitchDto withAntiVirusStatus(Integer antiVirusStatus) {
        this.antiVirusStatus = antiVirusStatus;
        return this;
    }

    /**
     * 反病毒开关状态
     * minimum: 0
     * maximum: 1
     * @return antiVirusStatus
     */
    public Integer getAntiVirusStatus() {
        return antiVirusStatus;
    }

    public void setAntiVirusStatus(Integer antiVirusStatus) {
        this.antiVirusStatus = antiVirusStatus;
    }

    public AntiVirusSwitchDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象ID
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusSwitchDto that = (AntiVirusSwitchDto) obj;
        return Objects.equals(this.antiVirusStatus, that.antiVirusStatus)
            && Objects.equals(this.objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(antiVirusStatus, objectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusSwitchDto {\n");
        sb.append("    antiVirusStatus: ").append(toIndentedString(antiVirusStatus)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
