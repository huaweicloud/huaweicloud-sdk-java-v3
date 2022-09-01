package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFacesByLimitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    @JacksonXmlProperty(localName = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ShowFacesByLimitRequest withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /**
     * 人脸库名称。
     * @return faceSetName
     */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public ShowFacesByLimitRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 从第几条数据读起，默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowFacesByLimitRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 读取多少条，默认为5。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFacesByLimitRequest showFacesByLimitRequest = (ShowFacesByLimitRequest) o;
        return Objects.equals(this.faceSetName, showFacesByLimitRequest.faceSetName)
            && Objects.equals(this.offset, showFacesByLimitRequest.offset)
            && Objects.equals(this.limit, showFacesByLimitRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetName, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFacesByLimitRequest {\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
