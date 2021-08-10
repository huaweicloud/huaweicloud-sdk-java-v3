package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSubCustomersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_infos")

    private List<SubCutomerInfoV2> subCustomerInfos = null;

    public ListSubCustomersResponse withSubCustomerInfos(List<SubCutomerInfoV2> subCustomerInfos) {
        this.subCustomerInfos = subCustomerInfos;
        return this;
    }

    public ListSubCustomersResponse addSubCustomerInfosItem(SubCutomerInfoV2 subCustomerInfosItem) {
        if (this.subCustomerInfos == null) {
            this.subCustomerInfos = new ArrayList<>();
        }
        this.subCustomerInfos.add(subCustomerInfosItem);
        return this;
    }

    public ListSubCustomersResponse withSubCustomerInfos(Consumer<List<SubCutomerInfoV2>> subCustomerInfosSetter) {
        if (this.subCustomerInfos == null) {
            this.subCustomerInfos = new ArrayList<>();
        }
        subCustomerInfosSetter.accept(this.subCustomerInfos);
        return this;
    }

    /** 子用户列表
     * 
     * @return subCustomerInfos */
    public List<SubCutomerInfoV2> getSubCustomerInfos() {
        return subCustomerInfos;
    }

    public void setSubCustomerInfos(List<SubCutomerInfoV2> subCustomerInfos) {
        this.subCustomerInfos = subCustomerInfos;
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
        return Objects.equals(this.subCustomerInfos, listSubCustomersResponse.subCustomerInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCustomerInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomersResponse {\n");
        sb.append("    subCustomerInfos: ").append(toIndentedString(subCustomerInfos)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
