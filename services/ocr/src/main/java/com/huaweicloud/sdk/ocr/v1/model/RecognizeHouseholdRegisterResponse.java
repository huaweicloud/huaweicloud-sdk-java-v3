package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RecognizeHouseholdRegisterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<HouseholdRegisterResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public RecognizeHouseholdRegisterResponse withResult(List<HouseholdRegisterResult> result) {
        this.result = result;
        return this;
    }

    public RecognizeHouseholdRegisterResponse addResultItem(HouseholdRegisterResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public RecognizeHouseholdRegisterResponse withResult(Consumer<List<HouseholdRegisterResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 调用成功时表示调用结果。  调用失败时无此字段。 
     * @return result
     */
    public List<HouseholdRegisterResult> getResult() {
        return result;
    }

    public void setResult(List<HouseholdRegisterResult> result) {
        this.result = result;
    }

    public RecognizeHouseholdRegisterResponse withXRequestId(String xRequestId) {
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
        RecognizeHouseholdRegisterResponse that = (RecognizeHouseholdRegisterResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeHouseholdRegisterResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
