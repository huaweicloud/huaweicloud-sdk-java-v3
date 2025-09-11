package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListAuditSqlsNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sqls")

    private List<AuditSqlResponseSqls> sqls = null;

    public ListAuditSqlsNewResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAuditSqlsNewResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAuditSqlsNewResponse withSqls(List<AuditSqlResponseSqls> sqls) {
        this.sqls = sqls;
        return this;
    }

    public ListAuditSqlsNewResponse addSqlsItem(AuditSqlResponseSqls sqlsItem) {
        if (this.sqls == null) {
            this.sqls = new ArrayList<>();
        }
        this.sqls.add(sqlsItem);
        return this;
    }

    public ListAuditSqlsNewResponse withSqls(Consumer<List<AuditSqlResponseSqls>> sqlsSetter) {
        if (this.sqls == null) {
            this.sqls = new ArrayList<>();
        }
        sqlsSetter.accept(this.sqls);
        return this;
    }

    /**
     * sql语句列表
     * @return sqls
     */
    public List<AuditSqlResponseSqls> getSqls() {
        return sqls;
    }

    public void setSqls(List<AuditSqlResponseSqls> sqls) {
        this.sqls = sqls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditSqlsNewResponse that = (ListAuditSqlsNewResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.count, that.count)
            && Objects.equals(this.sqls, that.sqls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, count, sqls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditSqlsNewResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    sqls: ").append(toIndentedString(sqls)).append("\n");
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
