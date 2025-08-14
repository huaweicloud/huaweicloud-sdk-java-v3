package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作事件详情
 */
public class ChangeEventRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handler")

    private String handler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_event_list")

    private List<OperateEventRequestInfo> operateEventList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_white_rule_list")

    private List<EventWhiteRuleListRequestInfo> eventWhiteRuleList = null;

    public ChangeEventRequestInfo withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * **参数解释**： 处理方式 **取值范围**： - mark_as_handled：手动处理 - ignore：忽略 - add_to_alarm_whitelist：加入告警白名单 - add_to_login_whitelist：加入登录白名单 - isolate_and_kill：隔离查杀 - unhandle：取消手动处理 - do_not_ignore：取消忽略 - remove_from_alarm_whitelist：删除告警白名单 - remove_from_login_whitelist：删除登录白名单 - do_not_isolate_or_kill：取消隔离查杀 
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ChangeEventRequestInfo withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * **参数解释**： 备注信息，已处理的告警才有 **取值范围**： 字符长度1-256位 
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public ChangeEventRequestInfo withOperateEventList(List<OperateEventRequestInfo> operateEventList) {
        this.operateEventList = operateEventList;
        return this;
    }

    public ChangeEventRequestInfo addOperateEventListItem(OperateEventRequestInfo operateEventListItem) {
        if (this.operateEventList == null) {
            this.operateEventList = new ArrayList<>();
        }
        this.operateEventList.add(operateEventListItem);
        return this;
    }

    public ChangeEventRequestInfo withOperateEventList(Consumer<List<OperateEventRequestInfo>> operateEventListSetter) {
        if (this.operateEventList == null) {
            this.operateEventList = new ArrayList<>();
        }
        operateEventListSetter.accept(this.operateEventList);
        return this;
    }

    /**
     * 操作的事件列表
     * @return operateEventList
     */
    public List<OperateEventRequestInfo> getOperateEventList() {
        return operateEventList;
    }

    public void setOperateEventList(List<OperateEventRequestInfo> operateEventList) {
        this.operateEventList = operateEventList;
    }

    public ChangeEventRequestInfo withEventWhiteRuleList(List<EventWhiteRuleListRequestInfo> eventWhiteRuleList) {
        this.eventWhiteRuleList = eventWhiteRuleList;
        return this;
    }

    public ChangeEventRequestInfo addEventWhiteRuleListItem(EventWhiteRuleListRequestInfo eventWhiteRuleListItem) {
        if (this.eventWhiteRuleList == null) {
            this.eventWhiteRuleList = new ArrayList<>();
        }
        this.eventWhiteRuleList.add(eventWhiteRuleListItem);
        return this;
    }

    public ChangeEventRequestInfo withEventWhiteRuleList(
        Consumer<List<EventWhiteRuleListRequestInfo>> eventWhiteRuleListSetter) {
        if (this.eventWhiteRuleList == null) {
            this.eventWhiteRuleList = new ArrayList<>();
        }
        eventWhiteRuleListSetter.accept(this.eventWhiteRuleList);
        return this;
    }

    /**
     * 用户自定义告警白名单规则列表
     * @return eventWhiteRuleList
     */
    public List<EventWhiteRuleListRequestInfo> getEventWhiteRuleList() {
        return eventWhiteRuleList;
    }

    public void setEventWhiteRuleList(List<EventWhiteRuleListRequestInfo> eventWhiteRuleList) {
        this.eventWhiteRuleList = eventWhiteRuleList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeEventRequestInfo that = (ChangeEventRequestInfo) obj;
        return Objects.equals(this.operateType, that.operateType) && Objects.equals(this.handler, that.handler)
            && Objects.equals(this.operateEventList, that.operateEventList)
            && Objects.equals(this.eventWhiteRuleList, that.eventWhiteRuleList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType, handler, operateEventList, eventWhiteRuleList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeEventRequestInfo {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    operateEventList: ").append(toIndentedString(operateEventList)).append("\n");
        sb.append("    eventWhiteRuleList: ").append(toIndentedString(eventWhiteRuleList)).append("\n");
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
