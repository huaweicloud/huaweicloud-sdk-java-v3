package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePartitionCount
 */
public class UpdatePartitionCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_timestamp")

    private Long createTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_partition_count")

    private Integer srcPartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_partition_count")

    private Integer targetPartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private Integer resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_msg")

    private Integer resultMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale")

    private Boolean autoScale;

    public UpdatePartitionCount withCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    /**
     * 扩缩容操作执行时间戳，13位时间戳。
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public UpdatePartitionCount withSrcPartitionCount(Integer srcPartitionCount) {
        this.srcPartitionCount = srcPartitionCount;
        return this;
    }

    /**
     * 扩缩容操作前分区数量。
     * @return srcPartitionCount
     */
    public Integer getSrcPartitionCount() {
        return srcPartitionCount;
    }

    public void setSrcPartitionCount(Integer srcPartitionCount) {
        this.srcPartitionCount = srcPartitionCount;
    }

    public UpdatePartitionCount withTargetPartitionCount(Integer targetPartitionCount) {
        this.targetPartitionCount = targetPartitionCount;
        return this;
    }

    /**
     * 扩缩容操作后分区数量。
     * @return targetPartitionCount
     */
    public Integer getTargetPartitionCount() {
        return targetPartitionCount;
    }

    public void setTargetPartitionCount(Integer targetPartitionCount) {
        this.targetPartitionCount = targetPartitionCount;
    }

    public UpdatePartitionCount withResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 扩缩容操作响应码。
     * @return resultCode
     */
    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public UpdatePartitionCount withResultMsg(Integer resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }

    /**
     * 扩缩容操作响应信息。
     * @return resultMsg
     */
    public Integer getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(Integer resultMsg) {
        this.resultMsg = resultMsg;
    }

    public UpdatePartitionCount withAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }

    /**
     * 本次扩缩容操作是否为自动扩缩容。  - true：自动扩缩容。 - false：手动扩缩容。
     * @return autoScale
     */
    public Boolean getAutoScale() {
        return autoScale;
    }

    public void setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePartitionCount that = (UpdatePartitionCount) obj;
        return Objects.equals(this.createTimestamp, that.createTimestamp)
            && Objects.equals(this.srcPartitionCount, that.srcPartitionCount)
            && Objects.equals(this.targetPartitionCount, that.targetPartitionCount)
            && Objects.equals(this.resultCode, that.resultCode) && Objects.equals(this.resultMsg, that.resultMsg)
            && Objects.equals(this.autoScale, that.autoScale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTimestamp, srcPartitionCount, targetPartitionCount, resultCode, resultMsg, autoScale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePartitionCount {\n");
        sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
        sb.append("    srcPartitionCount: ").append(toIndentedString(srcPartitionCount)).append("\n");
        sb.append("    targetPartitionCount: ").append(toIndentedString(targetPartitionCount)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
        sb.append("    autoScale: ").append(toIndentedString(autoScale)).append("\n");
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
