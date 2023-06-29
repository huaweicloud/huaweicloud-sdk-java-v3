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
public class ShowMultiAccountTransferAmountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_infos")

    private List<TransferAmountInfoV2> amountInfos = null;

    public ShowMultiAccountTransferAmountResponse withTotalCount(Integer totalCount) {
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

    public ShowMultiAccountTransferAmountResponse withAmountInfos(List<TransferAmountInfoV2> amountInfos) {
        this.amountInfos = amountInfos;
        return this;
    }

    public ShowMultiAccountTransferAmountResponse addAmountInfosItem(TransferAmountInfoV2 amountInfosItem) {
        if (this.amountInfos == null) {
            this.amountInfos = new ArrayList<>();
        }
        this.amountInfos.add(amountInfosItem);
        return this;
    }

    public ShowMultiAccountTransferAmountResponse withAmountInfos(
        Consumer<List<TransferAmountInfoV2>> amountInfosSetter) {
        if (this.amountInfos == null) {
            this.amountInfos = new ArrayList<>();
        }
        amountInfosSetter.accept(this.amountInfos);
        return this;
    }

    /**
     * 可拨款余额信息，如果是余额账户，只会有一条记录。 具体请参见表2。
     * @return amountInfos
     */
    public List<TransferAmountInfoV2> getAmountInfos() {
        return amountInfos;
    }

    public void setAmountInfos(List<TransferAmountInfoV2> amountInfos) {
        this.amountInfos = amountInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMultiAccountTransferAmountResponse that = (ShowMultiAccountTransferAmountResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.amountInfos, that.amountInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, amountInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMultiAccountTransferAmountResponse {\n");
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
