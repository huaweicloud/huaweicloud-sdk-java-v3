package com.huaweicloud.sdk.dws.v2.model;

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
public class SyncIamUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_user")

    private List<String> syncUser = null;

    public SyncIamUsersResponse withSyncUser(List<String> syncUser) {
        this.syncUser = syncUser;
        return this;
    }

    public SyncIamUsersResponse addSyncUserItem(String syncUserItem) {
        if (this.syncUser == null) {
            this.syncUser = new ArrayList<>();
        }
        this.syncUser.add(syncUserItem);
        return this;
    }

    public SyncIamUsersResponse withSyncUser(Consumer<List<String>> syncUserSetter) {
        if (this.syncUser == null) {
            this.syncUser = new ArrayList<>();
        }
        syncUserSetter.accept(this.syncUser);
        return this;
    }

    /**
     * **参数解释**： 创建成功用户列表。 **取值范围**： 不涉及。
     * @return syncUser
     */
    public List<String> getSyncUser() {
        return syncUser;
    }

    public void setSyncUser(List<String> syncUser) {
        this.syncUser = syncUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncIamUsersResponse that = (SyncIamUsersResponse) obj;
        return Objects.equals(this.syncUser, that.syncUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncIamUsersResponse {\n");
        sb.append("    syncUser: ").append(toIndentedString(syncUser)).append("\n");
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
