package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建自由能微扰作业请求体
 */
public class CreateFepJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private DrugFile receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<LigandPreviewDto> ligands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph")

    private FepGraphDto graph;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private FepParamDto params;

    public CreateFepJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreateFepJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new CreateDrugJobBasicInfo();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public CreateDrugJobBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public CreateFepJobReq withReceptor(DrugFile receptor) {
        this.receptor = receptor;
        return this;
    }

    public CreateFepJobReq withReceptor(Consumer<DrugFile> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new DrugFile();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public DrugFile getReceptor() {
        return receptor;
    }

    public void setReceptor(DrugFile receptor) {
        this.receptor = receptor;
    }

    public CreateFepJobReq withLigands(List<LigandPreviewDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public CreateFepJobReq addLigandsItem(LigandPreviewDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public CreateFepJobReq withLigands(Consumer<List<LigandPreviewDto>> ligandsSetter) {
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
    public List<LigandPreviewDto> getLigands() {
        return ligands;
    }

    public void setLigands(List<LigandPreviewDto> ligands) {
        this.ligands = ligands;
    }

    public CreateFepJobReq withGraph(FepGraphDto graph) {
        this.graph = graph;
        return this;
    }

    public CreateFepJobReq withGraph(Consumer<FepGraphDto> graphSetter) {
        if (this.graph == null) {
            this.graph = new FepGraphDto();
            graphSetter.accept(this.graph);
        }

        return this;
    }

    /**
     * Get graph
     * @return graph
     */
    public FepGraphDto getGraph() {
        return graph;
    }

    public void setGraph(FepGraphDto graph) {
        this.graph = graph;
    }

    public CreateFepJobReq withParams(FepParamDto params) {
        this.params = params;
        return this;
    }

    public CreateFepJobReq withParams(Consumer<FepParamDto> paramsSetter) {
        if (this.params == null) {
            this.params = new FepParamDto();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public FepParamDto getParams() {
        return params;
    }

    public void setParams(FepParamDto params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFepJobReq createFepJobReq = (CreateFepJobReq) o;
        return Objects.equals(this.basicInfo, createFepJobReq.basicInfo)
            && Objects.equals(this.receptor, createFepJobReq.receptor)
            && Objects.equals(this.ligands, createFepJobReq.ligands)
            && Objects.equals(this.graph, createFepJobReq.graph) && Objects.equals(this.params, createFepJobReq.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptor, ligands, graph, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFepJobReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
        sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
