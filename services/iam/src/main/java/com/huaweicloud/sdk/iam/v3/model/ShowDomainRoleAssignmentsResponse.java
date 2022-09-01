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
public class ShowDomainRoleAssignmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    @JacksonXmlProperty(localName = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_assignments")

    @JacksonXmlProperty(localName = "role_assignments")

    private List<RoleAssignmentBody> roleAssignments = null;

    public ShowDomainRoleAssignmentsResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 返回授权记录的总条数。
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public ShowDomainRoleAssignmentsResponse withRoleAssignments(List<RoleAssignmentBody> roleAssignments) {
        this.roleAssignments = roleAssignments;
        return this;
    }

    public ShowDomainRoleAssignmentsResponse addRoleAssignmentsItem(RoleAssignmentBody roleAssignmentsItem) {
        if (this.roleAssignments == null) {
            this.roleAssignments = new ArrayList<>();
        }
        this.roleAssignments.add(roleAssignmentsItem);
        return this;
    }

    public ShowDomainRoleAssignmentsResponse withRoleAssignments(
        Consumer<List<RoleAssignmentBody>> roleAssignmentsSetter) {
        if (this.roleAssignments == null) {
            this.roleAssignments = new ArrayList<>();
        }
        roleAssignmentsSetter.accept(this.roleAssignments);
        return this;
    }

    /**
     * Get roleAssignments
     * @return roleAssignments
     */
    public List<RoleAssignmentBody> getRoleAssignments() {
        return roleAssignments;
    }

    public void setRoleAssignments(List<RoleAssignmentBody> roleAssignments) {
        this.roleAssignments = roleAssignments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainRoleAssignmentsResponse showDomainRoleAssignmentsResponse = (ShowDomainRoleAssignmentsResponse) o;
        return Objects.equals(this.totalNum, showDomainRoleAssignmentsResponse.totalNum)
            && Objects.equals(this.roleAssignments, showDomainRoleAssignmentsResponse.roleAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, roleAssignments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainRoleAssignmentsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    roleAssignments: ").append(toIndentedString(roleAssignments)).append("\n");
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
