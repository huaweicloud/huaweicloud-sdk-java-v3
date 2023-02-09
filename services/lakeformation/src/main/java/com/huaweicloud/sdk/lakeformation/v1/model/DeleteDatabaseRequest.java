package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDatabaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_data")

    private Boolean deleteData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade")

    private Boolean cascade;

    public DeleteDatabaseRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例Id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteDatabaseRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public DeleteDatabaseRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DeleteDatabaseRequest withDeleteData(Boolean deleteData) {
        this.deleteData = deleteData;
        return this;
    }

    /**
     * 是否删除数据库路径下的数据
     * @return deleteData
     */
    public Boolean getDeleteData() {
        return deleteData;
    }

    public void setDeleteData(Boolean deleteData) {
        this.deleteData = deleteData;
    }

    public DeleteDatabaseRequest withCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    /**
     * 是否级联删除数据库下的表、分区以及函数
     * @return cascade
     */
    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDatabaseRequest deleteDatabaseRequest = (DeleteDatabaseRequest) o;
        return Objects.equals(this.instanceId, deleteDatabaseRequest.instanceId)
            && Objects.equals(this.catalogName, deleteDatabaseRequest.catalogName)
            && Objects.equals(this.databaseName, deleteDatabaseRequest.databaseName)
            && Objects.equals(this.deleteData, deleteDatabaseRequest.deleteData)
            && Objects.equals(this.cascade, deleteDatabaseRequest.cascade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, catalogName, databaseName, deleteData, cascade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDatabaseRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    deleteData: ").append(toIndentedString(deleteData)).append("\n");
        sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
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
