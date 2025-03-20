package com.huaweicloud.sdk.coc.v1.model;

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
public class SyncAddPersonnelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_ids")

    private List<String> addedIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_ids")

    private List<String> errorIds = null;

    public SyncAddPersonnelResponse withAddedIds(List<String> addedIds) {
        this.addedIds = addedIds;
        return this;
    }

    public SyncAddPersonnelResponse addAddedIdsItem(String addedIdsItem) {
        if (this.addedIds == null) {
            this.addedIds = new ArrayList<>();
        }
        this.addedIds.add(addedIdsItem);
        return this;
    }

    public SyncAddPersonnelResponse withAddedIds(Consumer<List<String>> addedIdsSetter) {
        if (this.addedIds == null) {
            this.addedIds = new ArrayList<>();
        }
        addedIdsSetter.accept(this.addedIds);
        return this;
    }

    /**
     * 添加成功的ID
     * @return addedIds
     */
    public List<String> getAddedIds() {
        return addedIds;
    }

    public void setAddedIds(List<String> addedIds) {
        this.addedIds = addedIds;
    }

    public SyncAddPersonnelResponse withErrorIds(List<String> errorIds) {
        this.errorIds = errorIds;
        return this;
    }

    public SyncAddPersonnelResponse addErrorIdsItem(String errorIdsItem) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        this.errorIds.add(errorIdsItem);
        return this;
    }

    public SyncAddPersonnelResponse withErrorIds(Consumer<List<String>> errorIdsSetter) {
        if (this.errorIds == null) {
            this.errorIds = new ArrayList<>();
        }
        errorIdsSetter.accept(this.errorIds);
        return this;
    }

    /**
     * 添加失败的ID
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
        SyncAddPersonnelResponse that = (SyncAddPersonnelResponse) obj;
        return Objects.equals(this.addedIds, that.addedIds) && Objects.equals(this.errorIds, that.errorIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addedIds, errorIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncAddPersonnelResponse {\n");
        sb.append("    addedIds: ").append(toIndentedString(addedIds)).append("\n");
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
