package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowWelcomeSpeechSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_welcome_speech")

    private Boolean enableWelcomeSpeech;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowWelcomeSpeechSwitchResponse withEnableWelcomeSpeech(Boolean enableWelcomeSpeech) {
        this.enableWelcomeSpeech = enableWelcomeSpeech;
        return this;
    }

    /**
     * 欢迎词功能开关。
     * @return enableWelcomeSpeech
     */
    public Boolean getEnableWelcomeSpeech() {
        return enableWelcomeSpeech;
    }

    public void setEnableWelcomeSpeech(Boolean enableWelcomeSpeech) {
        this.enableWelcomeSpeech = enableWelcomeSpeech;
    }

    public ShowWelcomeSpeechSwitchResponse withXRequestId(String xRequestId) {
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
        ShowWelcomeSpeechSwitchResponse that = (ShowWelcomeSpeechSwitchResponse) obj;
        return Objects.equals(this.enableWelcomeSpeech, that.enableWelcomeSpeech)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableWelcomeSpeech, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWelcomeSpeechSwitchResponse {\n");
        sb.append("    enableWelcomeSpeech: ").append(toIndentedString(enableWelcomeSpeech)).append("\n");
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
