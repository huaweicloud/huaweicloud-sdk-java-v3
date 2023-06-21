package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生命周期
 */
public class ConfigurationLifecycle {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint")

    private LifecycleEntrypoint entrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post-start")

    private LifecycleProcess postStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre-stop")

    private LifecycleProcess preStop;

    public ConfigurationLifecycle withEntrypoint(LifecycleEntrypoint entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    public ConfigurationLifecycle withEntrypoint(Consumer<LifecycleEntrypoint> entrypointSetter) {
        if (this.entrypoint == null) {
            this.entrypoint = new LifecycleEntrypoint();
            entrypointSetter.accept(this.entrypoint);
        }

        return this;
    }

    /**
     * Get entrypoint
     * @return entrypoint
     */
    public LifecycleEntrypoint getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(LifecycleEntrypoint entrypoint) {
        this.entrypoint = entrypoint;
    }

    public ConfigurationLifecycle withPostStart(LifecycleProcess postStart) {
        this.postStart = postStart;
        return this;
    }

    public ConfigurationLifecycle withPostStart(Consumer<LifecycleProcess> postStartSetter) {
        if (this.postStart == null) {
            this.postStart = new LifecycleProcess();
            postStartSetter.accept(this.postStart);
        }

        return this;
    }

    /**
     * Get postStart
     * @return postStart
     */
    public LifecycleProcess getPostStart() {
        return postStart;
    }

    public void setPostStart(LifecycleProcess postStart) {
        this.postStart = postStart;
    }

    public ConfigurationLifecycle withPreStop(LifecycleProcess preStop) {
        this.preStop = preStop;
        return this;
    }

    public ConfigurationLifecycle withPreStop(Consumer<LifecycleProcess> preStopSetter) {
        if (this.preStop == null) {
            this.preStop = new LifecycleProcess();
            preStopSetter.accept(this.preStop);
        }

        return this;
    }

    /**
     * Get preStop
     * @return preStop
     */
    public LifecycleProcess getPreStop() {
        return preStop;
    }

    public void setPreStop(LifecycleProcess preStop) {
        this.preStop = preStop;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationLifecycle configurationLifecycle = (ConfigurationLifecycle) o;
        return Objects.equals(this.entrypoint, configurationLifecycle.entrypoint)
            && Objects.equals(this.postStart, configurationLifecycle.postStart)
            && Objects.equals(this.preStop, configurationLifecycle.preStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entrypoint, postStart, preStop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationLifecycle {\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
        sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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
