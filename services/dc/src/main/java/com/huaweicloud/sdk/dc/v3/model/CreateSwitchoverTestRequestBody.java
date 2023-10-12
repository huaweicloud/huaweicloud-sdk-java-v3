package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSwitchoverTestRequestBody
 */
public class CreateSwitchoverTestRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchover_test_record")

    private CreateSwitchoverTest switchoverTestRecord;

    public CreateSwitchoverTestRequestBody withSwitchoverTestRecord(CreateSwitchoverTest switchoverTestRecord) {
        this.switchoverTestRecord = switchoverTestRecord;
        return this;
    }

    public CreateSwitchoverTestRequestBody withSwitchoverTestRecord(
        Consumer<CreateSwitchoverTest> switchoverTestRecordSetter) {
        if (this.switchoverTestRecord == null) {
            this.switchoverTestRecord = new CreateSwitchoverTest();
            switchoverTestRecordSetter.accept(this.switchoverTestRecord);
        }

        return this;
    }

    /**
     * Get switchoverTestRecord
     * @return switchoverTestRecord
     */
    public CreateSwitchoverTest getSwitchoverTestRecord() {
        return switchoverTestRecord;
    }

    public void setSwitchoverTestRecord(CreateSwitchoverTest switchoverTestRecord) {
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
        CreateSwitchoverTestRequestBody that = (CreateSwitchoverTestRequestBody) obj;
        return Objects.equals(this.switchoverTestRecord, that.switchoverTestRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchoverTestRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSwitchoverTestRequestBody {\n");
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
