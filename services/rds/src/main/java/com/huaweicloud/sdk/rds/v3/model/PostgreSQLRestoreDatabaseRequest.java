package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 库级恢复请求信息
 */
public class PostgreSQLRestoreDatabaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<PostgreSQLRestoreDatabaseInstance> instances = null;

    public PostgreSQLRestoreDatabaseRequest withInstances(List<PostgreSQLRestoreDatabaseInstance> instances) {
        this.instances = instances;
        return this;
    }

    public PostgreSQLRestoreDatabaseRequest addInstancesItem(PostgreSQLRestoreDatabaseInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public PostgreSQLRestoreDatabaseRequest withInstances(
        Consumer<List<PostgreSQLRestoreDatabaseInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 库级恢复实例信息
     * @return instances
     */
    public List<PostgreSQLRestoreDatabaseInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<PostgreSQLRestoreDatabaseInstance> instances) {
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
        PostgreSQLRestoreDatabaseRequest that = (PostgreSQLRestoreDatabaseRequest) obj;
        return Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLRestoreDatabaseRequest {\n");
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
