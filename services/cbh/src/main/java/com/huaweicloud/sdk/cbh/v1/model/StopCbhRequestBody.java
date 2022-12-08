package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关闭CBH实例请求对象
 */
public class StopCbhRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reboot")

    private RebootType reboot;

    public StopCbhRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例的server id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public StopCbhRequestBody withReboot(RebootType reboot) {
        this.reboot = reboot;
        return this;
    }

    public StopCbhRequestBody withReboot(Consumer<RebootType> rebootSetter) {
        if (this.reboot == null) {
            this.reboot = new RebootType();
            rebootSetter.accept(this.reboot);
        }

        return this;
    }

    /**
     * Get reboot
     * @return reboot
     */
    public RebootType getReboot() {
        return reboot;
    }

    public void setReboot(RebootType reboot) {
        this.reboot = reboot;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopCbhRequestBody stopCbhRequestBody = (StopCbhRequestBody) o;
        return Objects.equals(this.instanceId, stopCbhRequestBody.instanceId)
            && Objects.equals(this.reboot, stopCbhRequestBody.reboot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, reboot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopCbhRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
