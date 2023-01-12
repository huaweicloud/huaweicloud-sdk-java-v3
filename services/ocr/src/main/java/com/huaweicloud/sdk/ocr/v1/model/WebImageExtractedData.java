package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class WebImageExtractedData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_info")

    private WebImageContactInfo contactInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private WebImageImageSize imageSize;

    public WebImageExtractedData withContactInfo(WebImageContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    public WebImageExtractedData withContactInfo(Consumer<WebImageContactInfo> contactInfoSetter) {
        if (this.contactInfo == null) {
            this.contactInfo = new WebImageContactInfo();
            contactInfoSetter.accept(this.contactInfo);
        }

        return this;
    }

    /**
     * Get contactInfo
     * @return contactInfo
     */
    public WebImageContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(WebImageContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public WebImageExtractedData withImageSize(WebImageImageSize imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    public WebImageExtractedData withImageSize(Consumer<WebImageImageSize> imageSizeSetter) {
        if (this.imageSize == null) {
            this.imageSize = new WebImageImageSize();
            imageSizeSetter.accept(this.imageSize);
        }

        return this;
    }

    /**
     * Get imageSize
     * @return imageSize
     */
    public WebImageImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(WebImageImageSize imageSize) {
        this.imageSize = imageSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebImageExtractedData webImageExtractedData = (WebImageExtractedData) o;
        return Objects.equals(this.contactInfo, webImageExtractedData.contactInfo)
            && Objects.equals(this.imageSize, webImageExtractedData.imageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactInfo, imageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebImageExtractedData {\n");
        sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
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
