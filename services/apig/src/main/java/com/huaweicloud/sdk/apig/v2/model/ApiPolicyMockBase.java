package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ApiPolicyMockBase */
public class ApiPolicyMockBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_content")

    private String resultContent;

    public ApiPolicyMockBase withResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }

    /** 返回结果
     * 
     * @return resultContent */
    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiPolicyMockBase apiPolicyMockBase = (ApiPolicyMockBase) o;
        return Objects.equals(this.resultContent, apiPolicyMockBase.resultContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPolicyMockBase {\n");
        sb.append("    resultContent: ").append(toIndentedString(resultContent)).append("\n");
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
