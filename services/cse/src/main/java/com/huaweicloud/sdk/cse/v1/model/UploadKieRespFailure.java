package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UploadKieRespFailure
 */
public class UploadKieRespFailure {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    @JacksonXmlProperty(localName = "labels")

    private Object labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    @JacksonXmlProperty(localName = "error_message")

    private String errorMessage;

    public UploadKieRespFailure withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 配置项的key值
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UploadKieRespFailure withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 配置项的labels值
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public UploadKieRespFailure withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 导入失败的错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public UploadKieRespFailure withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 导入失败的原因
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadKieRespFailure uploadKieRespFailure = (UploadKieRespFailure) o;
        return Objects.equals(this.key, uploadKieRespFailure.key)
            && Objects.equals(this.labels, uploadKieRespFailure.labels)
            && Objects.equals(this.errorCode, uploadKieRespFailure.errorCode)
            && Objects.equals(this.errorMessage, uploadKieRespFailure.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, labels, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadKieRespFailure {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
