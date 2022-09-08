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
public class ShowRefundOrderDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refund_infos")

    private List<OrderRefundInfoV2> refundInfos = null;

    public ShowRefundOrderDetailsResponse withTotalCount(Integer totalCount) {
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

    public ShowRefundOrderDetailsResponse withRefundInfos(List<OrderRefundInfoV2> refundInfos) {
        this.refundInfos = refundInfos;
        return this;
    }

    public ShowRefundOrderDetailsResponse addRefundInfosItem(OrderRefundInfoV2 refundInfosItem) {
        if (this.refundInfos == null) {
            this.refundInfos = new ArrayList<>();
        }
        this.refundInfos.add(refundInfosItem);
        return this;
    }

    public ShowRefundOrderDetailsResponse withRefundInfos(Consumer<List<OrderRefundInfoV2>> refundInfosSetter) {
        if (this.refundInfos == null) {
            this.refundInfos = new ArrayList<>();
        }
        refundInfosSetter.accept(this.refundInfos);
        return this;
    }

    /**
     * 资源信息列表。 具体请参见表2。
     * @return refundInfos
     */
    public List<OrderRefundInfoV2> getRefundInfos() {
        return refundInfos;
    }

    public void setRefundInfos(List<OrderRefundInfoV2> refundInfos) {
        this.refundInfos = refundInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRefundOrderDetailsResponse showRefundOrderDetailsResponse = (ShowRefundOrderDetailsResponse) o;
        return Objects.equals(this.totalCount, showRefundOrderDetailsResponse.totalCount)
            && Objects.equals(this.refundInfos, showRefundOrderDetailsResponse.refundInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, refundInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRefundOrderDetailsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    refundInfos: ").append(toIndentedString(refundInfos)).append("\n");
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
