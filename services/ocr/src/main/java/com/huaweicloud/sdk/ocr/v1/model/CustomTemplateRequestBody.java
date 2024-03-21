package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自定义模板OCR请求体
 */
public class CustomTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifier_id")

    private String classifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifier_mode")

    private Boolean classifierMode;

    public CustomTemplateRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一  图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于15px，最长边不超过8192px，支持JPEG、JPG、PNG、BMP、TIFF、GIF、WEBP格式。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CustomTemplateRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CustomTemplateRequestBody withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 该参数与classifier_id二选一。 模板id，如果传入，启用单模板识别模式。 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CustomTemplateRequestBody withClassifierId(String classifierId) {
        this.classifierId = classifierId;
        return this;
    }

    /**
     * 该参数与template_id二选一。 分类器id，如果传入，启用多模板识别模式。 
     * @return classifierId
     */
    public String getClassifierId() {
        return classifierId;
    }

    public void setClassifierId(String classifierId) {
        this.classifierId = classifierId;
    }

    public CustomTemplateRequestBody withClassifierMode(Boolean classifierMode) {
        this.classifierMode = classifierMode;
        return this;
    }

    /**
     * 该参数与classifier_id参数配合使用，可选值如下所示： - true：仅返回模板分类结果 - false：正常返回多模板识别结果 > 说明： - 如果未传入该参数时默认为false，即正常返回多模板识别结果。 
     * @return classifierMode
     */
    public Boolean getClassifierMode() {
        return classifierMode;
    }

    public void setClassifierMode(Boolean classifierMode) {
        this.classifierMode = classifierMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTemplateRequestBody that = (CustomTemplateRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.classifierId, that.classifierId)
            && Objects.equals(this.classifierMode, that.classifierMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, templateId, classifierId, classifierMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomTemplateRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    classifierId: ").append(toIndentedString(classifierId)).append("\n");
        sb.append("    classifierMode: ").append(toIndentedString(classifierMode)).append("\n");
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
