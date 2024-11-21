package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单分子预对接请求体。
 */
public class CreateMolDockingJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private ReceptorDto receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand")

    private DrugFile ligand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    public CreateMolDockingJobReq withReceptor(ReceptorDto receptor) {
        this.receptor = receptor;
        return this;
    }

    public CreateMolDockingJobReq withReceptor(Consumer<ReceptorDto> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new ReceptorDto();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public ReceptorDto getReceptor() {
        return receptor;
    }

    public void setReceptor(ReceptorDto receptor) {
        this.receptor = receptor;
    }

    public CreateMolDockingJobReq withLigand(DrugFile ligand) {
        this.ligand = ligand;
        return this;
    }

    public CreateMolDockingJobReq withLigand(Consumer<DrugFile> ligandSetter) {
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

    public CreateMolDockingJobReq withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎，默认为AUTODOCK_VINA。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMolDockingJobReq that = (CreateMolDockingJobReq) obj;
        return Objects.equals(this.receptor, that.receptor) && Objects.equals(this.ligand, that.ligand)
            && Objects.equals(this.engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptor, ligand, engine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMolDockingJobReq {\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligand: ").append(toIndentedString(ligand)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
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
