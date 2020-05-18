package com.huaweicloud.sdk.ims.v2.model;

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
 * CopyImageCrossRegionRequestBody
 */
public class CopyImageCrossRegionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_name")
    
    private String agencyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;

    public CopyImageCrossRegionRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    


    /**
     * IMS服务委托名称。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CopyImageCrossRegionRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 镜像描述信息。支持字母、数字、中文等，不支持回车、<、 >，长度不能超过1024个字符。默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CopyImageCrossRegionRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CopyImageCrossRegionRequestBody withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    


    /**
     * 目的区域的项目名称。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public CopyImageCrossRegionRequestBody withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 目的区域的Region ID。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopyImageCrossRegionRequestBody copyImageCrossRegionRequestBody = (CopyImageCrossRegionRequestBody) o;
        return Objects.equals(this.agencyName, copyImageCrossRegionRequestBody.agencyName) &&
            Objects.equals(this.description, copyImageCrossRegionRequestBody.description) &&
            Objects.equals(this.name, copyImageCrossRegionRequestBody.name) &&
            Objects.equals(this.projectName, copyImageCrossRegionRequestBody.projectName) &&
            Objects.equals(this.region, copyImageCrossRegionRequestBody.region);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agencyName, description, name, projectName, region);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyImageCrossRegionRequestBody {\n");
            sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

