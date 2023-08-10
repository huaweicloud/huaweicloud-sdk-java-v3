package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体预览信息，若成功则除reason字段均有，若失败也有可能存在formula和smiles字段
 */
public class LigandPreviewInfoDto {

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
    @JsonProperty(value = "is_3d")

    private Boolean is3d;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structure")

    private LigandStructureDto structure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public LigandPreviewInfoDto withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 配体索引（从0起编号）
     * minimum: 0
     * maximum: 999
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public LigandPreviewInfoDto withName(String name) {
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

    public LigandPreviewInfoDto withSuccess(Boolean success) {
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

    public LigandPreviewInfoDto withSmiles(String smiles) {
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

    public LigandPreviewInfoDto withFormula(String formula) {
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

    public LigandPreviewInfoDto withIs3d(Boolean is3d) {
        this.is3d = is3d;
        return this;
    }

    /**
     * 标识原始数据是否为3D
     * @return is3d
     */
    public Boolean getIs3d() {
        return is3d;
    }

    public void setIs3d(Boolean is3d) {
        this.is3d = is3d;
    }

    public LigandPreviewInfoDto withStructure(LigandStructureDto structure) {
        this.structure = structure;
        return this;
    }

    public LigandPreviewInfoDto withStructure(Consumer<LigandStructureDto> structureSetter) {
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

    public LigandPreviewInfoDto withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 解析失败的理由
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
        LigandPreviewInfoDto that = (LigandPreviewInfoDto) obj;
        return Objects.equals(this.index, that.index) && Objects.equals(this.name, that.name)
            && Objects.equals(this.success, that.success) && Objects.equals(this.smiles, that.smiles)
            && Objects.equals(this.formula, that.formula) && Objects.equals(this.is3d, that.is3d)
            && Objects.equals(this.structure, that.structure) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, success, smiles, formula, is3d, structure, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LigandPreviewInfoDto {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    is3d: ").append(toIndentedString(is3d)).append("\n");
        sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
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
