package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowTrainingSegmentInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirmed_index")

    private List<Integer> confirmedIndex = null;

    public ShowTrainingSegmentInfoResponse withConfirmedIndex(List<Integer> confirmedIndex) {
        this.confirmedIndex = confirmedIndex;
        return this;
    }

    public ShowTrainingSegmentInfoResponse addConfirmedIndexItem(Integer confirmedIndexItem) {
        if (this.confirmedIndex == null) {
            this.confirmedIndex = new ArrayList<>();
        }
        this.confirmedIndex.add(confirmedIndexItem);
        return this;
    }

    public ShowTrainingSegmentInfoResponse withConfirmedIndex(Consumer<List<Integer>> confirmedIndexSetter) {
        if (this.confirmedIndex == null) {
            this.confirmedIndex = new ArrayList<>();
        }
        confirmedIndexSetter.accept(this.confirmedIndex);
        return this;
    }

    /**
     * 确认过的语句索引。
     * @return confirmedIndex
     */
    public List<Integer> getConfirmedIndex() {
        return confirmedIndex;
    }

    public void setConfirmedIndex(List<Integer> confirmedIndex) {
        this.confirmedIndex = confirmedIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrainingSegmentInfoResponse that = (ShowTrainingSegmentInfoResponse) obj;
        return Objects.equals(this.confirmedIndex, that.confirmedIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confirmedIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingSegmentInfoResponse {\n");
        sb.append("    confirmedIndex: ").append(toIndentedString(confirmedIndex)).append("\n");
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
