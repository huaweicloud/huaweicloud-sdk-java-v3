package com.huaweicloud.sdk.ocr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class BusinessCardRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private String image;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detect_direction")
    
    private Boolean detectDirection;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="return_adjusted_image")
    
    private Boolean returnAdjustedImage;

    public BusinessCardRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    


    /**
     * 与url二选一  图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于15px，最长边不超过8192px，支持JPEG、JPG、PNG、BMP、TIFF格式。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    

    public BusinessCardRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 与image二选一  图片的URL路径，目前支持：  - 公网http/https url  - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。  > 说明：  - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。  - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public BusinessCardRequestBody withDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    


    /**
     * 图片朝向检测开关，可选值包括：  - true：检测图片朝向;  - false：不检测图片朝向。  > 说明：  - 支持任意角度的图片朝向检测。未传入该参数时默认为false，即不检测图片朝向。 
     * @return detectDirection
     */
    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public void setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
    }

    

    public BusinessCardRequestBody withReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
        return this;
    }

    


    /**
     * 返回矫正后的名片图像的BASE64编码的开关，可选值包括：  - true：返回BASE64编码；  - false：不返回BASE64编码。  > 说明：  - 未传入该参数时默认为false，即不返回BASE64编码。 
     * @return returnAdjustedImage
     */
    public Boolean getReturnAdjustedImage() {
        return returnAdjustedImage;
    }

    public void setReturnAdjustedImage(Boolean returnAdjustedImage) {
        this.returnAdjustedImage = returnAdjustedImage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessCardRequestBody businessCardRequestBody = (BusinessCardRequestBody) o;
        return Objects.equals(this.image, businessCardRequestBody.image) &&
            Objects.equals(this.url, businessCardRequestBody.url) &&
            Objects.equals(this.detectDirection, businessCardRequestBody.detectDirection) &&
            Objects.equals(this.returnAdjustedImage, businessCardRequestBody.returnAdjustedImage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(image, url, detectDirection, returnAdjustedImage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessCardRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    detectDirection: ").append(toIndentedString(detectDirection)).append("\n");
        sb.append("    returnAdjustedImage: ").append(toIndentedString(returnAdjustedImage)).append("\n");
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

