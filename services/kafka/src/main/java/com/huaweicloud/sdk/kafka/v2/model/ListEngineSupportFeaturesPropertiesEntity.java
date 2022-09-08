package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例支持的功能属性描述。
 */
public class ListEngineSupportFeaturesPropertiesEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_task")

    private String maxTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_task")

    private String minTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_node")

    private String maxNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_node")

    private String minNode;

    public ListEngineSupportFeaturesPropertiesEntity withMaxTask(String maxTask) {
        this.maxTask = maxTask;
        return this;
    }

    /**
     * 转储功能的最大任务数。
     * @return maxTask
     */
    public String getMaxTask() {
        return maxTask;
    }

    public void setMaxTask(String maxTask) {
        this.maxTask = maxTask;
    }

    public ListEngineSupportFeaturesPropertiesEntity withMinTask(String minTask) {
        this.minTask = minTask;
        return this;
    }

    /**
     * 转储功能的最小任务数。
     * @return minTask
     */
    public String getMinTask() {
        return minTask;
    }

    public void setMinTask(String minTask) {
        this.minTask = minTask;
    }

    public ListEngineSupportFeaturesPropertiesEntity withMaxNode(String maxNode) {
        this.maxNode = maxNode;
        return this;
    }

    /**
     * 转储功能的最大节点数。
     * @return maxNode
     */
    public String getMaxNode() {
        return maxNode;
    }

    public void setMaxNode(String maxNode) {
        this.maxNode = maxNode;
    }

    public ListEngineSupportFeaturesPropertiesEntity withMinNode(String minNode) {
        this.minNode = minNode;
        return this;
    }

    /**
     * 转储功能的最小节点数。
     * @return minNode
     */
    public String getMinNode() {
        return minNode;
    }

    public void setMinNode(String minNode) {
        this.minNode = minNode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEngineSupportFeaturesPropertiesEntity listEngineSupportFeaturesPropertiesEntity =
            (ListEngineSupportFeaturesPropertiesEntity) o;
        return Objects.equals(this.maxTask, listEngineSupportFeaturesPropertiesEntity.maxTask)
            && Objects.equals(this.minTask, listEngineSupportFeaturesPropertiesEntity.minTask)
            && Objects.equals(this.maxNode, listEngineSupportFeaturesPropertiesEntity.maxNode)
            && Objects.equals(this.minNode, listEngineSupportFeaturesPropertiesEntity.minNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxTask, minTask, maxNode, minNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEngineSupportFeaturesPropertiesEntity {\n");
        sb.append("    maxTask: ").append(toIndentedString(maxTask)).append("\n");
        sb.append("    minTask: ").append(toIndentedString(minTask)).append("\n");
        sb.append("    maxNode: ").append(toIndentedString(maxNode)).append("\n");
        sb.append("    minNode: ").append(toIndentedString(minNode)).append("\n");
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
