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
public class ListPermissionSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_sets")

    private List<PermissionSetDto> permissionSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListPermissionSetsResponse withPermissionSets(List<PermissionSetDto> permissionSets) {
        this.permissionSets = permissionSets;
        return this;
    }

    public ListPermissionSetsResponse addPermissionSetsItem(PermissionSetDto permissionSetsItem) {
        if (this.permissionSets == null) {
            this.permissionSets = new ArrayList<>();
        }
        this.permissionSets.add(permissionSetsItem);
        return this;
    }

    public ListPermissionSetsResponse withPermissionSets(Consumer<List<PermissionSetDto>> permissionSetsSetter) {
        if (this.permissionSets == null) {
            this.permissionSets = new ArrayList<>();
        }
        permissionSetsSetter.accept(this.permissionSets);
        return this;
    }

    /**
     * 权限集列表
     * @return permissionSets
     */
    public List<PermissionSetDto> getPermissionSets() {
        return permissionSets;
    }

    public void setPermissionSets(List<PermissionSetDto> permissionSets) {
        this.permissionSets = permissionSets;
    }

    public ListPermissionSetsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPermissionSetsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListPermissionSetsResponse that = (ListPermissionSetsResponse) obj;
        return Objects.equals(this.permissionSets, that.permissionSets) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSets, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPermissionSetsResponse {\n");
        sb.append("    permissionSets: ").append(toIndentedString(permissionSets)).append("\n");
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
