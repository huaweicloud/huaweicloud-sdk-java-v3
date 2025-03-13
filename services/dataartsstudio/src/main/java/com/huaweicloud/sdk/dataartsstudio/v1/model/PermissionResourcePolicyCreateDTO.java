package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PermissionResourcePolicyCreateDTO
 */
public class PermissionResourcePolicyCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourcePolicyItem> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<MemberPolicyItem> members = null;

    public PermissionResourcePolicyCreateDTO withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称：英文和汉字开头, 支持英文、汉字、数字、下划线, 2-64字符
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public PermissionResourcePolicyCreateDTO withResources(List<ResourcePolicyItem> resources) {
        this.resources = resources;
        return this;
    }

    public PermissionResourcePolicyCreateDTO addResourcesItem(ResourcePolicyItem resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PermissionResourcePolicyCreateDTO withResources(Consumer<List<ResourcePolicyItem>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源对象列表。资源对象包含 数据连接, 连接获取方法详见[查询数据连接列表](ListDataconnections.xml)
     * @return resources
     */
    public List<ResourcePolicyItem> getResources() {
        return resources;
    }

    public void setResources(List<ResourcePolicyItem> resources) {
        this.resources = resources;
    }

    public PermissionResourcePolicyCreateDTO withMembers(List<MemberPolicyItem> members) {
        this.members = members;
        return this;
    }

    public PermissionResourcePolicyCreateDTO addMembersItem(MemberPolicyItem membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public PermissionResourcePolicyCreateDTO withMembers(Consumer<List<MemberPolicyItem>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 成员列表。 成员包含空间用户、空间用户组、空间用户角色。空间用户、用户组获取方法请参见[获取工作空间用户信息](ListWorkspaceusers.xml),空间角色获取方法参见[获取工作空间用户角色](ListWorkspaceRoles.xml)
     * @return members
     */
    public List<MemberPolicyItem> getMembers() {
        return members;
    }

    public void setMembers(List<MemberPolicyItem> members) {
        this.members = members;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionResourcePolicyCreateDTO that = (PermissionResourcePolicyCreateDTO) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, resources, members);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionResourcePolicyCreateDTO {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
