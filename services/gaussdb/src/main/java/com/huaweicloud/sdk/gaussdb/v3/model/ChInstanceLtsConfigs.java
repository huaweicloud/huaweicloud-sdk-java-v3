package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChInstanceLtsConfigs
 */
public class ChInstanceLtsConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<ChLtsConfigs> ltsConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private ChInstanceLtsConfigsInstance instance;

    public ChInstanceLtsConfigs withLtsConfigs(List<ChLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public ChInstanceLtsConfigs addLtsConfigsItem(ChLtsConfigs ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public ChInstanceLtsConfigs withLtsConfigs(Consumer<List<ChLtsConfigs>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * 实例LTS配置信息。
     * @return ltsConfigs
     */
    public List<ChLtsConfigs> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<ChLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
    }

    public ChInstanceLtsConfigs withInstance(ChInstanceLtsConfigsInstance instance) {
        this.instance = instance;
        return this;
    }

    public ChInstanceLtsConfigs withInstance(Consumer<ChInstanceLtsConfigsInstance> instanceSetter) {
        if (this.instance == null) {
            this.instance = new ChInstanceLtsConfigsInstance();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public ChInstanceLtsConfigsInstance getInstance() {
        return instance;
    }

    public void setInstance(ChInstanceLtsConfigsInstance instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChInstanceLtsConfigs that = (ChInstanceLtsConfigs) obj;
        return Objects.equals(this.ltsConfigs, that.ltsConfigs) && Objects.equals(this.instance, that.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsConfigs, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChInstanceLtsConfigs {\n");
        sb.append("    ltsConfigs: ").append(toIndentedString(ltsConfigs)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
