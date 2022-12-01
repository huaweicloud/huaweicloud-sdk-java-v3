package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PodAffinity
 */
public class PodAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_affinity")

    private List<MatchExpression> nodeAffinity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_affinity")

    private List<MatchExpression> podAffinity = null;

    public PodAffinity withNodeAffinity(List<MatchExpression> nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public PodAffinity addNodeAffinityItem(MatchExpression nodeAffinityItem) {
        if (this.nodeAffinity == null) {
            this.nodeAffinity = new ArrayList<>();
        }
        this.nodeAffinity.add(nodeAffinityItem);
        return this;
    }

    public PodAffinity withNodeAffinity(Consumer<List<MatchExpression>> nodeAffinitySetter) {
        if (this.nodeAffinity == null) {
            this.nodeAffinity = new ArrayList<>();
        }
        nodeAffinitySetter.accept(this.nodeAffinity);
        return this;
    }

    /**
     * 节点亲和规则
     * @return nodeAffinity
     */
    public List<MatchExpression> getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(List<MatchExpression> nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public PodAffinity withPodAffinity(List<MatchExpression> podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }

    public PodAffinity addPodAffinityItem(MatchExpression podAffinityItem) {
        if (this.podAffinity == null) {
            this.podAffinity = new ArrayList<>();
        }
        this.podAffinity.add(podAffinityItem);
        return this;
    }

    public PodAffinity withPodAffinity(Consumer<List<MatchExpression>> podAffinitySetter) {
        if (this.podAffinity == null) {
            this.podAffinity = new ArrayList<>();
        }
        podAffinitySetter.accept(this.podAffinity);
        return this;
    }

    /**
     * Pod亲和规则
     * @return podAffinity
     */
    public List<MatchExpression> getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(List<MatchExpression> podAffinity) {
        this.podAffinity = podAffinity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PodAffinity podAffinity = (PodAffinity) o;
        return Objects.equals(this.nodeAffinity, podAffinity.nodeAffinity)
            && Objects.equals(this.podAffinity, podAffinity.podAffinity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeAffinity, podAffinity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodAffinity {\n");
        sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
        sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
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
