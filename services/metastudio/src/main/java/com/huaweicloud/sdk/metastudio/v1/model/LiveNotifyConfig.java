package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 直播通知配置。通过短信，邮件，站内信通知用户直播中断。用户可在华为云消息中心配置接受者信息
 */
public class LiveNotifyConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_events")

    private List<NotifyEventEnum> notifyEvents = null;

    public LiveNotifyConfig withNotifyEvents(List<NotifyEventEnum> notifyEvents) {
        this.notifyEvents = notifyEvents;
        return this;
    }

    public LiveNotifyConfig addNotifyEventsItem(NotifyEventEnum notifyEventsItem) {
        if (this.notifyEvents == null) {
            this.notifyEvents = new ArrayList<>();
        }
        this.notifyEvents.add(notifyEventsItem);
        return this;
    }

    public LiveNotifyConfig withNotifyEvents(Consumer<List<NotifyEventEnum>> notifyEventsSetter) {
        if (this.notifyEvents == null) {
            this.notifyEvents = new ArrayList<>();
        }
        notifyEventsSetter.accept(this.notifyEvents);
        return this;
    }

    /**
     * **参数解释**： 启用通知事件列表。 **约束限制**： 不涉及 **默认取值**： 无。
     * @return notifyEvents
     */
    public List<NotifyEventEnum> getNotifyEvents() {
        return notifyEvents;
    }

    public void setNotifyEvents(List<NotifyEventEnum> notifyEvents) {
        this.notifyEvents = notifyEvents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveNotifyConfig that = (LiveNotifyConfig) obj;
        return Objects.equals(this.notifyEvents, that.notifyEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifyEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveNotifyConfig {\n");
        sb.append("    notifyEvents: ").append(toIndentedString(notifyEvents)).append("\n");
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
