package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DirectionalConnectionList
 */
public class DirectionalConnectionList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directional_connections")

    private List<DirectionalConnection> directionalConnections = null;

    public DirectionalConnectionList withDirectionalConnections(List<DirectionalConnection> directionalConnections) {
        this.directionalConnections = directionalConnections;
        return this;
    }

    public DirectionalConnectionList addDirectionalConnectionsItem(DirectionalConnection directionalConnectionsItem) {
        if (this.directionalConnections == null) {
            this.directionalConnections = new ArrayList<>();
        }
        this.directionalConnections.add(directionalConnectionsItem);
        return this;
    }

    public DirectionalConnectionList withDirectionalConnections(
        Consumer<List<DirectionalConnection>> directionalConnectionsSetter) {
        if (this.directionalConnections == null) {
            this.directionalConnections = new ArrayList<>();
        }
        directionalConnectionsSetter.accept(this.directionalConnections);
        return this;
    }

    /**
     * 有向连接列表。
     * @return directionalConnections
     */
    public List<DirectionalConnection> getDirectionalConnections() {
        return directionalConnections;
    }

    public void setDirectionalConnections(List<DirectionalConnection> directionalConnections) {
        this.directionalConnections = directionalConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectionalConnectionList that = (DirectionalConnectionList) obj;
        return Objects.equals(this.directionalConnections, that.directionalConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directionalConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectionalConnectionList {\n");
        sb.append("    directionalConnections: ").append(toIndentedString(directionalConnections)).append("\n");
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
