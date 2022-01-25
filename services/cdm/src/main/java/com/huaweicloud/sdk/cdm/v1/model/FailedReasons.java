package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 失败原因。集群处于正常状态时不返回。 */
public class FailedReasons {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CREATE_FAILED")

    private FailedReasonsCREATEFAILED createFailed;

    public FailedReasons withCreateFailed(FailedReasonsCREATEFAILED createFailed) {
        this.createFailed = createFailed;
        return this;
    }

    public FailedReasons withCreateFailed(Consumer<FailedReasonsCREATEFAILED> createFailedSetter) {
        if (this.createFailed == null) {
            this.createFailed = new FailedReasonsCREATEFAILED();
            createFailedSetter.accept(this.createFailed);
        }

        return this;
    }

    /** Get createFailed
     * 
     * @return createFailed */
    public FailedReasonsCREATEFAILED getCreateFailed() {
        return createFailed;
    }

    public void setCreateFailed(FailedReasonsCREATEFAILED createFailed) {
        this.createFailed = createFailed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailedReasons failedReasons = (FailedReasons) o;
        return Objects.equals(this.createFailed, failedReasons.createFailed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createFailed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailedReasons {\n");
        sb.append("    createFailed: ").append(toIndentedString(createFailed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
