package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 支持的访问策略
 */
public class PolicyStatement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement_id")

    private String policyStatementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roam_actions")

    private List<String> roamActions = null;

    public PolicyStatement withPolicyStatementId(String policyStatementId) {
        this.policyStatementId = policyStatementId;
        return this;
    }

    /**
     * 支持的访问策略，内置如下四种策略: * `DEFAULT_1`：`客户端访问存储` - 上传、下载; `云端访问存储` - 读写   - action: PutObject、DeleteObject、GetObject   - roam_action: PutObject、DeleteObject、GetObject * `DEFAULT_2`：`客户端访问存储` - 下载; `云端访问存储` - 读写   - action: GetObject   - roam_action: PutObject、DeleteObject、GetObject * `DEFAULT_3`：`客户端访问存储` - 上传; `云端访问存储` - 读写   - action: PutObject、DeleteObject   - roam_action: PutObject、DeleteObject、GetObject * `DEFAULT_4`：`客户端访问存储` - 仅可查看列表,不允许上传下载; `云端访问存储` - 只读   - action:    - roam_action: GetObject
     * @return policyStatementId
     */
    public String getPolicyStatementId() {
        return policyStatementId;
    }

    public void setPolicyStatementId(String policyStatementId) {
        this.policyStatementId = policyStatementId;
    }

    public PolicyStatement withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public PolicyStatement addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public PolicyStatement withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 客户端访问存储可操作的权限合集 * `PutObject` -  上传、修改、重命名、移动 * `GetObject` - 下载 * `DeleteObject` - 删除
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public PolicyStatement withRoamActions(List<String> roamActions) {
        this.roamActions = roamActions;
        return this;
    }

    public PolicyStatement addRoamActionsItem(String roamActionsItem) {
        if (this.roamActions == null) {
            this.roamActions = new ArrayList<>();
        }
        this.roamActions.add(roamActionsItem);
        return this;
    }

    public PolicyStatement withRoamActions(Consumer<List<String>> roamActionsSetter) {
        if (this.roamActions == null) {
            this.roamActions = new ArrayList<>();
        }
        roamActionsSetter.accept(this.roamActions);
        return this;
    }

    /**
     * 云端访问存储可操作的权限合集 * `PutObject` -  上传、修改、重命名、移动 * `GetObject` - 下载 * `DeleteObject` - 删除
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
        PolicyStatement that = (PolicyStatement) obj;
        return Objects.equals(this.policyStatementId, that.policyStatementId)
            && Objects.equals(this.actions, that.actions) && Objects.equals(this.roamActions, that.roamActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyStatementId, actions, roamActions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyStatement {\n");
        sb.append("    policyStatementId: ").append(toIndentedString(policyStatementId)).append("\n");
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
