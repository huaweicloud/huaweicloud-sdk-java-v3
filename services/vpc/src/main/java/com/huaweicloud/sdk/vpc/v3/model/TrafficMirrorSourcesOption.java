package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class TrafficMirrorSourcesOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_sources")

    private List<String> trafficMirrorSources = null;

    public TrafficMirrorSourcesOption withTrafficMirrorSources(List<String> trafficMirrorSources) {
        this.trafficMirrorSources = trafficMirrorSources;
        return this;
    }

    public TrafficMirrorSourcesOption addTrafficMirrorSourcesItem(String trafficMirrorSourcesItem) {
        if (this.trafficMirrorSources == null) {
            this.trafficMirrorSources = new ArrayList<>();
        }
        this.trafficMirrorSources.add(trafficMirrorSourcesItem);
        return this;
    }

    public TrafficMirrorSourcesOption withTrafficMirrorSources(Consumer<List<String>> trafficMirrorSourcesSetter) {
        if (this.trafficMirrorSources == null) {
            this.trafficMirrorSources = new ArrayList<>();
        }
        trafficMirrorSourcesSetter.accept(this.trafficMirrorSources);
        return this;
    }

    /**
     * 功能说明：镜像源ID列表
     * @return trafficMirrorSources
     */
    public List<String> getTrafficMirrorSources() {
        return trafficMirrorSources;
    }

    public void setTrafficMirrorSources(List<String> trafficMirrorSources) {
        this.trafficMirrorSources = trafficMirrorSources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrafficMirrorSourcesOption that = (TrafficMirrorSourcesOption) obj;
        return Objects.equals(this.trafficMirrorSources, that.trafficMirrorSources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorSources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficMirrorSourcesOption {\n");
        sb.append("    trafficMirrorSources: ").append(toIndentedString(trafficMirrorSources)).append("\n");
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
