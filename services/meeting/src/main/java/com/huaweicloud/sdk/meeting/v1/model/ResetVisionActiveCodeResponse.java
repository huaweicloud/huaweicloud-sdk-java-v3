package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ResetVisionActiveCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeCode")

    @JacksonXmlProperty(localName = "activeCode")

    private String activeCode;

    public ResetVisionActiveCodeResponse withActiveCode(String activeCode) {
        this.activeCode = activeCode;
        return this;
    }

    /**
     * 激活码
     * @return activeCode
     */
    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetVisionActiveCodeResponse resetVisionActiveCodeResponse = (ResetVisionActiveCodeResponse) o;
        return Objects.equals(this.activeCode, resetVisionActiveCodeResponse.activeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetVisionActiveCodeResponse {\n");
        sb.append("    activeCode: ").append(toIndentedString(activeCode)).append("\n");
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
