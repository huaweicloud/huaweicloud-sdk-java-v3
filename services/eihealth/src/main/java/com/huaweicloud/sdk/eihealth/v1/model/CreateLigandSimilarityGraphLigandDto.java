package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建配体相似度图任务配体
 */
public class CreateLigandSimilarityGraphLigandDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main")

    private Boolean main;

    public CreateLigandSimilarityGraphLigandDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配体分子唯一名字，受体中的建议使用\"{氨基酸}:{链}:{编号}\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateLigandSimilarityGraphLigandDto withSmiles(String smiles) {
        this.smiles = smiles;
        return this;
    }

    /**
     * 分子SMILES表达式
     * @return smiles
     */
    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public CreateLigandSimilarityGraphLigandDto withMain(Boolean main) {
        this.main = main;
        return this;
    }

    /**
     * 配体是否为主要配体，在中心模式下，必须指定1个主要配体
     * @return main
     */
    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLigandSimilarityGraphLigandDto that = (CreateLigandSimilarityGraphLigandDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.smiles, that.smiles)
            && Objects.equals(this.main, that.main);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, smiles, main);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLigandSimilarityGraphLigandDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    main: ").append(toIndentedString(main)).append("\n");
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
