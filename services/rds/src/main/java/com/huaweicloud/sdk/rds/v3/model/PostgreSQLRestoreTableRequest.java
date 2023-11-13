package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表级时间点恢复的请求信息
 */
public class PostgreSQLRestoreTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<PostgreSQLRestoreTableInstance> instances = null;

    public PostgreSQLRestoreTableRequest withInstances(List<PostgreSQLRestoreTableInstance> instances) {
        this.instances = instances;
        return this;
    }

    public PostgreSQLRestoreTableRequest addInstancesItem(PostgreSQLRestoreTableInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public PostgreSQLRestoreTableRequest withInstances(Consumer<List<PostgreSQLRestoreTableInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 表信息
     * @return instances
     */
    public List<PostgreSQLRestoreTableInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<PostgreSQLRestoreTableInstance> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgreSQLRestoreTableRequest that = (PostgreSQLRestoreTableRequest) obj;
        return Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLRestoreTableRequest {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
