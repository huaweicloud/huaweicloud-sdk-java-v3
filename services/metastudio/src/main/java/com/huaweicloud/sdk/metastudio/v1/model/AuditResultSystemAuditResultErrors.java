package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuditResultSystemAuditResultErrors
 */
public class AuditResultSystemAuditResultErrors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_name")

    private String audioName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_name")

    private String textName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public AuditResultSystemAuditResultErrors withAudioName(String audioName) {
        this.audioName = audioName;
        return this;
    }

    /**
     * 音频文件名。
     * @return audioName
     */
    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public AuditResultSystemAuditResultErrors withTextName(String textName) {
        this.textName = textName;
        return this;
    }

    /**
     * 文本文件名。
     * @return textName
     */
    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public AuditResultSystemAuditResultErrors withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 异常错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public AuditResultSystemAuditResultErrors withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 异常错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditResultSystemAuditResultErrors that = (AuditResultSystemAuditResultErrors) obj;
        return Objects.equals(this.audioName, that.audioName) && Objects.equals(this.textName, that.textName)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioName, textName, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditResultSystemAuditResultErrors {\n");
        sb.append("    audioName: ").append(toIndentedString(audioName)).append("\n");
        sb.append("    textName: ").append(toIndentedString(textName)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
