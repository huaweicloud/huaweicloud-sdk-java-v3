package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAccessPolicyObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_objects_list")

    private List<AccessPolicyObject> policyObjectsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAccessPolicyObjectsResponse withPolicyObjectsList(List<AccessPolicyObject> policyObjectsList) {
        this.policyObjectsList = policyObjectsList;
        return this;
    }

    public ListAccessPolicyObjectsResponse addPolicyObjectsListItem(AccessPolicyObject policyObjectsListItem) {
        if (this.policyObjectsList == null) {
            this.policyObjectsList = new ArrayList<>();
        }
        this.policyObjectsList.add(policyObjectsListItem);
        return this;
    }

    public ListAccessPolicyObjectsResponse withPolicyObjectsList(
        Consumer<List<AccessPolicyObject>> policyObjectsListSetter) {
        if (this.policyObjectsList == null) {
            this.policyObjectsList = new ArrayList<>();
        }
        policyObjectsListSetter.accept(this.policyObjectsList);
        return this;
    }

    /**
     * 查询接入策略应用对象响应。
     * @return policyObjectsList
     */
    public List<AccessPolicyObject> getPolicyObjectsList() {
        return policyObjectsList;
    }

    public void setPolicyObjectsList(List<AccessPolicyObject> policyObjectsList) {
        this.policyObjectsList = policyObjectsList;
    }

    public ListAccessPolicyObjectsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 对象总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessPolicyObjectsResponse that = (ListAccessPolicyObjectsResponse) obj;
        return Objects.equals(this.policyObjectsList, that.policyObjectsList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyObjectsList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPolicyObjectsResponse {\n");
        sb.append("    policyObjectsList: ").append(toIndentedString(policyObjectsList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
