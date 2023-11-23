package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceLogConfig
 */
public class InstanceLogConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private LogInstanceInfo instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<InstanceLogConfigDetail> ltsConfigs = null;

    public InstanceLogConfig withInstance(LogInstanceInfo instance) {
        this.instance = instance;
        return this;
    }

    public InstanceLogConfig withInstance(Consumer<LogInstanceInfo> instanceSetter) {
        if (this.instance == null) {
            this.instance = new LogInstanceInfo();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public LogInstanceInfo getInstance() {
        return instance;
    }

    public void setInstance(LogInstanceInfo instance) {
        this.instance = instance;
    }

    public InstanceLogConfig withLtsConfigs(List<InstanceLogConfigDetail> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public InstanceLogConfig addLtsConfigsItem(InstanceLogConfigDetail ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public InstanceLogConfig withLtsConfigs(Consumer<List<InstanceLogConfigDetail>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * LTS日志配置明细。从未设置LTS日志流，不返回该字段。
     * @return ltsConfigs
     */
    public List<InstanceLogConfigDetail> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<InstanceLogConfigDetail> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceLogConfig that = (InstanceLogConfig) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.ltsConfigs, that.ltsConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, ltsConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceLogConfig {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    ltsConfigs: ").append(toIndentedString(ltsConfigs)).append("\n");
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
