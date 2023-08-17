package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentAffinity
 */
public class ComponentAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private List<String> az = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node")

    private List<String> node = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component")

    private List<ComponentAffinityAppInnerParameters> component = null;

    public ComponentAffinity withAz(List<String> az) {
        this.az = az;
        return this;
    }

    public ComponentAffinity addAzItem(String azItem) {
        if (this.az == null) {
            this.az = new ArrayList<>();
        }
        this.az.add(azItem);
        return this;
    }

    public ComponentAffinity withAz(Consumer<List<String>> azSetter) {
        if (this.az == null) {
            this.az = new ArrayList<>();
        }
        azSetter.accept(this.az);
        return this;
    }

    /**
     * Get az
     * @return az
     */
    public List<String> getAz() {
        return az;
    }

    public void setAz(List<String> az) {
        this.az = az;
    }

    public ComponentAffinity withNode(List<String> node) {
        this.node = node;
        return this;
    }

    public ComponentAffinity addNodeItem(String nodeItem) {
        if (this.node == null) {
            this.node = new ArrayList<>();
        }
        this.node.add(nodeItem);
        return this;
    }

    public ComponentAffinity withNode(Consumer<List<String>> nodeSetter) {
        if (this.node == null) {
            this.node = new ArrayList<>();
        }
        nodeSetter.accept(this.node);
        return this;
    }

    /**
     * Get node
     * @return node
     */
    public List<String> getNode() {
        return node;
    }

    public void setNode(List<String> node) {
        this.node = node;
    }

    public ComponentAffinity withComponent(List<ComponentAffinityAppInnerParameters> component) {
        this.component = component;
        return this;
    }

    public ComponentAffinity addComponentItem(ComponentAffinityAppInnerParameters componentItem) {
        if (this.component == null) {
            this.component = new ArrayList<>();
        }
        this.component.add(componentItem);
        return this;
    }

    public ComponentAffinity withComponent(Consumer<List<ComponentAffinityAppInnerParameters>> componentSetter) {
        if (this.component == null) {
            this.component = new ArrayList<>();
        }
        componentSetter.accept(this.component);
        return this;
    }

    /**
     * Get component
     * @return component
     */
    public List<ComponentAffinityAppInnerParameters> getComponent() {
        return component;
    }

    public void setComponent(List<ComponentAffinityAppInnerParameters> component) {
        this.component = component;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentAffinity that = (ComponentAffinity) obj;
        return Objects.equals(this.az, that.az) && Objects.equals(this.node, that.node)
            && Objects.equals(this.component, that.component);
    }

    @Override
    public int hashCode() {
        return Objects.hash(az, node, component);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentAffinity {\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
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
