package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FaceSearchBase64Req
 */
public class FaceSearchBase64Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_base64")

    private String imageBase64;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_fields")

    private List<String> returnFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Double threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private List<Map<String, String>> sort = null;

    public FaceSearchBase64Req withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 过滤条件，参考[filter语法](https://support.huaweicloud.com/api-face/face_02_0014.html)。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public FaceSearchBase64Req withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 返回查询到的最相似的N张人脸，N默认为10。
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public FaceSearchBase64Req withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    /**
     * 图像数据，Base64编码，要求： • Base64编码后大小不超过8MB，建议小于MB。 • 图片为JPG/JPEG/BMP/PNG格式。
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public FaceSearchBase64Req withReturnFields(List<String> returnFields) {
        this.returnFields = returnFields;
        return this;
    }

    public FaceSearchBase64Req addReturnFieldsItem(String returnFieldsItem) {
        if (this.returnFields == null) {
            this.returnFields = new ArrayList<>();
        }
        this.returnFields.add(returnFieldsItem);
        return this;
    }

    public FaceSearchBase64Req withReturnFields(Consumer<List<String>> returnFieldsSetter) {
        if (this.returnFields == null) {
            this.returnFields = new ArrayList<>();
        }
        returnFieldsSetter.accept(this.returnFields);
        return this;
    }

    /**
     * 指定返回的自定义字段。
     * @return returnFields
     */
    public List<String> getReturnFields() {
        return returnFields;
    }

    public void setReturnFields(List<String> returnFields) {
        this.returnFields = returnFields;
    }

    public FaceSearchBase64Req withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 人脸相似度阈值，低于这个阈值则不返回，取值范围0~1，一般情况下建议取值0.93，默认为0。
     * @return threshold
     */
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public FaceSearchBase64Req withSort(List<Map<String, String>> sort) {
        this.sort = sort;
        return this;
    }

    public FaceSearchBase64Req addSortItem(Map<String, String> sortItem) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(sortItem);
        return this;
    }

    public FaceSearchBase64Req withSort(Consumer<List<Map<String, String>>> sortSetter) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        sortSetter.accept(this.sort);
        return this;
    }

    /**
     * 支持字段排序，参考[sort语法](https://support.huaweicloud.com/api-face/face_02_0013.html)。
     * @return sort
     */
    public List<Map<String, String>> getSort() {
        return sort;
    }

    public void setSort(List<Map<String, String>> sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaceSearchBase64Req faceSearchBase64Req = (FaceSearchBase64Req) o;
        return Objects.equals(this.filter, faceSearchBase64Req.filter)
            && Objects.equals(this.topN, faceSearchBase64Req.topN)
            && Objects.equals(this.imageBase64, faceSearchBase64Req.imageBase64)
            && Objects.equals(this.returnFields, faceSearchBase64Req.returnFields)
            && Objects.equals(this.threshold, faceSearchBase64Req.threshold)
            && Objects.equals(this.sort, faceSearchBase64Req.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, topN, imageBase64, returnFields, threshold, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceSearchBase64Req {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
        sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
