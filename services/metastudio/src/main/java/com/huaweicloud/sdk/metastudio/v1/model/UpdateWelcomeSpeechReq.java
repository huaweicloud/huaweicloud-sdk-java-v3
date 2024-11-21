package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改欢迎词请求。
 */
public class UpdateWelcomeSpeechReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "welcome_speech")

    private String welcomeSpeech;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_welcome_speech")

    private Boolean enableWelcomeSpeech;

    public UpdateWelcomeSpeechReq withWelcomeSpeech(String welcomeSpeech) {
        this.welcomeSpeech = welcomeSpeech;
        return this;
    }

    /**
     * 欢迎词。
     * @return welcomeSpeech
     */
    public String getWelcomeSpeech() {
        return welcomeSpeech;
    }

    public void setWelcomeSpeech(String welcomeSpeech) {
        this.welcomeSpeech = welcomeSpeech;
    }

    public UpdateWelcomeSpeechReq withEnableWelcomeSpeech(Boolean enableWelcomeSpeech) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWelcomeSpeechReq that = (UpdateWelcomeSpeechReq) obj;
        return Objects.equals(this.welcomeSpeech, that.welcomeSpeech)
            && Objects.equals(this.enableWelcomeSpeech, that.enableWelcomeSpeech);
    }

    @Override
    public int hashCode() {
        return Objects.hash(welcomeSpeech, enableWelcomeSpeech);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWelcomeSpeechReq {\n");
        sb.append("    welcomeSpeech: ").append(toIndentedString(welcomeSpeech)).append("\n");
        sb.append("    enableWelcomeSpeech: ").append(toIndentedString(enableWelcomeSpeech)).append("\n");
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
