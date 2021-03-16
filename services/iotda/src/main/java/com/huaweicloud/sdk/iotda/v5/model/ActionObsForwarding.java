package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转发OBS服务消息结构
 */
public class ActionObsForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_name")
    
    private String regionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_name")
    
    private String bucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private String location;

    public ActionObsForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    


    /**
     * OBS服务对应的region区域
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    

    public ActionObsForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * OBS服务对应的projectId信息
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ActionObsForwarding withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    


    /**
     * OBS服务对应的桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    

    public ActionObsForwarding withLocation(String location) {
        this.location = location;
        return this;
    }

    


    /**
     * OBS服务对应桶的区域
     * @return location
     */
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
        ActionObsForwarding actionObsForwarding = (ActionObsForwarding) o;
        return Objects.equals(this.regionName, actionObsForwarding.regionName) &&
            Objects.equals(this.projectId, actionObsForwarding.projectId) &&
            Objects.equals(this.bucketName, actionObsForwarding.bucketName) &&
            Objects.equals(this.location, actionObsForwarding.location);
    }
    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, bucketName, location);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionObsForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

