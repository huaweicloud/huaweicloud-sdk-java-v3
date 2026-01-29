package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件执行函数对象
 */
public class ComponentActionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private String actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_desc")

    private String actionDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_update")

    private Boolean canUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_version_id")

    private String actionVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_version_name")

    private String actionVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_version_number")

    private String actionVersionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_enable")

    private String actionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_input")

    private String actionInput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_output")

    private String actionOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_versions")

    private List<ComponentActionVersionInfo> actionVersions = null;

    public ComponentActionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 插件执行函数id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentActionInfo withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * 插件执行函数名称
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public ComponentActionInfo withActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
        return this;
    }

    /**
     * 插件执行函数描述
     * @return actionDesc
     */
    public String getActionDesc() {
        return actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }

    public ComponentActionInfo withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 执行函数类型，可选action/connector/manager
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public ComponentActionInfo withCreateTime(String createTime) {
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

    public ComponentActionInfo withCreatorName(String creatorName) {
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

    public ComponentActionInfo withCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
        return this;
    }

    /**
     * 是否可升级，true/false
     * @return canUpdate
     */
    public Boolean getCanUpdate() {
        return canUpdate;
    }

    public void setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    public ComponentActionInfo withActionVersionId(String actionVersionId) {
        this.actionVersionId = actionVersionId;
        return this;
    }

    /**
     * 当前启用的插件执行函数版本id
     * @return actionVersionId
     */
    public String getActionVersionId() {
        return actionVersionId;
    }

    public void setActionVersionId(String actionVersionId) {
        this.actionVersionId = actionVersionId;
    }

    public ComponentActionInfo withActionVersionName(String actionVersionName) {
        this.actionVersionName = actionVersionName;
        return this;
    }

    /**
     * 当前启用的用户自定义执行函数版本别名
     * @return actionVersionName
     */
    public String getActionVersionName() {
        return actionVersionName;
    }

    public void setActionVersionName(String actionVersionName) {
        this.actionVersionName = actionVersionName;
    }

    public ComponentActionInfo withActionVersionNumber(String actionVersionNumber) {
        this.actionVersionNumber = actionVersionNumber;
        return this;
    }

    /**
     * 当前启用的执行函数版本号
     * @return actionVersionNumber
     */
    public String getActionVersionNumber() {
        return actionVersionNumber;
    }

    public void setActionVersionNumber(String actionVersionNumber) {
        this.actionVersionNumber = actionVersionNumber;
    }

    public ComponentActionInfo withActionEnable(String actionEnable) {
        this.actionEnable = actionEnable;
        return this;
    }

    /**
     * 启用/禁用状态
     * @return actionEnable
     */
    public String getActionEnable() {
        return actionEnable;
    }

    public void setActionEnable(String actionEnable) {
        this.actionEnable = actionEnable;
    }

    public ComponentActionInfo withActionInput(String actionInput) {
        this.actionInput = actionInput;
        return this;
    }

    /**
     * 当前启用的执行函数版本输入参数列表
     * @return actionInput
     */
    public String getActionInput() {
        return actionInput;
    }

    public void setActionInput(String actionInput) {
        this.actionInput = actionInput;
    }

    public ComponentActionInfo withActionOutput(String actionOutput) {
        this.actionOutput = actionOutput;
        return this;
    }

    /**
     * 当前启用的执行函数版本输出参数列表
     * @return actionOutput
     */
    public String getActionOutput() {
        return actionOutput;
    }

    public void setActionOutput(String actionOutput) {
        this.actionOutput = actionOutput;
    }

    public ComponentActionInfo withActionVersions(List<ComponentActionVersionInfo> actionVersions) {
        this.actionVersions = actionVersions;
        return this;
    }

    public ComponentActionInfo addActionVersionsItem(ComponentActionVersionInfo actionVersionsItem) {
        if (this.actionVersions == null) {
            this.actionVersions = new ArrayList<>();
        }
        this.actionVersions.add(actionVersionsItem);
        return this;
    }

    public ComponentActionInfo withActionVersions(Consumer<List<ComponentActionVersionInfo>> actionVersionsSetter) {
        if (this.actionVersions == null) {
            this.actionVersions = new ArrayList<>();
        }
        actionVersionsSetter.accept(this.actionVersions);
        return this;
    }

    /**
     * 全量插件执行函数版本列表
     * @return actionVersions
     */
    public List<ComponentActionVersionInfo> getActionVersions() {
        return actionVersions;
    }

    public void setActionVersions(List<ComponentActionVersionInfo> actionVersions) {
        this.actionVersions = actionVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentActionInfo that = (ComponentActionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.actionName, that.actionName)
            && Objects.equals(this.actionDesc, that.actionDesc) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.canUpdate, that.canUpdate)
            && Objects.equals(this.actionVersionId, that.actionVersionId)
            && Objects.equals(this.actionVersionName, that.actionVersionName)
            && Objects.equals(this.actionVersionNumber, that.actionVersionNumber)
            && Objects.equals(this.actionEnable, that.actionEnable)
            && Objects.equals(this.actionInput, that.actionInput)
            && Objects.equals(this.actionOutput, that.actionOutput)
            && Objects.equals(this.actionVersions, that.actionVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            actionName,
            actionDesc,
            actionType,
            createTime,
            creatorName,
            canUpdate,
            actionVersionId,
            actionVersionName,
            actionVersionNumber,
            actionEnable,
            actionInput,
            actionOutput,
            actionVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentActionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    actionDesc: ").append(toIndentedString(actionDesc)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    canUpdate: ").append(toIndentedString(canUpdate)).append("\n");
        sb.append("    actionVersionId: ").append(toIndentedString(actionVersionId)).append("\n");
        sb.append("    actionVersionName: ").append(toIndentedString(actionVersionName)).append("\n");
        sb.append("    actionVersionNumber: ").append(toIndentedString(actionVersionNumber)).append("\n");
        sb.append("    actionEnable: ").append(toIndentedString(actionEnable)).append("\n");
        sb.append("    actionInput: ").append(toIndentedString(actionInput)).append("\n");
        sb.append("    actionOutput: ").append(toIndentedString(actionOutput)).append("\n");
        sb.append("    actionVersions: ").append(toIndentedString(actionVersions)).append("\n");
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
