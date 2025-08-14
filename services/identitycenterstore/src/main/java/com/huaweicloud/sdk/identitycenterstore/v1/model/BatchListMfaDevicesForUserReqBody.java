package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchListMfaDevicesForUserReqBody
 */
public class BatchListMfaDevicesForUserReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<RetrieveMfaDevicesForUserDto> userList = null;

    public BatchListMfaDevicesForUserReqBody withUserList(List<RetrieveMfaDevicesForUserDto> userList) {
        this.userList = userList;
        return this;
    }

    public BatchListMfaDevicesForUserReqBody addUserListItem(RetrieveMfaDevicesForUserDto userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public BatchListMfaDevicesForUserReqBody withUserList(Consumer<List<RetrieveMfaDevicesForUserDto>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * 用户列表
     * @return userList
     */
    public List<RetrieveMfaDevicesForUserDto> getUserList() {
        return userList;
    }

    public void setUserList(List<RetrieveMfaDevicesForUserDto> userList) {
        this.userList = userList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListMfaDevicesForUserReqBody that = (BatchListMfaDevicesForUserReqBody) obj;
        return Objects.equals(this.userList, that.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListMfaDevicesForUserReqBody {\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
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
