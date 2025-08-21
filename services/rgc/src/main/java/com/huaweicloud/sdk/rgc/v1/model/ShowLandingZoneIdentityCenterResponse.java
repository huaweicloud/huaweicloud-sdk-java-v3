package com.huaweicloud.sdk.rgc.v1.model;

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
public class ShowLandingZoneIdentityCenterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_portal_url")

    private String userPortalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_sets")

    private List<PermissionSet> permissionSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<IdentityCenterGroup> groups = null;

    public ShowLandingZoneIdentityCenterResponse withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * Identity Center目录ID。
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    public ShowLandingZoneIdentityCenterResponse withUserPortalUrl(String userPortalUrl) {
        this.userPortalUrl = userPortalUrl;
        return this;
    }

    /**
     * Identity Center登录URL。
     * @return userPortalUrl
     */
    public String getUserPortalUrl() {
        return userPortalUrl;
    }

    public void setUserPortalUrl(String userPortalUrl) {
        this.userPortalUrl = userPortalUrl;
    }

    public ShowLandingZoneIdentityCenterResponse withPermissionSets(List<PermissionSet> permissionSets) {
        this.permissionSets = permissionSets;
        return this;
    }

    public ShowLandingZoneIdentityCenterResponse addPermissionSetsItem(PermissionSet permissionSetsItem) {
        if (this.permissionSets == null) {
            this.permissionSets = new ArrayList<>();
        }
        this.permissionSets.add(permissionSetsItem);
        return this;
    }

    public ShowLandingZoneIdentityCenterResponse withPermissionSets(
        Consumer<List<PermissionSet>> permissionSetsSetter) {
        if (this.permissionSets == null) {
            this.permissionSets = new ArrayList<>();
        }
        permissionSetsSetter.accept(this.permissionSets);
        return this;
    }

    /**
     * Identity Center权限集。
     * @return permissionSets
     */
    public List<PermissionSet> getPermissionSets() {
        return permissionSets;
    }

    public void setPermissionSets(List<PermissionSet> permissionSets) {
        this.permissionSets = permissionSets;
    }

    public ShowLandingZoneIdentityCenterResponse withGroups(List<IdentityCenterGroup> groups) {
        this.groups = groups;
        return this;
    }

    public ShowLandingZoneIdentityCenterResponse addGroupsItem(IdentityCenterGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ShowLandingZoneIdentityCenterResponse withGroups(Consumer<List<IdentityCenterGroup>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * Identity Center用户组。
     * @return groups
     */
    public List<IdentityCenterGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<IdentityCenterGroup> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLandingZoneIdentityCenterResponse that = (ShowLandingZoneIdentityCenterResponse) obj;
        return Objects.equals(this.identityStoreId, that.identityStoreId)
            && Objects.equals(this.userPortalUrl, that.userPortalUrl)
            && Objects.equals(this.permissionSets, that.permissionSets) && Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityStoreId, userPortalUrl, permissionSets, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLandingZoneIdentityCenterResponse {\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
        sb.append("    userPortalUrl: ").append(toIndentedString(userPortalUrl)).append("\n");
        sb.append("    permissionSets: ").append(toIndentedString(permissionSets)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
