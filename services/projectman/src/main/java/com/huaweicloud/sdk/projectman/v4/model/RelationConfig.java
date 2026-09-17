package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RelationConfig
 */
public class RelationConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relations")

    private Map<String, List<Relation>> relations = null;

    public RelationConfig withRelations(Map<String, List<Relation>> relations) {
        this.relations = relations;
        return this;
    }

    public RelationConfig putRelationsItem(String key, List<Relation> relationsItem) {
        if (this.relations == null) {
            this.relations = new HashMap<>();
        }
        this.relations.put(key, relationsItem);
        return this;
    }

    public RelationConfig withRelations(Consumer<Map<String, List<Relation>>> relationsSetter) {
        if (this.relations == null) {
            this.relations = new HashMap<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * key为工作项类型，value为该类型的所有关联关系
     * @return relations
     */
    public Map<String, List<Relation>> getRelations() {
        return relations;
    }

    public void setRelations(Map<String, List<Relation>> relations) {
        this.relations = relations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelationConfig that = (RelationConfig) obj;
        return Objects.equals(this.relations, that.relations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationConfig {\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
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
