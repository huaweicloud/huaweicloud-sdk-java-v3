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
public class SealResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seal_list")

    private List<SealList> sealList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "erased_seal_image")

    private String erasedSealImage;

    public SealResult withSealList(List<SealList> sealList) {
        this.sealList = sealList;
        return this;
    }

    public SealResult addSealListItem(SealList sealListItem) {
        if (this.sealList == null) {
            this.sealList = new ArrayList<>();
        }
        this.sealList.add(sealListItem);
        return this;
    }

    public SealResult withSealList(Consumer<List<SealList>> sealListSetter) {
        if (this.sealList == null) {
            this.sealList = new ArrayList<>();
        }
        sealListSetter.accept(this.sealList);
        return this;
    }

    /**
     * 印章信息列表。 
     * @return sealList
     */
    public List<SealList> getSealList() {
        return sealList;
    }

    public void setSealList(List<SealList> sealList) {
        this.sealList = sealList;
    }

    public SealResult withErasedSealImage(String erasedSealImage) {
        this.erasedSealImage = erasedSealImage;
        return this;
    }

    /**
     * 在输入图片基础上进行印章擦除后的base64编码图片。 
     * @return erasedSealImage
     */
    public String getErasedSealImage() {
        return erasedSealImage;
    }

    public void setErasedSealImage(String erasedSealImage) {
        this.erasedSealImage = erasedSealImage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SealResult that = (SealResult) obj;
        return Objects.equals(this.sealList, that.sealList)
            && Objects.equals(this.erasedSealImage, that.erasedSealImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sealList, erasedSealImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SealResult {\n");
        sb.append("    sealList: ").append(toIndentedString(sealList)).append("\n");
        sb.append("    erasedSealImage: ").append(toIndentedString(erasedSealImage)).append("\n");
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
