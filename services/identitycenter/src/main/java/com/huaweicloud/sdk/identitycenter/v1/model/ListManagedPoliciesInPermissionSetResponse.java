package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListManagedPoliciesInPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_managed_policies")

    private List<AttachedManagedPolicyDto> attachedManagedPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListManagedPoliciesInPermissionSetResponse withAttachedManagedPolicies(
        List<AttachedManagedPolicyDto> attachedManagedPolicies) {
        this.attachedManagedPolicies = attachedManagedPolicies;
        return this;
    }

    public ListManagedPoliciesInPermissionSetResponse addAttachedManagedPoliciesItem(
        AttachedManagedPolicyDto attachedManagedPoliciesItem) {
        if (this.attachedManagedPolicies == null) {
            this.attachedManagedPolicies = new ArrayList<>();
        }
        this.attachedManagedPolicies.add(attachedManagedPoliciesItem);
        return this;
    }

    public ListManagedPoliciesInPermissionSetResponse withAttachedManagedPolicies(
        Consumer<List<AttachedManagedPolicyDto>> attachedManagedPoliciesSetter) {
        if (this.attachedManagedPolicies == null) {
            this.attachedManagedPolicies = new ArrayList<>();
        }
        attachedManagedPoliciesSetter.accept(this.attachedManagedPolicies);
        return this;
    }

    /**
     * AttachedManagedPolicy数据类型对象的数组
     * @return attachedManagedPolicies
     */
    public List<AttachedManagedPolicyDto> getAttachedManagedPolicies() {
        return attachedManagedPolicies;
    }

    public void setAttachedManagedPolicies(List<AttachedManagedPolicyDto> attachedManagedPolicies) {
        this.attachedManagedPolicies = attachedManagedPolicies;
    }

    public ListManagedPoliciesInPermissionSetResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListManagedPoliciesInPermissionSetResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
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
        ListManagedPoliciesInPermissionSetResponse that = (ListManagedPoliciesInPermissionSetResponse) obj;
        return Objects.equals(this.attachedManagedPolicies, that.attachedManagedPolicies)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedManagedPolicies, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagedPoliciesInPermissionSetResponse {\n");
        sb.append("    attachedManagedPolicies: ").append(toIndentedString(attachedManagedPolicies)).append("\n");
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
