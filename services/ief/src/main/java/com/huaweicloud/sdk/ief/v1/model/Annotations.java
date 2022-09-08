package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用扩展功能配置选项
 */
public class Annotations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ring_controller")

    private String ringController;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autonomy_edge_selector")

    private String autonomyEdgeSelector;

    public Annotations withRingController(String ringController) {
        this.ringController = ringController;
        return this;
    }

    /**
     * 生成ranktablefile。该参数目前只支持赋值\"ascend-1980\"，指昇腾D910。
     * @return ringController
     */
    public String getRingController() {
        return ringController;
    }

    public void setRingController(String ringController) {
        this.ringController = ringController;
    }

    public Annotations withAutonomyEdgeSelector(String autonomyEdgeSelector) {
        this.autonomyEdgeSelector = autonomyEdgeSelector;
        return this;
    }

    /**
     * 离线自愈功能配置字段，须填写调度的节点组id
     * @return autonomyEdgeSelector
     */
    public String getAutonomyEdgeSelector() {
        return autonomyEdgeSelector;
    }

    public void setAutonomyEdgeSelector(String autonomyEdgeSelector) {
        this.autonomyEdgeSelector = autonomyEdgeSelector;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Annotations annotations = (Annotations) o;
        return Objects.equals(this.ringController, annotations.ringController)
            && Objects.equals(this.autonomyEdgeSelector, annotations.autonomyEdgeSelector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ringController, autonomyEdgeSelector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Annotations {\n");
        sb.append("    ringController: ").append(toIndentedString(ringController)).append("\n");
        sb.append("    autonomyEdgeSelector: ").append(toIndentedString(autonomyEdgeSelector)).append("\n");
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
