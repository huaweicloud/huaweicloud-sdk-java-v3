package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体相似度图任务结果
 */
public class LigandSimilarityGraphTaskResultDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pairs")

    private List<LigandSimilarityGraphTaskResultPairDto> pairs = null;

    public LigandSimilarityGraphTaskResultDto withPairs(List<LigandSimilarityGraphTaskResultPairDto> pairs) {
        this.pairs = pairs;
        return this;
    }

    public LigandSimilarityGraphTaskResultDto addPairsItem(LigandSimilarityGraphTaskResultPairDto pairsItem) {
        if (this.pairs == null) {
            this.pairs = new ArrayList<>();
        }
        this.pairs.add(pairsItem);
        return this;
    }

    public LigandSimilarityGraphTaskResultDto withPairs(
        Consumer<List<LigandSimilarityGraphTaskResultPairDto>> pairsSetter) {
        if (this.pairs == null) {
            this.pairs = new ArrayList<>();
        }
        pairsSetter.accept(this.pairs);
        return this;
    }

    /**
     * 配体相似度图任务结果对列表
     * @return pairs
     */
    public List<LigandSimilarityGraphTaskResultPairDto> getPairs() {
        return pairs;
    }

    public void setPairs(List<LigandSimilarityGraphTaskResultPairDto> pairs) {
        this.pairs = pairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LigandSimilarityGraphTaskResultDto that = (LigandSimilarityGraphTaskResultDto) obj;
        return Objects.equals(this.pairs, that.pairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LigandSimilarityGraphTaskResultDto {\n");
        sb.append("    pairs: ").append(toIndentedString(pairs)).append("\n");
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
