package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ListGroupsForEnterpriseProjectResDetail */
public class ListGroupsForEnterpriseProjectResDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainId")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListGroupsForEnterpriseProjectResDetail withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 用户组创建时间。
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListGroupsForEnterpriseProjectResDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 用户组描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListGroupsForEnterpriseProjectResDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 租户Id。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListGroupsForEnterpriseProjectResDetail withId(String id) {
        this.id = id;
        return this;
    }

    /** 用户组Id。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListGroupsForEnterpriseProjectResDetail withName(String name) {
        this.name = name;
        return this;
    }

    /** 用户组名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGroupsForEnterpriseProjectResDetail listGroupsForEnterpriseProjectResDetail =
            (ListGroupsForEnterpriseProjectResDetail) o;
        return Objects.equals(this.createTime, listGroupsForEnterpriseProjectResDetail.createTime)
            && Objects.equals(this.description, listGroupsForEnterpriseProjectResDetail.description)
            && Objects.equals(this.domainId, listGroupsForEnterpriseProjectResDetail.domainId)
            && Objects.equals(this.id, listGroupsForEnterpriseProjectResDetail.id)
            && Objects.equals(this.name, listGroupsForEnterpriseProjectResDetail.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, description, domainId, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupsForEnterpriseProjectResDetail {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
