package com.huaweicloud.sdk.evs.v2.model;

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
public class ListAutoSnapshotPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_policies")

    private List<GetSnapshotPolicy> snapshotPolicies = null;

    public ListAutoSnapshotPolicyResponse withSnapshotPolicies(List<GetSnapshotPolicy> snapshotPolicies) {
        this.snapshotPolicies = snapshotPolicies;
        return this;
    }

    public ListAutoSnapshotPolicyResponse addSnapshotPoliciesItem(GetSnapshotPolicy snapshotPoliciesItem) {
        if (this.snapshotPolicies == null) {
            this.snapshotPolicies = new ArrayList<>();
        }
        this.snapshotPolicies.add(snapshotPoliciesItem);
        return this;
    }

    public ListAutoSnapshotPolicyResponse withSnapshotPolicies(
        Consumer<List<GetSnapshotPolicy>> snapshotPoliciesSetter) {
        if (this.snapshotPolicies == null) {
            this.snapshotPolicies = new ArrayList<>();
        }
        snapshotPoliciesSetter.accept(this.snapshotPolicies);
        return this;
    }

    /**
     * 查询的自动快照策略列表信息。
     * @return snapshotPolicies
     */
    public List<GetSnapshotPolicy> getSnapshotPolicies() {
        return snapshotPolicies;
    }

    public void setSnapshotPolicies(List<GetSnapshotPolicy> snapshotPolicies) {
        this.snapshotPolicies = snapshotPolicies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAutoSnapshotPolicyResponse that = (ListAutoSnapshotPolicyResponse) obj;
        return Objects.equals(this.snapshotPolicies, that.snapshotPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoSnapshotPolicyResponse {\n");
        sb.append("    snapshotPolicies: ").append(toIndentedString(snapshotPolicies)).append("\n");
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
