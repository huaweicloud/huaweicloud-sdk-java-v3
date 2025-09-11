package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstancesNodesResult
 */
public class InstancesNodesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_ids")

    private List<String> componentIds = null;

    public InstancesNodesResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstancesNodesResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 节点名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstancesNodesResult withComponentIds(List<String> componentIds) {
        this.componentIds = componentIds;
        return this;
    }

    public InstancesNodesResult addComponentIdsItem(String componentIdsItem) {
        if (this.componentIds == null) {
            this.componentIds = new ArrayList<>();
        }
        this.componentIds.add(componentIdsItem);
        return this;
    }

    public InstancesNodesResult withComponentIds(Consumer<List<String>> componentIdsSetter) {
        if (this.componentIds == null) {
            this.componentIds = new ArrayList<>();
        }
        componentIdsSetter.accept(this.componentIds);
        return this;
    }

    /**
     * **参数解释**： 组件ID列表。
     * @return componentIds
     */
    public List<String> getComponentIds() {
        return componentIds;
    }

    public void setComponentIds(List<String> componentIds) {
        this.componentIds = componentIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancesNodesResult that = (InstancesNodesResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.componentIds, that.componentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, componentIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesNodesResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    componentIds: ").append(toIndentedString(componentIds)).append("\n");
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
