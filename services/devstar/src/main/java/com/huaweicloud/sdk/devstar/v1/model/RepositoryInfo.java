package com.huaweicloud.sdk.devstar.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * RepositoryInfo
 */
public class RepositoryInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;

    public RepositoryInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 代码仓的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepositoryInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryInfo repositoryInfo = (RepositoryInfo) o;
        return Objects.equals(this.name, repositoryInfo.name) &&
            Objects.equals(this.projectId, repositoryInfo.projectId) &&
            Objects.equals(this.regionId, repositoryInfo.regionId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, projectId, regionId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryInfo {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
            sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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

