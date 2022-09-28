package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskInstanceSpecContainersRsp
 */
public class TaskInstanceSpecContainersRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private TaskInstanceSpecConResourceRsp resources;

    public TaskInstanceSpecContainersRsp withResources(TaskInstanceSpecConResourceRsp resources) {
        this.resources = resources;
        return this;
    }

    public TaskInstanceSpecContainersRsp withResources(Consumer<TaskInstanceSpecConResourceRsp> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new TaskInstanceSpecConResourceRsp();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public TaskInstanceSpecConResourceRsp getResources() {
        return resources;
    }

    public void setResources(TaskInstanceSpecConResourceRsp resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInstanceSpecContainersRsp taskInstanceSpecContainersRsp = (TaskInstanceSpecContainersRsp) o;
        return Objects.equals(this.resources, taskInstanceSpecContainersRsp.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInstanceSpecContainersRsp {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
