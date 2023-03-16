package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重启云堡垒机实例请求对象。
 */
public class RebootCbhRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reboot")

    private RebootType reboot;

    public RebootCbhRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 云堡垒机实例ID，使用UUID格式。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RebootCbhRequestBody withReboot(RebootType reboot) {
        this.reboot = reboot;
        return this;
    }

    public RebootCbhRequestBody withReboot(Consumer<RebootType> rebootSetter) {
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
        RebootCbhRequestBody rebootCbhRequestBody = (RebootCbhRequestBody) o;
        return Objects.equals(this.instanceId, rebootCbhRequestBody.instanceId)
            && Objects.equals(this.reboot, rebootCbhRequestBody.reboot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, reboot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebootCbhRequestBody {\n");
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
