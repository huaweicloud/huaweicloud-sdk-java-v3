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
public class ShowExpireKeyScanInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<SimpleKeyScanRecord> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowExpireKeyScanInfoResponse withRecords(List<SimpleKeyScanRecord> records) {
        this.records = records;
        return this;
    }

    public ShowExpireKeyScanInfoResponse addRecordsItem(SimpleKeyScanRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ShowExpireKeyScanInfoResponse withRecords(Consumer<List<SimpleKeyScanRecord>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 记录
     * @return records
     */
    public List<SimpleKeyScanRecord> getRecords() {
        return records;
    }

    public void setRecords(List<SimpleKeyScanRecord> records) {
        this.records = records;
    }

    public ShowExpireKeyScanInfoResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowExpireKeyScanInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowExpireKeyScanInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 统计
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExpireKeyScanInfoResponse that = (ShowExpireKeyScanInfoResponse) obj;
        return Objects.equals(this.records, that.records) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.total, that.total) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, instanceId, total, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExpireKeyScanInfoResponse {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
