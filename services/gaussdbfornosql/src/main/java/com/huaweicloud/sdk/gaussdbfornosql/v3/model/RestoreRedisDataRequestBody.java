package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数解释： 恢复到已有实例的请求body。 约束限制： 不涉及。 取值范围： 不涉及。 默认取值： 不涉及。
 */
public class RestoreRedisDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_info")

    private RecoveryInfo recoveryInfo;

    public RestoreRedisDataRequestBody withRecoveryInfo(RecoveryInfo recoveryInfo) {
        this.recoveryInfo = recoveryInfo;
        return this;
    }

    public RestoreRedisDataRequestBody withRecoveryInfo(Consumer<RecoveryInfo> recoveryInfoSetter) {
        if (this.recoveryInfo == null) {
            this.recoveryInfo = new RecoveryInfo();
            recoveryInfoSetter.accept(this.recoveryInfo);
        }

        return this;
    }

    /**
     * Get recoveryInfo
     * @return recoveryInfo
     */
    public RecoveryInfo getRecoveryInfo() {
        return recoveryInfo;
    }

    public void setRecoveryInfo(RecoveryInfo recoveryInfo) {
        this.recoveryInfo = recoveryInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreRedisDataRequestBody that = (RestoreRedisDataRequestBody) obj;
        return Objects.equals(this.recoveryInfo, that.recoveryInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recoveryInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreRedisDataRequestBody {\n");
        sb.append("    recoveryInfo: ").append(toIndentedString(recoveryInfo)).append("\n");
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
