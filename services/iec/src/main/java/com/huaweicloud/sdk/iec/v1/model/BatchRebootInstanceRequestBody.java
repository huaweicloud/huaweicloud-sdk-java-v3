package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量重启边缘实例请求体。
 */
public class BatchRebootInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reboot")

    private BatchReboot reboot;

    public BatchRebootInstanceRequestBody withReboot(BatchReboot reboot) {
        this.reboot = reboot;
        return this;
    }

    public BatchRebootInstanceRequestBody withReboot(Consumer<BatchReboot> rebootSetter) {
        if (this.reboot == null) {
            this.reboot = new BatchReboot();
            rebootSetter.accept(this.reboot);
        }

        return this;
    }

    /**
     * Get reboot
     * @return reboot
     */
    public BatchReboot getReboot() {
        return reboot;
    }

    public void setReboot(BatchReboot reboot) {
        this.reboot = reboot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRebootInstanceRequestBody that = (BatchRebootInstanceRequestBody) obj;
        return Objects.equals(this.reboot, that.reboot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reboot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRebootInstanceRequestBody {\n");
        sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
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
