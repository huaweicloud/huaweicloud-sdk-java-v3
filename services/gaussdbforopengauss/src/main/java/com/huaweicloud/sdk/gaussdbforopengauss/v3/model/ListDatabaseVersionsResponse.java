package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListDatabaseVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_versions")

    private List<DatabaseVersionResult> databaseVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListDatabaseVersionsResponse withDatabaseVersions(List<DatabaseVersionResult> databaseVersions) {
        this.databaseVersions = databaseVersions;
        return this;
    }

    public ListDatabaseVersionsResponse addDatabaseVersionsItem(DatabaseVersionResult databaseVersionsItem) {
        if (this.databaseVersions == null) {
            this.databaseVersions = new ArrayList<>();
        }
        this.databaseVersions.add(databaseVersionsItem);
        return this;
    }

    public ListDatabaseVersionsResponse withDatabaseVersions(
        Consumer<List<DatabaseVersionResult>> databaseVersionsSetter) {
        if (this.databaseVersions == null) {
            this.databaseVersions = new ArrayList<>();
        }
        databaseVersionsSetter.accept(this.databaseVersions);
        return this;
    }

    /**
     * **参数解释**： 数据库版本列表。
     * @return databaseVersions
     */
    public List<DatabaseVersionResult> getDatabaseVersions() {
        return databaseVersions;
    }

    public void setDatabaseVersions(List<DatabaseVersionResult> databaseVersions) {
        this.databaseVersions = databaseVersions;
    }

    public ListDatabaseVersionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 数据库三位引擎版本总个数。 **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatabaseVersionsResponse that = (ListDatabaseVersionsResponse) obj;
        return Objects.equals(this.databaseVersions, that.databaseVersions) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseVersions, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseVersionsResponse {\n");
        sb.append("    databaseVersions: ").append(toIndentedString(databaseVersions)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
