package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListDownloadAddressRequestBody
 */
public class ListDownloadAddressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_ids")

    private List<String> recordIds = null;

    public ListDownloadAddressRequestBody withRecordIds(List<String> recordIds) {
        this.recordIds = recordIds;
        return this;
    }

    public ListDownloadAddressRequestBody addRecordIdsItem(String recordIdsItem) {
        if (this.recordIds == null) {
            this.recordIds = new ArrayList<>();
        }
        this.recordIds.add(recordIdsItem);
        return this;
    }

    public ListDownloadAddressRequestBody withRecordIds(Consumer<List<String>> recordIdsSetter) {
        if (this.recordIds == null) {
            this.recordIds = new ArrayList<>();
        }
        recordIdsSetter.accept(this.recordIds);
        return this;
    }

    /**
     * 录屏记录UUID列表。
     * @return recordIds
     */
    public List<String> getRecordIds() {
        return recordIds;
    }

    public void setRecordIds(List<String> recordIds) {
        this.recordIds = recordIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDownloadAddressRequestBody that = (ListDownloadAddressRequestBody) obj;
        return Objects.equals(this.recordIds, that.recordIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDownloadAddressRequestBody {\n");
        sb.append("    recordIds: ").append(toIndentedString(recordIds)).append("\n");
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
