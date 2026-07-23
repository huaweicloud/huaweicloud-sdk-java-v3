package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单轮对话或单次测试的输入输出数据。
 */
public class CompareItemData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_input")

    private String userInput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_output")

    private String userOutput;

    public CompareItemData withUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }

    /**
     * 用户输入的文本内容。
     * @return userInput
     */
    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public CompareItemData withUserOutput(String userOutput) {
        this.userOutput = userOutput;
        return this;
    }

    /**
     * 系统或模型针对该输入给出的输出内容。
     * @return userOutput
     */
    public String getUserOutput() {
        return userOutput;
    }

    public void setUserOutput(String userOutput) {
        this.userOutput = userOutput;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareItemData that = (CompareItemData) obj;
        return Objects.equals(this.userInput, that.userInput) && Objects.equals(this.userOutput, that.userOutput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInput, userOutput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareItemData {\n");
        sb.append("    userInput: ").append(toIndentedString(userInput)).append("\n");
        sb.append("    userOutput: ").append(toIndentedString(userOutput)).append("\n");
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
