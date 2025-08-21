package com.huaweicloud.sdk.codehub.v4.model;

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
public class ShowProjectMemberSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_enabled")

    private Boolean syncEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_all_role_enabled")

    private Boolean syncAllRoleEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_sync")

    private List<RoleSyncDto> roleSync = null;

    public ShowProjectMemberSettingResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释：** 项目id **取值范围：** 字符串长度不少于1，不超过1000。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowProjectMemberSettingResponse withSyncEnabled(Boolean syncEnabled) {
        this.syncEnabled = syncEnabled;
        return this;
    }

    /**
     * **参数解释：** 同步开关
     * @return syncEnabled
     */
    public Boolean getSyncEnabled() {
        return syncEnabled;
    }

    public void setSyncEnabled(Boolean syncEnabled) {
        this.syncEnabled = syncEnabled;
    }

    public ShowProjectMemberSettingResponse withSyncAllRoleEnabled(Boolean syncAllRoleEnabled) {
        this.syncAllRoleEnabled = syncAllRoleEnabled;
        return this;
    }

    /**
     * **参数解释：** 同步所有角色开关
     * @return syncAllRoleEnabled
     */
    public Boolean getSyncAllRoleEnabled() {
        return syncAllRoleEnabled;
    }

    public void setSyncAllRoleEnabled(Boolean syncAllRoleEnabled) {
        this.syncAllRoleEnabled = syncAllRoleEnabled;
    }

    public ShowProjectMemberSettingResponse withRoleSync(List<RoleSyncDto> roleSync) {
        this.roleSync = roleSync;
        return this;
    }

    public ShowProjectMemberSettingResponse addRoleSyncItem(RoleSyncDto roleSyncItem) {
        if (this.roleSync == null) {
            this.roleSync = new ArrayList<>();
        }
        this.roleSync.add(roleSyncItem);
        return this;
    }

    public ShowProjectMemberSettingResponse withRoleSync(Consumer<List<RoleSyncDto>> roleSyncSetter) {
        if (this.roleSync == null) {
            this.roleSync = new ArrayList<>();
        }
        roleSyncSetter.accept(this.roleSync);
        return this;
    }

    /**
     * **参数解释：** 角色同步
     * @return roleSync
     */
    public List<RoleSyncDto> getRoleSync() {
        return roleSync;
    }

    public void setRoleSync(List<RoleSyncDto> roleSync) {
        this.roleSync = roleSync;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectMemberSettingResponse that = (ShowProjectMemberSettingResponse) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.syncEnabled, that.syncEnabled)
            && Objects.equals(this.syncAllRoleEnabled, that.syncAllRoleEnabled)
            && Objects.equals(this.roleSync, that.roleSync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, syncEnabled, syncAllRoleEnabled, roleSync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectMemberSettingResponse {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    syncEnabled: ").append(toIndentedString(syncEnabled)).append("\n");
        sb.append("    syncAllRoleEnabled: ").append(toIndentedString(syncAllRoleEnabled)).append("\n");
        sb.append("    roleSync: ").append(toIndentedString(roleSync)).append("\n");
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
