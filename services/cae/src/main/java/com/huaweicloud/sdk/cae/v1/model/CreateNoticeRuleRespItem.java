package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateNoticeRuleRespItem
 */
public class CreateNoticeRuleRespItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

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

    public CreateNoticeRuleRespItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 通知规则的唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateNoticeRuleRespItem withName(String name) {
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

    public CreateNoticeRuleRespItem withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 触发事件名称。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public CreateNoticeRuleRespItem withScope(NoticeRuleScope scope) {
        this.scope = scope;
        return this;
    }

    public CreateNoticeRuleRespItem withScope(Consumer<NoticeRuleScope> scopeSetter) {
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

    public CreateNoticeRuleRespItem withTriggerPolicy(TriggerPolicy triggerPolicy) {
        this.triggerPolicy = triggerPolicy;
        return this;
    }

    public CreateNoticeRuleRespItem withTriggerPolicy(Consumer<TriggerPolicy> triggerPolicySetter) {
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

    public CreateNoticeRuleRespItem withNotification(NoticeRuleNotification notification) {
        this.notification = notification;
        return this;
    }

    public CreateNoticeRuleRespItem withNotification(Consumer<NoticeRuleNotification> notificationSetter) {
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

    public CreateNoticeRuleRespItem withEnable(Boolean enable) {
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
        CreateNoticeRuleRespItem that = (CreateNoticeRuleRespItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.eventName, that.eventName) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.triggerPolicy, that.triggerPolicy)
            && Objects.equals(this.notification, that.notification) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, eventName, scope, triggerPolicy, notification, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNoticeRuleRespItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
