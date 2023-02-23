package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ExportFunctionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Boolean config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Boolean code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ExportFunctionRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ExportFunctionRequest withConfig(Boolean config) {
        this.config = config;
        return this;
    }

    /**
     * 是否导出函数配置，默认为false
     * @return config
     */
    public Boolean getConfig() {
        return config;
    }

    public void setConfig(Boolean config) {
        this.config = config;
    }

    public ExportFunctionRequest withCode(Boolean code) {
        this.code = code;
        return this;
    }

    /**
     * 是否导出函数代码，默认为false
     * @return code
     */
    public Boolean getCode() {
        return code;
    }

    public void setCode(Boolean code) {
        this.code = code;
    }

    public ExportFunctionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 不兼容与code、config参数混用；type=code代表导出代码,type=config代码导出配置
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportFunctionRequest exportFunctionRequest = (ExportFunctionRequest) o;
        return Objects.equals(this.functionUrn, exportFunctionRequest.functionUrn)
            && Objects.equals(this.config, exportFunctionRequest.config)
            && Objects.equals(this.code, exportFunctionRequest.code)
            && Objects.equals(this.type, exportFunctionRequest.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, config, code, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFunctionRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
