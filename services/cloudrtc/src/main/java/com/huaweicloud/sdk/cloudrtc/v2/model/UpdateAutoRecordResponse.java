package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAutoRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_record_mode")

    private AppAutoRecordMode autoRecordMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")

    private String xRequestId;

    public UpdateAutoRecordResponse withAppId(String appId) {
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

    public UpdateAutoRecordResponse withAutoRecordMode(AppAutoRecordMode autoRecordMode) {
        this.autoRecordMode = autoRecordMode;
        return this;
    }

    public UpdateAutoRecordResponse withAutoRecordMode(Consumer<AppAutoRecordMode> autoRecordModeSetter) {
        if (this.autoRecordMode == null) {
            this.autoRecordMode = new AppAutoRecordMode();
            autoRecordModeSetter.accept(this.autoRecordMode);
        }

        return this;
    }

    /**
     * Get autoRecordMode
     * @return autoRecordMode
     */
    public AppAutoRecordMode getAutoRecordMode() {
        return autoRecordMode;
    }

    public void setAutoRecordMode(AppAutoRecordMode autoRecordMode) {
        this.autoRecordMode = autoRecordMode;
    }

    public UpdateAutoRecordResponse withXRequestId(String xRequestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAutoRecordResponse that = (UpdateAutoRecordResponse) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.autoRecordMode, that.autoRecordMode)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, autoRecordMode, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoRecordResponse {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    autoRecordMode: ").append(toIndentedString(autoRecordMode)).append("\n");
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
