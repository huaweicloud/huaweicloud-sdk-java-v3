package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 服务配置信息 */
public class ObsForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    public ObsForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /** **参数说明**：OBS服务对应的region区域
     * 
     * @return regionName */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ObsForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** **参数说明**：OBS服务对应的projectId信息
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ObsForwarding withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /** **参数说明**：OBS服务对应的桶名称
     * 
     * @return bucketName */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsForwarding withLocation(String location) {
        this.location = location;
        return this;
    }

    /** **参数说明**：OBS服务对应桶的区域
     * 
     * @return location */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsForwarding obsForwarding = (ObsForwarding) o;
        return Objects.equals(this.regionName, obsForwarding.regionName)
            && Objects.equals(this.projectId, obsForwarding.projectId)
            && Objects.equals(this.bucketName, obsForwarding.bucketName)
            && Objects.equals(this.location, obsForwarding.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, bucketName, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
