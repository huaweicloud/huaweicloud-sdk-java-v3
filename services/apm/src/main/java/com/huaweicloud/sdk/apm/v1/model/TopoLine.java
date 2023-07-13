package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组件之间调用指向线。
 */
public class TopoLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_node")

    private String fromNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_node")

    private String toNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector")

    private String collector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_env_id")

    private Long targetEnvId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hints")

    private Map<String, String> hints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_value")

    private String filterValue;

    public TopoLine withFromNode(String fromNode) {
        this.fromNode = fromNode;
        return this;
    }

    /**
     * 开始节点。
     * @return fromNode
     */
    public String getFromNode() {
        return fromNode;
    }

    public void setFromNode(String fromNode) {
        this.fromNode = fromNode;
    }

    public TopoLine withToNode(String toNode) {
        this.toNode = toNode;
        return this;
    }

    /**
     * 结束节点。
     * @return toNode
     */
    public String getToNode() {
        return toNode;
    }

    public void setToNode(String toNode) {
        this.toNode = toNode;
    }

    public TopoLine withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 指向。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public TopoLine withCollector(String collector) {
        this.collector = collector;
        return this;
    }

    /**
     * 采集器名称。
     * @return collector
     */
    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public TopoLine withTargetEnvId(Long targetEnvId) {
        this.targetEnvId = targetEnvId;
        return this;
    }

    /**
     * 环境id。
     * @return targetEnvId
     */
    public Long getTargetEnvId() {
        return targetEnvId;
    }

    public void setTargetEnvId(Long targetEnvId) {
        this.targetEnvId = targetEnvId;
    }

    public TopoLine withHints(Map<String, String> hints) {
        this.hints = hints;
        return this;
    }

    public TopoLine putHintsItem(String key, String hintsItem) {
        if (this.hints == null) {
            this.hints = new HashMap<>();
        }
        this.hints.put(key, hintsItem);
        return this;
    }

    public TopoLine withHints(Consumer<Map<String, String>> hintsSetter) {
        if (this.hints == null) {
            this.hints = new HashMap<>();
        }
        hintsSetter.accept(this.hints);
        return this;
    }

    /**
     * 线条上的提示信息。
     * @return hints
     */
    public Map<String, String> getHints() {
        return hints;
    }

    public void setHints(Map<String, String> hints) {
        this.hints = hints;
    }

    public TopoLine withFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }

    /**
     * 过滤值。
     * @return filterValue
     */
    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopoLine that = (TopoLine) obj;
        return Objects.equals(this.fromNode, that.fromNode) && Objects.equals(this.toNode, that.toNode)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.collector, that.collector)
            && Objects.equals(this.targetEnvId, that.targetEnvId) && Objects.equals(this.hints, that.hints)
            && Objects.equals(this.filterValue, that.filterValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromNode, toNode, direction, collector, targetEnvId, hints, filterValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopoLine {\n");
        sb.append("    fromNode: ").append(toIndentedString(fromNode)).append("\n");
        sb.append("    toNode: ").append(toIndentedString(toNode)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    collector: ").append(toIndentedString(collector)).append("\n");
        sb.append("    targetEnvId: ").append(toIndentedString(targetEnvId)).append("\n");
        sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
        sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
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
