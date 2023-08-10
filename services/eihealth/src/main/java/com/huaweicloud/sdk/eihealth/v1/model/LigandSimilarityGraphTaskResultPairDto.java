package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体相似度图任务结果对，成功则返回similarity，失败则返回reason
 */
public class LigandSimilarityGraphTaskResultPairDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<String> ligands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similarity")

    private Float similarity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public LigandSimilarityGraphTaskResultPairDto withLigands(List<String> ligands) {
        this.ligands = ligands;
        return this;
    }

    public LigandSimilarityGraphTaskResultPairDto addLigandsItem(String ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public LigandSimilarityGraphTaskResultPairDto withLigands(Consumer<List<String>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 两个配体名称
     * @return ligands
     */
    public List<String> getLigands() {
        return ligands;
    }

    public void setLigands(List<String> ligands) {
        this.ligands = ligands;
    }

    public LigandSimilarityGraphTaskResultPairDto withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 相似度计算是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public LigandSimilarityGraphTaskResultPairDto withSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * 配体对之间的相似度
     * minimum: 0
     * maximum: 1
     * @return similarity
     */
    public Float getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    public LigandSimilarityGraphTaskResultPairDto withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 相似度计算失败的理由
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LigandSimilarityGraphTaskResultPairDto that = (LigandSimilarityGraphTaskResultPairDto) obj;
        return Objects.equals(this.ligands, that.ligands) && Objects.equals(this.success, that.success)
            && Objects.equals(this.similarity, that.similarity) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ligands, success, similarity, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LigandSimilarityGraphTaskResultPairDto {\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
