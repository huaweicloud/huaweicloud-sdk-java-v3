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

    public PolicyStatement withPolicyStatementId(String policyStatementId) {
        this.policyStatementId = policyStatementId;
        return this;
    }

    /**
     * 支持的访问策略,内置如下三种策略 * `读写` - 上传、编辑、下载 policy_statement_id: DEFAULT_1 * `只读` - 下载 policy_statement_id: DEFAULT_2 * `只写` - 上传、编辑 policy_statement_id: DEFAULT_3
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
     * 可以进行操作的权限合集 * `PutObject` -  上传、修改、重命名、移动 * `GetObject` - 下载 * `DeleteObject` - 删除
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
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
            && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyStatementId, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyStatement {\n");
        sb.append("    policyStatementId: ").append(toIndentedString(policyStatementId)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
