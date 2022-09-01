package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListStoredValueCardsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_id")

    @JacksonXmlProperty(localName = "card_id")

    private String cardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ListStoredValueCardsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态：1：可使用2：已用完
     * minimum: 1
     * maximum: 2
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListStoredValueCardsRequest withCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }

    /**
     * 储值卡ID。此参数不携带或携带值为空时，不作为筛选条件。
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public ListStoredValueCardsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListStoredValueCardsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询的优惠券数量，默认值为10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStoredValueCardsRequest listStoredValueCardsRequest = (ListStoredValueCardsRequest) o;
        return Objects.equals(this.status, listStoredValueCardsRequest.status)
            && Objects.equals(this.cardId, listStoredValueCardsRequest.cardId)
            && Objects.equals(this.offset, listStoredValueCardsRequest.offset)
            && Objects.equals(this.limit, listStoredValueCardsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, cardId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStoredValueCardsRequest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
