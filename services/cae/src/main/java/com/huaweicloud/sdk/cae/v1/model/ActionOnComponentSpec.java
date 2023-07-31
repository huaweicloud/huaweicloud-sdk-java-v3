package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ActionOnComponentSpec
 */
public class ActionOnComponentSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_index")

    private Integer snapshotIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private ActionOnComponentSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_limit")

    private ResourceLimitForUpgrade resourceLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    private ActionOnComponentBuild build;

    public ActionOnComponentSpec withSnapshotIndex(Integer snapshotIndex) {
        this.snapshotIndex = snapshotIndex;
        return this;
    }

    /**
     * 快照序号。
     * @return snapshotIndex
     */
    public Integer getSnapshotIndex() {
        return snapshotIndex;
    }

    public void setSnapshotIndex(Integer snapshotIndex) {
        this.snapshotIndex = snapshotIndex;
    }

    public ActionOnComponentSpec withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * 实例个数。
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public ActionOnComponentSpec withSource(ActionOnComponentSource source) {
        this.source = source;
        return this;
    }

    public ActionOnComponentSpec withSource(Consumer<ActionOnComponentSource> sourceSetter) {
        if (this.source == null) {
            this.source = new ActionOnComponentSource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public ActionOnComponentSource getSource() {
        return source;
    }

    public void setSource(ActionOnComponentSource source) {
        this.source = source;
    }

    public ActionOnComponentSpec withResourceLimit(ResourceLimitForUpgrade resourceLimit) {
        this.resourceLimit = resourceLimit;
        return this;
    }

    public ActionOnComponentSpec withResourceLimit(Consumer<ResourceLimitForUpgrade> resourceLimitSetter) {
        if (this.resourceLimit == null) {
            this.resourceLimit = new ResourceLimitForUpgrade();
            resourceLimitSetter.accept(this.resourceLimit);
        }

        return this;
    }

    /**
     * Get resourceLimit
     * @return resourceLimit
     */
    public ResourceLimitForUpgrade getResourceLimit() {
        return resourceLimit;
    }

    public void setResourceLimit(ResourceLimitForUpgrade resourceLimit) {
        this.resourceLimit = resourceLimit;
    }

    public ActionOnComponentSpec withBuild(ActionOnComponentBuild build) {
        this.build = build;
        return this;
    }

    public ActionOnComponentSpec withBuild(Consumer<ActionOnComponentBuild> buildSetter) {
        if (this.build == null) {
            this.build = new ActionOnComponentBuild();
            buildSetter.accept(this.build);
        }

        return this;
    }

    /**
     * Get build
     * @return build
     */
    public ActionOnComponentBuild getBuild() {
        return build;
    }

    public void setBuild(ActionOnComponentBuild build) {
        this.build = build;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionOnComponentSpec that = (ActionOnComponentSpec) obj;
        return Objects.equals(this.snapshotIndex, that.snapshotIndex) && Objects.equals(this.replica, that.replica)
            && Objects.equals(this.source, that.source) && Objects.equals(this.resourceLimit, that.resourceLimit)
            && Objects.equals(this.build, that.build);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotIndex, replica, source, resourceLimit, build);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionOnComponentSpec {\n");
        sb.append("    snapshotIndex: ").append(toIndentedString(snapshotIndex)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    resourceLimit: ").append(toIndentedString(resourceLimit)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
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
