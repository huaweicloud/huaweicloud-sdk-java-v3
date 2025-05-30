package com.huaweicloud.sdk.dws.v2.model;

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
public class ListSyncRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_records")

    private List<IdentitySourceSyncRecordVo> syncRecords = null;

    public ListSyncRecordsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 同步记录条数。 **取值范围**： 大于等于0的整数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSyncRecordsResponse withSyncRecords(List<IdentitySourceSyncRecordVo> syncRecords) {
        this.syncRecords = syncRecords;
        return this;
    }

    public ListSyncRecordsResponse addSyncRecordsItem(IdentitySourceSyncRecordVo syncRecordsItem) {
        if (this.syncRecords == null) {
            this.syncRecords = new ArrayList<>();
        }
        this.syncRecords.add(syncRecordsItem);
        return this;
    }

    public ListSyncRecordsResponse withSyncRecords(Consumer<List<IdentitySourceSyncRecordVo>> syncRecordsSetter) {
        if (this.syncRecords == null) {
            this.syncRecords = new ArrayList<>();
        }
        syncRecordsSetter.accept(this.syncRecords);
        return this;
    }

    /**
     * **参数解释**： 同步记录详细信息。 **取值范围**： 不涉及。
     * @return syncRecords
     */
    public List<IdentitySourceSyncRecordVo> getSyncRecords() {
        return syncRecords;
    }

    public void setSyncRecords(List<IdentitySourceSyncRecordVo> syncRecords) {
        this.syncRecords = syncRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSyncRecordsResponse that = (ListSyncRecordsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.syncRecords, that.syncRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, syncRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSyncRecordsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    syncRecords: ").append(toIndentedString(syncRecords)).append("\n");
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
