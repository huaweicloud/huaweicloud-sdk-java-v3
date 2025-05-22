package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 桶分裂信息。 **取值范围**： 不涉及。
 */
public class BucketSplitInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_dn_num")

    private Integer currentDnNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_scale_out_dn_num")

    private Integer afterScaleOutDnNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_bucket_num")

    private Integer currentBucketNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_scale_out_bucket_num")

    private Integer afterScaleOutBucketNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_bucket_split")

    private Boolean isBucketSplit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_tilt_rate")

    private String bucketTiltRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_scale_out_bucket_tilt_rate")

    private String afterScaleOutBucketTiltRate;

    public BucketSplitInfo withCurrentDnNum(Integer currentDnNum) {
        this.currentDnNum = currentDnNum;
        return this;
    }

    /**
     * **参数解释**： 当前DN数。 **取值范围**： 不涉及。
     * @return currentDnNum
     */
    public Integer getCurrentDnNum() {
        return currentDnNum;
    }

    public void setCurrentDnNum(Integer currentDnNum) {
        this.currentDnNum = currentDnNum;
    }

    public BucketSplitInfo withAfterScaleOutDnNum(Integer afterScaleOutDnNum) {
        this.afterScaleOutDnNum = afterScaleOutDnNum;
        return this;
    }

    /**
     * **参数解释**： 扩容后DN数。 **取值范围**： 不涉及。
     * @return afterScaleOutDnNum
     */
    public Integer getAfterScaleOutDnNum() {
        return afterScaleOutDnNum;
    }

    public void setAfterScaleOutDnNum(Integer afterScaleOutDnNum) {
        this.afterScaleOutDnNum = afterScaleOutDnNum;
    }

    public BucketSplitInfo withCurrentBucketNum(Integer currentBucketNum) {
        this.currentBucketNum = currentBucketNum;
        return this;
    }

    /**
     * **参数解释**： 当前bucket数。 **取值范围**： 不涉及。
     * @return currentBucketNum
     */
    public Integer getCurrentBucketNum() {
        return currentBucketNum;
    }

    public void setCurrentBucketNum(Integer currentBucketNum) {
        this.currentBucketNum = currentBucketNum;
    }

    public BucketSplitInfo withAfterScaleOutBucketNum(Integer afterScaleOutBucketNum) {
        this.afterScaleOutBucketNum = afterScaleOutBucketNum;
        return this;
    }

    /**
     * **参数解释**： 扩容后bucket数。 **取值范围**： 不涉及。
     * @return afterScaleOutBucketNum
     */
    public Integer getAfterScaleOutBucketNum() {
        return afterScaleOutBucketNum;
    }

    public void setAfterScaleOutBucketNum(Integer afterScaleOutBucketNum) {
        this.afterScaleOutBucketNum = afterScaleOutBucketNum;
    }

    public BucketSplitInfo withIsBucketSplit(Boolean isBucketSplit) {
        this.isBucketSplit = isBucketSplit;
        return this;
    }

    /**
     * **参数解释**： 扩容是否涉及bucket分裂。 **取值范围**： 不涉及。
     * @return isBucketSplit
     */
    public Boolean getIsBucketSplit() {
        return isBucketSplit;
    }

    public void setIsBucketSplit(Boolean isBucketSplit) {
        this.isBucketSplit = isBucketSplit;
    }

    public BucketSplitInfo withBucketTiltRate(String bucketTiltRate) {
        this.bucketTiltRate = bucketTiltRate;
        return this;
    }

    /**
     * **参数解释**： bucket DN倾斜率，用于衡量bucket在DN节点上不均衡程度。 **取值范围**： 不涉及。
     * @return bucketTiltRate
     */
    public String getBucketTiltRate() {
        return bucketTiltRate;
    }

    public void setBucketTiltRate(String bucketTiltRate) {
        this.bucketTiltRate = bucketTiltRate;
    }

    public BucketSplitInfo withAfterScaleOutBucketTiltRate(String afterScaleOutBucketTiltRate) {
        this.afterScaleOutBucketTiltRate = afterScaleOutBucketTiltRate;
        return this;
    }

    /**
     * **参数解释**： 扩容后 bucket DN倾斜率，用于衡量扩容后bucket在DN节点上不均衡程度。 **取值范围**： 不涉及。
     * @return afterScaleOutBucketTiltRate
     */
    public String getAfterScaleOutBucketTiltRate() {
        return afterScaleOutBucketTiltRate;
    }

    public void setAfterScaleOutBucketTiltRate(String afterScaleOutBucketTiltRate) {
        this.afterScaleOutBucketTiltRate = afterScaleOutBucketTiltRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BucketSplitInfo that = (BucketSplitInfo) obj;
        return Objects.equals(this.currentDnNum, that.currentDnNum)
            && Objects.equals(this.afterScaleOutDnNum, that.afterScaleOutDnNum)
            && Objects.equals(this.currentBucketNum, that.currentBucketNum)
            && Objects.equals(this.afterScaleOutBucketNum, that.afterScaleOutBucketNum)
            && Objects.equals(this.isBucketSplit, that.isBucketSplit)
            && Objects.equals(this.bucketTiltRate, that.bucketTiltRate)
            && Objects.equals(this.afterScaleOutBucketTiltRate, that.afterScaleOutBucketTiltRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentDnNum,
            afterScaleOutDnNum,
            currentBucketNum,
            afterScaleOutBucketNum,
            isBucketSplit,
            bucketTiltRate,
            afterScaleOutBucketTiltRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketSplitInfo {\n");
        sb.append("    currentDnNum: ").append(toIndentedString(currentDnNum)).append("\n");
        sb.append("    afterScaleOutDnNum: ").append(toIndentedString(afterScaleOutDnNum)).append("\n");
        sb.append("    currentBucketNum: ").append(toIndentedString(currentBucketNum)).append("\n");
        sb.append("    afterScaleOutBucketNum: ").append(toIndentedString(afterScaleOutBucketNum)).append("\n");
        sb.append("    isBucketSplit: ").append(toIndentedString(isBucketSplit)).append("\n");
        sb.append("    bucketTiltRate: ").append(toIndentedString(bucketTiltRate)).append("\n");
        sb.append("    afterScaleOutBucketTiltRate: ")
            .append(toIndentedString(afterScaleOutBucketTiltRate))
            .append("\n");
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
