package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteAssetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_result_array")

    @JacksonXmlProperty(localName = "delete_result_array")

    private List<DeleteResult> deleteResultArray = null;

    public DeleteAssetsResponse withDeleteResultArray(List<DeleteResult> deleteResultArray) {
        this.deleteResultArray = deleteResultArray;
        return this;
    }

    public DeleteAssetsResponse addDeleteResultArrayItem(DeleteResult deleteResultArrayItem) {
        if (this.deleteResultArray == null) {
            this.deleteResultArray = new ArrayList<>();
        }
        this.deleteResultArray.add(deleteResultArrayItem);
        return this;
    }

    public DeleteAssetsResponse withDeleteResultArray(Consumer<List<DeleteResult>> deleteResultArraySetter) {
        if (this.deleteResultArray == null) {
            this.deleteResultArray = new ArrayList<>();
        }
        deleteResultArraySetter.accept(this.deleteResultArray);
        return this;
    }

    /**
     * 删除媒资任务的处理结果。
     * @return deleteResultArray
     */
    public List<DeleteResult> getDeleteResultArray() {
        return deleteResultArray;
    }

    public void setDeleteResultArray(List<DeleteResult> deleteResultArray) {
        this.deleteResultArray = deleteResultArray;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAssetsResponse deleteAssetsResponse = (DeleteAssetsResponse) o;
        return Objects.equals(this.deleteResultArray, deleteAssetsResponse.deleteResultArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteResultArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAssetsResponse {\n");
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
