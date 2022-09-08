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
public class WebImageWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extracted_data")

    private Object extractedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_info")

    private Object contactInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Object imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "district")

    private String district;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_address")

    private String detailAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_list")

    private List<String> fontList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "font_scores")

    private List<Float> fontScores = null;

    public WebImageWordsBlockList withWords(String words) {
        this.words = words;
        return this;
    }

    /**
     * 文字块识别结果。 
     * @return words
     */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public WebImageWordsBlockList withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public WebImageWordsBlockList withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public WebImageWordsBlockList addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public WebImageWordsBlockList withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 文字块的区域位置信息，列表形式，包含文字区域四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public WebImageWordsBlockList withExtractedData(Object extractedData) {
        this.extractedData = extractedData;
        return this;
    }

    /**
     * 提取出的结构化JSON结果，该字典内的key值与入参列表extract_type的值一致，目前仅支持联系人信息提取，亦即key值为\"contact_info\"的字段。 若入参extract_type为空列表或该字段缺失时，不进行提取，此字段为空。 
     * @return extractedData
     */
    public Object getExtractedData() {
        return extractedData;
    }

    public void setExtractedData(Object extractedData) {
        this.extractedData = extractedData;
    }

    public WebImageWordsBlockList withContactInfo(Object contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    /**
     * 该字段表示提取的联系人信息，包括：姓名、联系电话、省市区以及详细地址。 若入参extract_type列表中无该字段，则此字段不存在。 
     * @return contactInfo
     */
    public Object getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Object contactInfo) {
        this.contactInfo = contactInfo;
    }

    public WebImageWordsBlockList withImageSize(Object imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 该字段表示返回图片宽高信息。 如入参extract_type列表中无该字段，则此字段不存在。 
     * @return imageSize
     */
    public Object getImageSize() {
        return imageSize;
    }

    public void setImageSize(Object imageSize) {
        this.imageSize = imageSize;
    }

    public WebImageWordsBlockList withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 传入image_size时的返回，为图像高度。 
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public WebImageWordsBlockList withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 传入image_size时的返回，为图像宽度。 
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public WebImageWordsBlockList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 传入contact_info时的返回，为姓名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebImageWordsBlockList withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 传入contact_info时的返回，联系电话。 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public WebImageWordsBlockList withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 传入contact_info时的返回，省。 
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public WebImageWordsBlockList withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 传入contact_info时的返回，市。 
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public WebImageWordsBlockList withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * 传入contact_info时的返回，县区。 
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public WebImageWordsBlockList withDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
        return this;
    }

    /**
     * 传入contact_info时的返回，详细地址（不含省市区）。 
     * @return detailAddress
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public WebImageWordsBlockList withFontList(List<String> fontList) {
        this.fontList = fontList;
        return this;
    }

    public WebImageWordsBlockList addFontListItem(String fontListItem) {
        if (this.fontList == null) {
            this.fontList = new ArrayList<>();
        }
        this.fontList.add(fontListItem);
        return this;
    }

    public WebImageWordsBlockList withFontList(Consumer<List<String>> fontListSetter) {
        if (this.fontList == null) {
            this.fontList = new ArrayList<>();
        }
        fontListSetter.accept(this.fontList);
        return this;
    }

    /**
     * 文字块所属字体类型，列表形式，表示与文字块的文字最接近的字体类型。 
     * @return fontList
     */
    public List<String> getFontList() {
        return fontList;
    }

    public void setFontList(List<String> fontList) {
        this.fontList = fontList;
    }

    public WebImageWordsBlockList withFontScores(List<Float> fontScores) {
        this.fontScores = fontScores;
        return this;
    }

    public WebImageWordsBlockList addFontScoresItem(Float fontScoresItem) {
        if (this.fontScores == null) {
            this.fontScores = new ArrayList<>();
        }
        this.fontScores.add(fontScoresItem);
        return this;
    }

    public WebImageWordsBlockList withFontScores(Consumer<List<Float>> fontScoresSetter) {
        if (this.fontScores == null) {
            this.fontScores = new ArrayList<>();
        }
        fontScoresSetter.accept(this.fontScores);
        return this;
    }

    /**
     * 文字块所属字体类型的概率，列表形式，与font_list一一对应，表示文字块的文字属于某种字体类型的概率。 
     * @return fontScores
     */
    public List<Float> getFontScores() {
        return fontScores;
    }

    public void setFontScores(List<Float> fontScores) {
        this.fontScores = fontScores;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebImageWordsBlockList webImageWordsBlockList = (WebImageWordsBlockList) o;
        return Objects.equals(this.words, webImageWordsBlockList.words)
            && Objects.equals(this.confidence, webImageWordsBlockList.confidence)
            && Objects.equals(this.location, webImageWordsBlockList.location)
            && Objects.equals(this.extractedData, webImageWordsBlockList.extractedData)
            && Objects.equals(this.contactInfo, webImageWordsBlockList.contactInfo)
            && Objects.equals(this.imageSize, webImageWordsBlockList.imageSize)
            && Objects.equals(this.height, webImageWordsBlockList.height)
            && Objects.equals(this.width, webImageWordsBlockList.width)
            && Objects.equals(this.name, webImageWordsBlockList.name)
            && Objects.equals(this.phone, webImageWordsBlockList.phone)
            && Objects.equals(this.province, webImageWordsBlockList.province)
            && Objects.equals(this.city, webImageWordsBlockList.city)
            && Objects.equals(this.district, webImageWordsBlockList.district)
            && Objects.equals(this.detailAddress, webImageWordsBlockList.detailAddress)
            && Objects.equals(this.fontList, webImageWordsBlockList.fontList)
            && Objects.equals(this.fontScores, webImageWordsBlockList.fontScores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words,
            confidence,
            location,
            extractedData,
            contactInfo,
            imageSize,
            height,
            width,
            name,
            phone,
            province,
            city,
            district,
            detailAddress,
            fontList,
            fontScores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebImageWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    extractedData: ").append(toIndentedString(extractedData)).append("\n");
        sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
        sb.append("    fontList: ").append(toIndentedString(fontList)).append("\n");
        sb.append("    fontScores: ").append(toIndentedString(fontScores)).append("\n");
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
