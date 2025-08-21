package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OrganizationAccountInfo
 */
public class OrganizationAccountInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegated")

    private Boolean delegated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_type")

    private String orgType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    public OrganizationAccountInfo withDelegated(Boolean delegated) {
        this.delegated = delegated;
        return this;
    }

    /**
     * **参数解释**： 是否已添加 **取值范围**： 不涉及
     * @return delegated
     */
    public Boolean getDelegated() {
        return delegated;
    }

    public void setDelegated(Boolean delegated) {
        this.delegated = delegated;
    }

    public OrganizationAccountInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 账号的唯一标识符 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrganizationAccountInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 账号名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationAccountInfo withOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }

    /**
     * **参数解释**： 组织节点类型 **取值范围**： account
     * @return orgType
     */
    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public OrganizationAccountInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**： 父节点（根或组织单元）的唯一标识符（ID） **取值范围**： 不涉及
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public OrganizationAccountInfo withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * **参数解释**： 账号的统一资源名称 **取值范围**： 不涉及
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrganizationAccountInfo that = (OrganizationAccountInfo) obj;
        return Objects.equals(this.delegated, that.delegated) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.orgType, that.orgType)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.urn, that.urn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegated, id, name, orgType, parentId, urn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationAccountInfo {\n");
        sb.append("    delegated: ").append(toIndentedString(delegated)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orgType: ").append(toIndentedString(orgType)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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
