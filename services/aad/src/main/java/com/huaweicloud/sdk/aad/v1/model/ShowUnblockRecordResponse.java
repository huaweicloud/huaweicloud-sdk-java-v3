package com.huaweicloud.sdk.aad.v1.model;

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
public class ShowUnblockRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unblock_record")

    private List<UnblockRecordResponseUnblockRecord> unblockRecord = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public ShowUnblockRecordResponse withUnblockRecord(List<UnblockRecordResponseUnblockRecord> unblockRecord) {
        this.unblockRecord = unblockRecord;
        return this;
    }

    public ShowUnblockRecordResponse addUnblockRecordItem(UnblockRecordResponseUnblockRecord unblockRecordItem) {
        if (this.unblockRecord == null) {
            this.unblockRecord = new ArrayList<>();
        }
        this.unblockRecord.add(unblockRecordItem);
        return this;
    }

    public ShowUnblockRecordResponse withUnblockRecord(
        Consumer<List<UnblockRecordResponseUnblockRecord>> unblockRecordSetter) {
        if (this.unblockRecord == null) {
            this.unblockRecord = new ArrayList<>();
        }
        unblockRecordSetter.accept(this.unblockRecord);
        return this;
    }

    /**
     * 解封记录
     * @return unblockRecord
     */
    public List<UnblockRecordResponseUnblockRecord> getUnblockRecord() {
        return unblockRecord;
    }

    public void setUnblockRecord(List<UnblockRecordResponseUnblockRecord> unblockRecord) {
        this.unblockRecord = unblockRecord;
    }

    public ShowUnblockRecordResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 1
     * maximum: 2000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowUnblockRecordResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUnblockRecordResponse that = (ShowUnblockRecordResponse) obj;
        return Objects.equals(this.unblockRecord, that.unblockRecord) && Objects.equals(this.total, that.total)
            && Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unblockRecord, total, domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUnblockRecordResponse {\n");
        sb.append("    unblockRecord: ").append(toIndentedString(unblockRecord)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
