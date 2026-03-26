package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray集群配置。 **约束限制**：不涉及。 
 */
public class RayClusterConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_custom")

    private Boolean enableCustom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_group_spec")

    private HeadGroupSpecV2 headGroupSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_group_specs")

    private List<WorkerGroupSpecV2> workerGroupSpecs = null;

    public RayClusterConfig withEnableCustom(Boolean enableCustom) {
        this.enableCustom = enableCustom;
        return this;
    }

    /**
     * **参数解释**：是否开启资源自定义。 **约束限制**：不涉及。 **取值范围**：开启true，关闭false。 **默认取值**：false。 
     * @return enableCustom
     */
    public Boolean getEnableCustom() {
        return enableCustom;
    }

    public void setEnableCustom(Boolean enableCustom) {
        this.enableCustom = enableCustom;
    }

    public RayClusterConfig withHeadGroupSpec(HeadGroupSpecV2 headGroupSpec) {
        this.headGroupSpec = headGroupSpec;
        return this;
    }

    public RayClusterConfig withHeadGroupSpec(Consumer<HeadGroupSpecV2> headGroupSpecSetter) {
        if (this.headGroupSpec == null) {
            this.headGroupSpec = new HeadGroupSpecV2();
            headGroupSpecSetter.accept(this.headGroupSpec);
        }

        return this;
    }

    /**
     * Get headGroupSpec
     * @return headGroupSpec
     */
    public HeadGroupSpecV2 getHeadGroupSpec() {
        return headGroupSpec;
    }

    public void setHeadGroupSpec(HeadGroupSpecV2 headGroupSpec) {
        this.headGroupSpec = headGroupSpec;
    }

    public RayClusterConfig withWorkerGroupSpecs(List<WorkerGroupSpecV2> workerGroupSpecs) {
        this.workerGroupSpecs = workerGroupSpecs;
        return this;
    }

    public RayClusterConfig addWorkerGroupSpecsItem(WorkerGroupSpecV2 workerGroupSpecsItem) {
        if (this.workerGroupSpecs == null) {
            this.workerGroupSpecs = new ArrayList<>();
        }
        this.workerGroupSpecs.add(workerGroupSpecsItem);
        return this;
    }

    public RayClusterConfig withWorkerGroupSpecs(Consumer<List<WorkerGroupSpecV2>> workerGroupSpecsSetter) {
        if (this.workerGroupSpecs == null) {
            this.workerGroupSpecs = new ArrayList<>();
        }
        workerGroupSpecsSetter.accept(this.workerGroupSpecs);
        return this;
    }

    /**
     * **参数解释**：Worker Group的配置。 **约束限制**：[1,1000]。 
     * @return workerGroupSpecs
     */
    public List<WorkerGroupSpecV2> getWorkerGroupSpecs() {
        return workerGroupSpecs;
    }

    public void setWorkerGroupSpecs(List<WorkerGroupSpecV2> workerGroupSpecs) {
        this.workerGroupSpecs = workerGroupSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayClusterConfig that = (RayClusterConfig) obj;
        return Objects.equals(this.enableCustom, that.enableCustom)
            && Objects.equals(this.headGroupSpec, that.headGroupSpec)
            && Objects.equals(this.workerGroupSpecs, that.workerGroupSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableCustom, headGroupSpec, workerGroupSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayClusterConfig {\n");
        sb.append("    enableCustom: ").append(toIndentedString(enableCustom)).append("\n");
        sb.append("    headGroupSpec: ").append(toIndentedString(headGroupSpec)).append("\n");
        sb.append("    workerGroupSpecs: ").append(toIndentedString(workerGroupSpecs)).append("\n");
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
