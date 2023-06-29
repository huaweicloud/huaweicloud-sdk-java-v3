package com.huaweicloud.sdk.dws.v2.model;

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
public class ListClusterScaleInNumbersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrink_sequence")

    private List<String> shrinkSequence = null;

    public ListClusterScaleInNumbersResponse withShrinkSequence(List<String> shrinkSequence) {
        this.shrinkSequence = shrinkSequence;
        return this;
    }

    public ListClusterScaleInNumbersResponse addShrinkSequenceItem(String shrinkSequenceItem) {
        if (this.shrinkSequence == null) {
            this.shrinkSequence = new ArrayList<>();
        }
        this.shrinkSequence.add(shrinkSequenceItem);
        return this;
    }

    public ListClusterScaleInNumbersResponse withShrinkSequence(Consumer<List<String>> shrinkSequenceSetter) {
        if (this.shrinkSequence == null) {
            this.shrinkSequence = new ArrayList<>();
        }
        shrinkSequenceSetter.accept(this.shrinkSequence);
        return this;
    }

    /**
     * 合适的缩容数
     * @return shrinkSequence
     */
    public List<String> getShrinkSequence() {
        return shrinkSequence;
    }

    public void setShrinkSequence(List<String> shrinkSequence) {
        this.shrinkSequence = shrinkSequence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterScaleInNumbersResponse that = (ListClusterScaleInNumbersResponse) obj;
        return Objects.equals(this.shrinkSequence, that.shrinkSequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shrinkSequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterScaleInNumbersResponse {\n");
        sb.append("    shrinkSequence: ").append(toIndentedString(shrinkSequence)).append("\n");
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
