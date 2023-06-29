package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteGetImagesListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_type")

    private Integer resolutionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public ExecuteGetImagesListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 范围：大于等于1 默认：10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ExecuteGetImagesListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 范围：大于等于0 默认值：0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ExecuteGetImagesListRequest withResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
        return this;
    }

    /**
     * 横竖屏模式 0：横屏（默认） 1：竖屏
     * @return resolutionType
     */
    public Integer getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
    }

    public ExecuteGetImagesListRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 默认0 0：用户背景 1：系统背景 2：用户图标
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteGetImagesListRequest that = (ExecuteGetImagesListRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.resolutionType, that.resolutionType) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, resolutionType, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetImagesListRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
