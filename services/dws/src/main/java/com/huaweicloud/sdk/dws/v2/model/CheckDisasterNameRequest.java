package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CheckDisasterNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_name")

    private String drName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_region")

    private String standbyRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_project_id")

    private String standbyProjectId;

    public CheckDisasterNameRequest withDrName(String drName) {
        this.drName = drName;
        return this;
    }

    /**
     * 容灾名称
     * @return drName
     */
    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public CheckDisasterNameRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 容灾类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CheckDisasterNameRequest withStandbyRegion(String standbyRegion) {
        this.standbyRegion = standbyRegion;
        return this;
    }

    /**
     * 备集群所在region
     * @return standbyRegion
     */
    public String getStandbyRegion() {
        return standbyRegion;
    }

    public void setStandbyRegion(String standbyRegion) {
        this.standbyRegion = standbyRegion;
    }

    public CheckDisasterNameRequest withStandbyProjectId(String standbyProjectId) {
        this.standbyProjectId = standbyProjectId;
        return this;
    }

    /**
     * 备集群所在项目ID
     * @return standbyProjectId
     */
    public String getStandbyProjectId() {
        return standbyProjectId;
    }

    public void setStandbyProjectId(String standbyProjectId) {
        this.standbyProjectId = standbyProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckDisasterNameRequest checkDisasterNameRequest = (CheckDisasterNameRequest) o;
        return Objects.equals(this.drName, checkDisasterNameRequest.drName)
            && Objects.equals(this.type, checkDisasterNameRequest.type)
            && Objects.equals(this.standbyRegion, checkDisasterNameRequest.standbyRegion)
            && Objects.equals(this.standbyProjectId, checkDisasterNameRequest.standbyProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drName, type, standbyRegion, standbyProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDisasterNameRequest {\n");
        sb.append("    drName: ").append(toIndentedString(drName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    standbyRegion: ").append(toIndentedString(standbyRegion)).append("\n");
        sb.append("    standbyProjectId: ").append(toIndentedString(standbyProjectId)).append("\n");
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
