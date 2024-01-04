package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IAM同步请求的指定参数
 */
public class UpdateSyncRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_sync")

    private Boolean isAllSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_names")

    private List<String> groupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_names")

    private List<String> userNames = null;

    public UpdateSyncRequest withIsAllSync(Boolean isAllSync) {
        this.isAllSync = isAllSync;
        return this;
    }

    /**
     * 是否是全量同步。true为全量同步，false为指定用户、用户组同步。默认值为false。
     * @return isAllSync
     */
    public Boolean getIsAllSync() {
        return isAllSync;
    }

    public void setIsAllSync(Boolean isAllSync) {
        this.isAllSync = isAllSync;
    }

    public UpdateSyncRequest withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    public UpdateSyncRequest addGroupNamesItem(String groupNamesItem) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        this.groupNames.add(groupNamesItem);
        return this;
    }

    public UpdateSyncRequest withGroupNames(Consumer<List<String>> groupNamesSetter) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        groupNamesSetter.accept(this.groupNames);
        return this;
    }

    /**
     * 指定同步的IAM用户组。
     * @return groupNames
     */
    public List<String> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }

    public UpdateSyncRequest withUserNames(List<String> userNames) {
        this.userNames = userNames;
        return this;
    }

    public UpdateSyncRequest addUserNamesItem(String userNamesItem) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        this.userNames.add(userNamesItem);
        return this;
    }

    public UpdateSyncRequest withUserNames(Consumer<List<String>> userNamesSetter) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        userNamesSetter.accept(this.userNames);
        return this;
    }

    /**
     * 指定同步的IAM用户。
     * @return userNames
     */
    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSyncRequest that = (UpdateSyncRequest) obj;
        return Objects.equals(this.isAllSync, that.isAllSync) && Objects.equals(this.groupNames, that.groupNames)
            && Objects.equals(this.userNames, that.userNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllSync, groupNames, userNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSyncRequest {\n");
        sb.append("    isAllSync: ").append(toIndentedString(isAllSync)).append("\n");
        sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
        sb.append("    userNames: ").append(toIndentedString(userNames)).append("\n");
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
