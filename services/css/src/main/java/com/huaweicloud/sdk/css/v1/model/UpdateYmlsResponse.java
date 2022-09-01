package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateYmlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acknowledged")

    @JacksonXmlProperty(localName = "acknowledged")

    private Boolean acknowledged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "externalMessage")

    @JacksonXmlProperty(localName = "externalMessage")

    private String externalMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpErrorResponse")

    @JacksonXmlProperty(localName = "httpErrorResponse")

    private String httpErrorResponse;

    public UpdateYmlsResponse withAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
        return this;
    }

    /**
     * 修改是否成功。 - true: 修改成功。 - false: 修改失败。
     * @return acknowledged
     */
    public Boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public UpdateYmlsResponse withExternalMessage(String externalMessage) {
        this.externalMessage = externalMessage;
        return this;
    }

    /**
     * 错误信息描述。当acknowledged为true时，该字段返回null。
     * @return externalMessage
     */
    public String getExternalMessage() {
        return externalMessage;
    }

    public void setExternalMessage(String externalMessage) {
        this.externalMessage = externalMessage;
    }

    public UpdateYmlsResponse withHttpErrorResponse(String httpErrorResponse) {
        this.httpErrorResponse = httpErrorResponse;
        return this;
    }

    /**
     * HTTP错误信息。默认为null。
     * @return httpErrorResponse
     */
    public String getHttpErrorResponse() {
        return httpErrorResponse;
    }

    public void setHttpErrorResponse(String httpErrorResponse) {
        this.httpErrorResponse = httpErrorResponse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateYmlsResponse updateYmlsResponse = (UpdateYmlsResponse) o;
        return Objects.equals(this.acknowledged, updateYmlsResponse.acknowledged)
            && Objects.equals(this.externalMessage, updateYmlsResponse.externalMessage)
            && Objects.equals(this.httpErrorResponse, updateYmlsResponse.httpErrorResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acknowledged, externalMessage, httpErrorResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateYmlsResponse {\n");
        sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
        sb.append("    externalMessage: ").append(toIndentedString(externalMessage)).append("\n");
        sb.append("    httpErrorResponse: ").append(toIndentedString(httpErrorResponse)).append("\n");
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
