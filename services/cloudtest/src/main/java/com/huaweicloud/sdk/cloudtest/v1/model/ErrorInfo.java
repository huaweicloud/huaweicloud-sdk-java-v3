package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ErrorInfo
 */
public class ErrorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_content")

    private String errorContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_index")

    private String errorIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_point")

    private String errorPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_light")

    private Boolean highLight;

    public ErrorInfo withErrorContent(String errorContent) {
        this.errorContent = errorContent;
        return this;
    }

    /**
     * 错误内容的描述
     * @return errorContent
     */
    public String getErrorContent() {
        return errorContent;
    }

    public void setErrorContent(String errorContent) {
        this.errorContent = errorContent;
    }

    public ErrorInfo withErrorIndex(String errorIndex) {
        this.errorIndex = errorIndex;
        return this;
    }

    /**
     * 错误索引的描述
     * @return errorIndex
     */
    public String getErrorIndex() {
        return errorIndex;
    }

    public void setErrorIndex(String errorIndex) {
        this.errorIndex = errorIndex;
    }

    public ErrorInfo withErrorPoint(String errorPoint) {
        this.errorPoint = errorPoint;
        return this;
    }

    /**
     * 错误点的描述
     * @return errorPoint
     */
    public String getErrorPoint() {
        return errorPoint;
    }

    public void setErrorPoint(String errorPoint) {
        this.errorPoint = errorPoint;
    }

    public ErrorInfo withHighLight(Boolean highLight) {
        this.highLight = highLight;
        return this;
    }

    /**
     * 是否高亮标识
     * @return highLight
     */
    public Boolean getHighLight() {
        return highLight;
    }

    public void setHighLight(Boolean highLight) {
        this.highLight = highLight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorInfo that = (ErrorInfo) obj;
        return Objects.equals(this.errorContent, that.errorContent) && Objects.equals(this.errorIndex, that.errorIndex)
            && Objects.equals(this.errorPoint, that.errorPoint) && Objects.equals(this.highLight, that.highLight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorContent, errorIndex, errorPoint, highLight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorInfo {\n");
        sb.append("    errorContent: ").append(toIndentedString(errorContent)).append("\n");
        sb.append("    errorIndex: ").append(toIndentedString(errorIndex)).append("\n");
        sb.append("    errorPoint: ").append(toIndentedString(errorPoint)).append("\n");
        sb.append("    highLight: ").append(toIndentedString(highLight)).append("\n");
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
