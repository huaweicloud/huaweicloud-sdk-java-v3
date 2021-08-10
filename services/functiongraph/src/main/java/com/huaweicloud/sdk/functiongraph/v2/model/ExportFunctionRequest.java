package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ExportFunctionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Boolean config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Boolean code;

    public ExportFunctionRequest withConfig(Boolean config) {
        this.config = config;
        return this;
    }

    /** 是否导出函数配置
     * 
     * @return config */
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

    /** 是否导出函数代码
     * 
     * @return code */
    public Boolean getCode() {
        return code;
    }

    public void setCode(Boolean code) {
        this.code = code;
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
        return Objects.equals(this.config, exportFunctionRequest.config)
            && Objects.equals(this.code, exportFunctionRequest.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportFunctionRequest {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
