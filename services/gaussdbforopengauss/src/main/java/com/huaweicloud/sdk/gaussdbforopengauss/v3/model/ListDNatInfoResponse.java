package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListDNatInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_list")

    private List<DNatInfoResult> dnatList = null;

    public ListDNatInfoResponse withDnatList(List<DNatInfoResult> dnatList) {
        this.dnatList = dnatList;
        return this;
    }

    public ListDNatInfoResponse addDnatListItem(DNatInfoResult dnatListItem) {
        if (this.dnatList == null) {
            this.dnatList = new ArrayList<>();
        }
        this.dnatList.add(dnatListItem);
        return this;
    }

    public ListDNatInfoResponse withDnatList(Consumer<List<DNatInfoResult>> dnatListSetter) {
        if (this.dnatList == null) {
            this.dnatList = new ArrayList<>();
        }
        dnatListSetter.accept(this.dnatList);
        return this;
    }

    /**
     * **参数解释**: 查询实例已绑定的NAT网关列表。
     * @return dnatList
     */
    public List<DNatInfoResult> getDnatList() {
        return dnatList;
    }

    public void setDnatList(List<DNatInfoResult> dnatList) {
        this.dnatList = dnatList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDNatInfoResponse that = (ListDNatInfoResponse) obj;
        return Objects.equals(this.dnatList, that.dnatList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDNatInfoResponse {\n");
        sb.append("    dnatList: ").append(toIndentedString(dnatList)).append("\n");
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
