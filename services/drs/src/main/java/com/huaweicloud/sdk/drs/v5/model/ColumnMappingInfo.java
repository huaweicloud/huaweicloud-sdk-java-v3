package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 列映射信息
 */
public class ColumnMappingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_info_lists")

    private List<ColumnInfo> columnInfoLists = null;

    public ColumnMappingInfo withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ColumnMappingInfo withColumnInfoLists(List<ColumnInfo> columnInfoLists) {
        this.columnInfoLists = columnInfoLists;
        return this;
    }

    public ColumnMappingInfo addColumnInfoListsItem(ColumnInfo columnInfoListsItem) {
        if (this.columnInfoLists == null) {
            this.columnInfoLists = new ArrayList<>();
        }
        this.columnInfoLists.add(columnInfoListsItem);
        return this;
    }

    public ColumnMappingInfo withColumnInfoLists(Consumer<List<ColumnInfo>> columnInfoListsSetter) {
        if (this.columnInfoLists == null) {
            this.columnInfoLists = new ArrayList<>();
        }
        columnInfoListsSetter.accept(this.columnInfoLists);
        return this;
    }

    /**
     * 列信息
     * @return columnInfoLists
     */
    public List<ColumnInfo> getColumnInfoLists() {
        return columnInfoLists;
    }

    public void setColumnInfoLists(List<ColumnInfo> columnInfoLists) {
        this.columnInfoLists = columnInfoLists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnMappingInfo that = (ColumnMappingInfo) obj;
        return Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.columnInfoLists, that.columnInfoLists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, columnInfoLists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnMappingInfo {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    columnInfoLists: ").append(toIndentedString(columnInfoLists)).append("\n");
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
