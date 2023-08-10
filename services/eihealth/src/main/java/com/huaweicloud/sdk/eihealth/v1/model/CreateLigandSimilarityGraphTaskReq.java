package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建配体相似度图任务请求体
 */
public class CreateLigandSimilarityGraphTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private LigandSimilarityGraphMode mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<CreateLigandSimilarityGraphLigandDto> ligands = null;

    public CreateLigandSimilarityGraphTaskReq withMode(LigandSimilarityGraphMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     * @return mode
     */
    public LigandSimilarityGraphMode getMode() {
        return mode;
    }

    public void setMode(LigandSimilarityGraphMode mode) {
        this.mode = mode;
    }

    public CreateLigandSimilarityGraphTaskReq withLigands(List<CreateLigandSimilarityGraphLigandDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public CreateLigandSimilarityGraphTaskReq addLigandsItem(CreateLigandSimilarityGraphLigandDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public CreateLigandSimilarityGraphTaskReq withLigands(
        Consumer<List<CreateLigandSimilarityGraphLigandDto>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 配体列表
     * @return ligands
     */
    public List<CreateLigandSimilarityGraphLigandDto> getLigands() {
        return ligands;
    }

    public void setLigands(List<CreateLigandSimilarityGraphLigandDto> ligands) {
        this.ligands = ligands;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLigandSimilarityGraphTaskReq that = (CreateLigandSimilarityGraphTaskReq) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.ligands, that.ligands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, ligands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLigandSimilarityGraphTaskReq {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
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
