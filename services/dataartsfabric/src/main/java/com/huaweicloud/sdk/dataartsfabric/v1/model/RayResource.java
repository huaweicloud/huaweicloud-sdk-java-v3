package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Ray资源配置
 */
public class RayResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_group_spec")

    private HeadGroupSpec headGroupSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_group_spec")

    private List<WorkerGroupSpec> workerGroupSpec = null;

    public RayResource withHeadGroupSpec(HeadGroupSpec headGroupSpec) {
        this.headGroupSpec = headGroupSpec;
        return this;
    }

    public RayResource withHeadGroupSpec(Consumer<HeadGroupSpec> headGroupSpecSetter) {
        if (this.headGroupSpec == null) {
            this.headGroupSpec = new HeadGroupSpec();
            headGroupSpecSetter.accept(this.headGroupSpec);
        }

        return this;
    }

    /**
     * Get headGroupSpec
     * @return headGroupSpec
     */
    public HeadGroupSpec getHeadGroupSpec() {
        return headGroupSpec;
    }

    public void setHeadGroupSpec(HeadGroupSpec headGroupSpec) {
        this.headGroupSpec = headGroupSpec;
    }

    public RayResource withWorkerGroupSpec(List<WorkerGroupSpec> workerGroupSpec) {
        this.workerGroupSpec = workerGroupSpec;
        return this;
    }

    public RayResource addWorkerGroupSpecItem(WorkerGroupSpec workerGroupSpecItem) {
        if (this.workerGroupSpec == null) {
            this.workerGroupSpec = new ArrayList<>();
        }
        this.workerGroupSpec.add(workerGroupSpecItem);
        return this;
    }

    public RayResource withWorkerGroupSpec(Consumer<List<WorkerGroupSpec>> workerGroupSpecSetter) {
        if (this.workerGroupSpec == null) {
            this.workerGroupSpec = new ArrayList<>();
        }
        workerGroupSpecSetter.accept(this.workerGroupSpec);
        return this;
    }

    /**
     * Ray worker group配置
     * @return workerGroupSpec
     */
    public List<WorkerGroupSpec> getWorkerGroupSpec() {
        return workerGroupSpec;
    }

    public void setWorkerGroupSpec(List<WorkerGroupSpec> workerGroupSpec) {
        this.workerGroupSpec = workerGroupSpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayResource that = (RayResource) obj;
        return Objects.equals(this.headGroupSpec, that.headGroupSpec)
            && Objects.equals(this.workerGroupSpec, that.workerGroupSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headGroupSpec, workerGroupSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayResource {\n");
        sb.append("    headGroupSpec: ").append(toIndentedString(headGroupSpec)).append("\n");
        sb.append("    workerGroupSpec: ").append(toIndentedString(workerGroupSpec)).append("\n");
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
