package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用实例亲和性规则，仅铂金版支持
 */
public class Affinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeAffinity")

    @JacksonXmlProperty(localName = "nodeAffinity")

    private AffinityNodeAffinity nodeAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podAffinity")

    @JacksonXmlProperty(localName = "podAffinity")

    private AffinityPodAffinity podAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podAntiAffinity")

    @JacksonXmlProperty(localName = "podAntiAffinity")

    private AffinityPodAntiAffinity podAntiAffinity;

    public Affinity withNodeAffinity(AffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public Affinity withNodeAffinity(Consumer<AffinityNodeAffinity> nodeAffinitySetter) {
        if (this.nodeAffinity == null) {
            this.nodeAffinity = new AffinityNodeAffinity();
            nodeAffinitySetter.accept(this.nodeAffinity);
        }

        return this;
    }

    /**
     * Get nodeAffinity
     * @return nodeAffinity
     */
    public AffinityNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(AffinityNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public Affinity withPodAffinity(AffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }

    public Affinity withPodAffinity(Consumer<AffinityPodAffinity> podAffinitySetter) {
        if (this.podAffinity == null) {
            this.podAffinity = new AffinityPodAffinity();
            podAffinitySetter.accept(this.podAffinity);
        }

        return this;
    }

    /**
     * Get podAffinity
     * @return podAffinity
     */
    public AffinityPodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(AffinityPodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public Affinity withPodAntiAffinity(AffinityPodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }

    public Affinity withPodAntiAffinity(Consumer<AffinityPodAntiAffinity> podAntiAffinitySetter) {
        if (this.podAntiAffinity == null) {
            this.podAntiAffinity = new AffinityPodAntiAffinity();
            podAntiAffinitySetter.accept(this.podAntiAffinity);
        }

        return this;
    }

    /**
     * Get podAntiAffinity
     * @return podAntiAffinity
     */
    public AffinityPodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(AffinityPodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Affinity affinity = (Affinity) o;
        return Objects.equals(this.nodeAffinity, affinity.nodeAffinity)
            && Objects.equals(this.podAffinity, affinity.podAffinity)
            && Objects.equals(this.podAntiAffinity, affinity.podAntiAffinity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Affinity {\n");
        sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
        sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
        sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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
