package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

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
public class ListAuraSessionStatementRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<SessionStatementRecord> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_count")

    private Integer currentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    public ListAuraSessionStatementRecordsResponse withRecords(List<SessionStatementRecord> records) {
        this.records = records;
        return this;
    }

    public ListAuraSessionStatementRecordsResponse addRecordsItem(SessionStatementRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListAuraSessionStatementRecordsResponse withRecords(Consumer<List<SessionStatementRecord>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**：本次查询记录。 **取值范围**：不涉及。
     * @return records
     */
    public List<SessionStatementRecord> getRecords() {
        return records;
    }

    public void setRecords(List<SessionStatementRecord> records) {
        this.records = records;
    }

    public ListAuraSessionStatementRecordsResponse withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * **参数解释**：本次查询记录总数。 **取值范围**：1~2147483647。
     * minimum: 0
     * maximum: 100
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public ListAuraSessionStatementRecordsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * **参数解释**：下一页查询marker值，若为空表示当前已是最后一页。 **取值范围**：长度为1~64个字符，支持大小写英文字母、数字、连字符。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuraSessionStatementRecordsResponse that = (ListAuraSessionStatementRecordsResponse) obj;
        return Objects.equals(this.records, that.records) && Objects.equals(this.currentCount, that.currentCount)
            && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, currentCount, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuraSessionStatementRecordsResponse {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
