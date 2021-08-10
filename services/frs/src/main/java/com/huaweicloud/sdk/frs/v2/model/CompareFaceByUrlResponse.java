package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CompareFaceByUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image1_face")

    private CompareFace image1Face;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image2_face")

    private CompareFace image2Face;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similarity")

    private Double similarity;

    public CompareFaceByUrlResponse withImage1Face(CompareFace image1Face) {
        this.image1Face = image1Face;
        return this;
    }

    public CompareFaceByUrlResponse withImage1Face(Consumer<CompareFace> image1FaceSetter) {
        if (this.image1Face == null) {
            this.image1Face = new CompareFace();
            image1FaceSetter.accept(this.image1Face);
        }

        return this;
    }

    /** Get image1Face
     * 
     * @return image1Face */
    public CompareFace getImage1Face() {
        return image1Face;
    }

    public void setImage1Face(CompareFace image1Face) {
        this.image1Face = image1Face;
    }

    public CompareFaceByUrlResponse withImage2Face(CompareFace image2Face) {
        this.image2Face = image2Face;
        return this;
    }

    public CompareFaceByUrlResponse withImage2Face(Consumer<CompareFace> image2FaceSetter) {
        if (this.image2Face == null) {
            this.image2Face = new CompareFace();
            image2FaceSetter.accept(this.image2Face);
        }

        return this;
    }

    /** Get image2Face
     * 
     * @return image2Face */
    public CompareFace getImage2Face() {
        return image2Face;
    }

    public void setImage2Face(CompareFace image2Face) {
        this.image2Face = image2Face;
    }

    public CompareFaceByUrlResponse withSimilarity(Double similarity) {
        this.similarity = similarity;
        return this;
    }

    /** 人脸相似度，1表示最大，0表示最小，值越大表示越相似。一般情况下超过0.93即可认为是同一个人。 调用失败时无此字段。
     * 
     * @return similarity */
    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareFaceByUrlResponse compareFaceByUrlResponse = (CompareFaceByUrlResponse) o;
        return Objects.equals(this.image1Face, compareFaceByUrlResponse.image1Face)
            && Objects.equals(this.image2Face, compareFaceByUrlResponse.image2Face)
            && Objects.equals(this.similarity, compareFaceByUrlResponse.similarity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image1Face, image2Face, similarity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareFaceByUrlResponse {\n");
        sb.append("    image1Face: ").append(toIndentedString(image1Face)).append("\n");
        sb.append("    image2Face: ").append(toIndentedString(image2Face)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
