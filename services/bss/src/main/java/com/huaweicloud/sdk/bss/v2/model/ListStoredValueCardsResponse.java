package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListStoredValueCardsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stored_value_cards")

    private List<UserStoredValueCard> storedValueCards = null;

    public ListStoredValueCardsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 符合查询条件的总条数。
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListStoredValueCardsResponse withStoredValueCards(List<UserStoredValueCard> storedValueCards) {
        this.storedValueCards = storedValueCards;
        return this;
    }

    public ListStoredValueCardsResponse addStoredValueCardsItem(UserStoredValueCard storedValueCardsItem) {
        if (this.storedValueCards == null) {
            this.storedValueCards = new ArrayList<>();
        }
        this.storedValueCards.add(storedValueCardsItem);
        return this;
    }

    public ListStoredValueCardsResponse withStoredValueCards(
        Consumer<List<UserStoredValueCard>> storedValueCardsSetter) {
        if (this.storedValueCards == null) {
            this.storedValueCards = new ArrayList<>();
        }
        storedValueCardsSetter.accept(this.storedValueCards);
        return this;
    }

    /** 优惠券记录。 具体请参见表2。
     * 
     * @return storedValueCards */
    public List<UserStoredValueCard> getStoredValueCards() {
        return storedValueCards;
    }

    public void setStoredValueCards(List<UserStoredValueCard> storedValueCards) {
        this.storedValueCards = storedValueCards;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStoredValueCardsResponse listStoredValueCardsResponse = (ListStoredValueCardsResponse) o;
        return Objects.equals(this.totalCount, listStoredValueCardsResponse.totalCount)
            && Objects.equals(this.storedValueCards, listStoredValueCardsResponse.storedValueCards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, storedValueCards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStoredValueCardsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    storedValueCards: ").append(toIndentedString(storedValueCards)).append("\n");
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
