package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFepJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor")

    private ReceptorDrugFile receptor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<LigandPreviewDto> ligands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph")

    private FepGraphDto graph;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private FepParamDto params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_result")

    private JobResult jobResult;

    public ShowFepJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowFepJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new DrugJobDto();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public DrugJobDto getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ShowFepJobResponse withReceptor(ReceptorDrugFile receptor) {
        this.receptor = receptor;
        return this;
    }

    public ShowFepJobResponse withReceptor(Consumer<ReceptorDrugFile> receptorSetter) {
        if (this.receptor == null) {
            this.receptor = new ReceptorDrugFile();
            receptorSetter.accept(this.receptor);
        }

        return this;
    }

    /**
     * Get receptor
     * @return receptor
     */
    public ReceptorDrugFile getReceptor() {
        return receptor;
    }

    public void setReceptor(ReceptorDrugFile receptor) {
        this.receptor = receptor;
    }

    public ShowFepJobResponse withLigands(List<LigandPreviewDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public ShowFepJobResponse addLigandsItem(LigandPreviewDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public ShowFepJobResponse withLigands(Consumer<List<LigandPreviewDto>> ligandsSetter) {
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

    public ShowFepJobResponse withGraph(FepGraphDto graph) {
        this.graph = graph;
        return this;
    }

    public ShowFepJobResponse withGraph(Consumer<FepGraphDto> graphSetter) {
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

    public ShowFepJobResponse withParams(FepParamDto params) {
        this.params = params;
        return this;
    }

    public ShowFepJobResponse withParams(Consumer<FepParamDto> paramsSetter) {
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

    public ShowFepJobResponse withJobResult(JobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    public ShowFepJobResponse withJobResult(Consumer<JobResult> jobResultSetter) {
        if (this.jobResult == null) {
            this.jobResult = new JobResult();
            jobResultSetter.accept(this.jobResult);
        }

        return this;
    }

    /**
     * Get jobResult
     * @return jobResult
     */
    public JobResult getJobResult() {
        return jobResult;
    }

    public void setJobResult(JobResult jobResult) {
        this.jobResult = jobResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFepJobResponse that = (ShowFepJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.receptor, that.receptor)
            && Objects.equals(this.ligands, that.ligands) && Objects.equals(this.graph, that.graph)
            && Objects.equals(this.params, that.params) && Objects.equals(this.jobResult, that.jobResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptor, ligands, graph, params, jobResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFepJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
        sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
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
