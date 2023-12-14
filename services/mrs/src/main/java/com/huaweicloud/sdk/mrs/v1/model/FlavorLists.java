package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 支持规格列表
 */
public class FlavorLists {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master")

    private List<String> master = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core")

    private List<String> core = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private List<String> task = null;

    public FlavorLists withMaster(List<String> master) {
        this.master = master;
        return this;
    }

    public FlavorLists addMasterItem(String masterItem) {
        if (this.master == null) {
            this.master = new ArrayList<>();
        }
        this.master.add(masterItem);
        return this;
    }

    public FlavorLists withMaster(Consumer<List<String>> masterSetter) {
        if (this.master == null) {
            this.master = new ArrayList<>();
        }
        masterSetter.accept(this.master);
        return this;
    }

    /**
     * master节点支持的规格列表
     * @return master
     */
    public List<String> getMaster() {
        return master;
    }

    public void setMaster(List<String> master) {
        this.master = master;
    }

    public FlavorLists withCore(List<String> core) {
        this.core = core;
        return this;
    }

    public FlavorLists addCoreItem(String coreItem) {
        if (this.core == null) {
            this.core = new ArrayList<>();
        }
        this.core.add(coreItem);
        return this;
    }

    public FlavorLists withCore(Consumer<List<String>> coreSetter) {
        if (this.core == null) {
            this.core = new ArrayList<>();
        }
        coreSetter.accept(this.core);
        return this;
    }

    /**
     * core节点支持的规格列表
     * @return core
     */
    public List<String> getCore() {
        return core;
    }

    public void setCore(List<String> core) {
        this.core = core;
    }

    public FlavorLists withTask(List<String> task) {
        this.task = task;
        return this;
    }

    public FlavorLists addTaskItem(String taskItem) {
        if (this.task == null) {
            this.task = new ArrayList<>();
        }
        this.task.add(taskItem);
        return this;
    }

    public FlavorLists withTask(Consumer<List<String>> taskSetter) {
        if (this.task == null) {
            this.task = new ArrayList<>();
        }
        taskSetter.accept(this.task);
        return this;
    }

    /**
     * task节点支持的规格列表
     * @return task
     */
    public List<String> getTask() {
        return task;
    }

    public void setTask(List<String> task) {
        this.task = task;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorLists that = (FlavorLists) obj;
        return Objects.equals(this.master, that.master) && Objects.equals(this.core, that.core)
            && Objects.equals(this.task, that.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(master, core, task);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorLists {\n");
        sb.append("    master: ").append(toIndentedString(master)).append("\n");
        sb.append("    core: ").append(toIndentedString(core)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
