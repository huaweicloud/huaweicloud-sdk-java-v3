package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DualActiveInfo
 */
public class DualActiveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_instance_id")

    private String destinationInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    public DualActiveInfo withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 双活角色。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DualActiveInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 双活状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DualActiveInfo withDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }

    /**
     * 双活对端实例id。
     * @return destinationInstanceId
     */
    public String getDestinationInstanceId() {
        return destinationInstanceId;
    }

    public void setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
    }

    public DualActiveInfo withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 双活对端region。
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DualActiveInfo that = (DualActiveInfo) obj;
        return Objects.equals(this.role, that.role) && Objects.equals(this.status, that.status)
            && Objects.equals(this.destinationInstanceId, that.destinationInstanceId)
            && Objects.equals(this.destinationRegion, that.destinationRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, status, destinationInstanceId, destinationRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DualActiveInfo {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    destinationInstanceId: ").append(toIndentedString(destinationInstanceId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
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
