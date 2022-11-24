package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobByIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private Map<String, Object> jobConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_info")

    private StreamingJobInfoDto jobInfo;

    public ShowJobByIdResponse withJobConfig(Map<String, Object> jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public ShowJobByIdResponse putJobConfigItem(String key, Object jobConfigItem) {
        if (this.jobConfig == null) {
            this.jobConfig = new HashMap<>();
        }
        this.jobConfig.put(key, jobConfigItem);
        return this;
    }

    public ShowJobByIdResponse withJobConfig(Consumer<Map<String, Object>> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new HashMap<>();
        }
        jobConfigSetter.accept(this.jobConfig);
        return this;
    }

    /**
     * 实时分析作业详细配置，每个作业可选择不同的算子进行组合，各算子的使用方法详见：实时分析算子配置指南。
     * @return jobConfig
     */
    public Map<String, Object> getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(Map<String, Object> jobConfig) {
        this.jobConfig = jobConfig;
    }

    public ShowJobByIdResponse withJobInfo(StreamingJobInfoDto jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }

    public ShowJobByIdResponse withJobInfo(Consumer<StreamingJobInfoDto> jobInfoSetter) {
        if (this.jobInfo == null) {
            this.jobInfo = new StreamingJobInfoDto();
            jobInfoSetter.accept(this.jobInfo);
        }

        return this;
    }

    /**
     * Get jobInfo
     * @return jobInfo
     */
    public StreamingJobInfoDto getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(StreamingJobInfoDto jobInfo) {
        this.jobInfo = jobInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobByIdResponse showJobByIdResponse = (ShowJobByIdResponse) o;
        return Objects.equals(this.jobConfig, showJobByIdResponse.jobConfig)
            && Objects.equals(this.jobInfo, showJobByIdResponse.jobInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobConfig, jobInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobByIdResponse {\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    jobInfo: ").append(toIndentedString(jobInfo)).append("\n");
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
