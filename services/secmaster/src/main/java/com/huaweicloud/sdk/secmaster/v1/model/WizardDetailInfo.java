package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 页面详情
 */
public class WizardDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_description")

    private String enDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wizard_json")

    private String wizardJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_binding")

    private Boolean isBinding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_button")

    private List<WizardDetailInfoBindingButton> bindingButton = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boa_version")

    private String boaVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public WizardDetailInfo withCreateTime(String createTime) {
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

    public WizardDetailInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public WizardDetailInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WizardDetailInfo withEnDescription(String enDescription) {
        this.enDescription = enDescription;
        return this;
    }

    /**
     * 英文描述
     * @return enDescription
     */
    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription;
    }

    public WizardDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 页面ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WizardDetailInfo withWizardJson(String wizardJson) {
        this.wizardJson = wizardJson;
        return this;
    }

    /**
     * 布局页面相关信息
     * @return wizardJson
     */
    public String getWizardJson() {
        return wizardJson;
    }

    public void setWizardJson(String wizardJson) {
        this.wizardJson = wizardJson;
    }

    public WizardDetailInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 页面名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WizardDetailInfo withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 英文名称
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public WizardDetailInfo withUpdateTime(String updateTime) {
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

    public WizardDetailInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public WizardDetailInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public WizardDetailInfo withIsBinding(Boolean isBinding) {
        this.isBinding = isBinding;
        return this;
    }

    /**
     * 是否已绑定按钮
     * @return isBinding
     */
    public Boolean getIsBinding() {
        return isBinding;
    }

    public void setIsBinding(Boolean isBinding) {
        this.isBinding = isBinding;
    }

    public WizardDetailInfo withBindingButton(List<WizardDetailInfoBindingButton> bindingButton) {
        this.bindingButton = bindingButton;
        return this;
    }

    public WizardDetailInfo addBindingButtonItem(WizardDetailInfoBindingButton bindingButtonItem) {
        if (this.bindingButton == null) {
            this.bindingButton = new ArrayList<>();
        }
        this.bindingButton.add(bindingButtonItem);
        return this;
    }

    public WizardDetailInfo withBindingButton(Consumer<List<WizardDetailInfoBindingButton>> bindingButtonSetter) {
        if (this.bindingButton == null) {
            this.bindingButton = new ArrayList<>();
        }
        bindingButtonSetter.accept(this.bindingButton);
        return this;
    }

    /**
     * 绑定按钮
     * @return bindingButton
     */
    public List<WizardDetailInfoBindingButton> getBindingButton() {
        return bindingButton;
    }

    public void setBindingButton(List<WizardDetailInfoBindingButton> bindingButton) {
        this.bindingButton = bindingButton;
    }

    public WizardDetailInfo withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否为系统页面
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public WizardDetailInfo withBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
        return this;
    }

    /**
     * BOA底座版本
     * @return boaVersion
     */
    public String getBoaVersion() {
        return boaVersion;
    }

    public void setBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
    }

    public WizardDetailInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 安全云脑版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WizardDetailInfo that = (WizardDetailInfo) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enDescription, that.enDescription) && Objects.equals(this.id, that.id)
            && Objects.equals(this.wizardJson, that.wizardJson) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enName, that.enName) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.isBinding, that.isBinding) && Objects.equals(this.bindingButton, that.bindingButton)
            && Objects.equals(this.isBuiltIn, that.isBuiltIn) && Objects.equals(this.boaVersion, that.boaVersion)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            creatorId,
            description,
            enDescription,
            id,
            wizardJson,
            name,
            enName,
            updateTime,
            projectId,
            workspaceId,
            isBinding,
            bindingButton,
            isBuiltIn,
            boaVersion,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WizardDetailInfo {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enDescription: ").append(toIndentedString(enDescription)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    wizardJson: ").append(toIndentedString(wizardJson)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    isBinding: ").append(toIndentedString(isBinding)).append("\n");
        sb.append("    bindingButton: ").append(toIndentedString(bindingButton)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    boaVersion: ").append(toIndentedString(boaVersion)).append("\n");
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
