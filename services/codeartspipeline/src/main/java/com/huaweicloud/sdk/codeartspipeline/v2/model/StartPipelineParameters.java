package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StartPipelineParameters
 */
public class StartPipelineParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_params")

    private List<StartPipelineBuildParams> buildParams = null;

    public StartPipelineParameters withBuildParams(List<StartPipelineBuildParams> buildParams) {
        this.buildParams = buildParams;
        return this;
    }

    public StartPipelineParameters addBuildParamsItem(StartPipelineBuildParams buildParamsItem) {
        if (this.buildParams == null) {
            this.buildParams = new ArrayList<>();
        }
        this.buildParams.add(buildParamsItem);
        return this;
    }

    public StartPipelineParameters withBuildParams(Consumer<List<StartPipelineBuildParams>> buildParamsSetter) {
        if (this.buildParams == null) {
            this.buildParams = new ArrayList<>();
        }
        buildParamsSetter.accept(this.buildParams);
        return this;
    }

    /**
     * 启动流水线时的构建参数
     * @return buildParams
     */
    public List<StartPipelineBuildParams> getBuildParams() {
        return buildParams;
    }

    public void setBuildParams(List<StartPipelineBuildParams> buildParams) {
        this.buildParams = buildParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartPipelineParameters that = (StartPipelineParameters) obj;
        return Objects.equals(this.buildParams, that.buildParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartPipelineParameters {\n");
        sb.append("    buildParams: ").append(toIndentedString(buildParams)).append("\n");
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
