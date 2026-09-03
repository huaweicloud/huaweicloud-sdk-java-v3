package com.huaweicloud.sdk.das.v3.model;

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
public class ListTemplateDatabaseComparisonsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name_list")

    private List<String> dbNameList = null;

    public ListTemplateDatabaseComparisonsResponse withDbNameList(List<String> dbNameList) {
        this.dbNameList = dbNameList;
        return this;
    }

    public ListTemplateDatabaseComparisonsResponse addDbNameListItem(String dbNameListItem) {
        if (this.dbNameList == null) {
            this.dbNameList = new ArrayList<>();
        }
        this.dbNameList.add(dbNameListItem);
        return this;
    }

    public ListTemplateDatabaseComparisonsResponse withDbNameList(Consumer<List<String>> dbNameListSetter) {
        if (this.dbNameList == null) {
            this.dbNameList = new ArrayList<>();
        }
        dbNameListSetter.accept(this.dbNameList);
        return this;
    }

    /**
     * 数据库列表
     * @return dbNameList
     */
    public List<String> getDbNameList() {
        return dbNameList;
    }

    public void setDbNameList(List<String> dbNameList) {
        this.dbNameList = dbNameList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTemplateDatabaseComparisonsResponse that = (ListTemplateDatabaseComparisonsResponse) obj;
        return Objects.equals(this.dbNameList, that.dbNameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateDatabaseComparisonsResponse {\n");
        sb.append("    dbNameList: ").append(toIndentedString(dbNameList)).append("\n");
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
