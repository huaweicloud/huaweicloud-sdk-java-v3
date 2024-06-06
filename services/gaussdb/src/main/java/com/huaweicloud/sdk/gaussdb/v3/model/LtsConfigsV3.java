package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LtsConfigsV3
 */
public class LtsConfigsV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<LtsConfig> ltsConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private InstanceLtsBasicInfo instance;

    public LtsConfigsV3 withLtsConfigs(List<LtsConfig> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public LtsConfigsV3 addLtsConfigsItem(LtsConfig ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public LtsConfigsV3 withLtsConfigs(Consumer<List<LtsConfig>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * LTS配置列表
     * @return ltsConfigs
     */
    public List<LtsConfig> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<LtsConfig> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
    }

    public LtsConfigsV3 withInstance(InstanceLtsBasicInfo instance) {
        this.instance = instance;
        return this;
    }

    public LtsConfigsV3 withInstance(Consumer<InstanceLtsBasicInfo> instanceSetter) {
        if (this.instance == null) {
            this.instance = new InstanceLtsBasicInfo();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public InstanceLtsBasicInfo getInstance() {
        return instance;
    }

    public void setInstance(InstanceLtsBasicInfo instance) {
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
        LtsConfigsV3 that = (LtsConfigsV3) obj;
        return Objects.equals(this.ltsConfigs, that.ltsConfigs) && Objects.equals(this.instance, that.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsConfigs, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsConfigsV3 {\n");
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
