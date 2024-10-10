package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DetailInfo
 */
public class DetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private PageRespInfo response;

    public DetailInfo withResponse(PageRespInfo response) {
        this.response = response;
        return this;
    }

    public DetailInfo withResponse(Consumer<PageRespInfo> responseSetter) {
        if (this.response == null) {
            this.response = new PageRespInfo();
            responseSetter.accept(this.response);
        }

        return this;
    }

    /**
     * Get response
     * @return response
     */
    public PageRespInfo getResponse() {
        return response;
    }

    public void setResponse(PageRespInfo response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetailInfo that = (DetailInfo) obj;
        return Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailInfo {\n");
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
