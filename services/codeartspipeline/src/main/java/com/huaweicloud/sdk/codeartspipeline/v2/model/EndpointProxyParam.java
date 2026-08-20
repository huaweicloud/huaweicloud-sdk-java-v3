package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 代理调用外部服务接口参数
 */
public class EndpointProxyParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private EndpointAuthorizationBody authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_name")

    private String datasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_uuid")

    private String endpointUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_inner")

    private Boolean isInner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    public EndpointProxyParam withAuthorization(EndpointAuthorizationBody authorization) {
        this.authorization = authorization;
        return this;
    }

    public EndpointProxyParam withAuthorization(Consumer<EndpointAuthorizationBody> authorizationSetter) {
        if (this.authorization == null) {
            this.authorization = new EndpointAuthorizationBody();
            authorizationSetter.accept(this.authorization);
        }

        return this;
    }

    /**
     * Get authorization
     * @return authorization
     */
    public EndpointAuthorizationBody getAuthorization() {
        return authorization;
    }

    public void setAuthorization(EndpointAuthorizationBody authorization) {
        this.authorization = authorization;
    }

    public EndpointProxyParam withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public EndpointProxyParam withDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }

    /**
     * 数据源名称
     * @return datasourceName
     */
    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public EndpointProxyParam withEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
        return this;
    }

    /**
     * 接入点uuid
     * @return endpointUuid
     */
    public String getEndpointUuid() {
        return endpointUuid;
    }

    public void setEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
    }

    public EndpointProxyParam withModuleId(String moduleId) {
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

    public EndpointProxyParam withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EndpointProxyParam withIsInner(Boolean isInner) {
        this.isInner = isInner;
        return this;
    }

    /**
     * 
     * @return isInner
     */
    public Boolean getIsInner() {
        return isInner;
    }

    public void setIsInner(Boolean isInner) {
        this.isInner = isInner;
    }

    public EndpointProxyParam withProjectUuid(String projectUuid) {
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

    public EndpointProxyParam withRegionName(String regionName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointProxyParam that = (EndpointProxyParam) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.data, that.data)
            && Objects.equals(this.datasourceName, that.datasourceName)
            && Objects.equals(this.endpointUuid, that.endpointUuid) && Objects.equals(this.moduleId, that.moduleId)
            && Objects.equals(this.url, that.url) && Objects.equals(this.isInner, that.isInner)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.regionName, that.regionName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(authorization, data, datasourceName, endpointUuid, moduleId, url, isInner, projectUuid, regionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointProxyParam {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
        sb.append("    endpointUuid: ").append(toIndentedString(endpointUuid)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    isInner: ").append(toIndentedString(isInner)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
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
