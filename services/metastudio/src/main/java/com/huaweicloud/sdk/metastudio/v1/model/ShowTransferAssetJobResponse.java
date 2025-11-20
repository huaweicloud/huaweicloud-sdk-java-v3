package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTransferAssetJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_type")

    private TransferTypeEnum transferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_assets")

    private List<DigitalAssetSummary> transferAssets = null;

    /**
     * 任务状态 - PROCESSING: 处理过程中 - ACCEPT： 接受 - REJECT： 拒绝 - CANCEL：取消 - FAIL: 失败
     */
    public static final class StateEnum {

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StateEnum PROCESSING = new StateEnum("PROCESSING");

        /**
         * Enum ACCEPT for value: "ACCEPT"
         */
        public static final StateEnum ACCEPT = new StateEnum("ACCEPT");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final StateEnum REJECT = new StateEnum("REJECT");

        /**
         * Enum CANCEL for value: "CANCEL"
         */
        public static final StateEnum CANCEL = new StateEnum("CANCEL");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StateEnum FAIL = new StateEnum("FAIL");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("PROCESSING", PROCESSING);
            map.put("ACCEPT", ACCEPT);
            map.put("REJECT", REJECT);
            map.put("CANCEL", CANCEL);
            map.put("FAIL", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_project_id")

    private String srcProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_project_id")

    private String destProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")

    private String memo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_billing")

    private Boolean isNeedBilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowTransferAssetJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 转移资产任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowTransferAssetJobResponse withTransferType(TransferTypeEnum transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * Get transferType
     * @return transferType
     */
    public TransferTypeEnum getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferTypeEnum transferType) {
        this.transferType = transferType;
    }

    public ShowTransferAssetJobResponse withTransferAssets(List<DigitalAssetSummary> transferAssets) {
        this.transferAssets = transferAssets;
        return this;
    }

    public ShowTransferAssetJobResponse addTransferAssetsItem(DigitalAssetSummary transferAssetsItem) {
        if (this.transferAssets == null) {
            this.transferAssets = new ArrayList<>();
        }
        this.transferAssets.add(transferAssetsItem);
        return this;
    }

    public ShowTransferAssetJobResponse withTransferAssets(Consumer<List<DigitalAssetSummary>> transferAssetsSetter) {
        if (this.transferAssets == null) {
            this.transferAssets = new ArrayList<>();
        }
        transferAssetsSetter.accept(this.transferAssets);
        return this;
    }

    /**
     * 转移资产列表
     * @return transferAssets
     */
    public List<DigitalAssetSummary> getTransferAssets() {
        return transferAssets;
    }

    public void setTransferAssets(List<DigitalAssetSummary> transferAssets) {
        this.transferAssets = transferAssets;
    }

    public ShowTransferAssetJobResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态 - PROCESSING: 处理过程中 - ACCEPT： 接受 - REJECT： 拒绝 - CANCEL：取消 - FAIL: 失败
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowTransferAssetJobResponse withSrcProjectId(String srcProjectId) {
        this.srcProjectId = srcProjectId;
        return this;
    }

    /**
     * 源用户ID
     * @return srcProjectId
     */
    public String getSrcProjectId() {
        return srcProjectId;
    }

    public void setSrcProjectId(String srcProjectId) {
        this.srcProjectId = srcProjectId;
    }

    public ShowTransferAssetJobResponse withDestProjectId(String destProjectId) {
        this.destProjectId = destProjectId;
        return this;
    }

    /**
     * 目标用户ID
     * @return destProjectId
     */
    public String getDestProjectId() {
        return destProjectId;
    }

    public void setDestProjectId(String destProjectId) {
        this.destProjectId = destProjectId;
    }

    public ShowTransferAssetJobResponse withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * 备注信息
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public ShowTransferAssetJobResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 冻结/解冻原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ShowTransferAssetJobResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 资产转移开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowTransferAssetJobResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 资产转移完成时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ShowTransferAssetJobResponse withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 资产转移过期时间
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ShowTransferAssetJobResponse withIsNeedBilling(Boolean isNeedBilling) {
        this.isNeedBilling = isNeedBilling;
        return this;
    }

    /**
     * 资产转移时，是否需要从接收方扣减资源（产生计费话单）
     * @return isNeedBilling
     */
    public Boolean getIsNeedBilling() {
        return isNeedBilling;
    }

    public void setIsNeedBilling(Boolean isNeedBilling) {
        this.isNeedBilling = isNeedBilling;
    }

    public ShowTransferAssetJobResponse withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public ShowTransferAssetJobResponse withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ShowTransferAssetJobResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTransferAssetJobResponse that = (ShowTransferAssetJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.transferType, that.transferType)
            && Objects.equals(this.transferAssets, that.transferAssets) && Objects.equals(this.state, that.state)
            && Objects.equals(this.srcProjectId, that.srcProjectId)
            && Objects.equals(this.destProjectId, that.destProjectId) && Objects.equals(this.memo, that.memo)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.isNeedBilling, that.isNeedBilling) && Objects.equals(this.errorInfo, that.errorInfo)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            transferType,
            transferAssets,
            state,
            srcProjectId,
            destProjectId,
            memo,
            reason,
            startTime,
            finishTime,
            expireTime,
            isNeedBilling,
            errorInfo,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTransferAssetJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
        sb.append("    transferAssets: ").append(toIndentedString(transferAssets)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    srcProjectId: ").append(toIndentedString(srcProjectId)).append("\n");
        sb.append("    destProjectId: ").append(toIndentedString(destProjectId)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    isNeedBilling: ").append(toIndentedString(isNeedBilling)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
