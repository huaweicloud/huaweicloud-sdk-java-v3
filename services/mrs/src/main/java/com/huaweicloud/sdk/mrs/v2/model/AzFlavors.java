package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 支持规格列表
 */
public class AzFlavors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_name")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master")

    private List<Flavor> master = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core")

    private List<Flavor> core = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private List<Flavor> task = null;

    public AzFlavors withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区code
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public AzFlavors withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * 可用区名称
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public AzFlavors withMaster(List<Flavor> master) {
        this.master = master;
        return this;
    }

    public AzFlavors addMasterItem(Flavor masterItem) {
        if (this.master == null) {
            this.master = new ArrayList<>();
        }
        this.master.add(masterItem);
        return this;
    }

    public AzFlavors withMaster(Consumer<List<Flavor>> masterSetter) {
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
    public List<Flavor> getMaster() {
        return master;
    }

    public void setMaster(List<Flavor> master) {
        this.master = master;
    }

    public AzFlavors withCore(List<Flavor> core) {
        this.core = core;
        return this;
    }

    public AzFlavors addCoreItem(Flavor coreItem) {
        if (this.core == null) {
            this.core = new ArrayList<>();
        }
        this.core.add(coreItem);
        return this;
    }

    public AzFlavors withCore(Consumer<List<Flavor>> coreSetter) {
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
    public List<Flavor> getCore() {
        return core;
    }

    public void setCore(List<Flavor> core) {
        this.core = core;
    }

    public AzFlavors withTask(List<Flavor> task) {
        this.task = task;
        return this;
    }

    public AzFlavors addTaskItem(Flavor taskItem) {
        if (this.task == null) {
            this.task = new ArrayList<>();
        }
        this.task.add(taskItem);
        return this;
    }

    public AzFlavors withTask(Consumer<List<Flavor>> taskSetter) {
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
    public List<Flavor> getTask() {
        return task;
    }

    public void setTask(List<Flavor> task) {
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
        AzFlavors that = (AzFlavors) obj;
        return Objects.equals(this.azCode, that.azCode) && Objects.equals(this.azName, that.azName)
            && Objects.equals(this.master, that.master) && Objects.equals(this.core, that.core)
            && Objects.equals(this.task, that.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azCode, azName, master, core, task);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzFlavors {\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
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
