package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAccessPolicyObjectsReq
 */
public class UpdateAccessPolicyObjectsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_objects_list")

    private List<AccessPolicyObjectInfo> policyObjectsList = null;

    public UpdateAccessPolicyObjectsReq withPolicyObjectsList(List<AccessPolicyObjectInfo> policyObjectsList) {
        this.policyObjectsList = policyObjectsList;
        return this;
    }

    public UpdateAccessPolicyObjectsReq addPolicyObjectsListItem(AccessPolicyObjectInfo policyObjectsListItem) {
        if (this.policyObjectsList == null) {
            this.policyObjectsList = new ArrayList<>();
        }
        this.policyObjectsList.add(policyObjectsListItem);
        return this;
    }

    public UpdateAccessPolicyObjectsReq withPolicyObjectsList(
        Consumer<List<AccessPolicyObjectInfo>> policyObjectsListSetter) {
        if (this.policyObjectsList == null) {
            this.policyObjectsList = new ArrayList<>();
        }
        policyObjectsListSetter.accept(this.policyObjectsList);
        return this;
    }

    /**
     * 更新策略应用对象列表请求。
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
        UpdateAccessPolicyObjectsReq that = (UpdateAccessPolicyObjectsReq) obj;
        return Objects.equals(this.policyObjectsList, that.policyObjectsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyObjectsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessPolicyObjectsReq {\n");
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
