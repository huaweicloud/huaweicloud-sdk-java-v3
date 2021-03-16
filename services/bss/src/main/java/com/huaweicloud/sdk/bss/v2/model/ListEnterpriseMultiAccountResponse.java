package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.RetrieveAmountInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEnterpriseMultiAccountResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount_infos")
    
    private List<RetrieveAmountInfoV2> amountInfos = null;
    
    public ListEnterpriseMultiAccountResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 记录条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListEnterpriseMultiAccountResponse withAmountInfos(List<RetrieveAmountInfoV2> amountInfos) {
        this.amountInfos = amountInfos;
        return this;
    }

    
    public ListEnterpriseMultiAccountResponse addAmountInfosItem(RetrieveAmountInfoV2 amountInfosItem) {
        this.amountInfos.add(amountInfosItem);
        return this;
    }

    public ListEnterpriseMultiAccountResponse withAmountInfos(Consumer<List<RetrieveAmountInfoV2>> amountInfosSetter) {
        if(this.amountInfos == null ){
            this.amountInfos = new ArrayList<>();
        }
        amountInfosSetter.accept(this.amountInfos);
        return this;
    }

    /**
     * 可回收余额信息，如果是余额账户，只会有一条记录。 具体请参见表2。
     * @return amountInfos
     */
    public List<RetrieveAmountInfoV2> getAmountInfos() {
        return amountInfos;
    }

    public void setAmountInfos(List<RetrieveAmountInfoV2> amountInfos) {
        this.amountInfos = amountInfos;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnterpriseMultiAccountResponse listEnterpriseMultiAccountResponse = (ListEnterpriseMultiAccountResponse) o;
        return Objects.equals(this.totalCount, listEnterpriseMultiAccountResponse.totalCount) &&
            Objects.equals(this.amountInfos, listEnterpriseMultiAccountResponse.amountInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, amountInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseMultiAccountResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    amountInfos: ").append(toIndentedString(amountInfos)).append("\n");
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

