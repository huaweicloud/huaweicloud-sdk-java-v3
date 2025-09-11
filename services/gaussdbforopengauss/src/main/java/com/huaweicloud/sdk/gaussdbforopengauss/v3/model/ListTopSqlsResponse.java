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
public class ListTopSqlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_sql_infos")

    private List<TopSQLInfoResult> topSqlInfos = null;

    public ListTopSqlsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: Top SQL总条数。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTopSqlsResponse withTopSqlInfos(List<TopSQLInfoResult> topSqlInfos) {
        this.topSqlInfos = topSqlInfos;
        return this;
    }

    public ListTopSqlsResponse addTopSqlInfosItem(TopSQLInfoResult topSqlInfosItem) {
        if (this.topSqlInfos == null) {
            this.topSqlInfos = new ArrayList<>();
        }
        this.topSqlInfos.add(topSqlInfosItem);
        return this;
    }

    public ListTopSqlsResponse withTopSqlInfos(Consumer<List<TopSQLInfoResult>> topSqlInfosSetter) {
        if (this.topSqlInfos == null) {
            this.topSqlInfos = new ArrayList<>();
        }
        topSqlInfosSetter.accept(this.topSqlInfos);
        return this;
    }

    /**
     * **参数解释**: Top SQL信息列表。
     * @return topSqlInfos
     */
    public List<TopSQLInfoResult> getTopSqlInfos() {
        return topSqlInfos;
    }

    public void setTopSqlInfos(List<TopSQLInfoResult> topSqlInfos) {
        this.topSqlInfos = topSqlInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopSqlsResponse that = (ListTopSqlsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.topSqlInfos, that.topSqlInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, topSqlInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopSqlsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    topSqlInfos: ").append(toIndentedString(topSqlInfos)).append("\n");
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
