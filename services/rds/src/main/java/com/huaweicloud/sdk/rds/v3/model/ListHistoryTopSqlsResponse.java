package com.huaweicloud.sdk.rds.v3.model;

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
public class ListHistoryTopSqlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_sqls")

    private List<TopSql> topSqls = null;

    public ListHistoryTopSqlsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListHistoryTopSqlsResponse withTopSqls(List<TopSql> topSqls) {
        this.topSqls = topSqls;
        return this;
    }

    public ListHistoryTopSqlsResponse addTopSqlsItem(TopSql topSqlsItem) {
        if (this.topSqls == null) {
            this.topSqls = new ArrayList<>();
        }
        this.topSqls.add(topSqlsItem);
        return this;
    }

    public ListHistoryTopSqlsResponse withTopSqls(Consumer<List<TopSql>> topSqlsSetter) {
        if (this.topSqls == null) {
            this.topSqls = new ArrayList<>();
        }
        topSqlsSetter.accept(this.topSqls);
        return this;
    }

    /**
     * top sql 列表
     * @return topSqls
     */
    public List<TopSql> getTopSqls() {
        return topSqls;
    }

    public void setTopSqls(List<TopSql> topSqls) {
        this.topSqls = topSqls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHistoryTopSqlsResponse that = (ListHistoryTopSqlsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.topSqls, that.topSqls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, topSqls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryTopSqlsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    topSqls: ").append(toIndentedString(topSqls)).append("\n");
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
