package com.huaweicloud.sdk.aom.v2.model;

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
public class ListNotifiedHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notified_histories")

    private List<NotifiedHistoriesResult> notifiedHistories = null;

    public ListNotifiedHistoriesResponse withNotifiedHistories(List<NotifiedHistoriesResult> notifiedHistories) {
        this.notifiedHistories = notifiedHistories;
        return this;
    }

    public ListNotifiedHistoriesResponse addNotifiedHistoriesItem(NotifiedHistoriesResult notifiedHistoriesItem) {
        if (this.notifiedHistories == null) {
            this.notifiedHistories = new ArrayList<>();
        }
        this.notifiedHistories.add(notifiedHistoriesItem);
        return this;
    }

    public ListNotifiedHistoriesResponse withNotifiedHistories(
        Consumer<List<NotifiedHistoriesResult>> notifiedHistoriesSetter) {
        if (this.notifiedHistories == null) {
            this.notifiedHistories = new ArrayList<>();
        }
        notifiedHistoriesSetter.accept(this.notifiedHistories);
        return this;
    }

    /**
     * 通知历史列表。
     * @return notifiedHistories
     */
    public List<NotifiedHistoriesResult> getNotifiedHistories() {
        return notifiedHistories;
    }

    public void setNotifiedHistories(List<NotifiedHistoriesResult> notifiedHistories) {
        this.notifiedHistories = notifiedHistories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotifiedHistoriesResponse that = (ListNotifiedHistoriesResponse) obj;
        return Objects.equals(this.notifiedHistories, that.notifiedHistories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifiedHistories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotifiedHistoriesResponse {\n");
        sb.append("    notifiedHistories: ").append(toIndentedString(notifiedHistories)).append("\n");
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
