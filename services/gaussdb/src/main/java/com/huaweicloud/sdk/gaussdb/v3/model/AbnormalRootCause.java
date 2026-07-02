package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AbnormalRootCause
 */
public class AbnormalRootCause {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_type")

    private String abnormalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_root_cause")

    private LockRootCause lockRootCause;

    public AbnormalRootCause withAbnormalType(String abnormalType) {
        this.abnormalType = abnormalType;
        return this;
    }

    /**
     * **参数解释**： 异常类型。 **取值范围**： LOCK_WAIT：锁等待。 
     * @return abnormalType
     */
    public String getAbnormalType() {
        return abnormalType;
    }

    public void setAbnormalType(String abnormalType) {
        this.abnormalType = abnormalType;
    }

    public AbnormalRootCause withLockRootCause(LockRootCause lockRootCause) {
        this.lockRootCause = lockRootCause;
        return this;
    }

    public AbnormalRootCause withLockRootCause(Consumer<LockRootCause> lockRootCauseSetter) {
        if (this.lockRootCause == null) {
            this.lockRootCause = new LockRootCause();
            lockRootCauseSetter.accept(this.lockRootCause);
        }

        return this;
    }

    /**
     * Get lockRootCause
     * @return lockRootCause
     */
    public LockRootCause getLockRootCause() {
        return lockRootCause;
    }

    public void setLockRootCause(LockRootCause lockRootCause) {
        this.lockRootCause = lockRootCause;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbnormalRootCause that = (AbnormalRootCause) obj;
        return Objects.equals(this.abnormalType, that.abnormalType)
            && Objects.equals(this.lockRootCause, that.lockRootCause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalType, lockRootCause);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbnormalRootCause {\n");
        sb.append("    abnormalType: ").append(toIndentedString(abnormalType)).append("\n");
        sb.append("    lockRootCause: ").append(toIndentedString(lockRootCause)).append("\n");
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
