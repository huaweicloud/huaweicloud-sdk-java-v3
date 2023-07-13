package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Pod亲和规则
 */
public class WeightPodAffinityTermsPodAffinityTerm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelSelector")

    private LabelSelector labelSelector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<String> namespaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topologyKey")

    private String topologyKey;

    public WeightPodAffinityTermsPodAffinityTerm withLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public WeightPodAffinityTermsPodAffinityTerm withLabelSelector(Consumer<LabelSelector> labelSelectorSetter) {
        if (this.labelSelector == null) {
            this.labelSelector = new LabelSelector();
            labelSelectorSetter.accept(this.labelSelector);
        }

        return this;
    }

    /**
     * Get labelSelector
     * @return labelSelector
     */
    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public WeightPodAffinityTermsPodAffinityTerm withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public WeightPodAffinityTermsPodAffinityTerm addNamespacesItem(String namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public WeightPodAffinityTermsPodAffinityTerm withNamespaces(Consumer<List<String>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 命名空间
     * @return namespaces
     */
    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public WeightPodAffinityTermsPodAffinityTerm withTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }

    /**
     * 拓扑标签。先圈定topologyKey指定的范围，然后再选择labelSelector定义的内容，即亲和调度只会在有topologyKey指定的标签节点上调度。
     * @return topologyKey
     */
    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WeightPodAffinityTermsPodAffinityTerm that = (WeightPodAffinityTermsPodAffinityTerm) obj;
        return Objects.equals(this.labelSelector, that.labelSelector)
            && Objects.equals(this.namespaces, that.namespaces) && Objects.equals(this.topologyKey, that.topologyKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelSelector, namespaces, topologyKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeightPodAffinityTermsPodAffinityTerm {\n");
        sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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
