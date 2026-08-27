package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面版本信息。
 */
public class DesktopVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    public DesktopVersionInfo withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面id。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DesktopVersionInfo withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 桌面sid。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public DesktopVersionInfo withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名称。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public DesktopVersionInfo withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DesktopVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 桌面状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DesktopVersionInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 桌面执行任务状态。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopVersionInfo that = (DesktopVersionInfo) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.desktopName, that.desktopName) && Objects.equals(this.username, that.username)
            && Objects.equals(this.status, that.status) && Objects.equals(this.taskStatus, that.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, sid, desktopName, username, status, taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopVersionInfo {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
