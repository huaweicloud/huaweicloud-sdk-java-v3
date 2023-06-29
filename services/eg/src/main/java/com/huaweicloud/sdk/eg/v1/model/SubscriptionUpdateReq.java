package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新订阅，全量更新订阅源和目标
 */
public class SubscriptionUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<SubscriptionSource> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<SubscriptionTarget> targets = null;

    public SubscriptionUpdateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 订阅描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubscriptionUpdateReq withSources(List<SubscriptionSource> sources) {
        this.sources = sources;
        return this;
    }

    public SubscriptionUpdateReq addSourcesItem(SubscriptionSource sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public SubscriptionUpdateReq withSources(Consumer<List<SubscriptionSource>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 订阅事件源列表，字段存在则代表全量更新订阅源
     * @return sources
     */
    public List<SubscriptionSource> getSources() {
        return sources;
    }

    public void setSources(List<SubscriptionSource> sources) {
        this.sources = sources;
    }

    public SubscriptionUpdateReq withTargets(List<SubscriptionTarget> targets) {
        this.targets = targets;
        return this;
    }

    public SubscriptionUpdateReq addTargetsItem(SubscriptionTarget targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public SubscriptionUpdateReq withTargets(Consumer<List<SubscriptionTarget>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 订阅事件目标列表，字段存在则代表全量更新订阅目标
     * @return targets
     */
    public List<SubscriptionTarget> getTargets() {
        return targets;
    }

    public void setTargets(List<SubscriptionTarget> targets) {
        this.targets = targets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionUpdateReq that = (SubscriptionUpdateReq) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.targets, that.targets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, sources, targets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionUpdateReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
