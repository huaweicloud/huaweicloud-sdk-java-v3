package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OverrideSpec
 */
public class OverrideSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSelectors")

    private List<ResourceSelector> resourceSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overriders")

    private Object overriders;

    public OverrideSpec withResourceSelectors(List<ResourceSelector> resourceSelectors) {
        this.resourceSelectors = resourceSelectors;
        return this;
    }

    public OverrideSpec addResourceSelectorsItem(ResourceSelector resourceSelectorsItem) {
        if (this.resourceSelectors == null) {
            this.resourceSelectors = new ArrayList<>();
        }
        this.resourceSelectors.add(resourceSelectorsItem);
        return this;
    }

    public OverrideSpec withResourceSelectors(Consumer<List<ResourceSelector>> resourceSelectorsSetter) {
        if (this.resourceSelectors == null) {
            this.resourceSelectors = new ArrayList<>();
        }
        resourceSelectorsSetter.accept(this.resourceSelectors);
        return this;
    }

    /**
     * 资源选择器，限制该覆盖策略适用的资源类型
     * @return resourceSelectors
     */
    public List<ResourceSelector> getResourceSelectors() {
        return resourceSelectors;
    }

    public void setResourceSelectors(List<ResourceSelector> resourceSelectors) {
        this.resourceSelectors = resourceSelectors;
    }

    public OverrideSpec withOverriders(Object overriders) {
        this.overriders = overriders;
        return this;
    }

    /**
     * 将应用于资源的覆盖规则
     * @return overriders
     */
    public Object getOverriders() {
        return overriders;
    }

    public void setOverriders(Object overriders) {
        this.overriders = overriders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverrideSpec that = (OverrideSpec) obj;
        return Objects.equals(this.resourceSelectors, that.resourceSelectors)
            && Objects.equals(this.overriders, that.overriders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSelectors, overriders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverrideSpec {\n");
        sb.append("    resourceSelectors: ").append(toIndentedString(resourceSelectors)).append("\n");
        sb.append("    overriders: ").append(toIndentedString(overriders)).append("\n");
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
