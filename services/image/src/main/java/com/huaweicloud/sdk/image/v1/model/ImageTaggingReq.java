package com.huaweicloud.sdk.image.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class ImageTaggingReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private byte[] image;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="language")
    
    private String language;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold")
    
    private Float threshold = 0.0f;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ImageTaggingReq withImage(byte[] image) {
        this.image = image;
        return this;
    }

    


    /**
     * 与url二选一  图像数据，base64编码，要求base64编码后大小不超过10M，最短边至少15px，最长边最大4096px，支持JPG/PNG/BMP格式。 
     * @return image
     */
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public ImageTaggingReq withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 与image二选一  图片的URL路径，目前支持：  - 公网HTTP/HTTPS URL  - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[配置OBS服务的访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)。  > 说明：  - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。  - 请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageTaggingReq withLanguage(String language) {
        this.language = language;
        return this;
    }

    


    /**
     * zh：返回标签的语言类型为中文。  en：返回标签的语言类型为英文。  默认值为zh。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ImageTaggingReq withThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    


    /**
     * 置信度的阈值（0~100），低于此置信数的标签，将不会返回。  默认值：0。
     * minimum: 0
     * maximum: 1E+2
     * @return threshold
     */
    public Float getThreshold() {
        return threshold;
    }

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    public ImageTaggingReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 最多返回的tag数，默认值： -1，表示返回所有。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageTaggingReq imageTaggingReq = (ImageTaggingReq) o;
        return Objects.equals(this.image, imageTaggingReq.image) &&
            Objects.equals(this.url, imageTaggingReq.url) &&
            Objects.equals(this.language, imageTaggingReq.language) &&
            Objects.equals(this.threshold, imageTaggingReq.threshold) &&
            Objects.equals(this.limit, imageTaggingReq.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(image, url, language, threshold, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingReq {\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    language: ").append(toIndentedString(language)).append("\n");
            sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

