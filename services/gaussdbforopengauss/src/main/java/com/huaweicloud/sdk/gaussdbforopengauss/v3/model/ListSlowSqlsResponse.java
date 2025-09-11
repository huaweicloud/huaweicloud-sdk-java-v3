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
public class ListSlowSqlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_infos")

    private List<SlowSQLInfoResult> slowSqlInfos = null;

    public ListSlowSqlsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 总数。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSlowSqlsResponse withSlowSqlInfos(List<SlowSQLInfoResult> slowSqlInfos) {
        this.slowSqlInfos = slowSqlInfos;
        return this;
    }

    public ListSlowSqlsResponse addSlowSqlInfosItem(SlowSQLInfoResult slowSqlInfosItem) {
        if (this.slowSqlInfos == null) {
            this.slowSqlInfos = new ArrayList<>();
        }
        this.slowSqlInfos.add(slowSqlInfosItem);
        return this;
    }

    public ListSlowSqlsResponse withSlowSqlInfos(Consumer<List<SlowSQLInfoResult>> slowSqlInfosSetter) {
        if (this.slowSqlInfos == null) {
            this.slowSqlInfos = new ArrayList<>();
        }
        slowSqlInfosSetter.accept(this.slowSqlInfos);
        return this;
    }

    /**
     * **参数解释**: 慢SQL列表。
     * @return slowSqlInfos
     */
    public List<SlowSQLInfoResult> getSlowSqlInfos() {
        return slowSqlInfos;
    }

    public void setSlowSqlInfos(List<SlowSQLInfoResult> slowSqlInfos) {
        this.slowSqlInfos = slowSqlInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSlowSqlsResponse that = (ListSlowSqlsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.slowSqlInfos, that.slowSqlInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, slowSqlInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSlowSqlsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    slowSqlInfos: ").append(toIndentedString(slowSqlInfos)).append("\n");
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
