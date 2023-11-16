package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点组详情
 */
public class AssignedNodeGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_roles")

    private List<String> assignedRoles = null;

    public AssignedNodeGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssignedNodeGroup withAssignedRoles(List<String> assignedRoles) {
        this.assignedRoles = assignedRoles;
        return this;
    }

    public AssignedNodeGroup addAssignedRolesItem(String assignedRolesItem) {
        if (this.assignedRoles == null) {
            this.assignedRoles = new ArrayList<>();
        }
        this.assignedRoles.add(assignedRolesItem);
        return this;
    }

    public AssignedNodeGroup withAssignedRoles(Consumer<List<String>> assignedRolesSetter) {
        if (this.assignedRoles == null) {
            this.assignedRoles = new ArrayList<>();
        }
        assignedRolesSetter.accept(this.assignedRoles);
        return this;
    }

    /**
     * 角色部署信息。 可以指定节点组中部署的角色，该参数是一个字符串数组，每个字符串表示一个角色表达式。 角色表达式定义： - 当该角色在节点组所有节点部署时： {role name}，如“DataNode”。 - 当该角色在节点组指定下标节点部署时：{role name}:{index1},{index2}…,{indexN}，如“NameNode:1,2”，下标从1开始计数。 - 部分角色支持多实例部署（即在一个节点部署多个同角色的实例）：{role name}[{instance count}]，如“EsNode[9]”，多实例部署不需要指定角色位置，默认在节点组所有节点部署多个实例 可选的角色请参考[MRS支持的角色与组件对应表](https://support.huaweicloud.com/api-mrs/mrs_02_0106.html)。
     * @return assignedRoles
     */
    public List<String> getAssignedRoles() {
        return assignedRoles;
    }

    public void setAssignedRoles(List<String> assignedRoles) {
        this.assignedRoles = assignedRoles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssignedNodeGroup that = (AssignedNodeGroup) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.assignedRoles, that.assignedRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, assignedRoles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignedNodeGroup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    assignedRoles: ").append(toIndentedString(assignedRoles)).append("\n");
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
