package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPacifyWordsSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_pacify_words")

    private Boolean enablePacifyWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowPacifyWordsSwitchResponse withEnablePacifyWords(Boolean enablePacifyWords) {
        this.enablePacifyWords = enablePacifyWords;
        return this;
    }

    /**
     * 安抚话术功能开关。
     * @return enablePacifyWords
     */
    public Boolean getEnablePacifyWords() {
        return enablePacifyWords;
    }

    public void setEnablePacifyWords(Boolean enablePacifyWords) {
        this.enablePacifyWords = enablePacifyWords;
    }

    public ShowPacifyWordsSwitchResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPacifyWordsSwitchResponse that = (ShowPacifyWordsSwitchResponse) obj;
        return Objects.equals(this.enablePacifyWords, that.enablePacifyWords)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enablePacifyWords, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPacifyWordsSwitchResponse {\n");
        sb.append("    enablePacifyWords: ").append(toIndentedString(enablePacifyWords)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
