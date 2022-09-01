package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FaceSearchFaceIdReq
 */
public class FaceSearchFaceIdReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    @JacksonXmlProperty(localName = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    @JacksonXmlProperty(localName = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_id")

    @JacksonXmlProperty(localName = "face_id")

    private String faceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_fields")

    @JacksonXmlProperty(localName = "return_fields")

    private List<String> returnFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    @JacksonXmlProperty(localName = "threshold")

    private Double threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    @JacksonXmlProperty(localName = "sort")

    private List<Map<String, String>> sort = null;

    public FaceSearchFaceIdReq withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * [过滤条件，参考[filter语法](https://support.huaweicloud.com/api-face/face_02_0014.html)。](tag:hc) [过滤条件，参考[filter语法](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0014.html)。](tag:hk)
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public FaceSearchFaceIdReq withTopN(Integer topN) {
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

    public FaceSearchFaceIdReq withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * 导入人脸时，系统返回的人脸编号，即人脸ID。
     * @return faceId
     */
    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public FaceSearchFaceIdReq withReturnFields(List<String> returnFields) {
        this.returnFields = returnFields;
        return this;
    }

    public FaceSearchFaceIdReq addReturnFieldsItem(String returnFieldsItem) {
        if (this.returnFields == null) {
            this.returnFields = new ArrayList<>();
        }
        this.returnFields.add(returnFieldsItem);
        return this;
    }

    public FaceSearchFaceIdReq withReturnFields(Consumer<List<String>> returnFieldsSetter) {
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

    public FaceSearchFaceIdReq withThreshold(Double threshold) {
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

    public FaceSearchFaceIdReq withSort(List<Map<String, String>> sort) {
        this.sort = sort;
        return this;
    }

    public FaceSearchFaceIdReq addSortItem(Map<String, String> sortItem) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(sortItem);
        return this;
    }

    public FaceSearchFaceIdReq withSort(Consumer<List<Map<String, String>>> sortSetter) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        sortSetter.accept(this.sort);
        return this;
    }

    /**
     * [支持字段排序，参考[sort语法](https://support.huaweicloud.com/api-face/face_02_0013.html)。](tag:hc) [支持字段排序，参考[sort语法](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0013.html)。](tag:hk)
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
        FaceSearchFaceIdReq faceSearchFaceIdReq = (FaceSearchFaceIdReq) o;
        return Objects.equals(this.filter, faceSearchFaceIdReq.filter)
            && Objects.equals(this.topN, faceSearchFaceIdReq.topN)
            && Objects.equals(this.faceId, faceSearchFaceIdReq.faceId)
            && Objects.equals(this.returnFields, faceSearchFaceIdReq.returnFields)
            && Objects.equals(this.threshold, faceSearchFaceIdReq.threshold)
            && Objects.equals(this.sort, faceSearchFaceIdReq.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, topN, faceId, returnFields, threshold, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceSearchFaceIdReq {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    faceId: ").append(toIndentedString(faceId)).append("\n");
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
