package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateAlarmActionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_enabled")

    private String actionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<SMNAction> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<SMNAction> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_begin_time")

    private String actionBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_end_time")

    private String actionEndTime;

    public UpdateAlarmActionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 告警名称, 只能包含0-9/a-z/A-Z/_/-或汉字，长度1-128
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAlarmActionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 告警描述，长度0-256
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAlarmActionResponse withActionEnabled(String actionEnabled) {
        this.actionEnabled = actionEnabled;
        return this;
    }

    /** 是否开启告警通知
     * 
     * @return actionEnabled */
    public String getActionEnabled() {
        return actionEnabled;
    }

    public void setActionEnabled(String actionEnabled) {
        this.actionEnabled = actionEnabled;
    }

    public UpdateAlarmActionResponse withAlarmActions(List<SMNAction> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public UpdateAlarmActionResponse addAlarmActionsItem(SMNAction alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public UpdateAlarmActionResponse withAlarmActions(Consumer<List<SMNAction>> alarmActionsSetter) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /** 告警触发的动作
     * 
     * @return alarmActions */
    public List<SMNAction> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<SMNAction> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public UpdateAlarmActionResponse withOkActions(List<SMNAction> okActions) {
        this.okActions = okActions;
        return this;
    }

    public UpdateAlarmActionResponse addOkActionsItem(SMNAction okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public UpdateAlarmActionResponse withOkActions(Consumer<List<SMNAction>> okActionsSetter) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /** 告警恢复触发的动作
     * 
     * @return okActions */
    public List<SMNAction> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<SMNAction> okActions) {
        this.okActions = okActions;
    }

    public UpdateAlarmActionResponse withActionBeginTime(String actionBeginTime) {
        this.actionBeginTime = actionBeginTime;
        return this;
    }

    /** 告警通知开启时间
     * 
     * @return actionBeginTime */
    public String getActionBeginTime() {
        return actionBeginTime;
    }

    public void setActionBeginTime(String actionBeginTime) {
        this.actionBeginTime = actionBeginTime;
    }

    public UpdateAlarmActionResponse withActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
        return this;
    }

    /** 告警通知关闭时间
     * 
     * @return actionEndTime */
    public String getActionEndTime() {
        return actionEndTime;
    }

    public void setActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAlarmActionResponse updateAlarmActionResponse = (UpdateAlarmActionResponse) o;
        return Objects.equals(this.name, updateAlarmActionResponse.name)
            && Objects.equals(this.description, updateAlarmActionResponse.description)
            && Objects.equals(this.actionEnabled, updateAlarmActionResponse.actionEnabled)
            && Objects.equals(this.alarmActions, updateAlarmActionResponse.alarmActions)
            && Objects.equals(this.okActions, updateAlarmActionResponse.okActions)
            && Objects.equals(this.actionBeginTime, updateAlarmActionResponse.actionBeginTime)
            && Objects.equals(this.actionEndTime, updateAlarmActionResponse.actionEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, actionEnabled, alarmActions, okActions, actionBeginTime, actionEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmActionResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    actionEnabled: ").append(toIndentedString(actionEnabled)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    actionBeginTime: ").append(toIndentedString(actionBeginTime)).append("\n");
        sb.append("    actionEndTime: ").append(toIndentedString(actionEndTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
