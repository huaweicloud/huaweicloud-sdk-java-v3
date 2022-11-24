package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SearchFaceByFileRequestBody
 */
public class SearchFaceByFileRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "image_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart imageFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Double threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_fields")

    private String returnFields;

    public SearchFaceByFileRequestBody withImageFile(FormDataFilePart imageFile) {
        this.imageFile = imageFile;
        return this;
    }

    /**
     * 本地图片文件，图片不能超过8MB,建议小于1MB。上传文件时，请求格式为multipart。  必选，与image_url、image_base64、face_id四选一。
     * @return imageFile
     */
    public FormDataFilePart getImageFile() {
        return imageFile;
    }

    public void setImageFile(FormDataFilePart imageFile) {
        this.imageFile = imageFile;
    }

    public SearchFaceByFileRequestBody withTopN(Integer topN) {
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

    public SearchFaceByFileRequestBody withThreshold(Double threshold) {
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

    public SearchFaceByFileRequestBody withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * [支持字段排序，参考[sort语法](https://support.huaweicloud.com/api-face/face_02_0013.html)。](tag:hc) [支持字段排序，参考[sort语法](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0013.html)。](tag:hk)
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public SearchFaceByFileRequestBody withFilter(String filter) {
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

    public SearchFaceByFileRequestBody withReturnFields(String returnFields) {
        this.returnFields = returnFields;
        return this;
    }

    /**
     * 指定返回的自定义字段。
     * @return returnFields
     */
    public String getReturnFields() {
        return returnFields;
    }

    public void setReturnFields(String returnFields) {
        this.returnFields = returnFields;
    }

    public SearchFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName, String contentType) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public SearchFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName) {
        this.imageFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public SearchFaceByFileRequestBody withImageFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.imageFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("image_file", imageFile);
                if (topN != null) {
                    put("top_n", new FormDataPart<>(topN));
                }
                if (threshold != null) {
                    put("threshold", new FormDataPart<>(threshold));
                }
                if (sort != null) {
                    put("sort", new FormDataPart<>(sort));
                }
                if (filter != null) {
                    put("filter", new FormDataPart<>(filter));
                }
                if (returnFields != null) {
                    put("return_fields", new FormDataPart<>(returnFields));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchFaceByFileRequestBody searchFaceByFileRequestBody = (SearchFaceByFileRequestBody) o;
        return Objects.equals(this.imageFile, searchFaceByFileRequestBody.imageFile)
            && Objects.equals(this.topN, searchFaceByFileRequestBody.topN)
            && Objects.equals(this.threshold, searchFaceByFileRequestBody.threshold)
            && Objects.equals(this.sort, searchFaceByFileRequestBody.sort)
            && Objects.equals(this.filter, searchFaceByFileRequestBody.filter)
            && Objects.equals(this.returnFields, searchFaceByFileRequestBody.returnFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageFile, topN, threshold, sort, filter, returnFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchFaceByFileRequestBody {\n");
        sb.append("    imageFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
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
