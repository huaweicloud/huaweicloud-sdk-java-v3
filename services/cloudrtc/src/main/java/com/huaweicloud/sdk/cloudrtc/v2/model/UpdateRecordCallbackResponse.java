package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateRecordCallbackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_callback")

    @JacksonXmlProperty(localName = "record_callback")

    private AppCallbackUrl recordCallback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")

    @JacksonXmlProperty(localName = "X-request-Id")

    private String xRequestId;

    public UpdateRecordCallbackResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateRecordCallbackResponse withRecordCallback(AppCallbackUrl recordCallback) {
        this.recordCallback = recordCallback;
        return this;
    }

    public UpdateRecordCallbackResponse withRecordCallback(Consumer<AppCallbackUrl> recordCallbackSetter) {
        if (this.recordCallback == null) {
            this.recordCallback = new AppCallbackUrl();
            recordCallbackSetter.accept(this.recordCallback);
        }

        return this;
    }

    /**
     * Get recordCallback
     * @return recordCallback
     */
    public AppCallbackUrl getRecordCallback() {
        return recordCallback;
    }

    public void setRecordCallback(AppCallbackUrl recordCallback) {
        this.recordCallback = recordCallback;
    }

    public UpdateRecordCallbackResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRecordCallbackResponse updateRecordCallbackResponse = (UpdateRecordCallbackResponse) o;
        return Objects.equals(this.appId, updateRecordCallbackResponse.appId)
            && Objects.equals(this.recordCallback, updateRecordCallbackResponse.recordCallback)
            && Objects.equals(this.xRequestId, updateRecordCallbackResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, recordCallback, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecordCallbackResponse {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    recordCallback: ").append(toIndentedString(recordCallback)).append("\n");
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
