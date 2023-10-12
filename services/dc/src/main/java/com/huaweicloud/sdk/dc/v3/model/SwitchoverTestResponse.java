package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SwitchoverTestResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchover_test_record")

    private SwitchoverTestRecord switchoverTestRecord;

    public SwitchoverTestResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SwitchoverTestResponse withSwitchoverTestRecord(SwitchoverTestRecord switchoverTestRecord) {
        this.switchoverTestRecord = switchoverTestRecord;
        return this;
    }

    public SwitchoverTestResponse withSwitchoverTestRecord(Consumer<SwitchoverTestRecord> switchoverTestRecordSetter) {
        if (this.switchoverTestRecord == null) {
            this.switchoverTestRecord = new SwitchoverTestRecord();
            switchoverTestRecordSetter.accept(this.switchoverTestRecord);
        }

        return this;
    }

    /**
     * Get switchoverTestRecord
     * @return switchoverTestRecord
     */
    public SwitchoverTestRecord getSwitchoverTestRecord() {
        return switchoverTestRecord;
    }

    public void setSwitchoverTestRecord(SwitchoverTestRecord switchoverTestRecord) {
        this.switchoverTestRecord = switchoverTestRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchoverTestResponse that = (SwitchoverTestResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.switchoverTestRecord, that.switchoverTestRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, switchoverTestRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchoverTestResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    switchoverTestRecord: ").append(toIndentedString(switchoverTestRecord)).append("\n");
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
