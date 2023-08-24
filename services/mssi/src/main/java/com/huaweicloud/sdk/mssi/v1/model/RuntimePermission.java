package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuntimePermission
 */
public class RuntimePermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_list")

    private List<String> actionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_name")

    private String permissionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_type")

    private String permissionType;

    public RuntimePermission withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 动作列表
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RuntimePermission withActionList(List<String> actionList) {
        this.actionList = actionList;
        return this;
    }

    public RuntimePermission addActionListItem(String actionListItem) {
        if (this.actionList == null) {
            this.actionList = new ArrayList<>();
        }
        this.actionList.add(actionListItem);
        return this;
    }

    public RuntimePermission withActionList(Consumer<List<String>> actionListSetter) {
        if (this.actionList == null) {
            this.actionList = new ArrayList<>();
        }
        actionListSetter.accept(this.actionList);
        return this;
    }

    /**
     * 动作列表
     * @return actionList
     */
    public List<String> getActionList() {
        return actionList;
    }

    public void setActionList(List<String> actionList) {
        this.actionList = actionList;
    }

    public RuntimePermission withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 权限名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuntimePermission withPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }

    /**
     * 权限名称
     * @return permissionName
     */
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public RuntimePermission withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 权限类型
     * @return permissionType
     */
    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimePermission that = (RuntimePermission) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.actionList, that.actionList)
            && Objects.equals(this.name, that.name) && Objects.equals(this.permissionName, that.permissionName)
            && Objects.equals(this.permissionType, that.permissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, actionList, name, permissionName, permissionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimePermission {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
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
