package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FepGraphDto
 */
public class FepGraphDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "center_id")

    private String centerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pairs")

    private List<SimilarityDto> pairs = null;

    public FepGraphDto withCenterId(String centerId) {
        this.centerId = centerId;
        return this;
    }

    /**
     * 中心配体名称
     * @return centerId
     */
    public String getCenterId() {
        return centerId;
    }

    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    public FepGraphDto withPairs(List<SimilarityDto> pairs) {
        this.pairs = pairs;
        return this;
    }

    public FepGraphDto addPairsItem(SimilarityDto pairsItem) {
        if (this.pairs == null) {
            this.pairs = new ArrayList<>();
        }
        this.pairs.add(pairsItem);
        return this;
    }

    public FepGraphDto withPairs(Consumer<List<SimilarityDto>> pairsSetter) {
        if (this.pairs == null) {
            this.pairs = new ArrayList<>();
        }
        pairsSetter.accept(this.pairs);
        return this;
    }

    /**
     * 配体对列表
     * @return pairs
     */
    public List<SimilarityDto> getPairs() {
        return pairs;
    }

    public void setPairs(List<SimilarityDto> pairs) {
        this.pairs = pairs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FepGraphDto fepGraphDto = (FepGraphDto) o;
        return Objects.equals(this.centerId, fepGraphDto.centerId) && Objects.equals(this.pairs, fepGraphDto.pairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centerId, pairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FepGraphDto {\n");
        sb.append("    centerId: ").append(toIndentedString(centerId)).append("\n");
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
