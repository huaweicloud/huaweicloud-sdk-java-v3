package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HapComponentItem
 */
public class HapComponentItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions_with_entities")

    private List<ActionWithEntities> actionsWithEntities = null;

    public HapComponentItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HapComponentItem withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 元能力可见
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public HapComponentItem withActionsWithEntities(List<ActionWithEntities> actionsWithEntities) {
        this.actionsWithEntities = actionsWithEntities;
        return this;
    }

    public HapComponentItem addActionsWithEntitiesItem(ActionWithEntities actionsWithEntitiesItem) {
        if (this.actionsWithEntities == null) {
            this.actionsWithEntities = new ArrayList<>();
        }
        this.actionsWithEntities.add(actionsWithEntitiesItem);
        return this;
    }

    public HapComponentItem withActionsWithEntities(Consumer<List<ActionWithEntities>> actionsWithEntitiesSetter) {
        if (this.actionsWithEntities == null) {
            this.actionsWithEntities = new ArrayList<>();
        }
        actionsWithEntitiesSetter.accept(this.actionsWithEntities);
        return this;
    }

    /**
     * 动作和实体列表
     * @return actionsWithEntities
     */
    public List<ActionWithEntities> getActionsWithEntities() {
        return actionsWithEntities;
    }

    public void setActionsWithEntities(List<ActionWithEntities> actionsWithEntities) {
        this.actionsWithEntities = actionsWithEntities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HapComponentItem hapComponentItem = (HapComponentItem) o;
        return Objects.equals(this.name, hapComponentItem.name)
            && Objects.equals(this.visible, hapComponentItem.visible)
            && Objects.equals(this.actionsWithEntities, hapComponentItem.actionsWithEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, visible, actionsWithEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HapComponentItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    actionsWithEntities: ").append(toIndentedString(actionsWithEntities)).append("\n");
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
