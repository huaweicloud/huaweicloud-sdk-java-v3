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
public class DeleteThumbnailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_result_array")

    private List<DeleteThumbnailResult> deleteResultArray = null;

    public DeleteThumbnailsResponse withDeleteResultArray(List<DeleteThumbnailResult> deleteResultArray) {
        this.deleteResultArray = deleteResultArray;
        return this;
    }

    public DeleteThumbnailsResponse addDeleteResultArrayItem(DeleteThumbnailResult deleteResultArrayItem) {
        if (this.deleteResultArray == null) {
            this.deleteResultArray = new ArrayList<>();
        }
        this.deleteResultArray.add(deleteResultArrayItem);
        return this;
    }

    public DeleteThumbnailsResponse withDeleteResultArray(
        Consumer<List<DeleteThumbnailResult>> deleteResultArraySetter) {
        if (this.deleteResultArray == null) {
            this.deleteResultArray = new ArrayList<>();
        }
        deleteResultArraySetter.accept(this.deleteResultArray);
        return this;
    }

    /**
     * 删除截图信息的处理结果。
     * @return deleteResultArray
     */
    public List<DeleteThumbnailResult> getDeleteResultArray() {
        return deleteResultArray;
    }

    public void setDeleteResultArray(List<DeleteThumbnailResult> deleteResultArray) {
        this.deleteResultArray = deleteResultArray;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteThumbnailsResponse that = (DeleteThumbnailsResponse) obj;
        return Objects.equals(this.deleteResultArray, that.deleteResultArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteResultArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteThumbnailsResponse {\n");
        sb.append("    deleteResultArray: ").append(toIndentedString(deleteResultArray)).append("\n");
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
