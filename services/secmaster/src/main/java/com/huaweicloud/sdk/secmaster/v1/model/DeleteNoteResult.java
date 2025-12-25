package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除评论结果对象
 */
public class DeleteNoteResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_ids")

    private List<String> successIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_ids")

    private List<String> errorIds = null;

    public DeleteNoteResult withSuccessIds(List<String> successIds) {
        this.successIds = successIds;
        return this;
    }

    public DeleteNoteResult addSuccessIdsItem(String successIdsItem) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        this.successIds.add(successIdsItem);
        return this;
    }

    public DeleteNoteResult withSuccessIds(Consumer<List<String>> successIdsSetter) {
        if (this.successIds == null) {
            this.successIds = new ArrayList<>();
        }
        successIdsSetter.accept(this.successIds);
        return this;
    }

    /**
     * 成功删除的 note ID 列表
     * @return successIds
     */
    public List<String> getSuccessIds() {
        return successIds;
    }

    public void setSuccessIds(List<String> successIds) {
        this.successIds = successIds;
    }

    public DeleteNoteResult withErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
        return this;
    }

    public DeleteNoteResult addErrorIdsItem(String errorIdsItem) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        this.errorIds.add(errorIdsItem);
        return this;
    }

    public DeleteNoteResult withErrorIds(Consumer<List<String>> errorIdsSetter) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        errorIdsSetter.accept(this.errorIds);
        return this;
    }

    /**
     * 删除失败的 note ID 列表
     * @return errorIds
     */
    public List<String> getErrorIds() {
        return errorIds;
    }

    public void setErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNoteResult that = (DeleteNoteResult) obj;
        return Objects.equals(this.successIds, that.successIds) && Objects.equals(this.errorIds, that.errorIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successIds, errorIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNoteResult {\n");
        sb.append("    successIds: ").append(toIndentedString(successIds)).append("\n");
        sb.append("    errorIds: ").append(toIndentedString(errorIds)).append("\n");
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
