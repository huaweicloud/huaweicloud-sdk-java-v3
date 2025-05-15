package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MyanmarDriverLicenseRequestBody
 */
public class MyanmarDriverLicenseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "convert_unicode")

    private Boolean convertUnicode;

    public MyanmarDriverLicenseRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。  图片的Base64编码，要求单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过4096px，支持JPEG、JPG、PNG、BMP、TIFF格式。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MyanmarDriverLicenseRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一。  单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片最小边不小于15px，最长边不超过4096px，支持JPEG、JPG、PNG、BMP、TIFF格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/intl/zh-cn/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MyanmarDriverLicenseRequestBody withConvertUnicode(Boolean convertUnicode) {
        this.convertUnicode = convertUnicode;
        return this;
    }

    /**
     * - true：输出为unicode格式 - false：输出为zawgyi格式 如果参数值为空或无该参数，默认输出为zawgyi格式。 
     * @return convertUnicode
     */
    public Boolean getConvertUnicode() {
        return convertUnicode;
    }

    public void setConvertUnicode(Boolean convertUnicode) {
        this.convertUnicode = convertUnicode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyanmarDriverLicenseRequestBody that = (MyanmarDriverLicenseRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.convertUnicode, that.convertUnicode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, convertUnicode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyanmarDriverLicenseRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    convertUnicode: ").append(toIndentedString(convertUnicode)).append("\n");
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
