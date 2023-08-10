package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体配置
 */
public class LigandDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand")

    private DrugFile ligand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public LigandDto withLigand(DrugFile ligand) {
        this.ligand = ligand;
        return this;
    }

    public LigandDto withLigand(Consumer<DrugFile> ligandSetter) {
        if (this.ligand == null) {
            this.ligand = new DrugFile();
            ligandSetter.accept(this.ligand);
        }

        return this;
    }

    /**
     * Get ligand
     * @return ligand
     */
    public DrugFile getLigand() {
        return ligand;
    }

    public void setLigand(DrugFile ligand) {
        this.ligand = ligand;
    }

    public LigandDto withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 计算个数
     * minimum: 1
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LigandDto that = (LigandDto) obj;
        return Objects.equals(this.ligand, that.ligand) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ligand, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LigandDto {\n");
        sb.append("    ligand: ").append(toIndentedString(ligand)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
