package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowDefaultBuildParametersResult
 */
public class ShowDefaultBuildParametersResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<ShowDefaultBuildParametersParams> params = null;

    public ShowDefaultBuildParametersResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数定义
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDefaultBuildParametersResult withParams(List<ShowDefaultBuildParametersParams> params) {
        this.params = params;
        return this;
    }

    public ShowDefaultBuildParametersResult addParamsItem(ShowDefaultBuildParametersParams paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ShowDefaultBuildParametersResult withParams(Consumer<List<ShowDefaultBuildParametersParams>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 参数元数据列表
     * @return params
     */
    public List<ShowDefaultBuildParametersParams> getParams() {
        return params;
    }

    public void setParams(List<ShowDefaultBuildParametersParams> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDefaultBuildParametersResult that = (ShowDefaultBuildParametersResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefaultBuildParametersResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
