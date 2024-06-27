package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OrganizationalUnitIdsPrimitiveTypeHolder
 */
public class OrganizationalUnitIdsPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_ids")

    private List<String> organizationalUnitIds = null;

    public OrganizationalUnitIdsPrimitiveTypeHolder withOrganizationalUnitIds(List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }

    public OrganizationalUnitIdsPrimitiveTypeHolder addOrganizationalUnitIdsItem(String organizationalUnitIdsItem) {
        if (this.organizationalUnitIds == null) {
            this.organizationalUnitIds = new ArrayList<>();
        }
        this.organizationalUnitIds.add(organizationalUnitIdsItem);
        return this;
    }

    public OrganizationalUnitIdsPrimitiveTypeHolder withOrganizationalUnitIds(
        Consumer<List<String>> organizationalUnitIdsSetter) {
        if (this.organizationalUnitIds == null) {
            this.organizationalUnitIds = new ArrayList<>();
        }
        organizationalUnitIdsSetter.accept(this.organizationalUnitIds);
        return this;
    }

    /**
     * 组织单元（Organizational Unit，缩写OU）ID列表，仅在资源栈集权限模型是SERVICE_MANAGED时，才允许指定该参数。  用户指定的Organization组织部署的ID列表，可以是根组织（Root）ID，也可以是某些组织单元的ID。  创建资源栈实例 （CreateStackInstances）API 必须指定该参数，该API 会异步校验OU IDs 的合法性，校验有效的OU IDs 及其所有非空子OU ID 都会被资源栈集记录管理。该API允许指定没有或者已经被资源栈集管理的OU IDs。   * 若资源栈集不自动部署，空子OU不会被资源栈集记录管理（特指子OU下无成员账号或部署排除其下所有成员账号）。*   * 【暂不支持】若资源栈集开启自动部署，空子OU也会被资源栈集记录管理（特指子OU下无成员账号或部署排除其下所有成员账号），自动部署仅针对成员账号变动，不针对其他组织结构变化，例如新增OU等，新增OU不会自动被资源栈集管理。*  部署或删除资源栈实例（DeployStackSet、UpdateStackInstances、DeleteStackInstances） API，只允许指定已经被资源栈集管理的OU IDs。若指定了没有被资源栈集记录管理的OU IDs，则会报错。  删除资源栈实例 （DeleteStackInstances）API 必须指定该参数。  用户可以通过获取资源栈集元数据（ShowStackSetMetadata）API ，获取通过创建资源栈实例（CreateStackInstances）API 请求指定过的OU IDs。  资源栈集不仅会部署到目标 OU 中的用户，同时还会部署所有子 OU 下的用户。指定该参数后，资源栈集会根据用户输入的 OU 列表下所有的用户信息（包含子 OU 下的用户）和region列表，以笛卡尔积的形式，选择资源栈实例进行创建或部署。  *资源栈集不会选择组织管理员作为部署目标，进行资源栈实例的创建或部署，即使组织管理员位于给与的组织或组织的 OU 中。*
     * @return organizationalUnitIds
     */
    public List<String> getOrganizationalUnitIds() {
        return organizationalUnitIds;
    }

    public void setOrganizationalUnitIds(List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrganizationalUnitIdsPrimitiveTypeHolder that = (OrganizationalUnitIdsPrimitiveTypeHolder) obj;
        return Objects.equals(this.organizationalUnitIds, that.organizationalUnitIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationalUnitIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationalUnitIdsPrimitiveTypeHolder {\n");
        sb.append("    organizationalUnitIds: ").append(toIndentedString(organizationalUnitIds)).append("\n");
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
