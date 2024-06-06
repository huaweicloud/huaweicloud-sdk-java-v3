package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateNoticeRuleItem
 */
public class CreateNoticeRuleItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 触发事件名称，支持实例调度成功、实例调度失败、健康检查成功、健康检查失败、镜像拉取成功、镜像拉取失败、容器启动成功、容器启动失败、卷挂载成功、卷挂载失败。
     */
    public static final class EventNameEnum {

        /**
         * Enum SCHEDULED for value: "Scheduled"
         */
        public static final EventNameEnum SCHEDULED = new EventNameEnum("Scheduled");

        /**
         * Enum FAILEDSCHEDULING for value: "FailedScheduling"
         */
        public static final EventNameEnum FAILEDSCHEDULING = new EventNameEnum("FailedScheduling");

        /**
         * Enum HEALTHY for value: "Healthy"
         */
        public static final EventNameEnum HEALTHY = new EventNameEnum("Healthy");

        /**
         * Enum UNHEALTHY for value: "Unhealthy"
         */
        public static final EventNameEnum UNHEALTHY = new EventNameEnum("Unhealthy");

        /**
         * Enum PULLED for value: "Pulled"
         */
        public static final EventNameEnum PULLED = new EventNameEnum("Pulled");

        /**
         * Enum FAILEDPULLIMAGE for value: "FailedPullImage"
         */
        public static final EventNameEnum FAILEDPULLIMAGE = new EventNameEnum("FailedPullImage");

        /**
         * Enum STARTED for value: "Started"
         */
        public static final EventNameEnum STARTED = new EventNameEnum("Started");

        /**
         * Enum BACKOFFSTART for value: "BackOffStart"
         */
        public static final EventNameEnum BACKOFFSTART = new EventNameEnum("BackOffStart");

        /**
         * Enum SUCCESSFULMOUNTVOLUME for value: "SuccessfulMountVolume"
         */
        public static final EventNameEnum SUCCESSFULMOUNTVOLUME = new EventNameEnum("SuccessfulMountVolume");

        /**
         * Enum FAILEDMOUNT for value: "FailedMount"
         */
        public static final EventNameEnum FAILEDMOUNT = new EventNameEnum("FailedMount");

        private static final Map<String, EventNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventNameEnum> createStaticFields() {
            Map<String, EventNameEnum> map = new HashMap<>();
            map.put("Scheduled", SCHEDULED);
            map.put("FailedScheduling", FAILEDSCHEDULING);
            map.put("Healthy", HEALTHY);
            map.put("Unhealthy", UNHEALTHY);
            map.put("Pulled", PULLED);
            map.put("FailedPullImage", FAILEDPULLIMAGE);
            map.put("Started", STARTED);
            map.put("BackOffStart", BACKOFFSTART);
            map.put("SuccessfulMountVolume", SUCCESSFULMOUNTVOLUME);
            map.put("FailedMount", FAILEDMOUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventNameEnum(String value) {
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
        public static EventNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventNameEnum(value));
        }

        public static EventNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventNameEnum) {
                return this.value.equals(((EventNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private EventNameEnum eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private NoticeRuleScope scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_policy")

    private TriggerPolicy triggerPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification")

    private NoticeRuleNotification notification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public CreateNoticeRuleItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 通知名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNoticeRuleItem withEventName(EventNameEnum eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 触发事件名称，支持实例调度成功、实例调度失败、健康检查成功、健康检查失败、镜像拉取成功、镜像拉取失败、容器启动成功、容器启动失败、卷挂载成功、卷挂载失败。
     * @return eventName
     */
    public EventNameEnum getEventName() {
        return eventName;
    }

    public void setEventName(EventNameEnum eventName) {
        this.eventName = eventName;
    }

    public CreateNoticeRuleItem withScope(NoticeRuleScope scope) {
        this.scope = scope;
        return this;
    }

    public CreateNoticeRuleItem withScope(Consumer<NoticeRuleScope> scopeSetter) {
        if (this.scope == null) {
            this.scope = new NoticeRuleScope();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    public NoticeRuleScope getScope() {
        return scope;
    }

    public void setScope(NoticeRuleScope scope) {
        this.scope = scope;
    }

    public CreateNoticeRuleItem withTriggerPolicy(TriggerPolicy triggerPolicy) {
        this.triggerPolicy = triggerPolicy;
        return this;
    }

    public CreateNoticeRuleItem withTriggerPolicy(Consumer<TriggerPolicy> triggerPolicySetter) {
        if (this.triggerPolicy == null) {
            this.triggerPolicy = new TriggerPolicy();
            triggerPolicySetter.accept(this.triggerPolicy);
        }

        return this;
    }

    /**
     * Get triggerPolicy
     * @return triggerPolicy
     */
    public TriggerPolicy getTriggerPolicy() {
        return triggerPolicy;
    }

    public void setTriggerPolicy(TriggerPolicy triggerPolicy) {
        this.triggerPolicy = triggerPolicy;
    }

    public CreateNoticeRuleItem withNotification(NoticeRuleNotification notification) {
        this.notification = notification;
        return this;
    }

    public CreateNoticeRuleItem withNotification(Consumer<NoticeRuleNotification> notificationSetter) {
        if (this.notification == null) {
            this.notification = new NoticeRuleNotification();
            notificationSetter.accept(this.notification);
        }

        return this;
    }

    /**
     * Get notification
     * @return notification
     */
    public NoticeRuleNotification getNotification() {
        return notification;
    }

    public void setNotification(NoticeRuleNotification notification) {
        this.notification = notification;
    }

    public CreateNoticeRuleItem withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNoticeRuleItem that = (CreateNoticeRuleItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.scope, that.scope) && Objects.equals(this.triggerPolicy, that.triggerPolicy)
            && Objects.equals(this.notification, that.notification) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, eventName, scope, triggerPolicy, notification, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNoticeRuleItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    triggerPolicy: ").append(toIndentedString(triggerPolicy)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
