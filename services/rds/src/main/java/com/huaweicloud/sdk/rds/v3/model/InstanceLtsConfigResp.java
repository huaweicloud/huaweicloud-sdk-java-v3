package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceLtsConfigResp
 */
public class InstanceLtsConfigResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<InstanceLtsConfigDetailResp> ltsConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private InstanceLtsBasicInfoResp instance;

    public InstanceLtsConfigResp withLtsConfigs(List<InstanceLtsConfigDetailResp> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public InstanceLtsConfigResp addLtsConfigsItem(InstanceLtsConfigDetailResp ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public InstanceLtsConfigResp withLtsConfigs(Consumer<List<InstanceLtsConfigDetailResp>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * LTS配置信息
     * @return ltsConfigs
     */
    public List<InstanceLtsConfigDetailResp> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<InstanceLtsConfigDetailResp> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
    }

    public InstanceLtsConfigResp withInstance(InstanceLtsBasicInfoResp instance) {
        this.instance = instance;
        return this;
    }

    public InstanceLtsConfigResp withInstance(Consumer<InstanceLtsBasicInfoResp> instanceSetter) {
        if (this.instance == null) {
            this.instance = new InstanceLtsBasicInfoResp();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public InstanceLtsBasicInfoResp getInstance() {
        return instance;
    }

    public void setInstance(InstanceLtsBasicInfoResp instance) {
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
        InstanceLtsConfigResp that = (InstanceLtsConfigResp) obj;
        return Objects.equals(this.ltsConfigs, that.ltsConfigs) && Objects.equals(this.instance, that.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsConfigs, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceLtsConfigResp {\n");
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
