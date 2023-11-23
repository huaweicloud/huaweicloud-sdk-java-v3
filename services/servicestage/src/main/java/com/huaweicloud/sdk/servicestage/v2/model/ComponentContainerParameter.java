package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentContainerParameter
 */
public class ComponentContainerParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private ComponentContainerSize size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private List<ConfigurationEnvParam> env = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private List<ComponentStorage> storage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycle")

    private ConfigurationLifecycle lifecycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "probes")

    private ConfigurationProbes probes;

    public ComponentContainerParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 容器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentContainerParameter withSize(ComponentContainerSize size) {
        this.size = size;
        return this;
    }

    public ComponentContainerParameter withSize(Consumer<ComponentContainerSize> sizeSetter) {
        if (this.size == null) {
            this.size = new ComponentContainerSize();
            sizeSetter.accept(this.size);
        }

        return this;
    }

    /**
     * Get size
     * @return size
     */
    public ComponentContainerSize getSize() {
        return size;
    }

    public void setSize(ComponentContainerSize size) {
        this.size = size;
    }

    public ComponentContainerParameter withEnv(List<ConfigurationEnvParam> env) {
        this.env = env;
        return this;
    }

    public ComponentContainerParameter addEnvItem(ConfigurationEnvParam envItem) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    public ComponentContainerParameter withEnv(Consumer<List<ConfigurationEnvParam>> envSetter) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        envSetter.accept(this.env);
        return this;
    }

    /**
     * 应用环境变量。
     * @return env
     */
    public List<ConfigurationEnvParam> getEnv() {
        return env;
    }

    public void setEnv(List<ConfigurationEnvParam> env) {
        this.env = env;
    }

    public ComponentContainerParameter withStorage(List<ComponentStorage> storage) {
        this.storage = storage;
        return this;
    }

    public ComponentContainerParameter addStorageItem(ComponentStorage storageItem) {
        if (this.storage == null) {
            this.storage = new ArrayList<>();
        }
        this.storage.add(storageItem);
        return this;
    }

    public ComponentContainerParameter withStorage(Consumer<List<ComponentStorage>> storageSetter) {
        if (this.storage == null) {
            this.storage = new ArrayList<>();
        }
        storageSetter.accept(this.storage);
        return this;
    }

    /**
     * Get storage
     * @return storage
     */
    public List<ComponentStorage> getStorage() {
        return storage;
    }

    public void setStorage(List<ComponentStorage> storage) {
        this.storage = storage;
    }

    public ComponentContainerParameter withLifecycle(ConfigurationLifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public ComponentContainerParameter withLifecycle(Consumer<ConfigurationLifecycle> lifecycleSetter) {
        if (this.lifecycle == null) {
            this.lifecycle = new ConfigurationLifecycle();
            lifecycleSetter.accept(this.lifecycle);
        }

        return this;
    }

    /**
     * Get lifecycle
     * @return lifecycle
     */
    public ConfigurationLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(ConfigurationLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ComponentContainerParameter withProbes(ConfigurationProbes probes) {
        this.probes = probes;
        return this;
    }

    public ComponentContainerParameter withProbes(Consumer<ConfigurationProbes> probesSetter) {
        if (this.probes == null) {
            this.probes = new ConfigurationProbes();
            probesSetter.accept(this.probes);
        }

        return this;
    }

    /**
     * Get probes
     * @return probes
     */
    public ConfigurationProbes getProbes() {
        return probes;
    }

    public void setProbes(ConfigurationProbes probes) {
        this.probes = probes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentContainerParameter that = (ComponentContainerParameter) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.size, that.size)
            && Objects.equals(this.env, that.env) && Objects.equals(this.storage, that.storage)
            && Objects.equals(this.lifecycle, that.lifecycle) && Objects.equals(this.probes, that.probes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, env, storage, lifecycle, probes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentContainerParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
        sb.append("    probes: ").append(toIndentedString(probes)).append("\n");
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
