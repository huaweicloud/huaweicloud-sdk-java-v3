package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Watermark
 */
public class Watermark {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_enable")

    private Boolean watermarkEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private WatermarkOptions options;

    public Watermark withWatermarkEnable(Boolean watermarkEnable) {
        this.watermarkEnable = watermarkEnable;
        return this;
    }

    /**
     * 是否开启水印策略设置。取值为：false：表示关闭。true：表示开启。
     * @return watermarkEnable
     */
    public Boolean getWatermarkEnable() {
        return watermarkEnable;
    }

    public void setWatermarkEnable(Boolean watermarkEnable) {
        this.watermarkEnable = watermarkEnable;
    }

    public Watermark withOptions(WatermarkOptions options) {
        this.options = options;
        return this;
    }

    public Watermark withOptions(Consumer<WatermarkOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new WatermarkOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public WatermarkOptions getOptions() {
        return options;
    }

    public void setOptions(WatermarkOptions options) {
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
        Watermark that = (Watermark) obj;
        return Objects.equals(this.watermarkEnable, that.watermarkEnable) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermarkEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Watermark {\n");
        sb.append("    watermarkEnable: ").append(toIndentedString(watermarkEnable)).append("\n");
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
