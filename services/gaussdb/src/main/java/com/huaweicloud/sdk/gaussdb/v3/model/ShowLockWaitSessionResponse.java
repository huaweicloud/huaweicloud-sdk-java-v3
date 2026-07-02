package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLockWaitSessionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_root_cause")

    private AbnormalRootCause abnormalRootCause;

    public ShowLockWaitSessionResponse withAbnormalRootCause(AbnormalRootCause abnormalRootCause) {
        this.abnormalRootCause = abnormalRootCause;
        return this;
    }

    public ShowLockWaitSessionResponse withAbnormalRootCause(Consumer<AbnormalRootCause> abnormalRootCauseSetter) {
        if (this.abnormalRootCause == null) {
            this.abnormalRootCause = new AbnormalRootCause();
            abnormalRootCauseSetter.accept(this.abnormalRootCause);
        }

        return this;
    }

    /**
     * Get abnormalRootCause
     * @return abnormalRootCause
     */
    public AbnormalRootCause getAbnormalRootCause() {
        return abnormalRootCause;
    }

    public void setAbnormalRootCause(AbnormalRootCause abnormalRootCause) {
        this.abnormalRootCause = abnormalRootCause;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLockWaitSessionResponse that = (ShowLockWaitSessionResponse) obj;
        return Objects.equals(this.abnormalRootCause, that.abnormalRootCause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalRootCause);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLockWaitSessionResponse {\n");
        sb.append("    abnormalRootCause: ").append(toIndentedString(abnormalRootCause)).append("\n");
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
