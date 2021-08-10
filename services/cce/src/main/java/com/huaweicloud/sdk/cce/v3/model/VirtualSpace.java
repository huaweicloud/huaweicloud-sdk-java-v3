package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** VirtualSpace */
public class VirtualSpace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lvmConfig")

    private LVMConfig lvmConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtimeConfig")

    private RuntimeConfig runtimeConfig;

    public VirtualSpace withName(String name) {
        this.name = name;
        return this;
    }

    /** virtualSpace的名称，当前仅支持三种类型：kubernetes、runtime、user。kubernetes：k8s空间配置，需配置lvmConfig；runtime：运行时空间配置，需配置runtimeConfig；user：用户空间配置，需配置lvmConfig
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualSpace withSize(String size) {
        this.size = size;
        return this;
    }

    /** virtualSpace的大小，仅支持整数百分比。例如：90%。 需要注意：一个group中所有virtualSpace的百分比之和不得超过100%
     * 
     * @return size */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public VirtualSpace withLvmConfig(LVMConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
        return this;
    }

    public VirtualSpace withLvmConfig(Consumer<LVMConfig> lvmConfigSetter) {
        if (this.lvmConfig == null) {
            this.lvmConfig = new LVMConfig();
            lvmConfigSetter.accept(this.lvmConfig);
        }

        return this;
    }

    /** Get lvmConfig
     * 
     * @return lvmConfig */
    public LVMConfig getLvmConfig() {
        return lvmConfig;
    }

    public void setLvmConfig(LVMConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
    }

    public VirtualSpace withRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public VirtualSpace withRuntimeConfig(Consumer<RuntimeConfig> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new RuntimeConfig();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    /** Get runtimeConfig
     * 
     * @return runtimeConfig */
    public RuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualSpace virtualSpace = (VirtualSpace) o;
        return Objects.equals(this.name, virtualSpace.name) && Objects.equals(this.size, virtualSpace.size)
            && Objects.equals(this.lvmConfig, virtualSpace.lvmConfig)
            && Objects.equals(this.runtimeConfig, virtualSpace.runtimeConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, lvmConfig, runtimeConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualSpace {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    lvmConfig: ").append(toIndentedString(lvmConfig)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
