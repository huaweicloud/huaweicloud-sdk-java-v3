package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 受体中配体信息，若成功则除reason字段均有，若失败也有可能存在formula和smiles字段
 */
public class ReceptorLigandInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    private String formula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structure")

    private LigandStructureDto structure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private DrugBoundingBoxDto boundingBox;

    public ReceptorLigandInfoDto withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 配体索引（从0起编号）
     * minimum: 0
     * maximum: 9
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public ReceptorLigandInfoDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配体名称，即配体所在的残基表示
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReceptorLigandInfoDto withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 解析是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ReceptorLigandInfoDto withSmiles(String smiles) {
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

    public ReceptorLigandInfoDto withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * 配体分子的化学式
     * @return formula
     */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public ReceptorLigandInfoDto withStructure(LigandStructureDto structure) {
        this.structure = structure;
        return this;
    }

    public ReceptorLigandInfoDto withStructure(Consumer<LigandStructureDto> structureSetter) {
        if (this.structure == null) {
            this.structure = new LigandStructureDto();
            structureSetter.accept(this.structure);
        }

        return this;
    }

    /**
     * Get structure
     * @return structure
     */
    public LigandStructureDto getStructure() {
        return structure;
    }

    public void setStructure(LigandStructureDto structure) {
        this.structure = structure;
    }

    public ReceptorLigandInfoDto withBoundingBox(DrugBoundingBoxDto boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public ReceptorLigandInfoDto withBoundingBox(Consumer<DrugBoundingBoxDto> boundingBoxSetter) {
        if (this.boundingBox == null) {
            this.boundingBox = new DrugBoundingBoxDto();
            boundingBoxSetter.accept(this.boundingBox);
        }

        return this;
    }

    /**
     * Get boundingBox
     * @return boundingBox
     */
    public DrugBoundingBoxDto getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(DrugBoundingBoxDto boundingBox) {
        this.boundingBox = boundingBox;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReceptorLigandInfoDto that = (ReceptorLigandInfoDto) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.name, that.name)
            && Objects.equals(this.success, that.success) && Objects.equals(this.smiles, that.smiles)
            && Objects.equals(this.formula, that.formula) && Objects.equals(this.structure, that.structure)
            && Objects.equals(this.boundingBox, that.boundingBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, success, smiles, formula, structure, boundingBox);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReceptorLigandInfoDto {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
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
