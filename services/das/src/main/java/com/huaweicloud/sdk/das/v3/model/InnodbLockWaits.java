package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InnodbLockWaits
 */
public class InnodbLockWaits {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requesting_trx_id")

    private String requestingTrxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requested_lock_id")

    private String requestedLockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_trx_id")

    private String blockingTrxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_lock_id")

    private String blockingLockId;

    public InnodbLockWaits withRequestingTrxId(String requestingTrxId) {
        this.requestingTrxId = requestingTrxId;
        return this;
    }

    /**
     * 申请锁资源的事务ID
     * @return requestingTrxId
     */
    public String getRequestingTrxId() {
        return requestingTrxId;
    }

    public void setRequestingTrxId(String requestingTrxId) {
        this.requestingTrxId = requestingTrxId;
    }

    public InnodbLockWaits withRequestedLockId(String requestedLockId) {
        this.requestedLockId = requestedLockId;
        return this;
    }

    /**
     * 申请的锁的ID
     * @return requestedLockId
     */
    public String getRequestedLockId() {
        return requestedLockId;
    }

    public void setRequestedLockId(String requestedLockId) {
        this.requestedLockId = requestedLockId;
    }

    public InnodbLockWaits withBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
        return this;
    }

    /**
     * 阻塞的事务ID
     * @return blockingTrxId
     */
    public String getBlockingTrxId() {
        return blockingTrxId;
    }

    public void setBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    public InnodbLockWaits withBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
        return this;
    }

    /**
     * 阻塞的锁的ID
     * @return blockingLockId
     */
    public String getBlockingLockId() {
        return blockingLockId;
    }

    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InnodbLockWaits that = (InnodbLockWaits) obj;
        return Objects.equals(this.requestingTrxId, that.requestingTrxId)
            && Objects.equals(this.requestedLockId, that.requestedLockId)
            && Objects.equals(this.blockingTrxId, that.blockingTrxId)
            && Objects.equals(this.blockingLockId, that.blockingLockId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestingTrxId, requestedLockId, blockingTrxId, blockingLockId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InnodbLockWaits {\n");
        sb.append("    requestingTrxId: ").append(toIndentedString(requestingTrxId)).append("\n");
        sb.append("    requestedLockId: ").append(toIndentedString(requestedLockId)).append("\n");
        sb.append("    blockingTrxId: ").append(toIndentedString(blockingTrxId)).append("\n");
        sb.append("    blockingLockId: ").append(toIndentedString(blockingLockId)).append("\n");
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
