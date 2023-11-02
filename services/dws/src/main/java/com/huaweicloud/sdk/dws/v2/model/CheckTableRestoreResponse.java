package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckTableRestoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_table_name_result")

    private CheckTableNameResult checkTableNameResult;

    public CheckTableRestoreResponse withCheckTableNameResult(CheckTableNameResult checkTableNameResult) {
        this.checkTableNameResult = checkTableNameResult;
        return this;
    }

    public CheckTableRestoreResponse withCheckTableNameResult(
        Consumer<CheckTableNameResult> checkTableNameResultSetter) {
        if (this.checkTableNameResult == null) {
            this.checkTableNameResult = new CheckTableNameResult();
            checkTableNameResultSetter.accept(this.checkTableNameResult);
        }

        return this;
    }

    /**
     * Get checkTableNameResult
     * @return checkTableNameResult
     */
    public CheckTableNameResult getCheckTableNameResult() {
        return checkTableNameResult;
    }

    public void setCheckTableNameResult(CheckTableNameResult checkTableNameResult) {
        this.checkTableNameResult = checkTableNameResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckTableRestoreResponse that = (CheckTableRestoreResponse) obj;
        return Objects.equals(this.checkTableNameResult, that.checkTableNameResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkTableNameResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTableRestoreResponse {\n");
        sb.append("    checkTableNameResult: ").append(toIndentedString(checkTableNameResult)).append("\n");
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
