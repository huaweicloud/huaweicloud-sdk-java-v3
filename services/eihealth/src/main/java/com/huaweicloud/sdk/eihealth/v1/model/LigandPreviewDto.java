package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体预览信息
 */
public class LigandPreviewDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private DrugFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    public LigandPreviewDto withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 配体索引（从0起编号）
     * minimum: 0
     * maximum: 99
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public LigandPreviewDto withFile(DrugFile file) {
        this.file = file;
        return this;
    }

    public LigandPreviewDto withFile(Consumer<DrugFile> fileSetter) {
        if (this.file == null) {
            this.file = new DrugFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public DrugFile getFile() {
        return file;
    }

    public void setFile(DrugFile file) {
        this.file = file;
    }

    public LigandPreviewDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配体名称，若无名称则自动命名，格式为UNK+索引（从1起编号）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LigandPreviewDto withSmiles(String smiles) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LigandPreviewDto that = (LigandPreviewDto) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.file, that.file)
            && Objects.equals(this.name, that.name) && Objects.equals(this.smiles, that.smiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, file, name, smiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LigandPreviewDto {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
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
