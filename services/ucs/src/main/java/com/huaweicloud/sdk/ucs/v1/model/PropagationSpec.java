package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PropagationSpec
 */
public class PropagationSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSelectors")

    private List<ResourceSelector> resourceSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propagateDeps")

    private Boolean propagateDeps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "placement")

    private Placement placement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulerName")

    private String schedulerName;

    public PropagationSpec withResourceSelectors(List<ResourceSelector> resourceSelectors) {
        this.resourceSelectors = resourceSelectors;
        return this;
    }

    public PropagationSpec addResourceSelectorsItem(ResourceSelector resourceSelectorsItem) {
        if (this.resourceSelectors == null) {
            this.resourceSelectors = new ArrayList<>();
        }
        this.resourceSelectors.add(resourceSelectorsItem);
        return this;
    }

    public PropagationSpec withResourceSelectors(Consumer<List<ResourceSelector>> resourceSelectorsSetter) {
        if (this.resourceSelectors == null) {
            this.resourceSelectors = new ArrayList<>();
        }
        resourceSelectorsSetter.accept(this.resourceSelectors);
        return this;
    }

    /**
     * 资源选择器，用于选择要传播的资源
     * @return resourceSelectors
     */
    public List<ResourceSelector> getResourceSelectors() {
        return resourceSelectors;
    }

    public void setResourceSelectors(List<ResourceSelector> resourceSelectors) {
        this.resourceSelectors = resourceSelectors;
    }

    public PropagationSpec withPropagateDeps(Boolean propagateDeps) {
        this.propagateDeps = propagateDeps;
        return this;
    }

    /**
     * 是否自动传播引用的资源
     * @return propagateDeps
     */
    public Boolean getPropagateDeps() {
        return propagateDeps;
    }

    public void setPropagateDeps(Boolean propagateDeps) {
        this.propagateDeps = propagateDeps;
    }

    public PropagationSpec withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    public PropagationSpec withPlacement(Consumer<Placement> placementSetter) {
        if (this.placement == null) {
            this.placement = new Placement();
            placementSetter.accept(this.placement);
        }

        return this;
    }

    /**
     * Get placement
     * @return placement
     */
    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public PropagationSpec withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 策略的优先级，默认值为0
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public PropagationSpec withSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    /**
     * 调度器名称，默认值为“default-scheduler”
     * @return schedulerName
     */
    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PropagationSpec that = (PropagationSpec) obj;
        return Objects.equals(this.resourceSelectors, that.resourceSelectors)
            && Objects.equals(this.propagateDeps, that.propagateDeps) && Objects.equals(this.placement, that.placement)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.schedulerName, that.schedulerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSelectors, propagateDeps, placement, priority, schedulerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropagationSpec {\n");
        sb.append("    resourceSelectors: ").append(toIndentedString(resourceSelectors)).append("\n");
        sb.append("    propagateDeps: ").append(toIndentedString(propagateDeps)).append("\n");
        sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
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
