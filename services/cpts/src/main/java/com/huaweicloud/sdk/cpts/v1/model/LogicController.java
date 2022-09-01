package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * LogicController
 */
public class LogicController {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "for_loop_params")

    @JacksonXmlProperty(localName = "for_loop_params")

    private String forLoopParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    @JacksonXmlProperty(localName = "condition")

    private String condition;

    public LogicController withForLoopParams(String forLoopParams) {
        this.forLoopParams = forLoopParams;
        return this;
    }

    /**
     * for_loop_params
     * @return forLoopParams
     */
    public String getForLoopParams() {
        return forLoopParams;
    }

    public void setForLoopParams(String forLoopParams) {
        this.forLoopParams = forLoopParams;
    }

    public LogicController withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * condition
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogicController logicController = (LogicController) o;
        return Objects.equals(this.forLoopParams, logicController.forLoopParams)
            && Objects.equals(this.condition, logicController.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forLoopParams, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicController {\n");
        sb.append("    forLoopParams: ").append(toIndentedString(forLoopParams)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
