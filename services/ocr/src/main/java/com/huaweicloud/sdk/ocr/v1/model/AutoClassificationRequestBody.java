package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AutoClassificationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_list")

    private List<String> typeList = null;

    public AutoClassificationRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一  图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于15px，最长边不超过8000px，支持JPEG、JPG、PNG、BMP、TIFF格式。  图片文件Base64编码字符串，点击[这里](https://support.huaweicloud.com/ocr_faq/ocr_01_0032.html)查看详细获取方式。   
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public AutoClassificationRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 与image二选一 图片的URL路径，目前支持： - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权，详情参见[配置OBS访问权限](https://support.huaweicloud.com/api-ocr/ocr_03_0132.html)。 > 说明： - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AutoClassificationRequestBody withTypeList(List<String> typeList) {
        this.typeList = typeList;
        return this;
    }

    public AutoClassificationRequestBody addTypeListItem(String typeListItem) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        this.typeList.add(typeListItem);
        return this;
    }

    public AutoClassificationRequestBody withTypeList(Consumer<List<String>> typeListSetter) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        typeListSetter.accept(this.typeList);
        return this;
    }

    /**
     * 可以指定要识别的票证，指定后不出现在此List的票证不识别。不指定时默认返回所有支持类别票证的识别信息。 
     * @return typeList
     */
    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoClassificationRequestBody autoClassificationRequestBody = (AutoClassificationRequestBody) o;
        return Objects.equals(this.image, autoClassificationRequestBody.image)
            && Objects.equals(this.url, autoClassificationRequestBody.url)
            && Objects.equals(this.typeList, autoClassificationRequestBody.typeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, typeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoClassificationRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
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
