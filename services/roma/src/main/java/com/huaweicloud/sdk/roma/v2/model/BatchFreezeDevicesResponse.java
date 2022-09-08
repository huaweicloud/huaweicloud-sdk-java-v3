package com.huaweicloud.sdk.roma.v2.model;

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
public class BatchFreezeDevicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<DeviceInfoSimple> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private List<DeviceInfoSimple> failed = null;

    public BatchFreezeDevicesResponse withSuccess(List<DeviceInfoSimple> success) {
        this.success = success;
        return this;
    }

    public BatchFreezeDevicesResponse addSuccessItem(DeviceInfoSimple successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public BatchFreezeDevicesResponse withSuccess(Consumer<List<DeviceInfoSimple>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 下线成功设备列表
     * @return success
     */
    public List<DeviceInfoSimple> getSuccess() {
        return success;
    }

    public void setSuccess(List<DeviceInfoSimple> success) {
        this.success = success;
    }

    public BatchFreezeDevicesResponse withFailed(List<DeviceInfoSimple> failed) {
        this.failed = failed;
        return this;
    }

    public BatchFreezeDevicesResponse addFailedItem(DeviceInfoSimple failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public BatchFreezeDevicesResponse withFailed(Consumer<List<DeviceInfoSimple>> failedSetter) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * 下线失败设备列表
     * @return failed
     */
    public List<DeviceInfoSimple> getFailed() {
        return failed;
    }

    public void setFailed(List<DeviceInfoSimple> failed) {
        this.failed = failed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchFreezeDevicesResponse batchFreezeDevicesResponse = (BatchFreezeDevicesResponse) o;
        return Objects.equals(this.success, batchFreezeDevicesResponse.success)
            && Objects.equals(this.failed, batchFreezeDevicesResponse.failed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchFreezeDevicesResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
