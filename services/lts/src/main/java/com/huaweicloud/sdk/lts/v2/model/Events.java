package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Events
 */
public class Events {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Annotations annotations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrives_at")

    private Long arrivesAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ends_at")

    private Long endsAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starts_at")

    private Long startsAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Long timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public Events withAnnotations(Annotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public Events withAnnotations(Consumer<Annotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new Annotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    public Events withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Events withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Events withArrivesAt(Long arrivesAt) {
        this.arrivesAt = arrivesAt;
        return this;
    }

    /**
     * 到达时间(时间戳)
     * @return arrivesAt
     */
    public Long getArrivesAt() {
        return arrivesAt;
    }

    public void setArrivesAt(Long arrivesAt) {
        this.arrivesAt = arrivesAt;
    }

    public Events withEndsAt(Long endsAt) {
        this.endsAt = endsAt;
        return this;
    }

    /**
     * 告警清除时间(时间戳)
     * @return endsAt
     */
    public Long getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Long endsAt) {
        this.endsAt = endsAt;
    }

    public Events withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 告警id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Events withStartsAt(Long startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    /**
     * 告警产生时间(时间戳)
     * @return startsAt
     */
    public Long getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Long startsAt) {
        this.startsAt = startsAt;
    }

    public Events withTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 告警自动清除时间(时间戳)
     * @return timeout
     */
    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public Events withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 告警规则类型(SQL/关键词)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Events events = (Events) o;
        return Objects.equals(this.annotations, events.annotations) && Objects.equals(this.metadata, events.metadata)
            && Objects.equals(this.arrivesAt, events.arrivesAt) && Objects.equals(this.endsAt, events.endsAt)
            && Objects.equals(this.id, events.id) && Objects.equals(this.startsAt, events.startsAt)
            && Objects.equals(this.timeout, events.timeout) && Objects.equals(this.type, events.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotations, metadata, arrivesAt, endsAt, id, startsAt, timeout, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Events {\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    arrivesAt: ").append(toIndentedString(arrivesAt)).append("\n");
        sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
