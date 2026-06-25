package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件描述信息。
 */
public class EventModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firstTimestamp")

    private String firstTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastTimestamp")

    private String lastTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public EventModel withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数描述**：API版本。 **取值范围**：可选值如下： - v1
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public EventModel withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数描述**：资源类型。 **取值范围**：可选值如下： - Event：事件
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public EventModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数描述**：事件类型。 **取值范围**：可选值如下： - Normal：正常 - Warning：异常
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventModel withFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
        return this;
    }

    /**
     * **参数描述**：事件第一次出现时间。 **取值范围**：不涉及。
     * @return firstTimestamp
     */
    public String getFirstTimestamp() {
        return firstTimestamp;
    }

    public void setFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    public EventModel withLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }

    /**
     * **参数描述**：事件最后一次出现时间。 **取值范围**：不涉及。
     * @return lastTimestamp
     */
    public String getLastTimestamp() {
        return lastTimestamp;
    }

    public void setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    public EventModel withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数描述**：事件连续出现次数。 **取值范围**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public EventModel withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数描述**：事件产生的原因。 **取值范围**：不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public EventModel withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数描述**：事件详细信息。 **取值范围**：不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.type, that.type) && Objects.equals(this.firstTimestamp, that.firstTimestamp)
            && Objects.equals(this.lastTimestamp, that.lastTimestamp) && Objects.equals(this.count, that.count)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, type, firstTimestamp, lastTimestamp, count, reason, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventModel {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
        sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
