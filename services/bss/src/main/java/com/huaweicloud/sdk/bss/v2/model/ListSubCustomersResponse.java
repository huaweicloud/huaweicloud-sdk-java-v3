package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSubCustomersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_infos")

    @JacksonXmlProperty(localName = "customer_infos")

    private List<CustomerInformation> customerInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListSubCustomersResponse withCustomerInfos(List<CustomerInformation> customerInfos) {
        this.customerInfos = customerInfos;
        return this;
    }

    public ListSubCustomersResponse addCustomerInfosItem(CustomerInformation customerInfosItem) {
        if (this.customerInfos == null) {
            this.customerInfos = new ArrayList<>();
        }
        this.customerInfos.add(customerInfosItem);
        return this;
    }

    public ListSubCustomersResponse withCustomerInfos(Consumer<List<CustomerInformation>> customerInfosSetter) {
        if (this.customerInfos == null) {
            this.customerInfos = new ArrayList<>();
        }
        customerInfosSetter.accept(this.customerInfos);
        return this;
    }

    /**
     * 客户信息列表。 具体请参见表1。
     * @return customerInfos
     */
    public List<CustomerInformation> getCustomerInfos() {
        return customerInfos;
    }

    public void setCustomerInfos(List<CustomerInformation> customerInfos) {
        this.customerInfos = customerInfos;
    }

    public ListSubCustomersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总记录数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubCustomersResponse listSubCustomersResponse = (ListSubCustomersResponse) o;
        return Objects.equals(this.customerInfos, listSubCustomersResponse.customerInfos)
            && Objects.equals(this.count, listSubCustomersResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerInfos, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomersResponse {\n");
        sb.append("    customerInfos: ").append(toIndentedString(customerInfos)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
