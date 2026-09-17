package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 项目详情对象
 */
public class ProjectInfoVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_type")

    private String projectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept_rr")

    private Integer acceptRr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by_name")

    private String createdByName;

    public ProjectInfoVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 项目ID。 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProjectInfoVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 项目名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectInfoVO withProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    /**
     * **参数解释**： 项目类型。 **取值范围**： - ipd：IPD项目 - scrum：scrum项目 - xboard：看板项目
     * @return projectType
     */
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public ProjectInfoVO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 项目空间ID。 **取值范围**： 不涉及
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ProjectInfoVO withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释**： IPD项目模型Id。 **取值范围**： 10001（系统设备类） 10002（独立软件类） 10003（云服务类型）
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ProjectInfoVO withAcceptRr(Integer acceptRr) {
        this.acceptRr = acceptRr;
        return this;
    }

    /**
     * **参数解释**： 该项目是否接受外部RR（原始需求）。 **取值范围**： - 0：不接受外部RR - 1：接受外部RR
     * @return acceptRr
     */
    public Integer getAcceptRr() {
        return acceptRr;
    }

    public void setAcceptRr(Integer acceptRr) {
        this.acceptRr = acceptRr;
    }

    public ProjectInfoVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 项目类型，用于区分项目和项目群。 **取值范围**： - Project：项目 - Group：项目群
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProjectInfoVO withCreatedByName(String createdByName) {
        this.createdByName = createdByName;
        return this;
    }

    /**
     * **参数解释**： 项目创建人名称。 **取值范围**： 不涉及。
     * @return createdByName
     */
    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectInfoVO that = (ProjectInfoVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectType, that.projectType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.modelId, that.modelId) && Objects.equals(this.acceptRr, that.acceptRr)
            && Objects.equals(this.category, that.category) && Objects.equals(this.createdByName, that.createdByName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, projectType, domainId, modelId, acceptRr, category, createdByName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectInfoVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    acceptRr: ").append(toIndentedString(acceptRr)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
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
