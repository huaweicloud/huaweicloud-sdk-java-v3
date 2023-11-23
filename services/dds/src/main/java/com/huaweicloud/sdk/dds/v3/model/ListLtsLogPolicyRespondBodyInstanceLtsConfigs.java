package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LTS日志配置信息只会出现已经配置过的日志类型。
 */
public class ListLtsLogPolicyRespondBodyInstanceLtsConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private ListLtsLogPolicyRespondBodyInstance instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<ListLtsLogPolicyRespondBodyLtsConfigs> ltsConfigs = null;

    public ListLtsLogPolicyRespondBodyInstanceLtsConfigs withInstance(ListLtsLogPolicyRespondBodyInstance instance) {
        this.instance = instance;
        return this;
    }

    public ListLtsLogPolicyRespondBodyInstanceLtsConfigs withInstance(
        Consumer<ListLtsLogPolicyRespondBodyInstance> instanceSetter) {
        if (this.instance == null) {
            this.instance = new ListLtsLogPolicyRespondBodyInstance();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public ListLtsLogPolicyRespondBodyInstance getInstance() {
        return instance;
    }

    public void setInstance(ListLtsLogPolicyRespondBodyInstance instance) {
        this.instance = instance;
    }

    public ListLtsLogPolicyRespondBodyInstanceLtsConfigs withLtsConfigs(
        List<ListLtsLogPolicyRespondBodyLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public ListLtsLogPolicyRespondBodyInstanceLtsConfigs addLtsConfigsItem(
        ListLtsLogPolicyRespondBodyLtsConfigs ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public ListLtsLogPolicyRespondBodyInstanceLtsConfigs withLtsConfigs(
        Consumer<List<ListLtsLogPolicyRespondBodyLtsConfigs>> ltsConfigsSetter) {
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
    public List<ListLtsLogPolicyRespondBodyLtsConfigs> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<ListLtsLogPolicyRespondBodyLtsConfigs> ltsConfigs) {
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
        ListLtsLogPolicyRespondBodyInstanceLtsConfigs that = (ListLtsLogPolicyRespondBodyInstanceLtsConfigs) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.ltsConfigs, that.ltsConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, ltsConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsLogPolicyRespondBodyInstanceLtsConfigs {\n");
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
