package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowPipelineJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_config")

    private Map<String, Object> pipelineConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_info")

    private PipelineJobInfoDto pipelineInfo;

    public ShowPipelineJobResponse withPipelineConfig(Map<String, Object> pipelineConfig) {
        this.pipelineConfig = pipelineConfig;
        return this;
    }

    public ShowPipelineJobResponse putPipelineConfigItem(String key, Object pipelineConfigItem) {
        if (this.pipelineConfig == null) {
            this.pipelineConfig = new HashMap<>();
        }
        this.pipelineConfig.put(key, pipelineConfigItem);
        return this;
    }

    public ShowPipelineJobResponse withPipelineConfig(Consumer<Map<String, Object>> pipelineConfigSetter) {
        if (this.pipelineConfig == null) {
            this.pipelineConfig = new HashMap<>();
        }
        pipelineConfigSetter.accept(this.pipelineConfig);
        return this;
    }

    /** 管道作业详细配置，每个作业可选择不同的算子进行组合，各算子的使用方法详见：数据管道算子配置指南。
     * 
     * @return pipelineConfig */
    public Map<String, Object> getPipelineConfig() {
        return pipelineConfig;
    }

    public void setPipelineConfig(Map<String, Object> pipelineConfig) {
        this.pipelineConfig = pipelineConfig;
    }

    public ShowPipelineJobResponse withPipelineInfo(PipelineJobInfoDto pipelineInfo) {
        this.pipelineInfo = pipelineInfo;
        return this;
    }

    public ShowPipelineJobResponse withPipelineInfo(Consumer<PipelineJobInfoDto> pipelineInfoSetter) {
        if (this.pipelineInfo == null) {
            this.pipelineInfo = new PipelineJobInfoDto();
            pipelineInfoSetter.accept(this.pipelineInfo);
        }

        return this;
    }

    /** Get pipelineInfo
     * 
     * @return pipelineInfo */
    public PipelineJobInfoDto getPipelineInfo() {
        return pipelineInfo;
    }

    public void setPipelineInfo(PipelineJobInfoDto pipelineInfo) {
        this.pipelineInfo = pipelineInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPipelineJobResponse showPipelineJobResponse = (ShowPipelineJobResponse) o;
        return Objects.equals(this.pipelineConfig, showPipelineJobResponse.pipelineConfig)
            && Objects.equals(this.pipelineInfo, showPipelineJobResponse.pipelineInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineConfig, pipelineInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipelineJobResponse {\n");
        sb.append("    pipelineConfig: ").append(toIndentedString(pipelineConfig)).append("\n");
        sb.append("    pipelineInfo: ").append(toIndentedString(pipelineInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
