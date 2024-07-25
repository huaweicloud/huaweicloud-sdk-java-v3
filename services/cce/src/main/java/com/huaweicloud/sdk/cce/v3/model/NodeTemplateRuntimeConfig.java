package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeTemplateRuntimeConfig
 */
public class NodeTemplateRuntimeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private NodeTemplateRuntimeConfigRuntime runtime;

    public NodeTemplateRuntimeConfig withRuntime(NodeTemplateRuntimeConfigRuntime runtime) {
        this.runtime = runtime;
        return this;
    }

    public NodeTemplateRuntimeConfig withRuntime(Consumer<NodeTemplateRuntimeConfigRuntime> runtimeSetter) {
        if (this.runtime == null) {
            this.runtime = new NodeTemplateRuntimeConfigRuntime();
            runtimeSetter.accept(this.runtime);
        }

        return this;
    }

    /**
     * Get runtime
     * @return runtime
     */
    public NodeTemplateRuntimeConfigRuntime getRuntime() {
        return runtime;
    }

    public void setRuntime(NodeTemplateRuntimeConfigRuntime runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTemplateRuntimeConfig that = (NodeTemplateRuntimeConfig) obj;
        return Objects.equals(this.runtime, that.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTemplateRuntimeConfig {\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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
