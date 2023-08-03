package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RTC Animation加入房间信息。
 */
public class RTCRoomInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<RTCUserInfo> users = null;

    public RTCRoomInfoList withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * RTC应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public RTCRoomInfoList withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * RTC房间ID。
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public RTCRoomInfoList withUsers(List<RTCUserInfo> users) {
        this.users = users;
        return this;
    }

    public RTCRoomInfoList addUsersItem(RTCUserInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public RTCRoomInfoList withUsers(Consumer<List<RTCUserInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 接入RTC的用户信息。
     * @return users
     */
    public List<RTCUserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<RTCUserInfo> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RTCRoomInfoList that = (RTCRoomInfoList) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.roomId, that.roomId)
            && Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, roomId, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RTCRoomInfoList {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
