package com.huaweicloud.sdk.dsc.v1.model;

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
public class ListRelationDbResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_list")

    private List<RelationSimpleInfo> dbList = null;

    public ListRelationDbResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 关系信息总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRelationDbResponse withDbList(List<RelationSimpleInfo> dbList) {
        this.dbList = dbList;
        return this;
    }

    public ListRelationDbResponse addDbListItem(RelationSimpleInfo dbListItem) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        this.dbList.add(dbListItem);
        return this;
    }

    public ListRelationDbResponse withDbList(Consumer<List<RelationSimpleInfo>> dbListSetter) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        dbListSetter.accept(this.dbList);
        return this;
    }

    /**
     * 关系信息列表
     * @return dbList
     */
    public List<RelationSimpleInfo> getDbList() {
        return dbList;
    }

    public void setDbList(List<RelationSimpleInfo> dbList) {
        this.dbList = dbList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRelationDbResponse listRelationDbResponse = (ListRelationDbResponse) o;
        return Objects.equals(this.total, listRelationDbResponse.total)
            && Objects.equals(this.dbList, listRelationDbResponse.dbList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, dbList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationDbResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    dbList: ").append(toIndentedString(dbList)).append("\n");
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
