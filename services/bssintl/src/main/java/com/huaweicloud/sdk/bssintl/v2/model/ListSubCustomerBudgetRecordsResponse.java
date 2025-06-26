package com.huaweicloud.sdk.bssintl.v2.model;

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
public class ListSubCustomerBudgetRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_list")

    private List<BudgetRecordInfo> recordList = null;

    public ListSubCustomerBudgetRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * |参数名称：返回总条数。| |参数的约束及描述：范围限制：0-2147483647|
     * minimum: 0
     * maximum: 2147483647
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListSubCustomerBudgetRecordsResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * |参数名称：金额单位。||参数的约束及描述：范围限制：0-3。1：元|
     * minimum: 0
     * maximum: 3
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ListSubCustomerBudgetRecordsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * |参数名称：币种。||参数的约束及描述：范围限制：0-10。CNY：人民币，USD：美元|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListSubCustomerBudgetRecordsResponse withRecordList(List<BudgetRecordInfo> recordList) {
        this.recordList = recordList;
        return this;
    }

    public ListSubCustomerBudgetRecordsResponse addRecordListItem(BudgetRecordInfo recordListItem) {
        if (this.recordList == null) {
            this.recordList = new ArrayList<>();
        }
        this.recordList.add(recordListItem);
        return this;
    }

    public ListSubCustomerBudgetRecordsResponse withRecordList(Consumer<List<BudgetRecordInfo>> recordListSetter) {
        if (this.recordList == null) {
            this.recordList = new ArrayList<>();
        }
        recordListSetter.accept(this.recordList);
        return this;
    }

    /**
     * |参数名称：客户预算设置记录列表。||参数的约束及描述：客户预算设置记录列表|
     * @return recordList
     */
    public List<BudgetRecordInfo> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<BudgetRecordInfo> recordList) {
        this.recordList = recordList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubCustomerBudgetRecordsResponse that = (ListSubCustomerBudgetRecordsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.measureId, that.measureId)
            && Objects.equals(this.currency, that.currency) && Objects.equals(this.recordList, that.recordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, measureId, currency, recordList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerBudgetRecordsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    recordList: ").append(toIndentedString(recordList)).append("\n");
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
