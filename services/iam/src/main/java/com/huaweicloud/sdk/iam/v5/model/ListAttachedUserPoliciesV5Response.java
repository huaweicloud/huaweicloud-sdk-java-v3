package com.huaweicloud.sdk.iam.v5.model;

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
public class ListAttachedUserPoliciesV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_policies")

    private List<AttachedPolicy> attachedPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAttachedUserPoliciesV5Response withAttachedPolicies(List<AttachedPolicy> attachedPolicies) {
        this.attachedPolicies = attachedPolicies;
        return this;
    }

    public ListAttachedUserPoliciesV5Response addAttachedPoliciesItem(AttachedPolicy attachedPoliciesItem) {
        if (this.attachedPolicies == null) {
            this.attachedPolicies = new ArrayList<>();
        }
        this.attachedPolicies.add(attachedPoliciesItem);
        return this;
    }

    public ListAttachedUserPoliciesV5Response withAttachedPolicies(
        Consumer<List<AttachedPolicy>> attachedPoliciesSetter) {
        if (this.attachedPolicies == null) {
            this.attachedPolicies = new ArrayList<>();
        }
        attachedPoliciesSetter.accept(this.attachedPolicies);
        return this;
    }

    /**
     * 身份策略列表。
     * @return attachedPolicies
     */
    public List<AttachedPolicy> getAttachedPolicies() {
        return attachedPolicies;
    }

    public void setAttachedPolicies(List<AttachedPolicy> attachedPolicies) {
        this.attachedPolicies = attachedPolicies;
    }

    public ListAttachedUserPoliciesV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAttachedUserPoliciesV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAttachedUserPoliciesV5Response that = (ListAttachedUserPoliciesV5Response) obj;
        return Objects.equals(this.attachedPolicies, that.attachedPolicies)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedPolicies, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAttachedUserPoliciesV5Response {\n");
        sb.append("    attachedPolicies: ").append(toIndentedString(attachedPolicies)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
