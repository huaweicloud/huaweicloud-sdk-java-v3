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
public class ListSqlTemplateComparisonsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_tpl_cmp_dto_list")

    private List<SQLTplCmp> sqlTplCmpDtoList = null;

    public ListSqlTemplateComparisonsResponse withSqlTplCmpDtoList(List<SQLTplCmp> sqlTplCmpDtoList) {
        this.sqlTplCmpDtoList = sqlTplCmpDtoList;
        return this;
    }

    public ListSqlTemplateComparisonsResponse addSqlTplCmpDtoListItem(SQLTplCmp sqlTplCmpDtoListItem) {
        if (this.sqlTplCmpDtoList == null) {
            this.sqlTplCmpDtoList = new ArrayList<>();
        }
        this.sqlTplCmpDtoList.add(sqlTplCmpDtoListItem);
        return this;
    }

    public ListSqlTemplateComparisonsResponse withSqlTplCmpDtoList(Consumer<List<SQLTplCmp>> sqlTplCmpDtoListSetter) {
        if (this.sqlTplCmpDtoList == null) {
            this.sqlTplCmpDtoList = new ArrayList<>();
        }
        sqlTplCmpDtoListSetter.accept(this.sqlTplCmpDtoList);
        return this;
    }

    /**
     * SQL模板对比列表
     * @return sqlTplCmpDtoList
     */
    public List<SQLTplCmp> getSqlTplCmpDtoList() {
        return sqlTplCmpDtoList;
    }

    public void setSqlTplCmpDtoList(List<SQLTplCmp> sqlTplCmpDtoList) {
        this.sqlTplCmpDtoList = sqlTplCmpDtoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlTemplateComparisonsResponse that = (ListSqlTemplateComparisonsResponse) obj;
        return Objects.equals(this.sqlTplCmpDtoList, that.sqlTplCmpDtoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTplCmpDtoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlTemplateComparisonsResponse {\n");
        sb.append("    sqlTplCmpDtoList: ").append(toIndentedString(sqlTplCmpDtoList)).append("\n");
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
