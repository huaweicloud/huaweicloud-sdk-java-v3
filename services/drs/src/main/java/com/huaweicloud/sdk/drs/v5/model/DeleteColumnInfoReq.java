package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除对象列信息请求体
 */
public class DeleteColumnInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_ids")

    private List<String> tableIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_ids")

    private List<String> schemaIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private List<String> dbIds = null;

    public DeleteColumnInfoReq withTableIds(List<String> tableIds) {
        this.tableIds = tableIds;
        return this;
    }

    public DeleteColumnInfoReq addTableIdsItem(String tableIdsItem) {
        if (this.tableIds == null) {
            this.tableIds = new ArrayList<>();
        }
        this.tableIds.add(tableIdsItem);
        return this;
    }

    public DeleteColumnInfoReq withTableIds(Consumer<List<String>> tableIdsSetter) {
        if (this.tableIds == null) {
            this.tableIds = new ArrayList<>();
        }
        tableIdsSetter.accept(this.tableIds);
        return this;
    }

    /**
     * 列所属表的id
     * @return tableIds
     */
    public List<String> getTableIds() {
        return tableIds;
    }

    public void setTableIds(List<String> tableIds) {
        this.tableIds = tableIds;
    }

    public DeleteColumnInfoReq withSchemaIds(List<String> schemaIds) {
        this.schemaIds = schemaIds;
        return this;
    }

    public DeleteColumnInfoReq addSchemaIdsItem(String schemaIdsItem) {
        if (this.schemaIds == null) {
            this.schemaIds = new ArrayList<>();
        }
        this.schemaIds.add(schemaIdsItem);
        return this;
    }

    public DeleteColumnInfoReq withSchemaIds(Consumer<List<String>> schemaIdsSetter) {
        if (this.schemaIds == null) {
            this.schemaIds = new ArrayList<>();
        }
        schemaIdsSetter.accept(this.schemaIds);
        return this;
    }

    /**
     * 列所属schema的id
     * @return schemaIds
     */
    public List<String> getSchemaIds() {
        return schemaIds;
    }

    public void setSchemaIds(List<String> schemaIds) {
        this.schemaIds = schemaIds;
    }

    public DeleteColumnInfoReq withDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    public DeleteColumnInfoReq addDbIdsItem(String dbIdsItem) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        this.dbIds.add(dbIdsItem);
        return this;
    }

    public DeleteColumnInfoReq withDbIds(Consumer<List<String>> dbIdsSetter) {
        if (this.dbIds == null) {
            this.dbIds = new ArrayList<>();
        }
        dbIdsSetter.accept(this.dbIds);
        return this;
    }

    /**
     * 列所属库的id
     * @return dbIds
     */
    public List<String> getDbIds() {
        return dbIds;
    }

    public void setDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteColumnInfoReq that = (DeleteColumnInfoReq) obj;
        return Objects.equals(this.tableIds, that.tableIds) && Objects.equals(this.schemaIds, that.schemaIds)
            && Objects.equals(this.dbIds, that.dbIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableIds, schemaIds, dbIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteColumnInfoReq {\n");
        sb.append("    tableIds: ").append(toIndentedString(tableIds)).append("\n");
        sb.append("    schemaIds: ").append(toIndentedString(schemaIds)).append("\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
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
