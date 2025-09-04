package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainsStatuses请求体
 */
public class EndPointResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private EndPointResponseAuthorization authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

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
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private EndPointResponseCreatedBy createdBy;

    public EndPointResponse withAuthorization(EndPointResponseAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }

    public EndPointResponse withAuthorization(Consumer<EndPointResponseAuthorization> authorizationSetter) {
        if (this.authorization == null) {
            this.authorization = new EndPointResponseAuthorization();
            authorizationSetter.accept(this.authorization);
        }

        return this;
    }

    /**
     * Get authorization
     * @return authorization
     */
    public EndPointResponseAuthorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(EndPointResponseAuthorization authorization) {
        this.authorization = authorization;
    }

    public EndPointResponse withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public EndPointResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 访问地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EndPointResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EndPointResponse withProjectUuid(String projectUuid) {
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

    public EndPointResponse withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 区域名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public EndPointResponse withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 数据
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public EndPointResponse withModuleId(String moduleId) {
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

    public EndPointResponse withCreatedBy(EndPointResponseCreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public EndPointResponse withCreatedBy(Consumer<EndPointResponseCreatedBy> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new EndPointResponseCreatedBy();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public EndPointResponseCreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(EndPointResponseCreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndPointResponse that = (EndPointResponse) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.url, that.url) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.data, that.data) && Objects.equals(this.moduleId, that.moduleId)
            && Objects.equals(this.createdBy, that.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, uuid, url, name, projectUuid, regionName, data, moduleId, createdBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndPointResponse {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
