package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.IssuedCouponQuota;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListIssuedCouponQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    private List<IssuedCouponQuota> quotas = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListIssuedCouponQuotasResponse withQuotas(List<IssuedCouponQuota> quotas) {
        this.quotas = quotas;
        return this;
    }

    
    public ListIssuedCouponQuotasResponse addQuotasItem(IssuedCouponQuota quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ListIssuedCouponQuotasResponse withQuotas(Consumer<List<IssuedCouponQuota>> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * |参数名称：额度记录列表。具体请参见IssuedCouponQuota。| |参数约束以及描述：额度记录列表。具体请参见IssuedCouponQuota。|
     * @return quotas
     */
    public List<IssuedCouponQuota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<IssuedCouponQuota> quotas) {
        this.quotas = quotas;
    }

    public ListIssuedCouponQuotasResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：查询总数。| |参数的约束及描述：查询总数。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssuedCouponQuotasResponse listIssuedCouponQuotasResponse = (ListIssuedCouponQuotasResponse) o;
        return Objects.equals(this.quotas, listIssuedCouponQuotasResponse.quotas) &&
            Objects.equals(this.totalCount, listIssuedCouponQuotasResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotas, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuedCouponQuotasResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

