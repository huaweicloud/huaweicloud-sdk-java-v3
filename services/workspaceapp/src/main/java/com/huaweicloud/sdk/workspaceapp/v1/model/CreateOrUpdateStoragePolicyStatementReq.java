package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)
 */
public class CreateOrUpdateStoragePolicyStatementReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roam_actions")

    private List<String> roamActions = null;

    public CreateOrUpdateStoragePolicyStatementReq withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public CreateOrUpdateStoragePolicyStatementReq addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public CreateOrUpdateStoragePolicyStatementReq withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 客户端访问存储可操作的权限合集 允许为空,为空时配置了该策略的用户,通过云办公客户端接入后仅可查看文件列表,不可上传下载 * `PutObject` -  上传、修改、重命名、移动 * `DeleteObject` - 删除 * `GetObject` - 下载 注：PutObject和DeleteObject必须同时设置,不支持仅设置其中一个
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public CreateOrUpdateStoragePolicyStatementReq withRoamActions(List<String> roamActions) {
        this.roamActions = roamActions;
        return this;
    }

    public CreateOrUpdateStoragePolicyStatementReq addRoamActionsItem(String roamActionsItem) {
        if (this.roamActions == null) {
            this.roamActions = new ArrayList<>();
        }
        this.roamActions.add(roamActionsItem);
        return this;
    }

    public CreateOrUpdateStoragePolicyStatementReq withRoamActions(Consumer<List<String>> roamActionsSetter) {
        if (this.roamActions == null) {
            this.roamActions = new ArrayList<>();
        }
        roamActionsSetter.accept(this.roamActions);
        return this;
    }

    /**
     * 云端访问存储可操作的权限合集,不允许为空 * `PutObject` -  上传、修改、重命名、移动 * `DeleteObject` - 删除 * `GetObject` - 下载           注：PutObject和DeleteObject必须同时设置,不支持仅设置其中一个
     * @return roamActions
     */
    public List<String> getRoamActions() {
        return roamActions;
    }

    public void setRoamActions(List<String> roamActions) {
        this.roamActions = roamActions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOrUpdateStoragePolicyStatementReq that = (CreateOrUpdateStoragePolicyStatementReq) obj;
        return Objects.equals(this.actions, that.actions) && Objects.equals(this.roamActions, that.roamActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, roamActions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrUpdateStoragePolicyStatementReq {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    roamActions: ").append(toIndentedString(roamActions)).append("\n");
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
