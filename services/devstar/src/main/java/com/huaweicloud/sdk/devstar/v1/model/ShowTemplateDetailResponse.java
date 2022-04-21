package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTemplateDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repostory_id")

    private String repostoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_url")

    private String codeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_url")

    private String sshUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<Object> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<Object> dependencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_type")

    private String dependencyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment")

    private Object deployment;

    public ShowTemplateDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowTemplateDetailResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 模板的名称。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowTemplateDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowTemplateDetailResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 模板关联的region host id。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowTemplateDetailResponse withRepostoryId(String repostoryId) {
        this.repostoryId = repostoryId;
        return this;
    }

    /**
     * 模板关联的repo id。
     * @return repostoryId
     */
    public String getRepostoryId() {
        return repostoryId;
    }

    public void setRepostoryId(String repostoryId) {
        this.repostoryId = repostoryId;
    }

    public ShowTemplateDetailResponse withCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }

    /**
     * 模板https下载路径。
     * @return codeUrl
     */
    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public ShowTemplateDetailResponse withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    /**
     * 模板ssh下载路径。
     * @return sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public ShowTemplateDetailResponse withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id。
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public ShowTemplateDetailResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 模板状态。
     * minimum: 1
     * maximum: 5
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowTemplateDetailResponse withProperties(List<Object> properties) {
        this.properties = properties;
        return this;
    }

    public ShowTemplateDetailResponse addPropertiesItem(Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public ShowTemplateDetailResponse withProperties(Consumer<List<Object>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 源数据信息： - key：元数据标识 - defaultValue：用户输入值的默认值 - isShow：前台界面组件是否展示该元数据 - isProjectName：是否使用作为项目名称 - label：前台界面组件展示名称 - type：前台界面组件类型 - helpText：前台界面组件帮助文本 - readOnly：前台界面组件是否可修改 - required：前台界面组件是否展示必填 - regType：该元数据进行正则校验类型；简化模板编码使用 - regPattern：该元数据对应js语法正则表达式 - regTip：该元数据正则校验提示信息 - visibleRule：该元数据可见规则 - isRequired：是否必填 - isReadOnly：是否只读 - options：option对象集合   - displayName：前台界面展示字符串   - value：该选项值 - eventOnchange：联动属性集合   - associatedProperty：被关联Property的key值   - associatedValue：被关联的value - fold：是否折叠 - show：是否展示该Property 
     * @return properties
     */
    public List<Object> getProperties() {
        return properties;
    }

    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

    public ShowTemplateDetailResponse withDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public ShowTemplateDetailResponse addDependenciesItem(Object dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public ShowTemplateDetailResponse withDependencies(Consumer<List<Object>> dependenciesSetter) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        dependenciesSetter.accept(this.dependencies);
        return this;
    }

    /**
     * dependency信息： - id：依赖全局唯一标识 - name：依赖展示名称 - description：依赖展示描述 - recommended：是否推荐使用该依赖 - versionProperty：该依赖版本被关联Property的key值 - versionRange：该依赖版本适用范围 - groupName：分组名称 - items：分组列表 
     * @return dependencies
     */
    public List<Object> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
    }

    public ShowTemplateDetailResponse withDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    /**
     * dependency类型： - 0：分组 - 1：不分组 - null：无分组信息 
     * @return dependencyType
     */
    public String getDependencyType() {
        return dependencyType;
    }

    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }

    public ShowTemplateDetailResponse withDeployment(Object deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * 部署信息： - param：参数对象   - build：构建类型   - runtime：函数运行时   - handler：函数执行入口   - outputFile：构建产物文件路径 - target：部署环境 
     * @return deployment
     */
    public Object getDeployment() {
        return deployment;
    }

    public void setDeployment(Object deployment) {
        this.deployment = deployment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTemplateDetailResponse showTemplateDetailResponse = (ShowTemplateDetailResponse) o;
        return Objects.equals(this.id, showTemplateDetailResponse.id)
            && Objects.equals(this.title, showTemplateDetailResponse.title)
            && Objects.equals(this.description, showTemplateDetailResponse.description)
            && Objects.equals(this.regionId, showTemplateDetailResponse.regionId)
            && Objects.equals(this.repostoryId, showTemplateDetailResponse.repostoryId)
            && Objects.equals(this.codeUrl, showTemplateDetailResponse.codeUrl)
            && Objects.equals(this.sshUrl, showTemplateDetailResponse.sshUrl)
            && Objects.equals(this.projectUuid, showTemplateDetailResponse.projectUuid)
            && Objects.equals(this.status, showTemplateDetailResponse.status)
            && Objects.equals(this.properties, showTemplateDetailResponse.properties)
            && Objects.equals(this.dependencies, showTemplateDetailResponse.dependencies)
            && Objects.equals(this.dependencyType, showTemplateDetailResponse.dependencyType)
            && Objects.equals(this.deployment, showTemplateDetailResponse.deployment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            description,
            regionId,
            repostoryId,
            codeUrl,
            sshUrl,
            projectUuid,
            status,
            properties,
            dependencies,
            dependencyType,
            deployment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplateDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    repostoryId: ").append(toIndentedString(repostoryId)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    dependencyType: ").append(toIndentedString(dependencyType)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
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
