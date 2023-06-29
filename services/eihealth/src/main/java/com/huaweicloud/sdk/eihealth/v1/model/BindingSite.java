package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结合位点
 */
public class BindingSite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protein")

    private String protein;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bounding_box")

    private BoundingBox boundingBox;

    public BindingSite withProtein(String protein) {
        this.protein = protein;
        return this;
    }

    /**
     * 蛋白质3D结构，使用gzip压缩然后转base64格式
     * @return protein
     */
    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public BindingSite withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public BindingSite withBoundingBox(Consumer<BoundingBox> boundingBoxSetter) {
        if (this.boundingBox == null) {
            this.boundingBox = new BoundingBox();
            boundingBoxSetter.accept(this.boundingBox);
        }

        return this;
    }

    /**
     * Get boundingBox
     * @return boundingBox
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindingSite that = (BindingSite) obj;
        return Objects.equals(this.protein, that.protein) && Objects.equals(this.boundingBox, that.boundingBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protein, boundingBox);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindingSite {\n");
        sb.append("    protein: ").append(toIndentedString(protein)).append("\n");
        sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
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
