package com.huaweicloud.sdk.tics.v1.model;

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
public class ShowInstanceReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_report_base_info")

    private JobReportBaseInfoVo jobReportBaseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_report_env")

    private JobReportEnvVo jobReportEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_report_output")

    private JobReportOutputVo jobReportOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_report_partners")

    private List<JobReportPartnerVo> jobReportPartners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "round_deploys")

    private List<RoundDeployVo> roundDeploys = null;

    public ShowInstanceReportResponse withJobReportBaseInfo(JobReportBaseInfoVo jobReportBaseInfo) {
        this.jobReportBaseInfo = jobReportBaseInfo;
        return this;
    }

    public ShowInstanceReportResponse withJobReportBaseInfo(Consumer<JobReportBaseInfoVo> jobReportBaseInfoSetter) {
        if (this.jobReportBaseInfo == null) {
            this.jobReportBaseInfo = new JobReportBaseInfoVo();
            jobReportBaseInfoSetter.accept(this.jobReportBaseInfo);
        }

        return this;
    }

    /**
     * Get jobReportBaseInfo
     * @return jobReportBaseInfo
     */
    public JobReportBaseInfoVo getJobReportBaseInfo() {
        return jobReportBaseInfo;
    }

    public void setJobReportBaseInfo(JobReportBaseInfoVo jobReportBaseInfo) {
        this.jobReportBaseInfo = jobReportBaseInfo;
    }

    public ShowInstanceReportResponse withJobReportEnv(JobReportEnvVo jobReportEnv) {
        this.jobReportEnv = jobReportEnv;
        return this;
    }

    public ShowInstanceReportResponse withJobReportEnv(Consumer<JobReportEnvVo> jobReportEnvSetter) {
        if (this.jobReportEnv == null) {
            this.jobReportEnv = new JobReportEnvVo();
            jobReportEnvSetter.accept(this.jobReportEnv);
        }

        return this;
    }

    /**
     * Get jobReportEnv
     * @return jobReportEnv
     */
    public JobReportEnvVo getJobReportEnv() {
        return jobReportEnv;
    }

    public void setJobReportEnv(JobReportEnvVo jobReportEnv) {
        this.jobReportEnv = jobReportEnv;
    }

    public ShowInstanceReportResponse withJobReportOutput(JobReportOutputVo jobReportOutput) {
        this.jobReportOutput = jobReportOutput;
        return this;
    }

    public ShowInstanceReportResponse withJobReportOutput(Consumer<JobReportOutputVo> jobReportOutputSetter) {
        if (this.jobReportOutput == null) {
            this.jobReportOutput = new JobReportOutputVo();
            jobReportOutputSetter.accept(this.jobReportOutput);
        }

        return this;
    }

    /**
     * Get jobReportOutput
     * @return jobReportOutput
     */
    public JobReportOutputVo getJobReportOutput() {
        return jobReportOutput;
    }

    public void setJobReportOutput(JobReportOutputVo jobReportOutput) {
        this.jobReportOutput = jobReportOutput;
    }

    public ShowInstanceReportResponse withJobReportPartners(List<JobReportPartnerVo> jobReportPartners) {
        this.jobReportPartners = jobReportPartners;
        return this;
    }

    public ShowInstanceReportResponse addJobReportPartnersItem(JobReportPartnerVo jobReportPartnersItem) {
        if (this.jobReportPartners == null) {
            this.jobReportPartners = new ArrayList<>();
        }
        this.jobReportPartners.add(jobReportPartnersItem);
        return this;
    }

    public ShowInstanceReportResponse withJobReportPartners(
        Consumer<List<JobReportPartnerVo>> jobReportPartnersSetter) {
        if (this.jobReportPartners == null) {
            this.jobReportPartners = new ArrayList<>();
        }
        jobReportPartnersSetter.accept(this.jobReportPartners);
        return this;
    }

    /**
     * 合作方信息
     * @return jobReportPartners
     */
    public List<JobReportPartnerVo> getJobReportPartners() {
        return jobReportPartners;
    }

    public void setJobReportPartners(List<JobReportPartnerVo> jobReportPartners) {
        this.jobReportPartners = jobReportPartners;
    }

    public ShowInstanceReportResponse withRoundDeploys(List<RoundDeployVo> roundDeploys) {
        this.roundDeploys = roundDeploys;
        return this;
    }

    public ShowInstanceReportResponse addRoundDeploysItem(RoundDeployVo roundDeploysItem) {
        if (this.roundDeploys == null) {
            this.roundDeploys = new ArrayList<>();
        }
        this.roundDeploys.add(roundDeploysItem);
        return this;
    }

    public ShowInstanceReportResponse withRoundDeploys(Consumer<List<RoundDeployVo>> roundDeploysSetter) {
        if (this.roundDeploys == null) {
            this.roundDeploys = new ArrayList<>();
        }
        roundDeploysSetter.accept(this.roundDeploys);
        return this;
    }

    /**
     * 计算过程
     * @return roundDeploys
     */
    public List<RoundDeployVo> getRoundDeploys() {
        return roundDeploys;
    }

    public void setRoundDeploys(List<RoundDeployVo> roundDeploys) {
        this.roundDeploys = roundDeploys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceReportResponse that = (ShowInstanceReportResponse) obj;
        return Objects.equals(this.jobReportBaseInfo, that.jobReportBaseInfo)
            && Objects.equals(this.jobReportEnv, that.jobReportEnv)
            && Objects.equals(this.jobReportOutput, that.jobReportOutput)
            && Objects.equals(this.jobReportPartners, that.jobReportPartners)
            && Objects.equals(this.roundDeploys, that.roundDeploys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobReportBaseInfo, jobReportEnv, jobReportOutput, jobReportPartners, roundDeploys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceReportResponse {\n");
        sb.append("    jobReportBaseInfo: ").append(toIndentedString(jobReportBaseInfo)).append("\n");
        sb.append("    jobReportEnv: ").append(toIndentedString(jobReportEnv)).append("\n");
        sb.append("    jobReportOutput: ").append(toIndentedString(jobReportOutput)).append("\n");
        sb.append("    jobReportPartners: ").append(toIndentedString(jobReportPartners)).append("\n");
        sb.append("    roundDeploys: ").append(toIndentedString(roundDeploys)).append("\n");
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
