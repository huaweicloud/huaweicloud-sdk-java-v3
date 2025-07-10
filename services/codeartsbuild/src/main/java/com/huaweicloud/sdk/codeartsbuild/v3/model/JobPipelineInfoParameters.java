package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务流水线参数
 */
public class JobPipelineInfoParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<JobPipelineInfoParamsItems> params = null;

    public JobPipelineInfoParameters withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public JobPipelineInfoParameters withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public JobPipelineInfoParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobPipelineInfoParameters withParams(List<JobPipelineInfoParamsItems> params) {
        this.params = params;
        return this;
    }

    public JobPipelineInfoParameters addParamsItem(JobPipelineInfoParamsItems paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public JobPipelineInfoParameters withParams(Consumer<List<JobPipelineInfoParamsItems>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 参数值
     * @return params
     */
    public List<JobPipelineInfoParamsItems> getParams() {
        return params;
    }

    public void setParams(List<JobPipelineInfoParamsItems> params) {
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
        JobPipelineInfoParameters that = (JobPipelineInfoParameters) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.language, that.language)
            && Objects.equals(this.name, that.name) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, language, name, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobPipelineInfoParameters {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
