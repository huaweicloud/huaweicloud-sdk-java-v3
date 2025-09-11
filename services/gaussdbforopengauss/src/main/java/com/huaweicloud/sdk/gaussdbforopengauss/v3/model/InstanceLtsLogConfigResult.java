package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceLtsLogConfigResult
 */
public class InstanceLtsLogConfigResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private Object instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<LtsLogConfigResult> ltsConfigs = null;

    public InstanceLtsLogConfigResult withInstance(Object instance) {
        this.instance = instance;
        return this;
    }

    /**
     * **参数解释**: 实例基本信息。
     * @return instance
     */
    public Object getInstance() {
        return instance;
    }

    public void setInstance(Object instance) {
        this.instance = instance;
    }

    public InstanceLtsLogConfigResult withLtsConfigs(List<LtsLogConfigResult> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public InstanceLtsLogConfigResult addLtsConfigsItem(LtsLogConfigResult ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public InstanceLtsLogConfigResult withLtsConfigs(Consumer<List<LtsLogConfigResult>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * **参数解释**: LTS相关信息。
     * @return ltsConfigs
     */
    public List<LtsLogConfigResult> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<LtsLogConfigResult> ltsConfigs) {
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
        InstanceLtsLogConfigResult that = (InstanceLtsLogConfigResult) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.ltsConfigs, that.ltsConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, ltsConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceLtsLogConfigResult {\n");
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
