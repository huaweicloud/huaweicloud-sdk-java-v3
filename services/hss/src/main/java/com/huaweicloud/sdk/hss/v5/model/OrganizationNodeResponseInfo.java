package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组织结构树
 */
public class OrganizationNodeResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_type")

    private String orgType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegated")

    private Boolean delegated;

    public OrganizationNodeResponseInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父节点Id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public OrganizationNodeResponseInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrganizationNodeResponseInfo withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 组织的统一资源名称,格式：organizations::{management_account_id}:xxxxx:{org_id}/xxxxxxxx。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public OrganizationNodeResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationNodeResponseInfo withOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }

    /**
     * 节点类型，unit:组织单元、account:账号
     * @return orgType
     */
    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public OrganizationNodeResponseInfo withDelegated(Boolean delegated) {
        this.delegated = delegated;
        return this;
    }

    /**
     * 组织或账号是否已授权。   - true: 已授权（无需授权）。   - false: 未授权。
     * @return delegated
     */
    public Boolean getDelegated() {
        return delegated;
    }

    public void setDelegated(Boolean delegated) {
        this.delegated = delegated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrganizationNodeResponseInfo that = (OrganizationNodeResponseInfo) obj;
        return Objects.equals(this.parentId, that.parentId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.urn, that.urn) && Objects.equals(this.name, that.name)
            && Objects.equals(this.orgType, that.orgType) && Objects.equals(this.delegated, that.delegated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, id, urn, name, orgType, delegated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationNodeResponseInfo {\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orgType: ").append(toIndentedString(orgType)).append("\n");
        sb.append("    delegated: ").append(toIndentedString(delegated)).append("\n");
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
