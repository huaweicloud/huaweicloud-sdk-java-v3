package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubscriptionCreateReq
 */
public class SubscriptionCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    @JacksonXmlProperty(localName = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    @JacksonXmlProperty(localName = "sources")

    private List<SubscriptionSource> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    @JacksonXmlProperty(localName = "targets")

    private List<SubscriptionTarget> targets = null;

    public SubscriptionCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件订阅名称，租户下唯一，由字母、数字、点、下划线和中划线组成，必须字母或数字开头，长度为1~128字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubscriptionCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件订阅描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubscriptionCreateReq withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 所属事件通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public SubscriptionCreateReq withSources(List<SubscriptionSource> sources) {
        this.sources = sources;
        return this;
    }

    public SubscriptionCreateReq addSourcesItem(SubscriptionSource sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public SubscriptionCreateReq withSources(Consumer<List<SubscriptionSource>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 事件订阅的事件源列表，当前仅支持订阅一个事件源。
     * @return sources
     */
    public List<SubscriptionSource> getSources() {
        return sources;
    }

    public void setSources(List<SubscriptionSource> sources) {
        this.sources = sources;
    }

    public SubscriptionCreateReq withTargets(List<SubscriptionTarget> targets) {
        this.targets = targets;
        return this;
    }

    public SubscriptionCreateReq addTargetsItem(SubscriptionTarget targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public SubscriptionCreateReq withTargets(Consumer<List<SubscriptionTarget>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 事件目标列表，至少订阅一个，最多五个事件目标。
     * @return targets
     */
    public List<SubscriptionTarget> getTargets() {
        return targets;
    }

    public void setTargets(List<SubscriptionTarget> targets) {
        this.targets = targets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionCreateReq subscriptionCreateReq = (SubscriptionCreateReq) o;
        return Objects.equals(this.name, subscriptionCreateReq.name)
            && Objects.equals(this.description, subscriptionCreateReq.description)
            && Objects.equals(this.channelId, subscriptionCreateReq.channelId)
            && Objects.equals(this.sources, subscriptionCreateReq.sources)
            && Objects.equals(this.targets, subscriptionCreateReq.targets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, channelId, sources, targets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
