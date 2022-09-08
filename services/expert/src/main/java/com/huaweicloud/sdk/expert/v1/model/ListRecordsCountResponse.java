package com.huaweicloud.sdk.expert.v1.model;

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
public class ListRecordsCountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records_count")

    private List<IdCount> recordsCount = null;

    public ListRecordsCountResponse withRecordsCount(List<IdCount> recordsCount) {
        this.recordsCount = recordsCount;
        return this;
    }

    public ListRecordsCountResponse addRecordsCountItem(IdCount recordsCountItem) {
        if (this.recordsCount == null) {
            this.recordsCount = new ArrayList<>();
        }
        this.recordsCount.add(recordsCountItem);
        return this;
    }

    public ListRecordsCountResponse withRecordsCount(Consumer<List<IdCount>> recordsCountSetter) {
        if (this.recordsCount == null) {
            this.recordsCount = new ArrayList<>();
        }
        recordsCountSetter.accept(this.recordsCount);
        return this;
    }

    /**
     * 问卷ID和回收数量
     * @return recordsCount
     */
    public List<IdCount> getRecordsCount() {
        return recordsCount;
    }

    public void setRecordsCount(List<IdCount> recordsCount) {
        this.recordsCount = recordsCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordsCountResponse listRecordsCountResponse = (ListRecordsCountResponse) o;
        return Objects.equals(this.recordsCount, listRecordsCountResponse.recordsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordsCountResponse {\n");
        sb.append("    recordsCount: ").append(toIndentedString(recordsCount)).append("\n");
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
