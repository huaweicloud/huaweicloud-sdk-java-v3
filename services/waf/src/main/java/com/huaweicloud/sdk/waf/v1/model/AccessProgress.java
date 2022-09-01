package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 冗余参数，仅用于新版console（前端）使用 
 */
public class AccessProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    @JacksonXmlProperty(localName = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    public AccessProgress withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * 步骤   - 1: 指回源IP加白   - 2: 指本地验证   - 指修改DNS解析
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public AccessProgress withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，0：未完成这个步骤；1：已完成这个状态”
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessProgress accessProgress = (AccessProgress) o;
        return Objects.equals(this.step, accessProgress.step) && Objects.equals(this.status, accessProgress.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(step, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessProgress {\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
