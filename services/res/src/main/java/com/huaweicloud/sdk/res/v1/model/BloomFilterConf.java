package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class BloomFilterConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behaviors")

    private List<String> behaviors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    public BloomFilterConf withBehaviors(List<String> behaviors) {
        this.behaviors = behaviors;
        return this;
    }

    public BloomFilterConf addBehaviorsItem(String behaviorsItem) {
        if (this.behaviors == null) {
            this.behaviors = new ArrayList<>();
        }
        this.behaviors.add(behaviorsItem);
        return this;
    }

    public BloomFilterConf withBehaviors(Consumer<List<String>> behaviorsSetter) {
        if (this.behaviors == null) {
            this.behaviors = new ArrayList<>();
        }
        behaviorsSetter.accept(this.behaviors);
        return this;
    }

    /**
     * 待过滤行为类型。
     * @return behaviors
     */
    public List<String> getBehaviors() {
        return behaviors;
    }

    public void setBehaviors(List<String> behaviors) {
        this.behaviors = behaviors;
    }

    public BloomFilterConf withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 过滤时间。
     * minimum: 1
     * maximum: 7
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BloomFilterConf bloomFilterConf = (BloomFilterConf) o;
        return Objects.equals(this.behaviors, bloomFilterConf.behaviors)
            && Objects.equals(this.interval, bloomFilterConf.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(behaviors, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BloomFilterConf {\n");
        sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
