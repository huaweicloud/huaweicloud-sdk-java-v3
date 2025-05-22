package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListOfflineKeyAnalysisTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<OfflineKeyAnalysisRecord> records = null;

    public ListOfflineKeyAnalysisTaskResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **取值范围**： 不涉及。 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListOfflineKeyAnalysisTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 离线全量key分析的总数。 **取值范围**： 不涉及。 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOfflineKeyAnalysisTaskResponse withRecords(List<OfflineKeyAnalysisRecord> records) {
        this.records = records;
        return this;
    }

    public ListOfflineKeyAnalysisTaskResponse addRecordsItem(OfflineKeyAnalysisRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListOfflineKeyAnalysisTaskResponse withRecords(Consumer<List<OfflineKeyAnalysisRecord>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**： 离线全量key分析记录列表。 
     * @return records
     */
    public List<OfflineKeyAnalysisRecord> getRecords() {
        return records;
    }

    public void setRecords(List<OfflineKeyAnalysisRecord> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOfflineKeyAnalysisTaskResponse that = (ListOfflineKeyAnalysisTaskResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.total, that.total)
            && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, total, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOfflineKeyAnalysisTaskResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
