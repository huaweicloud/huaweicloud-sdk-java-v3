package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用详细信息
 */
public class ApplicationV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_creation_result")

    private List<PipelineCreationResult> pipelineCreationResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_creation_result")

    private RepositoryCreationResult repositoryCreationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_creation_result")

    private List<String> environmentCreationResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_types")

    private List<TemplateType> templateTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_deployment")

    private String templateDeployment;

    /**
     * 部署类型, function:函数部署,cci:cci容器部署,ServiceStage(Jar):ServiceStage jar包部署,ServiceStage(Docker):ServiceStage Docker容器部署
     */
    public static final class DeployTypeEnum {

        /**
         * Enum FUNCTION for value: "function"
         */
        public static final DeployTypeEnum FUNCTION = new DeployTypeEnum("function");

        /**
         * Enum CCI for value: "cci"
         */
        public static final DeployTypeEnum CCI = new DeployTypeEnum("cci");

        /**
         * Enum SERVICESTAGE_JAR_ for value: "ServiceStage(Jar)"
         */
        public static final DeployTypeEnum SERVICESTAGE_JAR_ = new DeployTypeEnum("ServiceStage(Jar)");

        /**
         * Enum SERVICESTAGE_DOCKER_ for value: "ServiceStage(Docker)"
         */
        public static final DeployTypeEnum SERVICESTAGE_DOCKER_ = new DeployTypeEnum("ServiceStage(Docker)");

        private static final Map<String, DeployTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployTypeEnum> createStaticFields() {
            Map<String, DeployTypeEnum> map = new HashMap<>();
            map.put("function", FUNCTION);
            map.put("cci", CCI);
            map.put("ServiceStage(Jar)", SERVICESTAGE_JAR_);
            map.put("ServiceStage(Docker)", SERVICESTAGE_DOCKER_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeployTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeployTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DeployTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeployTypeEnum(value);
            }
            return result;
        }

        public static DeployTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeployTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeployTypeEnum) {
                return this.value.equals(((DeployTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private DeployTypeEnum deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ApplicationV3 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplicationV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationV3 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApplicationV3 withRegionId(String regionId) {
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

    public ApplicationV3 withRegionName(String regionName) {
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

    public ApplicationV3 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 所属项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ApplicationV3 withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ApplicationV3 withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 应用图标
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ApplicationV3 withPipelineCreationResult(List<PipelineCreationResult> pipelineCreationResult) {
        this.pipelineCreationResult = pipelineCreationResult;
        return this;
    }

    public ApplicationV3 addPipelineCreationResultItem(PipelineCreationResult pipelineCreationResultItem) {
        if (this.pipelineCreationResult == null) {
            this.pipelineCreationResult = new ArrayList<>();
        }
        this.pipelineCreationResult.add(pipelineCreationResultItem);
        return this;
    }

    public ApplicationV3 withPipelineCreationResult(
        Consumer<List<PipelineCreationResult>> pipelineCreationResultSetter) {
        if (this.pipelineCreationResult == null) {
            this.pipelineCreationResult = new ArrayList<>();
        }
        pipelineCreationResultSetter.accept(this.pipelineCreationResult);
        return this;
    }

    /**
     * 流水线列表
     * @return pipelineCreationResult
     */
    public List<PipelineCreationResult> getPipelineCreationResult() {
        return pipelineCreationResult;
    }

    public void setPipelineCreationResult(List<PipelineCreationResult> pipelineCreationResult) {
        this.pipelineCreationResult = pipelineCreationResult;
    }

    public ApplicationV3 withRepositoryCreationResult(RepositoryCreationResult repositoryCreationResult) {
        this.repositoryCreationResult = repositoryCreationResult;
        return this;
    }

    public ApplicationV3 withRepositoryCreationResult(
        Consumer<RepositoryCreationResult> repositoryCreationResultSetter) {
        if (this.repositoryCreationResult == null) {
            this.repositoryCreationResult = new RepositoryCreationResult();
            repositoryCreationResultSetter.accept(this.repositoryCreationResult);
        }

        return this;
    }

    /**
     * Get repositoryCreationResult
     * @return repositoryCreationResult
     */
    public RepositoryCreationResult getRepositoryCreationResult() {
        return repositoryCreationResult;
    }

    public void setRepositoryCreationResult(RepositoryCreationResult repositoryCreationResult) {
        this.repositoryCreationResult = repositoryCreationResult;
    }

    public ApplicationV3 withEnvironmentCreationResult(List<String> environmentCreationResult) {
        this.environmentCreationResult = environmentCreationResult;
        return this;
    }

    public ApplicationV3 addEnvironmentCreationResultItem(String environmentCreationResultItem) {
        if (this.environmentCreationResult == null) {
            this.environmentCreationResult = new ArrayList<>();
        }
        this.environmentCreationResult.add(environmentCreationResultItem);
        return this;
    }

    public ApplicationV3 withEnvironmentCreationResult(Consumer<List<String>> environmentCreationResultSetter) {
        if (this.environmentCreationResult == null) {
            this.environmentCreationResult = new ArrayList<>();
        }
        environmentCreationResultSetter.accept(this.environmentCreationResult);
        return this;
    }

    /**
     * 环境信息
     * @return environmentCreationResult
     */
    public List<String> getEnvironmentCreationResult() {
        return environmentCreationResult;
    }

    public void setEnvironmentCreationResult(List<String> environmentCreationResult) {
        this.environmentCreationResult = environmentCreationResult;
    }

    public ApplicationV3 withTemplateTypes(List<TemplateType> templateTypes) {
        this.templateTypes = templateTypes;
        return this;
    }

    public ApplicationV3 addTemplateTypesItem(TemplateType templateTypesItem) {
        if (this.templateTypes == null) {
            this.templateTypes = new ArrayList<>();
        }
        this.templateTypes.add(templateTypesItem);
        return this;
    }

    public ApplicationV3 withTemplateTypes(Consumer<List<TemplateType>> templateTypesSetter) {
        if (this.templateTypes == null) {
            this.templateTypes = new ArrayList<>();
        }
        templateTypesSetter.accept(this.templateTypes);
        return this;
    }

    /**
     * 模板类型
     * @return templateTypes
     */
    public List<TemplateType> getTemplateTypes() {
        return templateTypes;
    }

    public void setTemplateTypes(List<TemplateType> templateTypes) {
        this.templateTypes = templateTypes;
    }

    public ApplicationV3 withTemplateDeployment(String templateDeployment) {
        this.templateDeployment = templateDeployment;
        return this;
    }

    /**
     * 模板部署信息
     * @return templateDeployment
     */
    public String getTemplateDeployment() {
        return templateDeployment;
    }

    public void setTemplateDeployment(String templateDeployment) {
        this.templateDeployment = templateDeployment;
    }

    public ApplicationV3 withDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * 部署类型, function:函数部署,cci:cci容器部署,ServiceStage(Jar):ServiceStage jar包部署,ServiceStage(Docker):ServiceStage Docker容器部署
     * @return deployType
     */
    public DeployTypeEnum getDeployType() {
        return deployType;
    }

    public void setDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
    }

    public ApplicationV3 withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ApplicationV3 withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ApplicationV3 withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ApplicationV3 withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationV3 applicationV3 = (ApplicationV3) o;
        return Objects.equals(this.id, applicationV3.id) && Objects.equals(this.name, applicationV3.name)
            && Objects.equals(this.description, applicationV3.description)
            && Objects.equals(this.regionId, applicationV3.regionId)
            && Objects.equals(this.regionName, applicationV3.regionName)
            && Objects.equals(this.projectId, applicationV3.projectId)
            && Objects.equals(this.projectName, applicationV3.projectName)
            && Objects.equals(this.icon, applicationV3.icon)
            && Objects.equals(this.pipelineCreationResult, applicationV3.pipelineCreationResult)
            && Objects.equals(this.repositoryCreationResult, applicationV3.repositoryCreationResult)
            && Objects.equals(this.environmentCreationResult, applicationV3.environmentCreationResult)
            && Objects.equals(this.templateTypes, applicationV3.templateTypes)
            && Objects.equals(this.templateDeployment, applicationV3.templateDeployment)
            && Objects.equals(this.deployType, applicationV3.deployType)
            && Objects.equals(this.creatorName, applicationV3.creatorName)
            && Objects.equals(this.createdAt, applicationV3.createdAt)
            && Objects.equals(this.updatedAt, applicationV3.updatedAt)
            && Objects.equals(this.version, applicationV3.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            regionId,
            regionName,
            projectId,
            projectName,
            icon,
            pipelineCreationResult,
            repositoryCreationResult,
            environmentCreationResult,
            templateTypes,
            templateDeployment,
            deployType,
            creatorName,
            createdAt,
            updatedAt,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationV3 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    pipelineCreationResult: ").append(toIndentedString(pipelineCreationResult)).append("\n");
        sb.append("    repositoryCreationResult: ").append(toIndentedString(repositoryCreationResult)).append("\n");
        sb.append("    environmentCreationResult: ").append(toIndentedString(environmentCreationResult)).append("\n");
        sb.append("    templateTypes: ").append(toIndentedString(templateTypes)).append("\n");
        sb.append("    templateDeployment: ").append(toIndentedString(templateDeployment)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
