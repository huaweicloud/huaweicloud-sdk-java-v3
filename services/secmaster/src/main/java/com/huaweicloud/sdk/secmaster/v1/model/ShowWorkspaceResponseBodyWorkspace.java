package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 空间详情
 */
public class ShowWorkspaceResponseBodyWorkspace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_id")

    private String modifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_name")

    private String modifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_view")

    private Boolean isView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_bind_id")

    private String viewBindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_bind_name")

    private String viewBindName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_agency_list")

    private List<CreateWorkspaceResponseBodyWorkspaceAgencyList> workspaceAgencyList = null;

    public ShowWorkspaceResponseBodyWorkspace withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工作空间id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowWorkspaceResponseBodyWorkspace withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowWorkspaceResponseBodyWorkspace withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowWorkspaceResponseBodyWorkspace withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作空间名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowWorkspaceResponseBodyWorkspace withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作空间描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowWorkspaceResponseBodyWorkspace withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建人id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowWorkspaceResponseBodyWorkspace withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowWorkspaceResponseBodyWorkspace withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * 修改人id
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public ShowWorkspaceResponseBodyWorkspace withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * 修改人名称
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public ShowWorkspaceResponseBodyWorkspace withProjectId(String projectId) {
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

    public ShowWorkspaceResponseBodyWorkspace withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 所属项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowWorkspaceResponseBodyWorkspace withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 所属租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowWorkspaceResponseBodyWorkspace withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 所属租户名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowWorkspaceResponseBodyWorkspace withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowWorkspaceResponseBodyWorkspace withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public ShowWorkspaceResponseBodyWorkspace withIsView(Boolean isView) {
        this.isView = isView;
        return this;
    }

    /**
     * 是否是视图
     * @return isView
     */
    public Boolean getIsView() {
        return isView;
    }

    public void setIsView(Boolean isView) {
        this.isView = isView;
    }

    public ShowWorkspaceResponseBodyWorkspace withRegionId(String regionId) {
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

    public ShowWorkspaceResponseBodyWorkspace withViewBindId(String viewBindId) {
        this.viewBindId = viewBindId;
        return this;
    }

    /**
     * 视图绑定的空间id
     * @return viewBindId
     */
    public String getViewBindId() {
        return viewBindId;
    }

    public void setViewBindId(String viewBindId) {
        this.viewBindId = viewBindId;
    }

    public ShowWorkspaceResponseBodyWorkspace withViewBindName(String viewBindName) {
        this.viewBindName = viewBindName;
        return this;
    }

    /**
     * 视图绑定的空间名称
     * @return viewBindName
     */
    public String getViewBindName() {
        return viewBindName;
    }

    public void setViewBindName(String viewBindName) {
        this.viewBindName = viewBindName;
    }

    public ShowWorkspaceResponseBodyWorkspace withWorkspaceAgencyList(
        List<CreateWorkspaceResponseBodyWorkspaceAgencyList> workspaceAgencyList) {
        this.workspaceAgencyList = workspaceAgencyList;
        return this;
    }

    public ShowWorkspaceResponseBodyWorkspace addWorkspaceAgencyListItem(
        CreateWorkspaceResponseBodyWorkspaceAgencyList workspaceAgencyListItem) {
        if (this.workspaceAgencyList == null) {
            this.workspaceAgencyList = new ArrayList<>();
        }
        this.workspaceAgencyList.add(workspaceAgencyListItem);
        return this;
    }

    public ShowWorkspaceResponseBodyWorkspace withWorkspaceAgencyList(
        Consumer<List<CreateWorkspaceResponseBodyWorkspaceAgencyList>> workspaceAgencyListSetter) {
        if (this.workspaceAgencyList == null) {
            this.workspaceAgencyList = new ArrayList<>();
        }
        workspaceAgencyListSetter.accept(this.workspaceAgencyList);
        return this;
    }

    /**
     * 纳管空间列表
     * @return workspaceAgencyList
     */
    public List<CreateWorkspaceResponseBodyWorkspaceAgencyList> getWorkspaceAgencyList() {
        return workspaceAgencyList;
    }

    public void setWorkspaceAgencyList(List<CreateWorkspaceResponseBodyWorkspaceAgencyList> workspaceAgencyList) {
        this.workspaceAgencyList = workspaceAgencyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkspaceResponseBodyWorkspace that = (ShowWorkspaceResponseBodyWorkspace) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.modifierId, that.modifierId)
            && Objects.equals(this.modifierName, that.modifierName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.isView, that.isView) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.viewBindId, that.viewBindId) && Objects.equals(this.viewBindName, that.viewBindName)
            && Objects.equals(this.workspaceAgencyList, that.workspaceAgencyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createTime,
            updateTime,
            name,
            description,
            creatorId,
            creatorName,
            modifierId,
            modifierName,
            projectId,
            projectName,
            domainId,
            domainName,
            enterpriseProjectId,
            enterpriseProjectName,
            isView,
            regionId,
            viewBindId,
            viewBindName,
            workspaceAgencyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkspaceResponseBodyWorkspace {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    isView: ").append(toIndentedString(isView)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    viewBindId: ").append(toIndentedString(viewBindId)).append("\n");
        sb.append("    viewBindName: ").append(toIndentedString(viewBindName)).append("\n");
        sb.append("    workspaceAgencyList: ").append(toIndentedString(workspaceAgencyList)).append("\n");
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
