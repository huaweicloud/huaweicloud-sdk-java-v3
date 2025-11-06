package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求参数。
 */
public class CreateEventsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source")

    private String eventSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private EventItemDetail detail;

    public CreateEventsRequestBody withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * **参数解释**： 事件名称。 **约束限制**： 不涉及。 **取值范围**： 必须以字母开头，只能包含0-9/a-z/A-Z/_，长度为[1,64]个字符。 **默认取值**： 不涉及。 
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public CreateEventsRequestBody withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * **参数解释**： 事件来源。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item，根据实际情况自定义配置。 service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，service.item，长度为[3,32]个字符。 **默认取值**： 不涉及。 
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public CreateEventsRequestBody withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**： 事件发生时间。UNIX时间戳，单位毫秒。 **约束限制**： 因为客户端到服务器端有延时，因此插入数据的时间戳应该在[当前时间-1小时+10秒，当前时间+10分钟-10秒]区间内，保证到达服务器时不会因为传输时延造成数据不能插入数据库。 **取值范围**： 插入数据的时间戳应该在[当前时间-1小时+10秒，当前时间+10分钟-10秒]区间内。 **默认取值**： 不涉及。 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public CreateEventsRequestBody withDetail(EventItemDetail detail) {
        this.detail = detail;
        return this;
    }

    public CreateEventsRequestBody withDetail(Consumer<EventItemDetail> detailSetter) {
        if (this.detail == null) {
            this.detail = new EventItemDetail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public EventItemDetail getDetail() {
        return detail;
    }

    public void setDetail(EventItemDetail detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEventsRequestBody that = (CreateEventsRequestBody) obj;
        return Objects.equals(this.eventName, that.eventName) && Objects.equals(this.eventSource, that.eventSource)
            && Objects.equals(this.time, that.time) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventSource, time, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEventsRequestBody {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
