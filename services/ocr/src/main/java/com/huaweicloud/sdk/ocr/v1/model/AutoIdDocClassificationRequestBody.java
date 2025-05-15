package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AutoIdDocClassificationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm")

    private Boolean alarm;

    public AutoIdDocClassificationRequestBody withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 该参数与url二选一。  图片的Base64编码，单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议图片大小不超过7MB。 图片尺寸不小于15px，最长边不超过8192px，支持JPEG/JPG/PNG/BMP/TIFF格式。 图片Base64编码示例如/9j/4AAQSkZJRgABAg...，带有多余前缀会产生The image format is not supported报错。 
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public AutoIdDocClassificationRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与data二选一。  单个图片其对应的Base64编码不超过10MB。文件在Base64编码后会大于文件原本大小，请注意做好边界判断，建议文件大小不超过7MB。 图片尺寸不小于15px，最长边不超过8192px，支持JPEG/JPG/PNG/BMP/TIFF格式。 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 - url中不能存在中文字符，若存在，中文需要进行utf8编码。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AutoIdDocClassificationRequestBody withAlarm(Boolean alarm) {
        this.alarm = alarm;
        return this;
    }

    /**
     * 证件告警检测功能的开关，默认false，取值范围如下：  - true：开启证件图像告警功能。 - false：关闭证件图像告警功能。 
     * @return alarm
     */
    public Boolean getAlarm() {
        return alarm;
    }

    public void setAlarm(Boolean alarm) {
        this.alarm = alarm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoIdDocClassificationRequestBody that = (AutoIdDocClassificationRequestBody) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.url, that.url)
            && Objects.equals(this.alarm, that.alarm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, url, alarm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoIdDocClassificationRequestBody {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
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
