package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListThumbnailDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_result")

    private List<ThumbnailRsp> thumbnailResult = null;

    public ListThumbnailDetailsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 截图图片总数 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListThumbnailDetailsResponse withThumbnailResult(List<ThumbnailRsp> thumbnailResult) {
        this.thumbnailResult = thumbnailResult;
        return this;
    }

    public ListThumbnailDetailsResponse addThumbnailResultItem(ThumbnailRsp thumbnailResultItem) {
        if (this.thumbnailResult == null) {
            this.thumbnailResult = new ArrayList<>();
        }
        this.thumbnailResult.add(thumbnailResultItem);
        return this;
    }

    public ListThumbnailDetailsResponse withThumbnailResult(Consumer<List<ThumbnailRsp>> thumbnailResultSetter) {
        if (this.thumbnailResult == null) {
            this.thumbnailResult = new ArrayList<>();
        }
        thumbnailResultSetter.accept(this.thumbnailResult);
        return this;
    }

    /**
     * 截图结果列表 
     * @return thumbnailResult
     */
    public List<ThumbnailRsp> getThumbnailResult() {
        return thumbnailResult;
    }

    public void setThumbnailResult(List<ThumbnailRsp> thumbnailResult) {
        this.thumbnailResult = thumbnailResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListThumbnailDetailsResponse that = (ListThumbnailDetailsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.thumbnailResult, that.thumbnailResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, thumbnailResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListThumbnailDetailsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    thumbnailResult: ").append(toIndentedString(thumbnailResult)).append("\n");
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
