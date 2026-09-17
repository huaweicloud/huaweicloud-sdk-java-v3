package com.huaweicloud.sdk.codeartspipeline.v2.model;

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
public class ShowVariableGroupDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private List<QueryVariableGroupDetailRespVariables> variables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_pipelines")

    private List<QueryVariableGroupDetailRespRelatedPipelines> relatedPipelines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater_id")

    private String updaterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater_name")

    private String updaterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Integer updateTime;

    public ShowVariableGroupDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 参数组名称。 **取值范围**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowVariableGroupDetailResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目名称。 **取值范围**： 不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowVariableGroupDetailResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowVariableGroupDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 参数组名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowVariableGroupDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 参数组描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowVariableGroupDetailResponse withVariables(List<QueryVariableGroupDetailRespVariables> variables) {
        this.variables = variables;
        return this;
    }

    public ShowVariableGroupDetailResponse addVariablesItem(QueryVariableGroupDetailRespVariables variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public ShowVariableGroupDetailResponse withVariables(
        Consumer<List<QueryVariableGroupDetailRespVariables>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * **参数解释**： 参数列表。 **取值范围**： 不涉及。 
     * @return variables
     */
    public List<QueryVariableGroupDetailRespVariables> getVariables() {
        return variables;
    }

    public void setVariables(List<QueryVariableGroupDetailRespVariables> variables) {
        this.variables = variables;
    }

    public ShowVariableGroupDetailResponse withRelatedPipelines(
        List<QueryVariableGroupDetailRespRelatedPipelines> relatedPipelines) {
        this.relatedPipelines = relatedPipelines;
        return this;
    }

    public ShowVariableGroupDetailResponse addRelatedPipelinesItem(
        QueryVariableGroupDetailRespRelatedPipelines relatedPipelinesItem) {
        if (this.relatedPipelines == null) {
            this.relatedPipelines = new ArrayList<>();
        }
        this.relatedPipelines.add(relatedPipelinesItem);
        return this;
    }

    public ShowVariableGroupDetailResponse withRelatedPipelines(
        Consumer<List<QueryVariableGroupDetailRespRelatedPipelines>> relatedPipelinesSetter) {
        if (this.relatedPipelines == null) {
            this.relatedPipelines = new ArrayList<>();
        }
        relatedPipelinesSetter.accept(this.relatedPipelines);
        return this;
    }

    /**
     * **参数解释**： 关联的流水线。 **取值范围**： 不涉及。 
     * @return relatedPipelines
     */
    public List<QueryVariableGroupDetailRespRelatedPipelines> getRelatedPipelines() {
        return relatedPipelines;
    }

    public void setRelatedPipelines(List<QueryVariableGroupDetailRespRelatedPipelines> relatedPipelines) {
        this.relatedPipelines = relatedPipelines;
    }

    public ShowVariableGroupDetailResponse withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**： 创建人ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowVariableGroupDetailResponse withUpdaterId(String updaterId) {
        this.updaterId = updaterId;
        return this;
    }

    /**
     * **参数解释**： 编辑人ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return updaterId
     */
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public ShowVariableGroupDetailResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * **参数解释**： 创建人名称。 **取值范围**： 不涉及。 
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowVariableGroupDetailResponse withUpdaterName(String updaterName) {
        this.updaterName = updaterName;
        return this;
    }

    /**
     * **参数解释**： 编辑人名称。 **取值范围**： 不涉及。 
     * @return updaterName
     */
    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    public ShowVariableGroupDetailResponse withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。 
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public ShowVariableGroupDetailResponse withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 更新时间。 **取值范围**： 不涉及。 
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVariableGroupDetailResponse that = (ShowVariableGroupDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.variables, that.variables)
            && Objects.equals(this.relatedPipelines, that.relatedPipelines)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.updaterId, that.updaterId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updaterName, that.updaterName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            domainId,
            name,
            description,
            variables,
            relatedPipelines,
            creatorId,
            updaterId,
            creatorName,
            updaterName,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVariableGroupDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    relatedPipelines: ").append(toIndentedString(relatedPipelines)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updaterName: ").append(toIndentedString(updaterName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
