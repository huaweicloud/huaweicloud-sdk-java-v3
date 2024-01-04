package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SkippedCheckItemList
 */
public class SkippedCheckItemList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSelector")

    private ResourceSelector resourceSelector;

    public SkippedCheckItemList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 跳过的检查项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SkippedCheckItemList withResourceSelector(ResourceSelector resourceSelector) {
        this.resourceSelector = resourceSelector;
        return this;
    }

    public SkippedCheckItemList withResourceSelector(Consumer<ResourceSelector> resourceSelectorSetter) {
        if (this.resourceSelector == null) {
            this.resourceSelector = new ResourceSelector();
            resourceSelectorSetter.accept(this.resourceSelector);
        }

        return this;
    }

    /**
     * Get resourceSelector
     * @return resourceSelector
     */
    public ResourceSelector getResourceSelector() {
        return resourceSelector;
    }

    public void setResourceSelector(ResourceSelector resourceSelector) {
        this.resourceSelector = resourceSelector;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkippedCheckItemList that = (SkippedCheckItemList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.resourceSelector, that.resourceSelector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, resourceSelector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkippedCheckItemList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resourceSelector: ").append(toIndentedString(resourceSelector)).append("\n");
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
