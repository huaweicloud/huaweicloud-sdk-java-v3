package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * endpoint具体信息
 */
public class Endpoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private EndpointCreatorInfo createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    public Endpoint withCreatedBy(EndpointCreatorInfo createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Endpoint withCreatedBy(Consumer<EndpointCreatorInfo> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new EndpointCreatorInfo();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public EndpointCreatorInfo getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(EndpointCreatorInfo createdBy) {
        this.createdBy = createdBy;
    }

    public Endpoint withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 扩展点数据
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Endpoint withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public Endpoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模块名称（用于搜索）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Endpoint withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目uuid
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public Endpoint withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 区域名
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Endpoint withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 链接地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Endpoint withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 扩展点id
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Endpoint that = (Endpoint) obj;
        return Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.data, that.data)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.url, that.url) && Objects.equals(this.uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdBy, data, moduleId, name, projectUuid, regionName, url, uuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
