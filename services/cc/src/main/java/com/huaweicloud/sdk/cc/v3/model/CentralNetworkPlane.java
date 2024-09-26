package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 中心网络平面详情信息。
 */
public class CentralNetworkPlane {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_er_tables")

    private List<AssociateErTableDocument> associateErTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_er_connections")

    private List<List<AssociateErInstanceDocument>> excludeErConnections = null;

    public CentralNetworkPlane withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CentralNetworkPlane withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CentralNetworkPlane withAssociateErTables(List<AssociateErTableDocument> associateErTables) {
        this.associateErTables = associateErTables;
        return this;
    }

    public CentralNetworkPlane addAssociateErTablesItem(AssociateErTableDocument associateErTablesItem) {
        if (this.associateErTables == null) {
            this.associateErTables = new ArrayList<>();
        }
        this.associateErTables.add(associateErTablesItem);
        return this;
    }

    public CentralNetworkPlane withAssociateErTables(Consumer<List<AssociateErTableDocument>> associateErTablesSetter) {
        if (this.associateErTables == null) {
            this.associateErTables = new ArrayList<>();
        }
        associateErTablesSetter.accept(this.associateErTables);
        return this;
    }

    /**
     * 关联的中心网络ER实例列表。
     * @return associateErTables
     */
    public List<AssociateErTableDocument> getAssociateErTables() {
        return associateErTables;
    }

    public void setAssociateErTables(List<AssociateErTableDocument> associateErTables) {
        this.associateErTables = associateErTables;
    }

    public CentralNetworkPlane withExcludeErConnections(List<List<AssociateErInstanceDocument>> excludeErConnections) {
        this.excludeErConnections = excludeErConnections;
        return this;
    }

    public CentralNetworkPlane addExcludeErConnectionsItem(List<AssociateErInstanceDocument> excludeErConnectionsItem) {
        if (this.excludeErConnections == null) {
            this.excludeErConnections = new ArrayList<>();
        }
        this.excludeErConnections.add(excludeErConnectionsItem);
        return this;
    }

    public CentralNetworkPlane withExcludeErConnections(
        Consumer<List<List<AssociateErInstanceDocument>>> excludeErConnectionsSetter) {
        if (this.excludeErConnections == null) {
            this.excludeErConnections = new ArrayList<>();
        }
        excludeErConnectionsSetter.accept(this.excludeErConnections);
        return this;
    }

    /**
     * 当自动连接所有ER实例时，排除中心网络的ER实例的连接。
     * @return excludeErConnections
     */
    public List<List<AssociateErInstanceDocument>> getExcludeErConnections() {
        return excludeErConnections;
    }

    public void setExcludeErConnections(List<List<AssociateErInstanceDocument>> excludeErConnections) {
        this.excludeErConnections = excludeErConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkPlane that = (CentralNetworkPlane) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.associateErTables, that.associateErTables)
            && Objects.equals(this.excludeErConnections, that.excludeErConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, associateErTables, excludeErConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkPlane {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    associateErTables: ").append(toIndentedString(associateErTables)).append("\n");
        sb.append("    excludeErConnections: ").append(toIndentedString(excludeErConnections)).append("\n");
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
