package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskInstanceSpecRsp
 */
public class TaskInstanceSpecRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containers")

    private List<TaskInstanceSpecContainersRsp> containers = null;

    public TaskInstanceSpecRsp withContainers(List<TaskInstanceSpecContainersRsp> containers) {
        this.containers = containers;
        return this;
    }

    public TaskInstanceSpecRsp addContainersItem(TaskInstanceSpecContainersRsp containersItem) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        this.containers.add(containersItem);
        return this;
    }

    public TaskInstanceSpecRsp withContainers(Consumer<List<TaskInstanceSpecContainersRsp>> containersSetter) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        containersSetter.accept(this.containers);
        return this;
    }

    /**
     * 实例详情响应体
     * @return containers
     */
    public List<TaskInstanceSpecContainersRsp> getContainers() {
        return containers;
    }

    public void setContainers(List<TaskInstanceSpecContainersRsp> containers) {
        this.containers = containers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInstanceSpecRsp taskInstanceSpecRsp = (TaskInstanceSpecRsp) o;
        return Objects.equals(this.containers, taskInstanceSpecRsp.containers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInstanceSpecRsp {\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
