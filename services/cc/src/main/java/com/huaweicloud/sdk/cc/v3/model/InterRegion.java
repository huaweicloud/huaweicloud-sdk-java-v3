package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InterRegion
 */
public class InterRegion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_region_id")

    private String localRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_region_id")

    private String remoteRegionId;

    public InterRegion withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InterRegion withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public InterRegion withLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
        return this;
    }

    /**
     * 域间实例本端的RegionID。
     * @return localRegionId
     */
    public String getLocalRegionId() {
        return localRegionId;
    }

    public void setLocalRegionId(String localRegionId) {
        this.localRegionId = localRegionId;
    }

    public InterRegion withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /**
     * 域间实例对端的RegionID。
     * @return remoteRegionId
     */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterRegion that = (InterRegion) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.localRegionId, that.localRegionId)
            && Objects.equals(this.remoteRegionId, that.remoteRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, localRegionId, remoteRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterRegion {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
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
