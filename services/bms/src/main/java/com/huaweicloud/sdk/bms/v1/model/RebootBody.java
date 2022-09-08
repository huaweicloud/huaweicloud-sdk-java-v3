package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重启裸金属服务器接口请求结构体
 */
public class RebootBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reboot")

    private ServersInfoType reboot;

    public RebootBody withReboot(ServersInfoType reboot) {
        this.reboot = reboot;
        return this;
    }

    public RebootBody withReboot(Consumer<ServersInfoType> rebootSetter) {
        if (this.reboot == null) {
            this.reboot = new ServersInfoType();
            rebootSetter.accept(this.reboot);
        }

        return this;
    }

    /**
     * Get reboot
     * @return reboot
     */
    public ServersInfoType getReboot() {
        return reboot;
    }

    public void setReboot(ServersInfoType reboot) {
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
        RebootBody rebootBody = (RebootBody) o;
        return Objects.equals(this.reboot, rebootBody.reboot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reboot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebootBody {\n");
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
