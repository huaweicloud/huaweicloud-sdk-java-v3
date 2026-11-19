package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 已委托账号信息
 */
public class DelegatedAccountResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

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

    public DelegatedAccountResponseInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释** 父节点的ID **取值范围** 字符长度1-64位 
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DelegatedAccountResponseInfo withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * **参数解释** 父节点名称 **取值范围** 字符长度0-64位 
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public DelegatedAccountResponseInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释** 账号ID **取值范围** 字符长度1-64位 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DelegatedAccountResponseInfo withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * **参数解释** 账号的统一资源名称 **取值范围** 字符长度0-2048位 
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public DelegatedAccountResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 账号名称 **取值范围** 字符长度1-64位 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DelegatedAccountResponseInfo withOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }

    /**
     * **参数解释** 节点类型 **取值范围** - unit：组织 - account：账号 - project：项目 
     * @return orgType
     */
    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelegatedAccountResponseInfo that = (DelegatedAccountResponseInfo) obj;
        return Objects.equals(this.parentId, that.parentId) && Objects.equals(this.parentName, that.parentName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.name, that.name) && Objects.equals(this.orgType, that.orgType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, parentName, id, urn, name, orgType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelegatedAccountResponseInfo {\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orgType: ").append(toIndentedString(orgType)).append("\n");
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
