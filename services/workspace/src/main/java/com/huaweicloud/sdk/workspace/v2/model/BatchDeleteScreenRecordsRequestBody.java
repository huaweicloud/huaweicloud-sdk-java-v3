package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteScreenRecordsRequestBody
 */
public class BatchDeleteScreenRecordsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screen_records")

    private List<BatchDeleteScreenRecordsRequestBodyScreenRecords> screenRecords = null;

    public BatchDeleteScreenRecordsRequestBody withScreenRecords(
        List<BatchDeleteScreenRecordsRequestBodyScreenRecords> screenRecords) {
        this.screenRecords = screenRecords;
        return this;
    }

    public BatchDeleteScreenRecordsRequestBody addScreenRecordsItem(
        BatchDeleteScreenRecordsRequestBodyScreenRecords screenRecordsItem) {
        if (this.screenRecords == null) {
            this.screenRecords = new ArrayList<>();
        }
        this.screenRecords.add(screenRecordsItem);
        return this;
    }

    public BatchDeleteScreenRecordsRequestBody withScreenRecords(
        Consumer<List<BatchDeleteScreenRecordsRequestBodyScreenRecords>> screenRecordsSetter) {
        if (this.screenRecords == null) {
            this.screenRecords = new ArrayList<>();
        }
        screenRecordsSetter.accept(this.screenRecords);
        return this;
    }

    /**
     * 待删除的录屏ID列表。
     * @return screenRecords
     */
    public List<BatchDeleteScreenRecordsRequestBodyScreenRecords> getScreenRecords() {
        return screenRecords;
    }

    public void setScreenRecords(List<BatchDeleteScreenRecordsRequestBodyScreenRecords> screenRecords) {
        this.screenRecords = screenRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteScreenRecordsRequestBody that = (BatchDeleteScreenRecordsRequestBody) obj;
        return Objects.equals(this.screenRecords, that.screenRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteScreenRecordsRequestBody {\n");
        sb.append("    screenRecords: ").append(toIndentedString(screenRecords)).append("\n");
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
