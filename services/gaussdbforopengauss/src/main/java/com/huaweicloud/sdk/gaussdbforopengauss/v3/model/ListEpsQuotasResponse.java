package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListQuotaResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEpsQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eps_quotas")
    
    
    private List<ListQuotaResult> epsQuotas = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListEpsQuotasResponse withEpsQuotas(List<ListQuotaResult> epsQuotas) {
        this.epsQuotas = epsQuotas;
        return this;
    }

    
    public ListEpsQuotasResponse addEpsQuotasItem(ListQuotaResult epsQuotasItem) {
        if(this.epsQuotas == null) {
            this.epsQuotas = new ArrayList<>();
        }
        this.epsQuotas.add(epsQuotasItem);
        return this;
    }

    public ListEpsQuotasResponse withEpsQuotas(Consumer<List<ListQuotaResult>> epsQuotasSetter) {
        if(this.epsQuotas == null) {
            this.epsQuotas = new ArrayList<>();
        }
        epsQuotasSetter.accept(this.epsQuotas);
        return this;
    }

    /**
     * 企业配额列表。
     * @return epsQuotas
     */
    public List<ListQuotaResult> getEpsQuotas() {
        return epsQuotas;
    }

    public void setEpsQuotas(List<ListQuotaResult> epsQuotas) {
        this.epsQuotas = epsQuotas;
    }

    

    public ListEpsQuotasResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 配额组数量。
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
        ListEpsQuotasResponse listEpsQuotasResponse = (ListEpsQuotasResponse) o;
        return Objects.equals(this.epsQuotas, listEpsQuotasResponse.epsQuotas) &&
            Objects.equals(this.totalCount, listEpsQuotasResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(epsQuotas, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEpsQuotasResponse {\n");
        sb.append("    epsQuotas: ").append(toIndentedString(epsQuotas)).append("\n");
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

