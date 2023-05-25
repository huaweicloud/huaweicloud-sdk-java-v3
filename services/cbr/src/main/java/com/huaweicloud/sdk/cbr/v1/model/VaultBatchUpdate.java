package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 存储库批量修改属性
 */
public class VaultBatchUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_notify")

    private Boolean smnNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    public VaultBatchUpdate withSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
        return this;
    }

    /**
     * 存储库smn消息通知开关
     * @return smnNotify
     */
    public Boolean getSmnNotify() {
        return smnNotify;
    }

    public void setSmnNotify(Boolean smnNotify) {
        this.smnNotify = smnNotify;
    }

    public VaultBatchUpdate withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 存储库容量阈值
     * minimum: 1
     * maximum: 100
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultBatchUpdate vaultBatchUpdate = (VaultBatchUpdate) o;
        return Objects.equals(this.smnNotify, vaultBatchUpdate.smnNotify)
            && Objects.equals(this.threshold, vaultBatchUpdate.threshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smnNotify, threshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultBatchUpdate {\n");
        sb.append("    smnNotify: ").append(toIndentedString(smnNotify)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
