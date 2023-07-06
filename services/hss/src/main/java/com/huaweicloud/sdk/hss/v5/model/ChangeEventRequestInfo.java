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

    public ChangeEventRequestInfo withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 处理方式，包含如下:   - mark_as_handled : 手动处理   - ignore : 忽略   - add_to_alarm_whitelist : 加入告警白名单   - add_to_login_whitelist : 加入登录白名单   - isolate_and_kill : 隔离查杀   - unhandle : 取消手动处理   - do_not_ignore : 取消忽略   - remove_from_alarm_whitelist : 删除告警白名单   - remove_from_login_whitelist : 删除登录白名单   - do_not_isolate_or_kill : 取消隔离查杀
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
     * 备注信息
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
            && Objects.equals(this.operateEventList, that.operateEventList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType, handler, operateEventList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeEventRequestInfo {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    operateEventList: ").append(toIndentedString(operateEventList)).append("\n");
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
