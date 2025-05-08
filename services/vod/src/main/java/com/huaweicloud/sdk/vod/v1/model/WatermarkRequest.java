package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WatermarkRequest
 */
public class WatermarkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark")

    private ImageWatermark imageWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_context")

    private String textContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_watermark")

    private TextWatermark textWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svg_context")

    private String svgContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svg_watermark")

    private SVGWatermark svgWatermark;

    public WatermarkRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 水印模板ID 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public WatermarkRequest withInput(ObsInfo input) {
        this.input = input;
        return this;
    }

    public WatermarkRequest withInput(Consumer<ObsInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsInfo getInput() {
        return input;
    }

    public void setInput(ObsInfo input) {
        this.input = input;
    }

    public WatermarkRequest withImageWatermark(ImageWatermark imageWatermark) {
        this.imageWatermark = imageWatermark;
        return this;
    }

    public WatermarkRequest withImageWatermark(Consumer<ImageWatermark> imageWatermarkSetter) {
        if (this.imageWatermark == null) {
            this.imageWatermark = new ImageWatermark();
            imageWatermarkSetter.accept(this.imageWatermark);
        }

        return this;
    }

    /**
     * Get imageWatermark
     * @return imageWatermark
     */
    public ImageWatermark getImageWatermark() {
        return imageWatermark;
    }

    public void setImageWatermark(ImageWatermark imageWatermark) {
        this.imageWatermark = imageWatermark;
    }

    public WatermarkRequest withTextContext(String textContext) {
        this.textContext = textContext;
        return this;
    }

    /**
     * 文字水印内容，内容需做Base64编码，若类型为文字水印 (type字段为Text)，则此配置项不能为空 
     * @return textContext
     */
    public String getTextContext() {
        return textContext;
    }

    public void setTextContext(String textContext) {
        this.textContext = textContext;
    }

    public WatermarkRequest withTextWatermark(TextWatermark textWatermark) {
        this.textWatermark = textWatermark;
        return this;
    }

    public WatermarkRequest withTextWatermark(Consumer<TextWatermark> textWatermarkSetter) {
        if (this.textWatermark == null) {
            this.textWatermark = new TextWatermark();
            textWatermarkSetter.accept(this.textWatermark);
        }

        return this;
    }

    /**
     * Get textWatermark
     * @return textWatermark
     */
    public TextWatermark getTextWatermark() {
        return textWatermark;
    }

    public void setTextWatermark(TextWatermark textWatermark) {
        this.textWatermark = textWatermark;
    }

    public WatermarkRequest withSvgContext(String svgContext) {
        this.svgContext = svgContext;
        return this;
    }

    /**
     * svg水印的内容 
     * @return svgContext
     */
    public String getSvgContext() {
        return svgContext;
    }

    public void setSvgContext(String svgContext) {
        this.svgContext = svgContext;
    }

    public WatermarkRequest withSvgWatermark(SVGWatermark svgWatermark) {
        this.svgWatermark = svgWatermark;
        return this;
    }

    public WatermarkRequest withSvgWatermark(Consumer<SVGWatermark> svgWatermarkSetter) {
        if (this.svgWatermark == null) {
            this.svgWatermark = new SVGWatermark();
            svgWatermarkSetter.accept(this.svgWatermark);
        }

        return this;
    }

    /**
     * Get svgWatermark
     * @return svgWatermark
     */
    public SVGWatermark getSvgWatermark() {
        return svgWatermark;
    }

    public void setSvgWatermark(SVGWatermark svgWatermark) {
        this.svgWatermark = svgWatermark;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WatermarkRequest that = (WatermarkRequest) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.input, that.input)
            && Objects.equals(this.imageWatermark, that.imageWatermark)
            && Objects.equals(this.textContext, that.textContext)
            && Objects.equals(this.textWatermark, that.textWatermark)
            && Objects.equals(this.svgContext, that.svgContext) && Objects.equals(this.svgWatermark, that.svgWatermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, input, imageWatermark, textContext, textWatermark, svgContext, svgWatermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WatermarkRequest {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    imageWatermark: ").append(toIndentedString(imageWatermark)).append("\n");
        sb.append("    textContext: ").append(toIndentedString(textContext)).append("\n");
        sb.append("    textWatermark: ").append(toIndentedString(textWatermark)).append("\n");
        sb.append("    svgContext: ").append(toIndentedString(svgContext)).append("\n");
        sb.append("    svgWatermark: ").append(toIndentedString(svgWatermark)).append("\n");
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
