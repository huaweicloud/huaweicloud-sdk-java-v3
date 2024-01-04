package com.huaweicloud.sdk.mrs.v2.model;

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
public class ShowSyncIamUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_names")

    private List<String> userNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_names")

    private List<String> groupNames = null;

    public ShowSyncIamUserResponse withUserNames(List<String> userNames) {
        this.userNames = userNames;
        return this;
    }

    public ShowSyncIamUserResponse addUserNamesItem(String userNamesItem) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        this.userNames.add(userNamesItem);
        return this;
    }

    public ShowSyncIamUserResponse withUserNames(Consumer<List<String>> userNamesSetter) {
        if (this.userNames == null) {
            this.userNames = new ArrayList<>();
        }
        userNamesSetter.accept(this.userNames);
        return this;
    }

    /**
     * 已经同步了的用户
     * @return userNames
     */
    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    public ShowSyncIamUserResponse withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    public ShowSyncIamUserResponse addGroupNamesItem(String groupNamesItem) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        this.groupNames.add(groupNamesItem);
        return this;
    }

    public ShowSyncIamUserResponse withGroupNames(Consumer<List<String>> groupNamesSetter) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        groupNamesSetter.accept(this.groupNames);
        return this;
    }

    /**
     * 已经同步了的用户组
     * @return groupNames
     */
    public List<String> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSyncIamUserResponse that = (ShowSyncIamUserResponse) obj;
        return Objects.equals(this.userNames, that.userNames) && Objects.equals(this.groupNames, that.groupNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNames, groupNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSyncIamUserResponse {\n");
        sb.append("    userNames: ").append(toIndentedString(userNames)).append("\n");
        sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
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
