package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray作业配置。 **约束限制**：不涉及。 **取值范围**：可选参数有：   - raycluster_endpoint_name：它必须是一个有效的Ray端点，可设置多个。 **默认取值**：不涉及。
 */
public class InnerRayJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raycluster_endpoint_name")

    private List<String> rayclusterEndpointName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_resources")

    private List<String> taskResources = null;

    public InnerRayJobConfig withRayclusterEndpointName(List<String> rayclusterEndpointName) {
        this.rayclusterEndpointName = rayclusterEndpointName;
        return this;
    }

    public InnerRayJobConfig addRayclusterEndpointNameItem(String rayclusterEndpointNameItem) {
        if (this.rayclusterEndpointName == null) {
            this.rayclusterEndpointName = new ArrayList<>();
        }
        this.rayclusterEndpointName.add(rayclusterEndpointNameItem);
        return this;
    }

    public InnerRayJobConfig withRayclusterEndpointName(Consumer<List<String>> rayclusterEndpointNameSetter) {
        if (this.rayclusterEndpointName == null) {
            this.rayclusterEndpointName = new ArrayList<>();
        }
        rayclusterEndpointNameSetter.accept(this.rayclusterEndpointName);
        return this;
    }

    /**
     * **参数解释**：作业将运行的Ray集群端点列表，可设置多个。 **约束限制**：不涉及。 **取值范围**：每个元素最小长度1，最大长度63。 **默认取值**：不涉及。
     * @return rayclusterEndpointName
     */
    public List<String> getRayclusterEndpointName() {
        return rayclusterEndpointName;
    }

    public void setRayclusterEndpointName(List<String> rayclusterEndpointName) {
        this.rayclusterEndpointName = rayclusterEndpointName;
    }

    public InnerRayJobConfig withTaskResources(List<String> taskResources) {
        this.taskResources = taskResources;
        return this;
    }

    public InnerRayJobConfig addTaskResourcesItem(String taskResourcesItem) {
        if (this.taskResources == null) {
            this.taskResources = new ArrayList<>();
        }
        this.taskResources.add(taskResourcesItem);
        return this;
    }

    public InnerRayJobConfig withTaskResources(Consumer<List<String>> taskResourcesSetter) {
        if (this.taskResources == null) {
            this.taskResources = new ArrayList<>();
        }
        taskResourcesSetter.accept(this.taskResources);
        return this;
    }

    /**
     * **参数解释**：集群中所需的资源规格。 **约束限制**：最小值为1，最大值为4。
     * @return taskResources
     */
    public List<String> getTaskResources() {
        return taskResources;
    }

    public void setTaskResources(List<String> taskResources) {
        this.taskResources = taskResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InnerRayJobConfig that = (InnerRayJobConfig) obj;
        return Objects.equals(this.rayclusterEndpointName, that.rayclusterEndpointName)
            && Objects.equals(this.taskResources, that.taskResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayclusterEndpointName, taskResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InnerRayJobConfig {\n");
        sb.append("    rayclusterEndpointName: ").append(toIndentedString(rayclusterEndpointName)).append("\n");
        sb.append("    taskResources: ").append(toIndentedString(taskResources)).append("\n");
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
