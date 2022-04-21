package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议与会统计数据的单个时间点数据。
 */
public class StatisticParticipateDataItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUserName")

    private String confUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUserAccount")

    private String confUserAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUserDeptName")

    private String confUserDeptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUserCount")

    private String confUserCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUserDuration")

    private String confUserDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confHardTerminalName")

    private String confHardTerminalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confHardTerminalModel")

    private String confHardTerminalModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confHardTerminalUserId")

    private String confHardTerminalUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confHardTerminalCount")

    private String confHardTerminalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confHardTerminalDuration")

    private String confHardTerminalDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deviceType")

    private String deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deviceVersion")

    private String deviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deviceAttendanceCount")

    private String deviceAttendanceCount;

    public StatisticParticipateDataItem withTime(String time) {
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

    public StatisticParticipateDataItem withConfUserName(String confUserName) {
        this.confUserName = confUserName;
        return this;
    }

    /**
     * 与会用户名称。 category = user_participate_info时有效。
     * @return confUserName
     */
    public String getConfUserName() {
        return confUserName;
    }

    public void setConfUserName(String confUserName) {
        this.confUserName = confUserName;
    }

    public StatisticParticipateDataItem withConfUserAccount(String confUserAccount) {
        this.confUserAccount = confUserAccount;
        return this;
    }

    /**
     * 与会用户账户。 category = user_participate_info时有效。
     * @return confUserAccount
     */
    public String getConfUserAccount() {
        return confUserAccount;
    }

    public void setConfUserAccount(String confUserAccount) {
        this.confUserAccount = confUserAccount;
    }

    public StatisticParticipateDataItem withConfUserDeptName(String confUserDeptName) {
        this.confUserDeptName = confUserDeptName;
        return this;
    }

    /**
     * 与会用户所属部门。 category = user_participate_info时有效。
     * @return confUserDeptName
     */
    public String getConfUserDeptName() {
        return confUserDeptName;
    }

    public void setConfUserDeptName(String confUserDeptName) {
        this.confUserDeptName = confUserDeptName;
    }

    public StatisticParticipateDataItem withConfUserCount(String confUserCount) {
        this.confUserCount = confUserCount;
        return this;
    }

    /**
     * 用户与会数。 category = user_participate_info时有效。
     * @return confUserCount
     */
    public String getConfUserCount() {
        return confUserCount;
    }

    public void setConfUserCount(String confUserCount) {
        this.confUserCount = confUserCount;
    }

    public StatisticParticipateDataItem withConfUserDuration(String confUserDuration) {
        this.confUserDuration = confUserDuration;
        return this;
    }

    /**
     * 用户与会时长(秒)。 category = user_participate_info时有效。
     * @return confUserDuration
     */
    public String getConfUserDuration() {
        return confUserDuration;
    }

    public void setConfUserDuration(String confUserDuration) {
        this.confUserDuration = confUserDuration;
    }

    public StatisticParticipateDataItem withConfHardTerminalName(String confHardTerminalName) {
        this.confHardTerminalName = confHardTerminalName;
        return this;
    }

    /**
     * 与会硬件终端名称。 category = hard_terminal_participate_info时有效。
     * @return confHardTerminalName
     */
    public String getConfHardTerminalName() {
        return confHardTerminalName;
    }

    public void setConfHardTerminalName(String confHardTerminalName) {
        this.confHardTerminalName = confHardTerminalName;
    }

    public StatisticParticipateDataItem withConfHardTerminalModel(String confHardTerminalModel) {
        this.confHardTerminalModel = confHardTerminalModel;
        return this;
    }

    /**
     * 与会硬件终端型号。 category = hard_terminal_participate_info时有效。
     * @return confHardTerminalModel
     */
    public String getConfHardTerminalModel() {
        return confHardTerminalModel;
    }

    public void setConfHardTerminalModel(String confHardTerminalModel) {
        this.confHardTerminalModel = confHardTerminalModel;
    }

    public StatisticParticipateDataItem withConfHardTerminalUserId(String confHardTerminalUserId) {
        this.confHardTerminalUserId = confHardTerminalUserId;
        return this;
    }

    /**
     * 与会硬件终端的用户ID。 category = hard_terminal_participate_info时有效。
     * @return confHardTerminalUserId
     */
    public String getConfHardTerminalUserId() {
        return confHardTerminalUserId;
    }

    public void setConfHardTerminalUserId(String confHardTerminalUserId) {
        this.confHardTerminalUserId = confHardTerminalUserId;
    }

    public StatisticParticipateDataItem withConfHardTerminalCount(String confHardTerminalCount) {
        this.confHardTerminalCount = confHardTerminalCount;
        return this;
    }

    /**
     * 硬件终端与会数。 category = hard_terminal_participate_info时有效。
     * @return confHardTerminalCount
     */
    public String getConfHardTerminalCount() {
        return confHardTerminalCount;
    }

    public void setConfHardTerminalCount(String confHardTerminalCount) {
        this.confHardTerminalCount = confHardTerminalCount;
    }

    public StatisticParticipateDataItem withConfHardTerminalDuration(String confHardTerminalDuration) {
        this.confHardTerminalDuration = confHardTerminalDuration;
        return this;
    }

    /**
     * 硬件终端与会时长(秒)。 category = hard_terminal_participate_info时有效。
     * @return confHardTerminalDuration
     */
    public String getConfHardTerminalDuration() {
        return confHardTerminalDuration;
    }

    public void setConfHardTerminalDuration(String confHardTerminalDuration) {
        this.confHardTerminalDuration = confHardTerminalDuration;
    }

    public StatisticParticipateDataItem withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 与会设备类型。 category = participant_type_info时有效。
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public StatisticParticipateDataItem withDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
        return this;
    }

    /**
     * 与会设备版本。 category = participant_type_info时有效。
     * @return deviceVersion
     */
    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public StatisticParticipateDataItem withDeviceAttendanceCount(String deviceAttendanceCount) {
        this.deviceAttendanceCount = deviceAttendanceCount;
        return this;
    }

    /**
     * 设备与会数。 category = participant_type_info时有效。
     * @return deviceAttendanceCount
     */
    public String getDeviceAttendanceCount() {
        return deviceAttendanceCount;
    }

    public void setDeviceAttendanceCount(String deviceAttendanceCount) {
        this.deviceAttendanceCount = deviceAttendanceCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticParticipateDataItem statisticParticipateDataItem = (StatisticParticipateDataItem) o;
        return Objects.equals(this.time, statisticParticipateDataItem.time)
            && Objects.equals(this.confUserName, statisticParticipateDataItem.confUserName)
            && Objects.equals(this.confUserAccount, statisticParticipateDataItem.confUserAccount)
            && Objects.equals(this.confUserDeptName, statisticParticipateDataItem.confUserDeptName)
            && Objects.equals(this.confUserCount, statisticParticipateDataItem.confUserCount)
            && Objects.equals(this.confUserDuration, statisticParticipateDataItem.confUserDuration)
            && Objects.equals(this.confHardTerminalName, statisticParticipateDataItem.confHardTerminalName)
            && Objects.equals(this.confHardTerminalModel, statisticParticipateDataItem.confHardTerminalModel)
            && Objects.equals(this.confHardTerminalUserId, statisticParticipateDataItem.confHardTerminalUserId)
            && Objects.equals(this.confHardTerminalCount, statisticParticipateDataItem.confHardTerminalCount)
            && Objects.equals(this.confHardTerminalDuration, statisticParticipateDataItem.confHardTerminalDuration)
            && Objects.equals(this.deviceType, statisticParticipateDataItem.deviceType)
            && Objects.equals(this.deviceVersion, statisticParticipateDataItem.deviceVersion)
            && Objects.equals(this.deviceAttendanceCount, statisticParticipateDataItem.deviceAttendanceCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time,
            confUserName,
            confUserAccount,
            confUserDeptName,
            confUserCount,
            confUserDuration,
            confHardTerminalName,
            confHardTerminalModel,
            confHardTerminalUserId,
            confHardTerminalCount,
            confHardTerminalDuration,
            deviceType,
            deviceVersion,
            deviceAttendanceCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticParticipateDataItem {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    confUserName: ").append(toIndentedString(confUserName)).append("\n");
        sb.append("    confUserAccount: ").append(toIndentedString(confUserAccount)).append("\n");
        sb.append("    confUserDeptName: ").append(toIndentedString(confUserDeptName)).append("\n");
        sb.append("    confUserCount: ").append(toIndentedString(confUserCount)).append("\n");
        sb.append("    confUserDuration: ").append(toIndentedString(confUserDuration)).append("\n");
        sb.append("    confHardTerminalName: ").append(toIndentedString(confHardTerminalName)).append("\n");
        sb.append("    confHardTerminalModel: ").append(toIndentedString(confHardTerminalModel)).append("\n");
        sb.append("    confHardTerminalUserId: ").append(toIndentedString(confHardTerminalUserId)).append("\n");
        sb.append("    confHardTerminalCount: ").append(toIndentedString(confHardTerminalCount)).append("\n");
        sb.append("    confHardTerminalDuration: ").append(toIndentedString(confHardTerminalDuration)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    deviceVersion: ").append(toIndentedString(deviceVersion)).append("\n");
        sb.append("    deviceAttendanceCount: ").append(toIndentedString(deviceAttendanceCount)).append("\n");
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
