package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 摄像头重定向。
 */
public class PoliciesPeripheralsDeviceRedirectionCameraRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_compress_enable")

    private Boolean videoCompressEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions options;

    public PoliciesPeripheralsDeviceRedirectionCameraRedirection withVideoCompressEnable(Boolean videoCompressEnable) {
        this.videoCompressEnable = videoCompressEnable;
        return this;
    }

    /**
     * 是否开启摄像头设备重定向。取值为： false：表示关闭。 true：表示开启。
     * @return videoCompressEnable
     */
    public Boolean getVideoCompressEnable() {
        return videoCompressEnable;
    }

    public void setVideoCompressEnable(Boolean videoCompressEnable) {
        this.videoCompressEnable = videoCompressEnable;
    }

    public PoliciesPeripheralsDeviceRedirectionCameraRedirection withOptions(
        PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirectionCameraRedirection withOptions(
        Consumer<PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsDeviceRedirectionCameraRedirection that =
            (PoliciesPeripheralsDeviceRedirectionCameraRedirection) obj;
        return Objects.equals(this.videoCompressEnable, that.videoCompressEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoCompressEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionCameraRedirection {\n");
        sb.append("    videoCompressEnable: ").append(toIndentedString(videoCompressEnable)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
