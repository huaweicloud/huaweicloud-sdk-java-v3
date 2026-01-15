package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 通知拦截记录信息详情
 */
public class NotificationRecordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_name")

    private String desktopPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private String operateTime;

    public NotificationRecordInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NotificationRecordInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 发送SMN类型:EMAIL-邮件、SMS-短信
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NotificationRecordInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public NotificationRecordInfo withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public NotificationRecordInfo withDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
        return this;
    }

    /**
     * 桌面池名称
     * @return desktopPoolName
     */
    public String getDesktopPoolName() {
        return desktopPoolName;
    }

    public void setDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
    }

    public NotificationRecordInfo withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 发送结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public NotificationRecordInfo withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 报错信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public NotificationRecordInfo withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * 操作时间
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationRecordInfo that = (NotificationRecordInfo) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.desktopPoolName, that.desktopPoolName) && Objects.equals(this.result, that.result)
            && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.operateTime, that.operateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, type, userName, desktopName, desktopPoolName, result, errorMessage, operateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationRecordInfo {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    desktopPoolName: ").append(toIndentedString(desktopPoolName)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
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
