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
 * 
 */
public class CelebrityRecognitionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private String image;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold")
    
    private Float threshold;

    public CelebrityRecognitionReq withImage(String image) {
        this.image = image;
        return this;
    }

    


    /**
     * 与url二选一  图片文件Base64编码字符串。要求base64编码后大小不超过10M。  政治人物检测人脸部分不小于40*40像素。  支持JPG/PNG/BMP格式。 
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CelebrityRecognitionReq withUrl(String url) {
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

    public CelebrityRecognitionReq withThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    


    /**
     * 置信度的阈值（0~1），低于此置信数的标签，将不会返回。  默认值：0.48。 
     * @return threshold
     */
    public Float getThreshold() {
        return threshold;
    }

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CelebrityRecognitionReq celebrityRecognitionReq = (CelebrityRecognitionReq) o;
        return Objects.equals(this.image, celebrityRecognitionReq.image) &&
            Objects.equals(this.url, celebrityRecognitionReq.url) &&
            Objects.equals(this.threshold, celebrityRecognitionReq.threshold);
    }
    @Override
    public int hashCode() {
        return Objects.hash(image, url, threshold);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CelebrityRecognitionReq {\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

