package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class SetDisasterRecoverySettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successed_instance_ids")

    private List<String> successedInstanceIds = null;

    public SetDisasterRecoverySettingsResponse withSuccessedInstanceIds(List<String> successedInstanceIds) {
        this.successedInstanceIds = successedInstanceIds;
        return this;
    }

    public SetDisasterRecoverySettingsResponse addSuccessedInstanceIdsItem(String successedInstanceIdsItem) {
        if (this.successedInstanceIds == null) {
            this.successedInstanceIds = new ArrayList<>();
        }
        this.successedInstanceIds.add(successedInstanceIdsItem);
        return this;
    }

    public SetDisasterRecoverySettingsResponse withSuccessedInstanceIds(
        Consumer<List<String>> successedInstanceIdsSetter) {
        if (this.successedInstanceIds == null) {
            this.successedInstanceIds = new ArrayList<>();
        }
        successedInstanceIdsSetter.accept(this.successedInstanceIds);
        return this;
    }

    /**
     * 设置容灾切换故障节点比例成功的实例列表。
     * @return successedInstanceIds
     */
    public List<String> getSuccessedInstanceIds() {
        return successedInstanceIds;
    }

    public void setSuccessedInstanceIds(List<String> successedInstanceIds) {
        this.successedInstanceIds = successedInstanceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetDisasterRecoverySettingsResponse that = (SetDisasterRecoverySettingsResponse) obj;
        return Objects.equals(this.successedInstanceIds, that.successedInstanceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successedInstanceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetDisasterRecoverySettingsResponse {\n");
        sb.append("    successedInstanceIds: ").append(toIndentedString(successedInstanceIds)).append("\n");
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
