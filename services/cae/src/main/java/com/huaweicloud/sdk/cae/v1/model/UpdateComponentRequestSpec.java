package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateComponentRequestSpec
 */
public class UpdateComponentRequestSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Source source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private Build build;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_limit")

    private ResourceLimit resourceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_strategy")

    private LogStrategy logStrategy;

    public UpdateComponentRequestSpec withSource(Source source) {
        this.source = source;
        return this;
    }

    public UpdateComponentRequestSpec withSource(Consumer<Source> sourceSetter) {
        if (this.source == null) {
            this.source = new Source();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public UpdateComponentRequestSpec withBuild(Build build) {
        this.build = build;
        return this;
    }

    public UpdateComponentRequestSpec withBuild(Consumer<Build> buildSetter) {
        if (this.build == null) {
            this.build = new Build();
            buildSetter.accept(this.build);
        }

        return this;
    }

    /**
     * Get build
     * @return build
     */
    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public UpdateComponentRequestSpec withResourceLimit(ResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
        return this;
    }

    public UpdateComponentRequestSpec withResourceLimit(Consumer<ResourceLimit> resourceLimitSetter) {
        if (this.resourceLimit == null) {
            this.resourceLimit = new ResourceLimit();
            resourceLimitSetter.accept(this.resourceLimit);
        }

        return this;
    }

    /**
     * Get resourceLimit
     * @return resourceLimit
     */
    public ResourceLimit getResourceLimit() {
        return resourceLimit;
    }

    public void setResourceLimit(ResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
    }

    public UpdateComponentRequestSpec withLogStrategy(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
        return this;
    }

    public UpdateComponentRequestSpec withLogStrategy(Consumer<LogStrategy> logStrategySetter) {
        if (this.logStrategy == null) {
            this.logStrategy = new LogStrategy();
            logStrategySetter.accept(this.logStrategy);
        }

        return this;
    }

    /**
     * Get logStrategy
     * @return logStrategy
     */
    public LogStrategy getLogStrategy() {
        return logStrategy;
    }

    public void setLogStrategy(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateComponentRequestSpec updateComponentRequestSpec = (UpdateComponentRequestSpec) o;
        return Objects.equals(this.source, updateComponentRequestSpec.source)
            && Objects.equals(this.build, updateComponentRequestSpec.build)
            && Objects.equals(this.resourceLimit, updateComponentRequestSpec.resourceLimit)
            && Objects.equals(this.logStrategy, updateComponentRequestSpec.logStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, build, resourceLimit, logStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateComponentRequestSpec {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    resourceLimit: ").append(toIndentedString(resourceLimit)).append("\n");
        sb.append("    logStrategy: ").append(toIndentedString(logStrategy)).append("\n");
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
