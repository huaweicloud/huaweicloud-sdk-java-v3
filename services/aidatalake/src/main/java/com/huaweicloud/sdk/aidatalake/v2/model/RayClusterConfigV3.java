package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray集群规格。
 */
public class RayClusterConfigV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_group_spec")

    private HeadGroupSpecV3 headGroupSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_group_specs")

    private List<WorkerGroupSpecV3> workerGroupSpecs = null;

    public RayClusterConfigV3 withHeadGroupSpec(HeadGroupSpecV3 headGroupSpec) {
        this.headGroupSpec = headGroupSpec;
        return this;
    }

    public RayClusterConfigV3 withHeadGroupSpec(Consumer<HeadGroupSpecV3> headGroupSpecSetter) {
        if (this.headGroupSpec == null) {
            this.headGroupSpec = new HeadGroupSpecV3();
            headGroupSpecSetter.accept(this.headGroupSpec);
        }

        return this;
    }

    /**
     * Get headGroupSpec
     * @return headGroupSpec
     */
    public HeadGroupSpecV3 getHeadGroupSpec() {
        return headGroupSpec;
    }

    public void setHeadGroupSpec(HeadGroupSpecV3 headGroupSpec) {
        this.headGroupSpec = headGroupSpec;
    }

    public RayClusterConfigV3 withWorkerGroupSpecs(List<WorkerGroupSpecV3> workerGroupSpecs) {
        this.workerGroupSpecs = workerGroupSpecs;
        return this;
    }

    public RayClusterConfigV3 addWorkerGroupSpecsItem(WorkerGroupSpecV3 workerGroupSpecsItem) {
        if (this.workerGroupSpecs == null) {
            this.workerGroupSpecs = new ArrayList<>();
        }
        this.workerGroupSpecs.add(workerGroupSpecsItem);
        return this;
    }

    public RayClusterConfigV3 withWorkerGroupSpecs(Consumer<List<WorkerGroupSpecV3>> workerGroupSpecsSetter) {
        if (this.workerGroupSpecs == null) {
            this.workerGroupSpecs = new ArrayList<>();
        }
        workerGroupSpecsSetter.accept(this.workerGroupSpecs);
        return this;
    }

    /**
     * **参数解释**：Worker Group的配置。 **约束限制**：不涉及。
     * @return workerGroupSpecs
     */
    public List<WorkerGroupSpecV3> getWorkerGroupSpecs() {
        return workerGroupSpecs;
    }

    public void setWorkerGroupSpecs(List<WorkerGroupSpecV3> workerGroupSpecs) {
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
        RayClusterConfigV3 that = (RayClusterConfigV3) obj;
        return Objects.equals(this.headGroupSpec, that.headGroupSpec)
            && Objects.equals(this.workerGroupSpecs, that.workerGroupSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headGroupSpec, workerGroupSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayClusterConfigV3 {\n");
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
