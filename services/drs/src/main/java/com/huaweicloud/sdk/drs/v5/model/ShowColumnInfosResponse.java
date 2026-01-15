package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowColumnInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_map_infos")

    private List<ColumnMappingInfo> columnMapInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_with_column_infos")

    private List<ObjectWithColumnInfo> objectWithColumnInfos = null;

    public ShowColumnInfosResponse withColumnMapInfos(List<ColumnMappingInfo> columnMapInfos) {
        this.columnMapInfos = columnMapInfos;
        return this;
    }

    public ShowColumnInfosResponse addColumnMapInfosItem(ColumnMappingInfo columnMapInfosItem) {
        if (this.columnMapInfos == null) {
            this.columnMapInfos = new ArrayList<>();
        }
        this.columnMapInfos.add(columnMapInfosItem);
        return this;
    }

    public ShowColumnInfosResponse withColumnMapInfos(Consumer<List<ColumnMappingInfo>> columnMapInfosSetter) {
        if (this.columnMapInfos == null) {
            this.columnMapInfos = new ArrayList<>();
        }
        columnMapInfosSetter.accept(this.columnMapInfos);
        return this;
    }

    /**
     * 列映射信息
     * @return columnMapInfos
     */
    public List<ColumnMappingInfo> getColumnMapInfos() {
        return columnMapInfos;
    }

    public void setColumnMapInfos(List<ColumnMappingInfo> columnMapInfos) {
        this.columnMapInfos = columnMapInfos;
    }

    public ShowColumnInfosResponse withObjectWithColumnInfos(List<ObjectWithColumnInfo> objectWithColumnInfos) {
        this.objectWithColumnInfos = objectWithColumnInfos;
        return this;
    }

    public ShowColumnInfosResponse addObjectWithColumnInfosItem(ObjectWithColumnInfo objectWithColumnInfosItem) {
        if (this.objectWithColumnInfos == null) {
            this.objectWithColumnInfos = new ArrayList<>();
        }
        this.objectWithColumnInfos.add(objectWithColumnInfosItem);
        return this;
    }

    public ShowColumnInfosResponse withObjectWithColumnInfos(
        Consumer<List<ObjectWithColumnInfo>> objectWithColumnInfosSetter) {
        if (this.objectWithColumnInfos == null) {
            this.objectWithColumnInfos = new ArrayList<>();
        }
        objectWithColumnInfosSetter.accept(this.objectWithColumnInfos);
        return this;
    }

    /**
     * 和列信息相关的对象
     * @return objectWithColumnInfos
     */
    public List<ObjectWithColumnInfo> getObjectWithColumnInfos() {
        return objectWithColumnInfos;
    }

    public void setObjectWithColumnInfos(List<ObjectWithColumnInfo> objectWithColumnInfos) {
        this.objectWithColumnInfos = objectWithColumnInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowColumnInfosResponse that = (ShowColumnInfosResponse) obj;
        return Objects.equals(this.columnMapInfos, that.columnMapInfos)
            && Objects.equals(this.objectWithColumnInfos, that.objectWithColumnInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnMapInfos, objectWithColumnInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowColumnInfosResponse {\n");
        sb.append("    columnMapInfos: ").append(toIndentedString(columnMapInfos)).append("\n");
        sb.append("    objectWithColumnInfos: ").append(toIndentedString(objectWithColumnInfos)).append("\n");
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
