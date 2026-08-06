package com.huaweicloud.sdk.kms.v2.model;

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
public class ListKeyPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListAccessPointResponseBodyPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyspace_policies")

    private List<ListKeyPolicyResponseBodyKeyspacePolicies> keyspacePolicies = null;

    public ListKeyPolicyResponse withPageInfo(ListAccessPointResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListKeyPolicyResponse withPageInfo(Consumer<ListAccessPointResponseBodyPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListAccessPointResponseBodyPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListAccessPointResponseBodyPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListAccessPointResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListKeyPolicyResponse withKeyspacePolicies(
        List<ListKeyPolicyResponseBodyKeyspacePolicies> keyspacePolicies) {
        this.keyspacePolicies = keyspacePolicies;
        return this;
    }

    public ListKeyPolicyResponse addKeyspacePoliciesItem(
        ListKeyPolicyResponseBodyKeyspacePolicies keyspacePoliciesItem) {
        if (this.keyspacePolicies == null) {
            this.keyspacePolicies = new ArrayList<>();
        }
        this.keyspacePolicies.add(keyspacePoliciesItem);
        return this;
    }

    public ListKeyPolicyResponse withKeyspacePolicies(
        Consumer<List<ListKeyPolicyResponseBodyKeyspacePolicies>> keyspacePoliciesSetter) {
        if (this.keyspacePolicies == null) {
            this.keyspacePolicies = new ArrayList<>();
        }
        keyspacePoliciesSetter.accept(this.keyspacePolicies);
        return this;
    }

    /**
     * **参数解释：** 密钥策略列表 **取值范围：** 不涉及
     * @return keyspacePolicies
     */
    public List<ListKeyPolicyResponseBodyKeyspacePolicies> getKeyspacePolicies() {
        return keyspacePolicies;
    }

    public void setKeyspacePolicies(List<ListKeyPolicyResponseBodyKeyspacePolicies> keyspacePolicies) {
        this.keyspacePolicies = keyspacePolicies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKeyPolicyResponse that = (ListKeyPolicyResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.keyspacePolicies, that.keyspacePolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, keyspacePolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeyPolicyResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    keyspacePolicies: ").append(toIndentedString(keyspacePolicies)).append("\n");
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
