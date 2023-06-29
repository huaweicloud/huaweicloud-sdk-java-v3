package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAccessPolicyReq
 */
public class CreateAccessPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private AccessPolicyInfo policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_objects_list")

    private List<AccessPolicyObjectInfo> policyObjectsList = null;

    public CreateAccessPolicyReq withPolicy(AccessPolicyInfo policy) {
        this.policy = policy;
        return this;
    }

    public CreateAccessPolicyReq withPolicy(Consumer<AccessPolicyInfo> policySetter) {
        if (this.policy == null) {
            this.policy = new AccessPolicyInfo();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public AccessPolicyInfo getPolicy() {
        return policy;
    }

    public void setPolicy(AccessPolicyInfo policy) {
        this.policy = policy;
    }

    public CreateAccessPolicyReq withPolicyObjectsList(List<AccessPolicyObjectInfo> policyObjectsList) {
        this.policyObjectsList = policyObjectsList;
        return this;
    }

    public CreateAccessPolicyReq addPolicyObjectsListItem(AccessPolicyObjectInfo policyObjectsListItem) {
        if (this.policyObjectsList == null) {
            this.policyObjectsList = new ArrayList<>();
        }
        this.policyObjectsList.add(policyObjectsListItem);
        return this;
    }

    public CreateAccessPolicyReq withPolicyObjectsList(Consumer<List<AccessPolicyObjectInfo>> policyObjectsListSetter) {
        if (this.policyObjectsList == null) {
            this.policyObjectsList = new ArrayList<>();
        }
        policyObjectsListSetter.accept(this.policyObjectsList);
        return this;
    }

    /**
     * 策略应用对象列表。
     * @return policyObjectsList
     */
    public List<AccessPolicyObjectInfo> getPolicyObjectsList() {
        return policyObjectsList;
    }

    public void setPolicyObjectsList(List<AccessPolicyObjectInfo> policyObjectsList) {
        this.policyObjectsList = policyObjectsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccessPolicyReq that = (CreateAccessPolicyReq) obj;
        return Objects.equals(this.policy, that.policy)
            && Objects.equals(this.policyObjectsList, that.policyObjectsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy, policyObjectsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessPolicyReq {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    policyObjectsList: ").append(toIndentedString(policyObjectsList)).append("\n");
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
