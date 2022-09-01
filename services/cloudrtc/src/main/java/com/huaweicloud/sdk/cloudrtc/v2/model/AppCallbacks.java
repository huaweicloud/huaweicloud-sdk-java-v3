package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * app回调配置
 */
public class AppCallbacks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_callback")

    @JacksonXmlProperty(localName = "push_callback")

    private AppCallbackUrl pushCallback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_callback")

    @JacksonXmlProperty(localName = "record_callback")

    private AppCallbackUrl recordCallback;

    public AppCallbacks withPushCallback(AppCallbackUrl pushCallback) {
        this.pushCallback = pushCallback;
        return this;
    }

    public AppCallbacks withPushCallback(Consumer<AppCallbackUrl> pushCallbackSetter) {
        if (this.pushCallback == null) {
            this.pushCallback = new AppCallbackUrl();
            pushCallbackSetter.accept(this.pushCallback);
        }

        return this;
    }

    /**
     * Get pushCallback
     * @return pushCallback
     */
    public AppCallbackUrl getPushCallback() {
        return pushCallback;
    }

    public void setPushCallback(AppCallbackUrl pushCallback) {
        this.pushCallback = pushCallback;
    }

    public AppCallbacks withRecordCallback(AppCallbackUrl recordCallback) {
        this.recordCallback = recordCallback;
        return this;
    }

    public AppCallbacks withRecordCallback(Consumer<AppCallbackUrl> recordCallbackSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppCallbacks appCallbacks = (AppCallbacks) o;
        return Objects.equals(this.pushCallback, appCallbacks.pushCallback)
            && Objects.equals(this.recordCallback, appCallbacks.recordCallback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pushCallback, recordCallback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppCallbacks {\n");
        sb.append("    pushCallback: ").append(toIndentedString(pushCallback)).append("\n");
        sb.append("    recordCallback: ").append(toIndentedString(recordCallback)).append("\n");
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
