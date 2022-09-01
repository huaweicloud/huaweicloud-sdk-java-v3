package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGroupsForEnterpriseProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    @JacksonXmlProperty(localName = "groups")

    private List<ListGroupsForEnterpriseProjectResDetail> groups = null;

    public ListGroupsForEnterpriseProjectResponse withGroups(List<ListGroupsForEnterpriseProjectResDetail> groups) {
        this.groups = groups;
        return this;
    }

    public ListGroupsForEnterpriseProjectResponse addGroupsItem(ListGroupsForEnterpriseProjectResDetail groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ListGroupsForEnterpriseProjectResponse withGroups(
        Consumer<List<ListGroupsForEnterpriseProjectResDetail>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 用户组信息。
     * @return groups
     */
    public List<ListGroupsForEnterpriseProjectResDetail> getGroups() {
        return groups;
    }

    public void setGroups(List<ListGroupsForEnterpriseProjectResDetail> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGroupsForEnterpriseProjectResponse listGroupsForEnterpriseProjectResponse =
            (ListGroupsForEnterpriseProjectResponse) o;
        return Objects.equals(this.groups, listGroupsForEnterpriseProjectResponse.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupsForEnterpriseProjectResponse {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
