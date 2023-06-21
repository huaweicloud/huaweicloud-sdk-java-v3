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
public class ShowDockingJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptors")

    private List<DockingReceptorDto> receptors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<LigandDto> ligands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_result")

    private JobResult jobResult;

    public ShowDockingJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowDockingJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
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

    public ShowDockingJobResponse withReceptors(List<DockingReceptorDto> receptors) {
        this.receptors = receptors;
        return this;
    }

    public ShowDockingJobResponse addReceptorsItem(DockingReceptorDto receptorsItem) {
        if (this.receptors == null) {
            this.receptors = new ArrayList<>();
        }
        this.receptors.add(receptorsItem);
        return this;
    }

    public ShowDockingJobResponse withReceptors(Consumer<List<DockingReceptorDto>> receptorsSetter) {
        if (this.receptors == null) {
            this.receptors = new ArrayList<>();
        }
        receptorsSetter.accept(this.receptors);
        return this;
    }

    /**
     * 受体文件列表
     * @return receptors
     */
    public List<DockingReceptorDto> getReceptors() {
        return receptors;
    }

    public void setReceptors(List<DockingReceptorDto> receptors) {
        this.receptors = receptors;
    }

    public ShowDockingJobResponse withLigands(List<LigandDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public ShowDockingJobResponse addLigandsItem(LigandDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public ShowDockingJobResponse withLigands(Consumer<List<LigandDto>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 配体文件列表，当前仅支持1个
     * @return ligands
     */
    public List<LigandDto> getLigands() {
        return ligands;
    }

    public void setLigands(List<LigandDto> ligands) {
        this.ligands = ligands;
    }

    public ShowDockingJobResponse withJobResult(JobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    public ShowDockingJobResponse withJobResult(Consumer<JobResult> jobResultSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDockingJobResponse showDockingJobResponse = (ShowDockingJobResponse) o;
        return Objects.equals(this.basicInfo, showDockingJobResponse.basicInfo)
            && Objects.equals(this.receptors, showDockingJobResponse.receptors)
            && Objects.equals(this.ligands, showDockingJobResponse.ligands)
            && Objects.equals(this.jobResult, showDockingJobResponse.jobResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptors, ligands, jobResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDockingJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptors: ").append(toIndentedString(receptors)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
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
