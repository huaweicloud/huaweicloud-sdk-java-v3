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
public class ConfirmTrainingSegmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confirm_result")

    private Boolean confirmResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unmatched_index_hit")

    private List<Integer> unmatchedIndexHit = null;

    public ConfirmTrainingSegmentResponse withConfirmResult(Boolean confirmResult) {
        this.confirmResult = confirmResult;
        return this;
    }

    /**
     * 是否确认成功。
     * @return confirmResult
     */
    public Boolean getConfirmResult() {
        return confirmResult;
    }

    public void setConfirmResult(Boolean confirmResult) {
        this.confirmResult = confirmResult;
    }

    public ConfirmTrainingSegmentResponse withUnmatchedIndexHit(List<Integer> unmatchedIndexHit) {
        this.unmatchedIndexHit = unmatchedIndexHit;
        return this;
    }

    public ConfirmTrainingSegmentResponse addUnmatchedIndexHitItem(Integer unmatchedIndexHitItem) {
        if (this.unmatchedIndexHit == null) {
            this.unmatchedIndexHit = new ArrayList<>();
        }
        this.unmatchedIndexHit.add(unmatchedIndexHitItem);
        return this;
    }

    public ConfirmTrainingSegmentResponse withUnmatchedIndexHit(Consumer<List<Integer>> unmatchedIndexHitSetter) {
        if (this.unmatchedIndexHit == null) {
            this.unmatchedIndexHit = new ArrayList<>();
        }
        unmatchedIndexHitSetter.accept(this.unmatchedIndexHit);
        return this;
    }

    /**
     * 讲解不匹配的文本索引。
     * @return unmatchedIndexHit
     */
    public List<Integer> getUnmatchedIndexHit() {
        return unmatchedIndexHit;
    }

    public void setUnmatchedIndexHit(List<Integer> unmatchedIndexHit) {
        this.unmatchedIndexHit = unmatchedIndexHit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmTrainingSegmentResponse that = (ConfirmTrainingSegmentResponse) obj;
        return Objects.equals(this.confirmResult, that.confirmResult)
            && Objects.equals(this.unmatchedIndexHit, that.unmatchedIndexHit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confirmResult, unmatchedIndexHit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmTrainingSegmentResponse {\n");
        sb.append("    confirmResult: ").append(toIndentedString(confirmResult)).append("\n");
        sb.append("    unmatchedIndexHit: ").append(toIndentedString(unmatchedIndexHit)).append("\n");
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
