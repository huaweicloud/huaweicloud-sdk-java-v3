package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议用户统计数据的单个时间点数据。
 */
public class StatisticUserDataItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userLoginCount")

    private String userLoginCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userPCLoginCount")

    private String userPCLoginCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userMobileLoginCount")

    private String userMobileLoginCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userActivatedCount")

    private String userActivatedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userLoginDevicesName")

    private String userLoginDevicesName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userLoginDevicesCount")

    private String userLoginDevicesCount;

    public StatisticUserDataItem withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 日期/月份。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StatisticUserDataItem withUserLoginCount(String userLoginCount) {
        this.userLoginCount = userLoginCount;
        return this;
    }

    /**
     * 登录用户数。 category = user_login_info时有效。
     * @return userLoginCount
     */
    public String getUserLoginCount() {
        return userLoginCount;
    }

    public void setUserLoginCount(String userLoginCount) {
        this.userLoginCount = userLoginCount;
    }

    public StatisticUserDataItem withUserPCLoginCount(String userPCLoginCount) {
        this.userPCLoginCount = userPCLoginCount;
        return this;
    }

    /**
     * PC端登录用户数。 category = user_login_info时有效。
     * @return userPCLoginCount
     */
    public String getUserPCLoginCount() {
        return userPCLoginCount;
    }

    public void setUserPCLoginCount(String userPCLoginCount) {
        this.userPCLoginCount = userPCLoginCount;
    }

    public StatisticUserDataItem withUserMobileLoginCount(String userMobileLoginCount) {
        this.userMobileLoginCount = userMobileLoginCount;
        return this;
    }

    /**
     * 移动端登录用户数。 category = user_login_info时有效。
     * @return userMobileLoginCount
     */
    public String getUserMobileLoginCount() {
        return userMobileLoginCount;
    }

    public void setUserMobileLoginCount(String userMobileLoginCount) {
        this.userMobileLoginCount = userMobileLoginCount;
    }

    public StatisticUserDataItem withUserActivatedCount(String userActivatedCount) {
        this.userActivatedCount = userActivatedCount;
        return this;
    }

    /**
     * 激活用户数。 category = user_activate_info时有效。
     * @return userActivatedCount
     */
    public String getUserActivatedCount() {
        return userActivatedCount;
    }

    public void setUserActivatedCount(String userActivatedCount) {
        this.userActivatedCount = userActivatedCount;
    }

    public StatisticUserDataItem withUserLoginDevicesName(String userLoginDevicesName) {
        this.userLoginDevicesName = userLoginDevicesName;
        return this;
    }

    /**
     * 用户登录设备名称。 category = user_login_device_info时有效。
     * @return userLoginDevicesName
     */
    public String getUserLoginDevicesName() {
        return userLoginDevicesName;
    }

    public void setUserLoginDevicesName(String userLoginDevicesName) {
        this.userLoginDevicesName = userLoginDevicesName;
    }

    public StatisticUserDataItem withUserLoginDevicesCount(String userLoginDevicesCount) {
        this.userLoginDevicesCount = userLoginDevicesCount;
        return this;
    }

    /**
     * 用户登录设备数。 category = user_login_device_info时有效。
     * @return userLoginDevicesCount
     */
    public String getUserLoginDevicesCount() {
        return userLoginDevicesCount;
    }

    public void setUserLoginDevicesCount(String userLoginDevicesCount) {
        this.userLoginDevicesCount = userLoginDevicesCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticUserDataItem statisticUserDataItem = (StatisticUserDataItem) o;
        return Objects.equals(this.time, statisticUserDataItem.time)
            && Objects.equals(this.userLoginCount, statisticUserDataItem.userLoginCount)
            && Objects.equals(this.userPCLoginCount, statisticUserDataItem.userPCLoginCount)
            && Objects.equals(this.userMobileLoginCount, statisticUserDataItem.userMobileLoginCount)
            && Objects.equals(this.userActivatedCount, statisticUserDataItem.userActivatedCount)
            && Objects.equals(this.userLoginDevicesName, statisticUserDataItem.userLoginDevicesName)
            && Objects.equals(this.userLoginDevicesCount, statisticUserDataItem.userLoginDevicesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time,
            userLoginCount,
            userPCLoginCount,
            userMobileLoginCount,
            userActivatedCount,
            userLoginDevicesName,
            userLoginDevicesCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticUserDataItem {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    userLoginCount: ").append(toIndentedString(userLoginCount)).append("\n");
        sb.append("    userPCLoginCount: ").append(toIndentedString(userPCLoginCount)).append("\n");
        sb.append("    userMobileLoginCount: ").append(toIndentedString(userMobileLoginCount)).append("\n");
        sb.append("    userActivatedCount: ").append(toIndentedString(userActivatedCount)).append("\n");
        sb.append("    userLoginDevicesName: ").append(toIndentedString(userLoginDevicesName)).append("\n");
        sb.append("    userLoginDevicesCount: ").append(toIndentedString(userLoginDevicesCount)).append("\n");
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
