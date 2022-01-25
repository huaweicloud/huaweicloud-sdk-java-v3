package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 事件或者告警元数据。
 */
public class EventModel  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="starts_at")
    
    
    private Long startsAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ends_at")
    
    
    private Long endsAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    
    private Long timeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    
    private Object metadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="annotations")
    
    
    private Object annotations;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attach_rule")
    
    
    private Object attachRule;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;

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

    

    public EventModel withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    


    /**
     * 事件或者告警的详细信息，为键值对形式。必须字段为： - event_name：事件或者告警名称,类型为String； - event_severity：事件级别枚举值。类型为String，四种类型 \"Critical\", \"Major\", \"Minor\", \"Info\"； - event_type：事件类别枚举值。类型为String，event为普通告警，alarm为告警事件； - resource_provider：事件对应云服务名称。类型为String； - resource_type：事件对应资源类型。类型为String； - resource_id：事件对应资源信息。类型为String。
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    

    public EventModel withAnnotations(Object annotations) {
        this.annotations = annotations;
        return this;
    }

    


    /**
     * 事件或者告警附加字段，可以为空。
     * @return annotations
     */
    public Object getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Object annotations) {
        this.annotations = annotations;
    }

    

    public EventModel withAttachRule(Object attachRule) {
        this.attachRule = attachRule;
        return this;
    }

    


    /**
     * 事件或者告警预留字段，为空。
     * @return attachRule
     */
    public Object getAttachRule() {
        return attachRule;
    }

    public void setAttachRule(Object attachRule) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventModel eventModel = (EventModel) o;
        return Objects.equals(this.startsAt, eventModel.startsAt) &&
            Objects.equals(this.endsAt, eventModel.endsAt) &&
            Objects.equals(this.timeout, eventModel.timeout) &&
            Objects.equals(this.metadata, eventModel.metadata) &&
            Objects.equals(this.annotations, eventModel.annotations) &&
            Objects.equals(this.attachRule, eventModel.attachRule) &&
            Objects.equals(this.id, eventModel.id);
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

