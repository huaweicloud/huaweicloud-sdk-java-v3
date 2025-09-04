package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HtapLTSConfigResponseInstanceLtsConfigs
 */
public class HtapLTSConfigResponseInstanceLtsConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<HtapLTSConfigResponseLtsConfigs> ltsConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private HtapLTSConfigResponseInstance instance;

    public HtapLTSConfigResponseInstanceLtsConfigs withLtsConfigs(List<HtapLTSConfigResponseLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public HtapLTSConfigResponseInstanceLtsConfigs addLtsConfigsItem(HtapLTSConfigResponseLtsConfigs ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public HtapLTSConfigResponseInstanceLtsConfigs withLtsConfigs(
        Consumer<List<HtapLTSConfigResponseLtsConfigs>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * **参数解释**： LTS配置信息。  **约束限制**： 不涉及。
     * @return ltsConfigs
     */
    public List<HtapLTSConfigResponseLtsConfigs> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<HtapLTSConfigResponseLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
    }

    public HtapLTSConfigResponseInstanceLtsConfigs withInstance(HtapLTSConfigResponseInstance instance) {
        this.instance = instance;
        return this;
    }

    public HtapLTSConfigResponseInstanceLtsConfigs withInstance(
        Consumer<HtapLTSConfigResponseInstance> instanceSetter) {
        if (this.instance == null) {
            this.instance = new HtapLTSConfigResponseInstance();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public HtapLTSConfigResponseInstance getInstance() {
        return instance;
    }

    public void setInstance(HtapLTSConfigResponseInstance instance) {
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
        HtapLTSConfigResponseInstanceLtsConfigs that = (HtapLTSConfigResponseInstanceLtsConfigs) obj;
        return Objects.equals(this.ltsConfigs, that.ltsConfigs) && Objects.equals(this.instance, that.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsConfigs, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapLTSConfigResponseInstanceLtsConfigs {\n");
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
