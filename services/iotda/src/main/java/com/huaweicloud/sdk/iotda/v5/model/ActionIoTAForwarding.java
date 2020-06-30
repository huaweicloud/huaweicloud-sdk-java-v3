package com.huaweicloud.sdk.iotda.v5.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转发IoTA服务消息结构
 */
public class ActionIoTAForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_name")
    
    private String regionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;

    public ActionIoTAForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    


    /**
     * IoTA服务对应的region区域
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ActionIoTAForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * IoTA服务对应的projectId信息
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionIoTAForwarding actionIoTAForwarding = (ActionIoTAForwarding) o;
        return Objects.equals(this.regionName, actionIoTAForwarding.regionName) &&
            Objects.equals(this.projectId, actionIoTAForwarding.projectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionIoTAForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

