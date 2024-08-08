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
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_result")

    private JobResult jobResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_failed_reason")

    private List<FailedReasonRecord> partFailedReason = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_result")

    private ClusterJobRsp clusterResult;

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

    public ShowDockingJobResponse withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
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

    public ShowDockingJobResponse withPartFailedReason(List<FailedReasonRecord> partFailedReason) {
        this.partFailedReason = partFailedReason;
        return this;
    }

    public ShowDockingJobResponse addPartFailedReasonItem(FailedReasonRecord partFailedReasonItem) {
        if (this.partFailedReason == null) {
            this.partFailedReason = new ArrayList<>();
        }
        this.partFailedReason.add(partFailedReasonItem);
        return this;
    }

    public ShowDockingJobResponse withPartFailedReason(Consumer<List<FailedReasonRecord>> partFailedReasonSetter) {
        if (this.partFailedReason == null) {
            this.partFailedReason = new ArrayList<>();
        }
        partFailedReasonSetter.accept(this.partFailedReason);
        return this;
    }

    /**
     * 部分失败原因和数量
     * @return partFailedReason
     */
    public List<FailedReasonRecord> getPartFailedReason() {
        return partFailedReason;
    }

    public void setPartFailedReason(List<FailedReasonRecord> partFailedReason) {
        this.partFailedReason = partFailedReason;
    }

    public ShowDockingJobResponse withClusterResult(ClusterJobRsp clusterResult) {
        this.clusterResult = clusterResult;
        return this;
    }

    public ShowDockingJobResponse withClusterResult(Consumer<ClusterJobRsp> clusterResultSetter) {
        if (this.clusterResult == null) {
            this.clusterResult = new ClusterJobRsp();
            clusterResultSetter.accept(this.clusterResult);
        }

        return this;
    }

    /**
     * Get clusterResult
     * @return clusterResult
     */
    public ClusterJobRsp getClusterResult() {
        return clusterResult;
    }

    public void setClusterResult(ClusterJobRsp clusterResult) {
        this.clusterResult = clusterResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDockingJobResponse that = (ShowDockingJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.receptors, that.receptors)
            && Objects.equals(this.ligands, that.ligands) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.jobResult, that.jobResult)
            && Objects.equals(this.partFailedReason, that.partFailedReason)
            && Objects.equals(this.clusterResult, that.clusterResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, receptors, ligands, engine, jobResult, partFailedReason, clusterResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDockingJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    receptors: ").append(toIndentedString(receptors)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
        sb.append("    partFailedReason: ").append(toIndentedString(partFailedReason)).append("\n");
        sb.append("    clusterResult: ").append(toIndentedString(clusterResult)).append("\n");
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
