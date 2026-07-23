package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对比数据项，包含基准组和对照组的对比评估结果。
 */
public class CompareResultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "benchmark_group")

    private List<CompareGroupItem> benchmarkGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_group")

    private List<CompareGroupItem> controlGroup = null;

    public CompareResultItem withBenchmarkGroup(List<CompareGroupItem> benchmarkGroup) {
        this.benchmarkGroup = benchmarkGroup;
        return this;
    }

    public CompareResultItem addBenchmarkGroupItem(CompareGroupItem benchmarkGroupItem) {
        if (this.benchmarkGroup == null) {
            this.benchmarkGroup = new ArrayList<>();
        }
        this.benchmarkGroup.add(benchmarkGroupItem);
        return this;
    }

    public CompareResultItem withBenchmarkGroup(Consumer<List<CompareGroupItem>> benchmarkGroupSetter) {
        if (this.benchmarkGroup == null) {
            this.benchmarkGroup = new ArrayList<>();
        }
        benchmarkGroupSetter.accept(this.benchmarkGroup);
        return this;
    }

    /**
     * 基准组评估结果列表，通常是被测系统的标准输出或对比基线。
     * @return benchmarkGroup
     */
    public List<CompareGroupItem> getBenchmarkGroup() {
        return benchmarkGroup;
    }

    public void setBenchmarkGroup(List<CompareGroupItem> benchmarkGroup) {
        this.benchmarkGroup = benchmarkGroup;
    }

    public CompareResultItem withControlGroup(List<CompareGroupItem> controlGroup) {
        this.controlGroup = controlGroup;
        return this;
    }

    public CompareResultItem addControlGroupItem(CompareGroupItem controlGroupItem) {
        if (this.controlGroup == null) {
            this.controlGroup = new ArrayList<>();
        }
        this.controlGroup.add(controlGroupItem);
        return this;
    }

    public CompareResultItem withControlGroup(Consumer<List<CompareGroupItem>> controlGroupSetter) {
        if (this.controlGroup == null) {
            this.controlGroup = new ArrayList<>();
        }
        controlGroupSetter.accept(this.controlGroup);
        return this;
    }

    /**
     * 对照组评估结果列表，通常是实验系统的输出或待评估的变体。
     * @return controlGroup
     */
    public List<CompareGroupItem> getControlGroup() {
        return controlGroup;
    }

    public void setControlGroup(List<CompareGroupItem> controlGroup) {
        this.controlGroup = controlGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareResultItem that = (CompareResultItem) obj;
        return Objects.equals(this.benchmarkGroup, that.benchmarkGroup)
            && Objects.equals(this.controlGroup, that.controlGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benchmarkGroup, controlGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareResultItem {\n");
        sb.append("    benchmarkGroup: ").append(toIndentedString(benchmarkGroup)).append("\n");
        sb.append("    controlGroup: ").append(toIndentedString(controlGroup)).append("\n");
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
