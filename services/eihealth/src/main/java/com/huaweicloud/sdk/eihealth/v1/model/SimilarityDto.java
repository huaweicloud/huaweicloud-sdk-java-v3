package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimilarityDto
 */
public class SimilarityDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand_ids")

    private List<String> ligandIds = null;

    public SimilarityDto withLigandIds(List<String> ligandIds) {
        this.ligandIds = ligandIds;
        return this;
    }

    public SimilarityDto addLigandIdsItem(String ligandIdsItem) {
        if (this.ligandIds == null) {
            this.ligandIds = new ArrayList<>();
        }
        this.ligandIds.add(ligandIdsItem);
        return this;
    }

    public SimilarityDto withLigandIds(Consumer<List<String>> ligandIdsSetter) {
        if (this.ligandIds == null) {
            this.ligandIds = new ArrayList<>();
        }
        ligandIdsSetter.accept(this.ligandIds);
        return this;
    }

    /**
     * 配体对
     * @return ligandIds
     */
    public List<String> getLigandIds() {
        return ligandIds;
    }

    public void setLigandIds(List<String> ligandIds) {
        this.ligandIds = ligandIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimilarityDto similarityDto = (SimilarityDto) o;
        return Objects.equals(this.ligandIds, similarityDto.ligandIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ligandIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimilarityDto {\n");
        sb.append("    ligandIds: ").append(toIndentedString(ligandIds)).append("\n");
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
