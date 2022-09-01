package com.huaweicloud.sdk.gsl.v3.model;

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
public class ListSimCardsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_cards")

    @JacksonXmlProperty(localName = "sim_cards")

    private List<SimDeviceVO> simCards = null;

    public ListSimCardsResponse withLimit(Long limit) {
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

    public ListSimCardsResponse withOffset(Long offset) {
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

    public ListSimCardsResponse withCount(Long count) {
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

    public ListSimCardsResponse withSimCards(List<SimDeviceVO> simCards) {
        this.simCards = simCards;
        return this;
    }

    public ListSimCardsResponse addSimCardsItem(SimDeviceVO simCardsItem) {
        if (this.simCards == null) {
            this.simCards = new ArrayList<>();
        }
        this.simCards.add(simCardsItem);
        return this;
    }

    public ListSimCardsResponse withSimCards(Consumer<List<SimDeviceVO>> simCardsSetter) {
        if (this.simCards == null) {
            this.simCards = new ArrayList<>();
        }
        simCardsSetter.accept(this.simCards);
        return this;
    }

    /**
     * sim卡数据集合
     * @return simCards
     */
    public List<SimDeviceVO> getSimCards() {
        return simCards;
    }

    public void setSimCards(List<SimDeviceVO> simCards) {
        this.simCards = simCards;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSimCardsResponse listSimCardsResponse = (ListSimCardsResponse) o;
        return Objects.equals(this.limit, listSimCardsResponse.limit)
            && Objects.equals(this.offset, listSimCardsResponse.offset)
            && Objects.equals(this.count, listSimCardsResponse.count)
            && Objects.equals(this.simCards, listSimCardsResponse.simCards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, count, simCards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimCardsResponse {\n");
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
