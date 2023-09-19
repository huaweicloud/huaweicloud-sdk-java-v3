package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IdDocumentRequestBody
 */
public class IdDocumentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_region")

    private List<String> countryRegion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_type")

    private List<String> idType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_portrait_image")

    private Boolean returnPortraitImage;

    public IdDocumentRequestBody withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 该参数与url二选一。图像数据，base64编码，要求base64编码后大小不超过10MB。图片最小边不小于100px，最长边不超过8192px，支持JPEG、JPG、PNG、BMP、TIFF。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public IdDocumentRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 该参数与image二选一。图片的url路径，目前支持： Image URL. Currently, the following URLs are supported: - 公网http/https url - OBS提供的url，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。 > 说明: - 接口响应时间依赖于图片的下载时间，如果图片下载时间过长，会返回接口调用失败。 - 请保证被检测图片所在的存储服务稳定可靠，推荐使用OBS服务存储图片数据。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public IdDocumentRequestBody withCountryRegion(List<String> countryRegion) {
        this.countryRegion = countryRegion;
        return this;
    }

    public IdDocumentRequestBody addCountryRegionItem(String countryRegionItem) {
        if (this.countryRegion == null) {
            this.countryRegion = new ArrayList<>();
        }
        this.countryRegion.add(countryRegionItem);
        return this;
    }

    public IdDocumentRequestBody withCountryRegion(Consumer<List<String>> countryRegionSetter) {
        if (this.countryRegion == null) {
            this.countryRegion = new ArrayList<>();
        }
        countryRegionSetter.accept(this.countryRegion);
        return this;
    }

    /**
     * 证件签发国家或地区代码，命名遵循ISO-3166 3位代码。可选值。支持填写1个或多个国家/地区。指定参数后，服务只识别指定国家/地区的卡证，如留空，则识别所有地区卡证。建议国家/地区固定或有限范围的情况下填写。支持国家/地区列表见表1国家/地区和证件列表。 
     * @return countryRegion
     */
    public List<String> getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(List<String> countryRegion) {
        this.countryRegion = countryRegion;
    }

    public IdDocumentRequestBody withIdType(List<String> idType) {
        this.idType = idType;
        return this;
    }

    public IdDocumentRequestBody addIdTypeItem(String idTypeItem) {
        if (this.idType == null) {
            this.idType = new ArrayList<>();
        }
        this.idType.add(idTypeItem);
        return this;
    }

    public IdDocumentRequestBody withIdType(Consumer<List<String>> idTypeSetter) {
        if (this.idType == null) {
            this.idType = new ArrayList<>();
        }
        idTypeSetter.accept(this.idType);
        return this;
    }

    /**
     * 证件类型。可选值。支持填写1种或多种证件。指定参数后，服务只识别指定类型的卡证，如留空，默认识别所有类型卡证，建议已知证件类型的情况下填写。支持证件类型如下： - PP: passport，国际护照。 - DL: driving license，驾驶证。 - ID: identification card，各国颁发的身份证类型证件，比如身份证、选民卡、社保卡等。 
     * @return idType
     */
    public List<String> getIdType() {
        return idType;
    }

    public void setIdType(List<String> idType) {
        this.idType = idType;
    }

    public IdDocumentRequestBody withReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
        return this;
    }

    /**
     * 控制是否返回portrait_image（证件中的人像图片），True代表需要返回，False代表不需要。 
     * @return returnPortraitImage
     */
    public Boolean getReturnPortraitImage() {
        return returnPortraitImage;
    }

    public void setReturnPortraitImage(Boolean returnPortraitImage) {
        this.returnPortraitImage = returnPortraitImage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdDocumentRequestBody that = (IdDocumentRequestBody) obj;
        return Objects.equals(this.image, that.image) && Objects.equals(this.url, that.url)
            && Objects.equals(this.countryRegion, that.countryRegion) && Objects.equals(this.idType, that.idType)
            && Objects.equals(this.returnPortraitImage, that.returnPortraitImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, url, countryRegion, idType, returnPortraitImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdDocumentRequestBody {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    countryRegion: ").append(toIndentedString(countryRegion)).append("\n");
        sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
        sb.append("    returnPortraitImage: ").append(toIndentedString(returnPortraitImage)).append("\n");
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
