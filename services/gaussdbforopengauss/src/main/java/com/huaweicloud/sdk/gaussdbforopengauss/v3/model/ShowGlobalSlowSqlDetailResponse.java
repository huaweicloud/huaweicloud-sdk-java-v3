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
public class ShowGlobalSlowSqlDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_details")

    private List<SlowSqlDetailResult> slowSqlDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowGlobalSlowSqlDetailResponse withSlowSqlDetails(List<SlowSqlDetailResult> slowSqlDetails) {
        this.slowSqlDetails = slowSqlDetails;
        return this;
    }

    public ShowGlobalSlowSqlDetailResponse addSlowSqlDetailsItem(SlowSqlDetailResult slowSqlDetailsItem) {
        if (this.slowSqlDetails == null) {
            this.slowSqlDetails = new ArrayList<>();
        }
        this.slowSqlDetails.add(slowSqlDetailsItem);
        return this;
    }

    public ShowGlobalSlowSqlDetailResponse withSlowSqlDetails(
        Consumer<List<SlowSqlDetailResult>> slowSqlDetailsSetter) {
        if (this.slowSqlDetails == null) {
            this.slowSqlDetails = new ArrayList<>();
        }
        slowSqlDetailsSetter.accept(this.slowSqlDetails);
        return this;
    }

    /**
     * **参数解释**: 慢SQL详情列表。
     * @return slowSqlDetails
     */
    public List<SlowSqlDetailResult> getSlowSqlDetails() {
        return slowSqlDetails;
    }

    public void setSlowSqlDetails(List<SlowSqlDetailResult> slowSqlDetails) {
        this.slowSqlDetails = slowSqlDetails;
    }

    public ShowGlobalSlowSqlDetailResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 返回的慢SQL数量。 **取值范围**: 不涉及。
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
        ShowGlobalSlowSqlDetailResponse that = (ShowGlobalSlowSqlDetailResponse) obj;
        return Objects.equals(this.slowSqlDetails, that.slowSqlDetails) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowSqlDetails, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGlobalSlowSqlDetailResponse {\n");
        sb.append("    slowSqlDetails: ").append(toIndentedString(slowSqlDetails)).append("\n");
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
