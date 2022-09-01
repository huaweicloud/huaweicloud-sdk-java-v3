package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 用例数据
 */
public class JudgementCaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    @JacksonXmlProperty(localName = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    @JacksonXmlProperty(localName = "output")

    private String output;

    public JudgementCaseInfo withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * 用例数据输入
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public JudgementCaseInfo withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * 用例数据期望输出
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JudgementCaseInfo judgementCaseInfo = (JudgementCaseInfo) o;
        return Objects.equals(this.input, judgementCaseInfo.input)
            && Objects.equals(this.output, judgementCaseInfo.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JudgementCaseInfo {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
