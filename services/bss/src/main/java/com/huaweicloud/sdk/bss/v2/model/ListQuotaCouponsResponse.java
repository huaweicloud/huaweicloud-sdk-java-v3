package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CouponQuotaV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListQuotaCouponsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    private List<CouponQuotaV2> quotas = null;
    
    public ListQuotaCouponsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 查询总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListQuotaCouponsResponse withQuotas(List<CouponQuotaV2> quotas) {
        this.quotas = quotas;
        return this;
    }

    
    public ListQuotaCouponsResponse addQuotasItem(CouponQuotaV2 quotasItem) {
        this.quotas.add(quotasItem);
        return this;
    }

    public ListQuotaCouponsResponse withQuotas(Consumer<List<CouponQuotaV2>> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * 额度记录列表。 具体请参见表2。
     * @return quotas
     */
    public List<CouponQuotaV2> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<CouponQuotaV2> quotas) {
        this.quotas = quotas;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQuotaCouponsResponse listQuotaCouponsResponse = (ListQuotaCouponsResponse) o;
        return Objects.equals(this.totalCount, listQuotaCouponsResponse.totalCount) &&
            Objects.equals(this.quotas, listQuotaCouponsResponse.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaCouponsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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

