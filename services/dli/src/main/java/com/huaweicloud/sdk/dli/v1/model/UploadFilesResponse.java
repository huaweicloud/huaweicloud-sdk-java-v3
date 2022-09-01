package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UploadFilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    @JacksonXmlProperty(localName = "resources")

    private List<String> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    @JacksonXmlProperty(localName = "is_async")

    private Boolean isAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    @JacksonXmlProperty(localName = "details")

    private List<UploadPackageGroupDetailsResp> details = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    @JacksonXmlProperty(localName = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_type")

    @JacksonXmlProperty(localName = "module_type")

    private String moduleType;

    public UploadFilesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * \"UPLOADING\"表示正在上传。 \"READY\"表示模块包已上传。 \"FAILED\"表示模块包上传失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UploadFilesResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 资源模块描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UploadFilesResponse withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public UploadFilesResponse addResourcesItem(String resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public UploadFilesResponse withResources(Consumer<List<String>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 该资源模块包含的资源包名列表。
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public UploadFilesResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源模块上传的unix时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UploadFilesResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 资源模块更新的unix时间戳。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UploadFilesResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 模块名。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public UploadFilesResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 资源包拥有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public UploadFilesResponse withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * 是否使用异步方式上传资源包。默认值为“false”，表示不使用异步方式。推荐使用异步方式上传资源包。
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public UploadFilesResponse withDetails(List<UploadPackageGroupDetailsResp> details) {
        this.details = details;
        return this;
    }

    public UploadFilesResponse addDetailsItem(UploadPackageGroupDetailsResp detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public UploadFilesResponse withDetails(Consumer<List<UploadPackageGroupDetailsResp>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 分组资源包的详细信息
     * @return details
     */
    public List<UploadPackageGroupDetailsResp> getDetails() {
        return details;
    }

    public void setDetails(List<UploadPackageGroupDetailsResp> details) {
        this.details = details;
    }

    public UploadFilesResponse withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 资源模块名
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public UploadFilesResponse withModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    /**
     * 资源模块类型。jar:用户jar文件;pyFile:用户python文件;file:用户文件
     * @return moduleType
     */
    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadFilesResponse uploadFilesResponse = (UploadFilesResponse) o;
        return Objects.equals(this.status, uploadFilesResponse.status)
            && Objects.equals(this.description, uploadFilesResponse.description)
            && Objects.equals(this.resources, uploadFilesResponse.resources)
            && Objects.equals(this.createTime, uploadFilesResponse.createTime)
            && Objects.equals(this.updateTime, uploadFilesResponse.updateTime)
            && Objects.equals(this.groupName, uploadFilesResponse.groupName)
            && Objects.equals(this.owner, uploadFilesResponse.owner)
            && Objects.equals(this.isAsync, uploadFilesResponse.isAsync)
            && Objects.equals(this.details, uploadFilesResponse.details)
            && Objects.equals(this.moduleName, uploadFilesResponse.moduleName)
            && Objects.equals(this.moduleType, uploadFilesResponse.moduleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            description,
            resources,
            createTime,
            updateTime,
            groupName,
            owner,
            isAsync,
            details,
            moduleName,
            moduleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFilesResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
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
