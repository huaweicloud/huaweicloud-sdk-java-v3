package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点限制
 */
public class NodeConstraints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private Map<String, Object> other = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master")

    private NodeConstraint master;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core")

    private NodeConstraint core;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private NodeConstraint task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_separate")

    private NodeConstraint coreSeparate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_combine")

    private NodeConstraint coreCombine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_separate")

    private NodeConstraint taskSeparate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_combine")

    private NodeConstraint taskCombine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group_task")

    private NodeConstraint nodeGroupTask;

    public NodeConstraints withOther(Map<String, Object> other) {
        this.other = other;
        return this;
    }

    public NodeConstraints putOtherItem(String key, Object otherItem) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        this.other.put(key, otherItem);
        return this;
    }

    public NodeConstraints withOther(Consumer<Map<String, Object>> otherSetter) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        otherSetter.accept(this.other);
        return this;
    }

    /**
     * 其他节点限制
     * @return other
     */
    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }

    public NodeConstraints withMaster(NodeConstraint master) {
        this.master = master;
        return this;
    }

    public NodeConstraints withMaster(Consumer<NodeConstraint> masterSetter) {
        if (this.master == null) {
            this.master = new NodeConstraint();
            masterSetter.accept(this.master);
        }

        return this;
    }

    /**
     * Get master
     * @return master
     */
    public NodeConstraint getMaster() {
        return master;
    }

    public void setMaster(NodeConstraint master) {
        this.master = master;
    }

    public NodeConstraints withCore(NodeConstraint core) {
        this.core = core;
        return this;
    }

    public NodeConstraints withCore(Consumer<NodeConstraint> coreSetter) {
        if (this.core == null) {
            this.core = new NodeConstraint();
            coreSetter.accept(this.core);
        }

        return this;
    }

    /**
     * Get core
     * @return core
     */
    public NodeConstraint getCore() {
        return core;
    }

    public void setCore(NodeConstraint core) {
        this.core = core;
    }

    public NodeConstraints withTask(NodeConstraint task) {
        this.task = task;
        return this;
    }

    public NodeConstraints withTask(Consumer<NodeConstraint> taskSetter) {
        if (this.task == null) {
            this.task = new NodeConstraint();
            taskSetter.accept(this.task);
        }

        return this;
    }

    /**
     * Get task
     * @return task
     */
    public NodeConstraint getTask() {
        return task;
    }

    public void setTask(NodeConstraint task) {
        this.task = task;
    }

    public NodeConstraints withCoreSeparate(NodeConstraint coreSeparate) {
        this.coreSeparate = coreSeparate;
        return this;
    }

    public NodeConstraints withCoreSeparate(Consumer<NodeConstraint> coreSeparateSetter) {
        if (this.coreSeparate == null) {
            this.coreSeparate = new NodeConstraint();
            coreSeparateSetter.accept(this.coreSeparate);
        }

        return this;
    }

    /**
     * Get coreSeparate
     * @return coreSeparate
     */
    public NodeConstraint getCoreSeparate() {
        return coreSeparate;
    }

    public void setCoreSeparate(NodeConstraint coreSeparate) {
        this.coreSeparate = coreSeparate;
    }

    public NodeConstraints withCoreCombine(NodeConstraint coreCombine) {
        this.coreCombine = coreCombine;
        return this;
    }

    public NodeConstraints withCoreCombine(Consumer<NodeConstraint> coreCombineSetter) {
        if (this.coreCombine == null) {
            this.coreCombine = new NodeConstraint();
            coreCombineSetter.accept(this.coreCombine);
        }

        return this;
    }

    /**
     * Get coreCombine
     * @return coreCombine
     */
    public NodeConstraint getCoreCombine() {
        return coreCombine;
    }

    public void setCoreCombine(NodeConstraint coreCombine) {
        this.coreCombine = coreCombine;
    }

    public NodeConstraints withTaskSeparate(NodeConstraint taskSeparate) {
        this.taskSeparate = taskSeparate;
        return this;
    }

    public NodeConstraints withTaskSeparate(Consumer<NodeConstraint> taskSeparateSetter) {
        if (this.taskSeparate == null) {
            this.taskSeparate = new NodeConstraint();
            taskSeparateSetter.accept(this.taskSeparate);
        }

        return this;
    }

    /**
     * Get taskSeparate
     * @return taskSeparate
     */
    public NodeConstraint getTaskSeparate() {
        return taskSeparate;
    }

    public void setTaskSeparate(NodeConstraint taskSeparate) {
        this.taskSeparate = taskSeparate;
    }

    public NodeConstraints withTaskCombine(NodeConstraint taskCombine) {
        this.taskCombine = taskCombine;
        return this;
    }

    public NodeConstraints withTaskCombine(Consumer<NodeConstraint> taskCombineSetter) {
        if (this.taskCombine == null) {
            this.taskCombine = new NodeConstraint();
            taskCombineSetter.accept(this.taskCombine);
        }

        return this;
    }

    /**
     * Get taskCombine
     * @return taskCombine
     */
    public NodeConstraint getTaskCombine() {
        return taskCombine;
    }

    public void setTaskCombine(NodeConstraint taskCombine) {
        this.taskCombine = taskCombine;
    }

    public NodeConstraints withNodeGroupTask(NodeConstraint nodeGroupTask) {
        this.nodeGroupTask = nodeGroupTask;
        return this;
    }

    public NodeConstraints withNodeGroupTask(Consumer<NodeConstraint> nodeGroupTaskSetter) {
        if (this.nodeGroupTask == null) {
            this.nodeGroupTask = new NodeConstraint();
            nodeGroupTaskSetter.accept(this.nodeGroupTask);
        }

        return this;
    }

    /**
     * Get nodeGroupTask
     * @return nodeGroupTask
     */
    public NodeConstraint getNodeGroupTask() {
        return nodeGroupTask;
    }

    public void setNodeGroupTask(NodeConstraint nodeGroupTask) {
        this.nodeGroupTask = nodeGroupTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeConstraints that = (NodeConstraints) obj;
        return Objects.equals(this.other, that.other) && Objects.equals(this.master, that.master)
            && Objects.equals(this.core, that.core) && Objects.equals(this.task, that.task)
            && Objects.equals(this.coreSeparate, that.coreSeparate)
            && Objects.equals(this.coreCombine, that.coreCombine)
            && Objects.equals(this.taskSeparate, that.taskSeparate)
            && Objects.equals(this.taskCombine, that.taskCombine)
            && Objects.equals(this.nodeGroupTask, that.nodeGroupTask);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(other, master, core, task, coreSeparate, coreCombine, taskSeparate, taskCombine, nodeGroupTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeConstraints {\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    master: ").append(toIndentedString(master)).append("\n");
        sb.append("    core: ").append(toIndentedString(core)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    coreSeparate: ").append(toIndentedString(coreSeparate)).append("\n");
        sb.append("    coreCombine: ").append(toIndentedString(coreCombine)).append("\n");
        sb.append("    taskSeparate: ").append(toIndentedString(taskSeparate)).append("\n");
        sb.append("    taskCombine: ").append(toIndentedString(taskCombine)).append("\n");
        sb.append("    nodeGroupTask: ").append(toIndentedString(nodeGroupTask)).append("\n");
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
