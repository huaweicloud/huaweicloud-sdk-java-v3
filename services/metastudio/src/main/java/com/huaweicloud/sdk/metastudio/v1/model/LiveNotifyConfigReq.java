package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 直播通知配置。通过短信，邮件，站内信通知用户直播中断。用户可在华为云消息中心配置接受者信息
 */
public class LiveNotifyConfigReq {

    /**
     * 确认操作。 * add: 增加。 * del: 删除。 * replace：替换。
     */
    public static final class ActionEnum {

        /**
         * Enum ADD for value: "add"
         */
        public static final ActionEnum ADD = new ActionEnum("add");

        /**
         * Enum DEL for value: "del"
         */
        public static final ActionEnum DEL = new ActionEnum("del");

        /**
         * Enum REPLACE for value: "replace"
         */
        public static final ActionEnum REPLACE = new ActionEnum("replace");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("add", ADD);
            map.put("del", DEL);
            map.put("replace", REPLACE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_events")

    private List<NotifyEventEnum> notifyEvents = null;

    public LiveNotifyConfigReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 确认操作。 * add: 增加。 * del: 删除。 * replace：替换。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public LiveNotifyConfigReq withNotifyEvents(List<NotifyEventEnum> notifyEvents) {
        this.notifyEvents = notifyEvents;
        return this;
    }

    public LiveNotifyConfigReq addNotifyEventsItem(NotifyEventEnum notifyEventsItem) {
        if (this.notifyEvents == null) {
            this.notifyEvents = new ArrayList<>();
        }
        this.notifyEvents.add(notifyEventsItem);
        return this;
    }

    public LiveNotifyConfigReq withNotifyEvents(Consumer<List<NotifyEventEnum>> notifyEventsSetter) {
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
        LiveNotifyConfigReq that = (LiveNotifyConfigReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.notifyEvents, that.notifyEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, notifyEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveNotifyConfigReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
