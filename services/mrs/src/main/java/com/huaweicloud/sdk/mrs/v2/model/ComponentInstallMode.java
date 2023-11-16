package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组件详情
 */
public class ComponentInstallMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component")

    private String component;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_groups")

    private List<AssignedNodeGroup> nodeGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_user_password")

    private String componentUserPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_default_password")

    private String componentDefaultPassword;

    public ComponentInstallMode withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * 组件名称
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public ComponentInstallMode withNodeGroups(List<AssignedNodeGroup> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }

    public ComponentInstallMode addNodeGroupsItem(AssignedNodeGroup nodeGroupsItem) {
        if (this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        this.nodeGroups.add(nodeGroupsItem);
        return this;
    }

    public ComponentInstallMode withNodeGroups(Consumer<List<AssignedNodeGroup>> nodeGroupsSetter) {
        if (this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        nodeGroupsSetter.accept(this.nodeGroups);
        return this;
    }

    /**
     * 该组件的角色部署信息
     * @return nodeGroups
     */
    public List<AssignedNodeGroup> getNodeGroups() {
        return nodeGroups;
    }

    public void setNodeGroups(List<AssignedNodeGroup> nodeGroups) {
        this.nodeGroups = nodeGroups;
    }

    public ComponentInstallMode withComponentUserPassword(String componentUserPassword) {
        this.componentUserPassword = componentUserPassword;
        return this;
    }

    /**
     * 配置组件用户密码，该密码用于ClickHouse组件机机用户连接使用。 - 密码长度应在8～26个字符之间 - 不能与用户名或者倒序用户名相同 - 必须包含如下4种字符的组合 - 至少一个小写字母 - 至少一个大写字母 - 至少一个数字 - 至少一个特殊字符：!@$%^-_=+[{}]:,./?
     * @return componentUserPassword
     */
    public String getComponentUserPassword() {
        return componentUserPassword;
    }

    public void setComponentUserPassword(String componentUserPassword) {
        this.componentUserPassword = componentUserPassword;
    }

    public ComponentInstallMode withComponentDefaultPassword(String componentDefaultPassword) {
        this.componentDefaultPassword = componentDefaultPassword;
        return this;
    }

    /**
     * 配置组件default用户密码，该密码用于ClickHouse组件人机用户连接使用。 - 密码长度应在8～26个字符之间 - 不能与用户名或者倒序用户名相同 - 必须包含如下4种字符的组合 - 至少一个小写字母 - 至少一个大写字母 - 至少一个数字 - 至少一个特殊字符：!@$%^-_=+[{}]:,./?
     * @return componentDefaultPassword
     */
    public String getComponentDefaultPassword() {
        return componentDefaultPassword;
    }

    public void setComponentDefaultPassword(String componentDefaultPassword) {
        this.componentDefaultPassword = componentDefaultPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentInstallMode that = (ComponentInstallMode) obj;
        return Objects.equals(this.component, that.component) && Objects.equals(this.nodeGroups, that.nodeGroups)
            && Objects.equals(this.componentUserPassword, that.componentUserPassword)
            && Objects.equals(this.componentDefaultPassword, that.componentDefaultPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, nodeGroups, componentUserPassword, componentDefaultPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentInstallMode {\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    nodeGroups: ").append(toIndentedString(nodeGroups)).append("\n");
        sb.append("    componentUserPassword: ").append(toIndentedString(componentUserPassword)).append("\n");
        sb.append("    componentDefaultPassword: ").append(toIndentedString(componentDefaultPassword)).append("\n");
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
