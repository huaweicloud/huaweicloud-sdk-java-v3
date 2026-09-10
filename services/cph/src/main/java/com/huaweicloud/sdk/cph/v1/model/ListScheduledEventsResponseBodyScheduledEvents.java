package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListScheduledEventsResponseBodyScheduledEvents
 */
public class ListScheduledEventsResponseBodyScheduledEvents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_state")

    private Integer serverState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private String authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private String notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before_deadline")

    private String notBeforeDeadline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ListScheduledEventsResponseBodyScheduledEvents withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 计划事件唯一标识，不超过36个字节
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器的唯一标识，不超过32个字节。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 云手机服务器名称， 不超过65字符，只支持英文字母、数字、汉字、下划线和中划线。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
        return this;
    }

    /**
     * 云手机服务器规格名称，不超过64个字节。
     * @return serverModelName
     */
    public String getServerModelName() {
        return serverModelName;
    }

    public void setServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withServerState(Integer serverState) {
        this.serverState = serverState;
        return this;
    }

    /**
     * 服务器状态。 - 0、1、3、4：创建中 - 2：异常 - 5：正常 - 8：冻结 - 10：关机 - 11：关机中 - 12：关机失败 - 13：开机中
     * @return serverState
     */
    public Integer getServerState() {
        return serverState;
    }

    public void setServerState(Integer serverState) {
        this.serverState = serverState;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 计划事件类型，取值范围： localdisk-recovery：本地盘换盘、 system-maintenance：系统维护
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * 授权类型，取值范围：maintenance：授权维修、redeploy：授权重部署
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 计划事件状态， 取值范围： inquiring: 待授权、 scheduled：待执行、 executing：执行中、 completed：执行成功、 failed：执行失败、 canceled：取消
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * 事件发布时间
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 事件开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 事件完成时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 计划执行开始时间
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 计划执行完成时间
     * @return notAfter
     */
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withNotBeforeDeadline(String notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
        return this;
    }

    /**
     * 计划执行开始时间deadline
     * @return notBeforeDeadline
     */
    public String getNotBeforeDeadline() {
        return notBeforeDeadline;
    }

    public void setNotBeforeDeadline(String notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
    }

    public ListScheduledEventsResponseBodyScheduledEvents withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 计划事件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledEventsResponseBodyScheduledEvents that = (ListScheduledEventsResponseBodyScheduledEvents) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.serverModelName, that.serverModelName)
            && Objects.equals(this.serverState, that.serverState) && Objects.equals(this.type, that.type)
            && Objects.equals(this.authorizationType, that.authorizationType) && Objects.equals(this.state, that.state)
            && Objects.equals(this.publishTime, that.publishTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.notBefore, that.notBefore)
            && Objects.equals(this.notAfter, that.notAfter)
            && Objects.equals(this.notBeforeDeadline, that.notBeforeDeadline)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId,
            serverId,
            serverName,
            serverModelName,
            serverState,
            type,
            authorizationType,
            state,
            publishTime,
            startTime,
            finishTime,
            notBefore,
            notAfter,
            notBeforeDeadline,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledEventsResponseBodyScheduledEvents {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    serverState: ").append(toIndentedString(serverState)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    notBeforeDeadline: ").append(toIndentedString(notBeforeDeadline)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
