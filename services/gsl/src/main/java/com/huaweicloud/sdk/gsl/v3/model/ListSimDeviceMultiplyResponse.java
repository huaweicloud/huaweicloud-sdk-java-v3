package com.huaweicloud.sdk.gsl.v3.model;

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
public class ListSimDeviceMultiplyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_cards")

    private List<SimDeviceMultiplyVO> simCards = null;

    public ListSimDeviceMultiplyResponse withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListSimDeviceMultiplyResponse withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListSimDeviceMultiplyResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListSimDeviceMultiplyResponse withSimCards(List<SimDeviceMultiplyVO> simCards) {
        this.simCards = simCards;
        return this;
    }

    public ListSimDeviceMultiplyResponse addSimCardsItem(SimDeviceMultiplyVO simCardsItem) {
        if (this.simCards == null) {
            this.simCards = new ArrayList<>();
        }
        this.simCards.add(simCardsItem);
        return this;
    }

    public ListSimDeviceMultiplyResponse withSimCards(Consumer<List<SimDeviceMultiplyVO>> simCardsSetter) {
        if (this.simCards == null) {
            this.simCards = new ArrayList<>();
        }
        simCardsSetter.accept(this.simCards);
        return this;
    }

    /**
     * 三网卡数据集合
     * @return simCards
     */
    public List<SimDeviceMultiplyVO> getSimCards() {
        return simCards;
    }

    public void setSimCards(List<SimDeviceMultiplyVO> simCards) {
        this.simCards = simCards;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSimDeviceMultiplyResponse that = (ListSimDeviceMultiplyResponse) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.count, that.count) && Objects.equals(this.simCards, that.simCards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, count, simCards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimDeviceMultiplyResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    simCards: ").append(toIndentedString(simCards)).append("\n");
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
