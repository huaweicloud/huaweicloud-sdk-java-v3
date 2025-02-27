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
public class ListEnterpriseSubCustomersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_infos")

    private List<SubCustomerInfoV2> subCustomerInfos = null;

    public ListEnterpriseSubCustomersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 结果集数量，成功才有。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListEnterpriseSubCustomersResponse withSubCustomerInfos(List<SubCustomerInfoV2> subCustomerInfos) {
        this.subCustomerInfos = subCustomerInfos;
        return this;
    }

    public ListEnterpriseSubCustomersResponse addSubCustomerInfosItem(SubCustomerInfoV2 subCustomerInfosItem) {
        if (this.subCustomerInfos == null) {
            this.subCustomerInfos = new ArrayList<>();
        }
        this.subCustomerInfos.add(subCustomerInfosItem);
        return this;
    }

    public ListEnterpriseSubCustomersResponse withSubCustomerInfos(
        Consumer<List<SubCustomerInfoV2>> subCustomerInfosSetter) {
        if (this.subCustomerInfos == null) {
            this.subCustomerInfos = new ArrayList<>();
        }
        subCustomerInfosSetter.accept(this.subCustomerInfos);
        return this;
    }

    /**
     * 客户信息列表，成功才有。 具体请参见表2。
     * @return subCustomerInfos
     */
    public List<SubCustomerInfoV2> getSubCustomerInfos() {
        return subCustomerInfos;
    }

    public void setSubCustomerInfos(List<SubCustomerInfoV2> subCustomerInfos) {
        this.subCustomerInfos = subCustomerInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnterpriseSubCustomersResponse that = (ListEnterpriseSubCustomersResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.subCustomerInfos, that.subCustomerInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, subCustomerInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseSubCustomersResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    subCustomerInfos: ").append(toIndentedString(subCustomerInfos)).append("\n");
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
