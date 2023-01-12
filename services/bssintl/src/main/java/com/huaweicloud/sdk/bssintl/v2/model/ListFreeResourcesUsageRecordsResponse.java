package com.huaweicloud.sdk.bssintl.v2.model;

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
public class ListFreeResourcesUsageRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_records")

    private List<FreeResourceRecord> freeResourceRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListFreeResourcesUsageRecordsResponse withFreeResourceRecords(List<FreeResourceRecord> freeResourceRecords) {
        this.freeResourceRecords = freeResourceRecords;
        return this;
    }

    public ListFreeResourcesUsageRecordsResponse addFreeResourceRecordsItem(
        FreeResourceRecord freeResourceRecordsItem) {
        if (this.freeResourceRecords == null) {
            this.freeResourceRecords = new ArrayList<>();
        }
        this.freeResourceRecords.add(freeResourceRecordsItem);
        return this;
    }

    public ListFreeResourcesUsageRecordsResponse withFreeResourceRecords(
        Consumer<List<FreeResourceRecord>> freeResourceRecordsSetter) {
        if (this.freeResourceRecords == null) {
            this.freeResourceRecords = new ArrayList<>();
        }
        freeResourceRecordsSetter.accept(this.freeResourceRecords);
        return this;
    }

    /**
     * 资源包使用明细记录，具体参见表1。
     * @return freeResourceRecords
     */
    public List<FreeResourceRecord> getFreeResourceRecords() {
        return freeResourceRecords;
    }

    public void setFreeResourceRecords(List<FreeResourceRecord> freeResourceRecords) {
        this.freeResourceRecords = freeResourceRecords;
    }

    public ListFreeResourcesUsageRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 满足条件的总个数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFreeResourcesUsageRecordsResponse listFreeResourcesUsageRecordsResponse =
            (ListFreeResourcesUsageRecordsResponse) o;
        return Objects.equals(this.freeResourceRecords, listFreeResourcesUsageRecordsResponse.freeResourceRecords)
            && Objects.equals(this.totalCount, listFreeResourcesUsageRecordsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeResourceRecords, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourcesUsageRecordsResponse {\n");
        sb.append("    freeResourceRecords: ").append(toIndentedString(freeResourceRecords)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
