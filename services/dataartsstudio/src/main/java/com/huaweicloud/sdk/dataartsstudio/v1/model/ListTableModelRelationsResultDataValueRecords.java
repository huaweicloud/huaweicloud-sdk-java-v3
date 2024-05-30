package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据记录。
 */
public class ListTableModelRelationsResultDataValueRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<TableModelVO> tables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inheritances")

    private List<Object> inheritances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relations")

    private List<RelationVO> relations = null;

    public ListTableModelRelationsResultDataValueRecords withTables(List<TableModelVO> tables) {
        this.tables = tables;
        return this;
    }

    public ListTableModelRelationsResultDataValueRecords addTablesItem(TableModelVO tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public ListTableModelRelationsResultDataValueRecords withTables(Consumer<List<TableModelVO>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * TableModelVO信息。
     * @return tables
     */
    public List<TableModelVO> getTables() {
        return tables;
    }

    public void setTables(List<TableModelVO> tables) {
        this.tables = tables;
    }

    public ListTableModelRelationsResultDataValueRecords withInheritances(List<Object> inheritances) {
        this.inheritances = inheritances;
        return this;
    }

    public ListTableModelRelationsResultDataValueRecords addInheritancesItem(Object inheritancesItem) {
        if (this.inheritances == null) {
            this.inheritances = new ArrayList<>();
        }
        this.inheritances.add(inheritancesItem);
        return this;
    }

    public ListTableModelRelationsResultDataValueRecords withInheritances(Consumer<List<Object>> inheritancesSetter) {
        if (this.inheritances == null) {
            this.inheritances = new ArrayList<>();
        }
        inheritancesSetter.accept(this.inheritances);
        return this;
    }

    /**
     * 层级信息信息。
     * @return inheritances
     */
    public List<Object> getInheritances() {
        return inheritances;
    }

    public void setInheritances(List<Object> inheritances) {
        this.inheritances = inheritances;
    }

    public ListTableModelRelationsResultDataValueRecords withRelations(List<RelationVO> relations) {
        this.relations = relations;
        return this;
    }

    public ListTableModelRelationsResultDataValueRecords addRelationsItem(RelationVO relationsItem) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        this.relations.add(relationsItem);
        return this;
    }

    public ListTableModelRelationsResultDataValueRecords withRelations(Consumer<List<RelationVO>> relationsSetter) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * RelationVO信息。
     * @return relations
     */
    public List<RelationVO> getRelations() {
        return relations;
    }

    public void setRelations(List<RelationVO> relations) {
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
        ListTableModelRelationsResultDataValueRecords that = (ListTableModelRelationsResultDataValueRecords) obj;
        return Objects.equals(this.tables, that.tables) && Objects.equals(this.inheritances, that.inheritances)
            && Objects.equals(this.relations, that.relations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tables, inheritances, relations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableModelRelationsResultDataValueRecords {\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    inheritances: ").append(toIndentedString(inheritances)).append("\n");
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
