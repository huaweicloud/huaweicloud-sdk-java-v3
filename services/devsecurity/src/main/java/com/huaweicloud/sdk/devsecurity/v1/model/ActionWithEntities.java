package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ActionWithEntities
 */
public class ActionWithEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<String> entities = null;

    public ActionWithEntities withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ActionWithEntities addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ActionWithEntities withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 动作列表
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ActionWithEntities withEntities(List<String> entities) {
        this.entities = entities;
        return this;
    }

    public ActionWithEntities addEntitiesItem(String entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ActionWithEntities withEntities(Consumer<List<String>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 实体列表
     * @return entities
     */
    public List<String> getEntities() {
        return entities;
    }

    public void setEntities(List<String> entities) {
        this.entities = entities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionWithEntities actionWithEntities = (ActionWithEntities) o;
        return Objects.equals(this.actions, actionWithEntities.actions)
            && Objects.equals(this.entities, actionWithEntities.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, entities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionWithEntities {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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
