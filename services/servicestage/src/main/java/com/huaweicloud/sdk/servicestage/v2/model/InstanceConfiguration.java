package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用配置，环境变量等，如{“env”: [{“name”: “log-level”: “warn”}]}, 默认空。
 */
public class InstanceConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env")

    private List<ConfigurationEnvParam> env = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private List<ComponentStorage> storage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private ConfigurationStrategy strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycle")

    private ConfigurationLifecycle lifecycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduler")

    private ConfigurationScheduler scheduler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "probes")

    private ConfigurationProbes probes;

    public InstanceConfiguration withEnv(List<ConfigurationEnvParam> env) {
        this.env = env;
        return this;
    }

    public InstanceConfiguration addEnvItem(ConfigurationEnvParam envItem) {
        if (this.env == null) {
            this.env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    public InstanceConfiguration withEnv(Consumer<List<ConfigurationEnvParam>> envSetter) {
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

    public InstanceConfiguration withStorage(List<ComponentStorage> storage) {
        this.storage = storage;
        return this;
    }

    public InstanceConfiguration addStorageItem(ComponentStorage storageItem) {
        if (this.storage == null) {
            this.storage = new ArrayList<>();
        }
        this.storage.add(storageItem);
        return this;
    }

    public InstanceConfiguration withStorage(Consumer<List<ComponentStorage>> storageSetter) {
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

    public InstanceConfiguration withStrategy(ConfigurationStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public InstanceConfiguration withStrategy(Consumer<ConfigurationStrategy> strategySetter) {
        if (this.strategy == null) {
            this.strategy = new ConfigurationStrategy();
            strategySetter.accept(this.strategy);
        }

        return this;
    }

    /**
     * Get strategy
     * @return strategy
     */
    public ConfigurationStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ConfigurationStrategy strategy) {
        this.strategy = strategy;
    }

    public InstanceConfiguration withLifecycle(ConfigurationLifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public InstanceConfiguration withLifecycle(Consumer<ConfigurationLifecycle> lifecycleSetter) {
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

    public InstanceConfiguration withScheduler(ConfigurationScheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public InstanceConfiguration withScheduler(Consumer<ConfigurationScheduler> schedulerSetter) {
        if (this.scheduler == null) {
            this.scheduler = new ConfigurationScheduler();
            schedulerSetter.accept(this.scheduler);
        }

        return this;
    }

    /**
     * Get scheduler
     * @return scheduler
     */
    public ConfigurationScheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(ConfigurationScheduler scheduler) {
        this.scheduler = scheduler;
    }

    public InstanceConfiguration withProbes(ConfigurationProbes probes) {
        this.probes = probes;
        return this;
    }

    public InstanceConfiguration withProbes(Consumer<ConfigurationProbes> probesSetter) {
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
        InstanceConfiguration that = (InstanceConfiguration) obj;
        return Objects.equals(this.env, that.env) && Objects.equals(this.storage, that.storage)
            && Objects.equals(this.strategy, that.strategy) && Objects.equals(this.lifecycle, that.lifecycle)
            && Objects.equals(this.scheduler, that.scheduler) && Objects.equals(this.probes, that.probes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(env, storage, strategy, lifecycle, scheduler, probes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceConfiguration {\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
        sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
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
