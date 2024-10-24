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
public class ListPermissionSetProvisioningStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_sets_provisioning_status")

    private List<PermissionSetProvisioningStatusMetadataDto> permissionSetsProvisioningStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListPermissionSetProvisioningStatusResponse withPermissionSetsProvisioningStatus(
        List<PermissionSetProvisioningStatusMetadataDto> permissionSetsProvisioningStatus) {
        this.permissionSetsProvisioningStatus = permissionSetsProvisioningStatus;
        return this;
    }

    public ListPermissionSetProvisioningStatusResponse addPermissionSetsProvisioningStatusItem(
        PermissionSetProvisioningStatusMetadataDto permissionSetsProvisioningStatusItem) {
        if (this.permissionSetsProvisioningStatus == null) {
            this.permissionSetsProvisioningStatus = new ArrayList<>();
        }
        this.permissionSetsProvisioningStatus.add(permissionSetsProvisioningStatusItem);
        return this;
    }

    public ListPermissionSetProvisioningStatusResponse withPermissionSetsProvisioningStatus(
        Consumer<List<PermissionSetProvisioningStatusMetadataDto>> permissionSetsProvisioningStatusSetter) {
        if (this.permissionSetsProvisioningStatus == null) {
            this.permissionSetsProvisioningStatus = new ArrayList<>();
        }
        permissionSetsProvisioningStatusSetter.accept(this.permissionSetsProvisioningStatus);
        return this;
    }

    /**
     * 权限集授权状态
     * @return permissionSetsProvisioningStatus
     */
    public List<PermissionSetProvisioningStatusMetadataDto> getPermissionSetsProvisioningStatus() {
        return permissionSetsProvisioningStatus;
    }

    public void setPermissionSetsProvisioningStatus(
        List<PermissionSetProvisioningStatusMetadataDto> permissionSetsProvisioningStatus) {
        this.permissionSetsProvisioningStatus = permissionSetsProvisioningStatus;
    }

    public ListPermissionSetProvisioningStatusResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPermissionSetProvisioningStatusResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListPermissionSetProvisioningStatusResponse that = (ListPermissionSetProvisioningStatusResponse) obj;
        return Objects.equals(this.permissionSetsProvisioningStatus, that.permissionSetsProvisioningStatus)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSetsProvisioningStatus, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPermissionSetProvisioningStatusResponse {\n");
        sb.append("    permissionSetsProvisioningStatus: ")
            .append(toIndentedString(permissionSetsProvisioningStatus))
            .append("\n");
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
