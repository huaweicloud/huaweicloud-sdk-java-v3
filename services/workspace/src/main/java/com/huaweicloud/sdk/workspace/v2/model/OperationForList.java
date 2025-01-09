package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OperationForList
 */
public class OperationForList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screen_record_id")

    private String screenRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_level")

    private String eventLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_data")

    private String eventData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time")

    private String operationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_start_time")

    private Integer relativeStartTime;

    public OperationForList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OperationForList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public OperationForList withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public OperationForList withScreenRecordId(String screenRecordId) {
        this.screenRecordId = screenRecordId;
        return this;
    }

    /**
     * 录屏记录ID。
     * @return screenRecordId
     */
    public String getScreenRecordId() {
        return screenRecordId;
    }

    public void setScreenRecordId(String screenRecordId) {
        this.screenRecordId = screenRecordId;
    }

    public OperationForList withUsername(String username) {
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

    public OperationForList withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型。 - APP：应用监控。 - FILE：文件监控。 - REG：注册表监控。 - HDP：协议行为监控。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public OperationForList withEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * 事件级别。 - INFO：提示。 - ALARM：告警。 - ERROR：异常。
     * @return eventLevel
     */
    public String getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
    }

    public OperationForList withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件ID。 - APP_START：应用程序启动 - APP_STOP：应用程序结束 - APP_CRASH：应用程序异常退出 - APP_HANG：应用程序无响应 - APP_INSTALL：应用安装 - APP_UNINSTALL：应用卸裁 - FILE_CREATE：文件创建 - FILE_DELETE：文件删除 - FILE_RENAME：文件改名 - REG_CREATE：注册表创建 - REG_CHANGE：注册表修改 - REG_DELETE：注册表删除 - REG_RENAME：注册表改名 - REG_SETVALUE：注册表设置值 - HDP_USB：USB重定向事件 - HDP_CLIPBOARD：剪切板操作 - HDP_INPUTIDLE：空闲无操作 - HDP_PRINT：文件打印
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public OperationForList withEventData(String eventData) {
        this.eventData = eventData;
        return this;
    }

    /**
     * 事件内容。
     * @return eventData
     */
    public String getEventData() {
        return eventData;
    }

    public void setEventData(String eventData) {
        this.eventData = eventData;
    }

    public OperationForList withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    /**
     * 操作时间（2024-10-15T11:04:41.263Z）。
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public OperationForList withRelativeStartTime(Integer relativeStartTime) {
        this.relativeStartTime = relativeStartTime;
        return this;
    }

    /**
     * 相对于视频开始的时间（秒）。
     * minimum: 0
     * maximum: 2147483647
     * @return relativeStartTime
     */
    public Integer getRelativeStartTime() {
        return relativeStartTime;
    }

    public void setRelativeStartTime(Integer relativeStartTime) {
        this.relativeStartTime = relativeStartTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationForList that = (OperationForList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.screenRecordId, that.screenRecordId) && Objects.equals(this.username, that.username)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.eventLevel, that.eventLevel)
            && Objects.equals(this.eventId, that.eventId) && Objects.equals(this.eventData, that.eventData)
            && Objects.equals(this.operationTime, that.operationTime)
            && Objects.equals(this.relativeStartTime, that.relativeStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            desktopId,
            screenRecordId,
            username,
            eventType,
            eventLevel,
            eventId,
            eventData,
            operationTime,
            relativeStartTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationForList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    screenRecordId: ").append(toIndentedString(screenRecordId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
        sb.append("    relativeStartTime: ").append(toIndentedString(relativeStartTime)).append("\n");
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
