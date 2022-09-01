package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 触发器结构体
 */
public class OBSTriggerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    @JacksonXmlProperty(localName = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    @JacksonXmlProperty(localName = "events")

    private List<String> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    @JacksonXmlProperty(localName = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix")

    @JacksonXmlProperty(localName = "suffix")

    private String suffix;

    public OBSTriggerConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS桶名（trigger_type为OBS时配置）
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public OBSTriggerConfig withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public OBSTriggerConfig addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public OBSTriggerConfig withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * OBS事件列表（trigger_type为OBS时配置）
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public OBSTriggerConfig withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 对象名前缀（trigger_type为OBS时配置）
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public OBSTriggerConfig withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * 对象名后缀（trigger_type为OBS时配置）
     * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBSTriggerConfig obSTriggerConfig = (OBSTriggerConfig) o;
        return Objects.equals(this.bucket, obSTriggerConfig.bucket)
            && Objects.equals(this.events, obSTriggerConfig.events)
            && Objects.equals(this.prefix, obSTriggerConfig.prefix)
            && Objects.equals(this.suffix, obSTriggerConfig.suffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, events, prefix, suffix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBSTriggerConfig {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
