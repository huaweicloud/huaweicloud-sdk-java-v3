package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件或者告警元数据。
 */
public class EventModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starts_at")

    private Long startsAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ends_at")

    private Long endsAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Long timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, Object> annotations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_rule")

    private Map<String, Object> attachRule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_sn")

    private String eventSn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrives_at")

    private Long arrivesAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private Map<String, Object> policy = null;

    public EventModel withStartsAt(Long startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    /**
     * 事件或者告警产生的时间，CST毫秒级时间戳。
     * @return startsAt
     */
    public Long getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Long startsAt) {
        this.startsAt = startsAt;
    }

    public EventModel withEndsAt(Long endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    /**
     * 事件或者告警清除的时间，CST毫秒级时间戳，为0时表示未删除。
     * @return endsAt
     */
    public Long getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Long endsAt) {
        this.endsAt = endsAt;
    }

    public EventModel withTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 告警自动清除时间。毫秒数，例如一分钟则填写为60000。默认清除时间为3天,对应数字为 4320 * 1000（即：3天 * 24小时 * 60分钟 * 1000毫秒）。
     * @return timeout
     */
    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public EventModel withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public EventModel putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public EventModel withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 事件或者告警的详细信息，为键值对形式。必须字段为：  - event_name：事件或者告警名称,类型为String；  - event_severity：事件级别枚举值。类型为String，四种类型 \"Critical\", \"Major\", \"Minor\", \"Info\"；  - event_type：事件类别枚举值。类型为String，event为告警事件，alarm为普通告警；  - resource_provider：事件对应云服务名称。类型为String；  - resource_type：事件对应资源类型。类型为String；  - resource_id：事件对应资源信息。类型为String。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public EventModel withAnnotations(Map<String, Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    public EventModel putAnnotationsItem(String key, Object annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public EventModel withAnnotations(Consumer<Map<String, Object>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * 事件或者告警附加字段，可以为空。
     * @return annotations
     */
    public Map<String, Object> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
        this.annotations = annotations;
    }

    public EventModel withAttachRule(Map<String, Object> attachRule) {
        this.attachRule = attachRule;
        return this;
    }

    public EventModel putAttachRuleItem(String key, Object attachRuleItem) {
        if (this.attachRule == null) {
            this.attachRule = new HashMap<>();
        }
        this.attachRule.put(key, attachRuleItem);
        return this;
    }

    public EventModel withAttachRule(Consumer<Map<String, Object>> attachRuleSetter) {
        if (this.attachRule == null) {
            this.attachRule = new HashMap<>();
        }
        attachRuleSetter.accept(this.attachRule);
        return this;
    }

    /**
     * 事件或者告警预留字段，为空。
     * @return attachRule
     */
    public Map<String, Object> getAttachRule() {
        return attachRule;
    }

    public void setAttachRule(Map<String, Object> attachRule) {
        this.attachRule = attachRule;
    }

    public EventModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件或者告警id，系统会自动生成，上报无须填写该字段。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventModel withEventSn(String eventSn) {
        this.eventSn = eventSn;
        return this;
    }

    /**
     * 告警流水号。
     * @return eventSn
     */
    public String getEventSn() {
        return eventSn;
    }

    public void setEventSn(String eventSn) {
        this.eventSn = eventSn;
    }

    public EventModel withArrivesAt(Long arrivesAt) {
        this.arrivesAt = arrivesAt;
        return this;
    }

    /**
     * 事件到达系统时间，CST毫秒级时间戳。
     * @return arrivesAt
     */
    public Long getArrivesAt() {
        return arrivesAt;
    }

    public void setArrivesAt(Long arrivesAt) {
        this.arrivesAt = arrivesAt;
    }

    public EventModel withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 事件或告警所属企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EventModel withPolicy(Map<String, Object> policy) {
        this.policy = policy;
        return this;
    }

    public EventModel putPolicyItem(String key, Object policyItem) {
        if (this.policy == null) {
            this.policy = new HashMap<>();
        }
        this.policy.put(key, policyItem);
        return this;
    }

    public EventModel withPolicy(Consumer<Map<String, Object>> policySetter) {
        if (this.policy == null) {
            this.policy = new HashMap<>();
        }
        policySetter.accept(this.policy);
        return this;
    }

    /**
     * 开放告警策略
     * @return policy
     */
    public Map<String, Object> getPolicy() {
        return policy;
    }

    public void setPolicy(Map<String, Object> policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventModel that = (EventModel) obj;
        return Objects.equals(this.startsAt, that.startsAt) && Objects.equals(this.endsAt, that.endsAt)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.annotations, that.annotations) && Objects.equals(this.attachRule, that.attachRule)
            && Objects.equals(this.id, that.id) && Objects.equals(this.eventSn, that.eventSn)
            && Objects.equals(this.arrivesAt, that.arrivesAt)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startsAt,
            endsAt,
            timeout,
            metadata,
            annotations,
            attachRule,
            id,
            eventSn,
            arrivesAt,
            enterpriseProjectId,
            policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventModel {\n");
        sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
        sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    attachRule: ").append(toIndentedString(attachRule)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    eventSn: ").append(toIndentedString(eventSn)).append("\n");
        sb.append("    arrivesAt: ").append(toIndentedString(arrivesAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
