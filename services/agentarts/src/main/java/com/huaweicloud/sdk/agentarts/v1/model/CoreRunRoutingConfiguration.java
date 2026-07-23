package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 智能体运行时访问方式的路由配置。 
 */
public class CoreRunRoutingConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_weights")

    private List<CoreRunVersionWeight> versionWeights = null;

    public CoreRunRoutingConfiguration withVersionWeights(List<CoreRunVersionWeight> versionWeights) {
        this.versionWeights = versionWeights;
        return this;
    }

    public CoreRunRoutingConfiguration addVersionWeightsItem(CoreRunVersionWeight versionWeightsItem) {
        if (this.versionWeights == null) {
            this.versionWeights = new ArrayList<>();
        }
        this.versionWeights.add(versionWeightsItem);
        return this;
    }

    public CoreRunRoutingConfiguration withVersionWeights(Consumer<List<CoreRunVersionWeight>> versionWeightsSetter) {
        if (this.versionWeights == null) {
            this.versionWeights = new ArrayList<>();
        }
        versionWeightsSetter.accept(this.versionWeights);
        return this;
    }

    /**
     * **参数解释**: 运行时访问方式多版本权重配置。 
     * @return versionWeights
     */
    public List<CoreRunVersionWeight> getVersionWeights() {
        return versionWeights;
    }

    public void setVersionWeights(List<CoreRunVersionWeight> versionWeights) {
        this.versionWeights = versionWeights;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunRoutingConfiguration that = (CoreRunRoutingConfiguration) obj;
        return Objects.equals(this.versionWeights, that.versionWeights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionWeights);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunRoutingConfiguration {\n");
        sb.append("    versionWeights: ").append(toIndentedString(versionWeights)).append("\n");
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
