package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAgencyEpPolicyAssignmentReqBody
 */
public class CreateAgencyEpPolicyAssignmentReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_assignments")

    private List<CreateAgencyEpPolicyAssignmentReqBodyRoleAssignments> roleAssignments = null;

    public CreateAgencyEpPolicyAssignmentReqBody withRoleAssignments(
        List<CreateAgencyEpPolicyAssignmentReqBodyRoleAssignments> roleAssignments) {
        this.roleAssignments = roleAssignments;
        return this;
    }

    public CreateAgencyEpPolicyAssignmentReqBody addRoleAssignmentsItem(
        CreateAgencyEpPolicyAssignmentReqBodyRoleAssignments roleAssignmentsItem) {
        if (this.roleAssignments == null) {
            this.roleAssignments = new ArrayList<>();
        }
        this.roleAssignments.add(roleAssignmentsItem);
        return this;
    }

    public CreateAgencyEpPolicyAssignmentReqBody withRoleAssignments(
        Consumer<List<CreateAgencyEpPolicyAssignmentReqBodyRoleAssignments>> roleAssignmentsSetter) {
        if (this.roleAssignments == null) {
            this.roleAssignments = new ArrayList<>();
        }
        roleAssignmentsSetter.accept(this.roleAssignments);
        return this;
    }

    /**
     * 委托在企业项目上的绑定关系，最多支持250条。
     * @return roleAssignments
     */
    public List<CreateAgencyEpPolicyAssignmentReqBodyRoleAssignments> getRoleAssignments() {
        return roleAssignments;
    }

    public void setRoleAssignments(List<CreateAgencyEpPolicyAssignmentReqBodyRoleAssignments> roleAssignments) {
        this.roleAssignments = roleAssignments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAgencyEpPolicyAssignmentReqBody that = (CreateAgencyEpPolicyAssignmentReqBody) obj;
        return Objects.equals(this.roleAssignments, that.roleAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleAssignments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyEpPolicyAssignmentReqBody {\n");
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
