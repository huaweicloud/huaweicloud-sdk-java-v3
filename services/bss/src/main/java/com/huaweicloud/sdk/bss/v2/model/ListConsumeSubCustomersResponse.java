package com.huaweicloud.sdk.bss.v2.model;

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
public class ListConsumeSubCustomersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customers")

    private List<SubCustomerInfoV3> subCustomers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListConsumeSubCustomersResponse withSubCustomers(List<SubCustomerInfoV3> subCustomers) {
        this.subCustomers = subCustomers;
        return this;
    }

    public ListConsumeSubCustomersResponse addSubCustomersItem(SubCustomerInfoV3 subCustomersItem) {
        if (this.subCustomers == null) {
            this.subCustomers = new ArrayList<>();
        }
        this.subCustomers.add(subCustomersItem);
        return this;
    }

    public ListConsumeSubCustomersResponse withSubCustomers(Consumer<List<SubCustomerInfoV3>> subCustomersSetter) {
        if (this.subCustomers == null) {
            this.subCustomers = new ArrayList<>();
        }
        subCustomersSetter.accept(this.subCustomers);
        return this;
    }

    /**
     * 子客户列表。 具体请参见表SubCustomerInfo。
     * @return subCustomers
     */
    public List<SubCustomerInfoV3> getSubCustomers() {
        return subCustomers;
    }

    public void setSubCustomers(List<SubCustomerInfoV3> subCustomers) {
        this.subCustomers = subCustomers;
    }

    public ListConsumeSubCustomersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 结果集数量，只有成功才返回这个参数。
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
        ListConsumeSubCustomersResponse listConsumeSubCustomersResponse = (ListConsumeSubCustomersResponse) o;
        return Objects.equals(this.subCustomers, listConsumeSubCustomersResponse.subCustomers)
            && Objects.equals(this.totalCount, listConsumeSubCustomersResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCustomers, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConsumeSubCustomersResponse {\n");
        sb.append("    subCustomers: ").append(toIndentedString(subCustomers)).append("\n");
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
