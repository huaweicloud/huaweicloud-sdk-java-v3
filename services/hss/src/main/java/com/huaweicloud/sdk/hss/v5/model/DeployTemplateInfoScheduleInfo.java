package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点调度信息
 */
public class DeployTemplateInfoScheduleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_selector")

    private List<String> nodeSelector = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_tolerances")

    private List<String> podTolerances = null;

    public DeployTemplateInfoScheduleInfo withNodeSelector(List<String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public DeployTemplateInfoScheduleInfo addNodeSelectorItem(String nodeSelectorItem) {
        if (this.nodeSelector == null) {
            this.nodeSelector = new ArrayList<>();
        }
        this.nodeSelector.add(nodeSelectorItem);
        return this;
    }

    public DeployTemplateInfoScheduleInfo withNodeSelector(Consumer<List<String>> nodeSelectorSetter) {
        if (this.nodeSelector == null) {
            this.nodeSelector = new ArrayList<>();
        }
        nodeSelectorSetter.accept(this.nodeSelector);
        return this;
    }

    /**
     * 节点选择器
     * @return nodeSelector
     */
    public List<String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(List<String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public DeployTemplateInfoScheduleInfo withPodTolerances(List<String> podTolerances) {
        this.podTolerances = podTolerances;
        return this;
    }

    public DeployTemplateInfoScheduleInfo addPodTolerancesItem(String podTolerancesItem) {
        if (this.podTolerances == null) {
            this.podTolerances = new ArrayList<>();
        }
        this.podTolerances.add(podTolerancesItem);
        return this;
    }

    public DeployTemplateInfoScheduleInfo withPodTolerances(Consumer<List<String>> podTolerancesSetter) {
        if (this.podTolerances == null) {
            this.podTolerances = new ArrayList<>();
        }
        podTolerancesSetter.accept(this.podTolerances);
        return this;
    }

    /**
     * pod容忍度
     * @return podTolerances
     */
    public List<String> getPodTolerances() {
        return podTolerances;
    }

    public void setPodTolerances(List<String> podTolerances) {
        this.podTolerances = podTolerances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployTemplateInfoScheduleInfo that = (DeployTemplateInfoScheduleInfo) obj;
        return Objects.equals(this.nodeSelector, that.nodeSelector)
            && Objects.equals(this.podTolerances, that.podTolerances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeSelector, podTolerances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployTemplateInfoScheduleInfo {\n");
        sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
        sb.append("    podTolerances: ").append(toIndentedString(podTolerances)).append("\n");
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
