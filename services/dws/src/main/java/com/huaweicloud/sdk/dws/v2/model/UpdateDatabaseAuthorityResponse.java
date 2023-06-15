package com.huaweicloud.sdk.dws.v2.model;

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
public class UpdateDatabaseAuthorityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_sql")

    private List<String> viewSql = null;

    public UpdateDatabaseAuthorityResponse withViewSql(List<String> viewSql) {
        this.viewSql = viewSql;
        return this;
    }

    public UpdateDatabaseAuthorityResponse addViewSqlItem(String viewSqlItem) {
        if (this.viewSql == null) {
            this.viewSql = new ArrayList<>();
        }
        this.viewSql.add(viewSqlItem);
        return this;
    }

    public UpdateDatabaseAuthorityResponse withViewSql(Consumer<List<String>> viewSqlSetter) {
        if (this.viewSql == null) {
            this.viewSql = new ArrayList<>();
        }
        viewSqlSetter.accept(this.viewSql);
        return this;
    }

    /**
     * sql列表
     * @return viewSql
     */
    public List<String> getViewSql() {
        return viewSql;
    }

    public void setViewSql(List<String> viewSql) {
        this.viewSql = viewSql;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDatabaseAuthorityResponse updateDatabaseAuthorityResponse = (UpdateDatabaseAuthorityResponse) o;
        return Objects.equals(this.viewSql, updateDatabaseAuthorityResponse.viewSql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(viewSql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseAuthorityResponse {\n");
        sb.append("    viewSql: ").append(toIndentedString(viewSql)).append("\n");
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
