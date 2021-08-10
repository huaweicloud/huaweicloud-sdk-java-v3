package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SubCustomerInfoV2 */
public class SubCustomerInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_id")

    private String orgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_name")

    private String orgName;

    public SubCustomerInfoV2 withId(String id) {
        this.id = id;
        return this;
    }

    /** 企业子账号的客户ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubCustomerInfoV2 withName(String name) {
        this.name = name;
        return this;
    }

    /** 企业子账号的用户名。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubCustomerInfoV2 withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** 企业子账号的显示名称。 不限制特殊字符。
     * 
     * @return displayName */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public SubCustomerInfoV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 子账号状态： 1：正常2：创建中3：关闭中4：已关闭101：子账号注册中102：子账号待激活
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SubCustomerInfoV2 withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    /** 子账号归属的组织单元ID。
     * 
     * @return orgId */
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public SubCustomerInfoV2 withOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /** 子账号归属的组织单元名称。 说明： 当子账号归属的组织是企业组织根节点时，本属性可能为空。
     * 
     * @return orgName */
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubCustomerInfoV2 subCustomerInfoV2 = (SubCustomerInfoV2) o;
        return Objects.equals(this.id, subCustomerInfoV2.id) && Objects.equals(this.name, subCustomerInfoV2.name)
            && Objects.equals(this.displayName, subCustomerInfoV2.displayName)
            && Objects.equals(this.status, subCustomerInfoV2.status)
            && Objects.equals(this.orgId, subCustomerInfoV2.orgId)
            && Objects.equals(this.orgName, subCustomerInfoV2.orgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, displayName, status, orgId, orgName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubCustomerInfoV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
