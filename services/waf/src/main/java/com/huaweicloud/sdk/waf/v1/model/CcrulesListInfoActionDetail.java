package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 阻断页面信息。当防护动作（category）选择阻断（block）或者动态阻断（dynamic_block）时，需要设置返回的阻断页面。  - 如果需要返回的阻断页面为系统默认的阻断页面，不需要传该参数。  - 如果用户想防护自定义的阻断页面，可以通过此参数设置
 */
public class CcrulesListInfoActionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private CcrulesListInfoActionDetailResponse response;

    public CcrulesListInfoActionDetail withResponse(CcrulesListInfoActionDetailResponse response) {
        this.response = response;
        return this;
    }

    public CcrulesListInfoActionDetail withResponse(Consumer<CcrulesListInfoActionDetailResponse> responseSetter) {
        if (this.response == null) {
            this.response = new CcrulesListInfoActionDetailResponse();
            responseSetter.accept(this.response);
        }

        return this;
    }

    /**
     * Get response
     * @return response
     */
    public CcrulesListInfoActionDetailResponse getResponse() {
        return response;
    }

    public void setResponse(CcrulesListInfoActionDetailResponse response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CcrulesListInfoActionDetail ccrulesListInfoActionDetail = (CcrulesListInfoActionDetail) o;
        return Objects.equals(this.response, ccrulesListInfoActionDetail.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CcrulesListInfoActionDetail {\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
