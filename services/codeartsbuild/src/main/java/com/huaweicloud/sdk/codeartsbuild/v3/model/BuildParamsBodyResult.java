package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class BuildParamsBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_parameters")

    private List<BuildParams> buildParameters = null;

    public BuildParamsBodyResult withBuildParameters(List<BuildParams> buildParameters) {
        this.buildParameters = buildParameters;
        return this;
    }

    public BuildParamsBodyResult addBuildParametersItem(BuildParams buildParametersItem) {
        if (this.buildParameters == null) {
            this.buildParameters = new ArrayList<>();
        }
        this.buildParameters.add(buildParametersItem);
        return this;
    }

    public BuildParamsBodyResult withBuildParameters(Consumer<List<BuildParams>> buildParametersSetter) {
        if (this.buildParameters == null) {
            this.buildParameters = new ArrayList<>();
        }
        buildParametersSetter.accept(this.buildParameters);
        return this;
    }

    /**
     * 构建参数约束列表
     * @return buildParameters
     */
    public List<BuildParams> getBuildParameters() {
        return buildParameters;
    }

    public void setBuildParameters(List<BuildParams> buildParameters) {
        this.buildParameters = buildParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildParamsBodyResult that = (BuildParamsBodyResult) obj;
        return Objects.equals(this.buildParameters, that.buildParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildParamsBodyResult {\n");
        sb.append("    buildParameters: ").append(toIndentedString(buildParameters)).append("\n");
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
