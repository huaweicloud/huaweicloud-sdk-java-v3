package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray节点资源配置。 **约束限制**：仅提交作业到RayJob端点时配置。
 */
public class RayResourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_resource_spec")

    private RayHeadResourceSpec headResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_resource_spec")

    private List<RayWorkerResourceSpec> workerResourceSpec = null;

    public RayResourceConfig withHeadResourceSpec(RayHeadResourceSpec headResourceSpec) {
        this.headResourceSpec = headResourceSpec;
        return this;
    }

    public RayResourceConfig withHeadResourceSpec(Consumer<RayHeadResourceSpec> headResourceSpecSetter) {
        if (this.headResourceSpec == null) {
            this.headResourceSpec = new RayHeadResourceSpec();
            headResourceSpecSetter.accept(this.headResourceSpec);
        }

        return this;
    }

    /**
     * Get headResourceSpec
     * @return headResourceSpec
     */
    public RayHeadResourceSpec getHeadResourceSpec() {
        return headResourceSpec;
    }

    public void setHeadResourceSpec(RayHeadResourceSpec headResourceSpec) {
        this.headResourceSpec = headResourceSpec;
    }

    public RayResourceConfig withWorkerResourceSpec(List<RayWorkerResourceSpec> workerResourceSpec) {
        this.workerResourceSpec = workerResourceSpec;
        return this;
    }

    public RayResourceConfig addWorkerResourceSpecItem(RayWorkerResourceSpec workerResourceSpecItem) {
        if (this.workerResourceSpec == null) {
            this.workerResourceSpec = new ArrayList<>();
        }
        this.workerResourceSpec.add(workerResourceSpecItem);
        return this;
    }

    public RayResourceConfig withWorkerResourceSpec(Consumer<List<RayWorkerResourceSpec>> workerResourceSpecSetter) {
        if (this.workerResourceSpec == null) {
            this.workerResourceSpec = new ArrayList<>();
        }
        workerResourceSpecSetter.accept(this.workerResourceSpec);
        return this;
    }

    /**
     * **参数解释**：worker资源配置。 **约束限制**：仅提交作业到RayJob端点时配置。
     * @return workerResourceSpec
     */
    public List<RayWorkerResourceSpec> getWorkerResourceSpec() {
        return workerResourceSpec;
    }

    public void setWorkerResourceSpec(List<RayWorkerResourceSpec> workerResourceSpec) {
        this.workerResourceSpec = workerResourceSpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayResourceConfig that = (RayResourceConfig) obj;
        return Objects.equals(this.headResourceSpec, that.headResourceSpec)
            && Objects.equals(this.workerResourceSpec, that.workerResourceSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headResourceSpec, workerResourceSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayResourceConfig {\n");
        sb.append("    headResourceSpec: ").append(toIndentedString(headResourceSpec)).append("\n");
        sb.append("    workerResourceSpec: ").append(toIndentedString(workerResourceSpec)).append("\n");
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
