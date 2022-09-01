package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Event
 */
public class Event {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starts_at")

    @JacksonXmlProperty(localName = "starts_at")

    private Long startsAt;

    public Event withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Event withMetadata(Consumer<Metadata> metadataSetter) {
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

    public Event withStartsAt(Long startsAt) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(this.metadata, event.metadata) && Objects.equals(this.startsAt, event.startsAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, startsAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
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
