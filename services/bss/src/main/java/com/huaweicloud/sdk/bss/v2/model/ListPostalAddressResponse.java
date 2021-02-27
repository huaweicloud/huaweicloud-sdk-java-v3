package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CustomerPostalAddressV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPostalAddressResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="postal_address")
    
    private List<CustomerPostalAddressV2> postalAddress = null;
    
    public ListPostalAddressResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 邮寄地址的个数，只有成功的时候才返回。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListPostalAddressResponse withPostalAddress(List<CustomerPostalAddressV2> postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    
    public ListPostalAddressResponse addPostalAddressItem(CustomerPostalAddressV2 postalAddressItem) {
        if (this.postalAddress == null) {
            this.postalAddress = new ArrayList<>();
        }
        this.postalAddress.add(postalAddressItem);
        return this;
    }

    public ListPostalAddressResponse withPostalAddress(Consumer<List<CustomerPostalAddressV2>> postalAddressSetter) {
        if(this.postalAddress == null ){
            this.postalAddress = new ArrayList<>();
        }
        postalAddressSetter.accept(this.postalAddress);
        return this;
    }

    /**
     * 邮寄地址，具体参见表2。
     * @return postalAddress
     */
    public List<CustomerPostalAddressV2> getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(List<CustomerPostalAddressV2> postalAddress) {
        this.postalAddress = postalAddress;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPostalAddressResponse listPostalAddressResponse = (ListPostalAddressResponse) o;
        return Objects.equals(this.totalCount, listPostalAddressResponse.totalCount) &&
            Objects.equals(this.postalAddress, listPostalAddressResponse.postalAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, postalAddress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostalAddressResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

