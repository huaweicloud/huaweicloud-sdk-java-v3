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

    public EventModel withStartsAt(Long startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    /**
     * 指定上报的事件或者告警产生的时间。仅支持UTC毫秒级时间戳。  例如：2024-10-16 16:03:01需要通过工具转换成UTC毫秒级时间戳：1702759381000  当action值为空时，即上报事件或告警时需要时指定该参数。
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
     * 指定清除的事件或者告警清除的时间。仅支持UTC毫秒级时间戳。默认值为0，表示没有清除告警。  例如：2024-10-16 16:03:01需要通过工具转换成UTC毫秒级时间戳：1702759381000  当action值为clear时，即清除告警时需要时指定该参数。
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
     * 指定AOM自动清除超期告警的时间，最长清除时间不超过15天。单位：毫秒数，一分钟则填写为60000。例如该时间设置为5天的告警，对应毫秒数：7200 * 60000（即：5天 * 24小时 * 60分钟 * 60000毫秒）。如果上报告警时没指定该时间，则默认清除时间为15天。 当action值为clear时，即清除告警时不需要指定该参数。
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
     * 待上报的事件或者告警的详细信息，为key:value键值对形式。支持如下必填字段： - event_name：事件或者告警名称，类型为String； - event_severity：事件或告警级别。类型为String，支持四种级别：    - Critical：紧急    - Major：重要    - Minor：次要    - Info：提示 - event_type：事件或告警类别。类型为String，支持两种类别：   - event：告警事件   - alarm：普通告警 - resource_provider：事件对应云服务名称。类型为String；  - resource_type：事件对应资源类型。类型为String；  - resource_id：事件对应资源信息。类型为String。 metadata中的value长度为1到2048字符串。
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
     * 事件或者告警预留字段，可以为空。
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
     * 事件或者告警id，产生事件或告警时，系统会自动生成。  当action值为clear时，即清除告警时需要时指定该参数。上报事件或告警时无需传入该参数。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startsAt, endsAt, timeout, metadata, annotations, attachRule, id);
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
