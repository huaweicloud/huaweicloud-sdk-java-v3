package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AttachSubNetworkInterfaceRequestBody
 */
public class AttachSubNetworkInterfaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interface")

    private AttachSubNetworkInterfaceOption subNetworkInterface;

    public AttachSubNetworkInterfaceRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * **参数解释**： 是否只预检此次请求。 **约束限制**： 不涉及。 **取值范围**： - true：发送检查请求，不会挂载辅助弹性网卡。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 - false：发送正常请求，并直接挂载辅助弹性网卡。 **默认取值**： false
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public AttachSubNetworkInterfaceRequestBody withSubNetworkInterface(
        AttachSubNetworkInterfaceOption subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
        return this;
    }

    public AttachSubNetworkInterfaceRequestBody withSubNetworkInterface(
        Consumer<AttachSubNetworkInterfaceOption> subNetworkInterfaceSetter) {
        if (this.subNetworkInterface == null) {
            this.subNetworkInterface = new AttachSubNetworkInterfaceOption();
            subNetworkInterfaceSetter.accept(this.subNetworkInterface);
        }

        return this;
    }

    /**
     * Get subNetworkInterface
     * @return subNetworkInterface
     */
    public AttachSubNetworkInterfaceOption getSubNetworkInterface() {
        return subNetworkInterface;
    }

    public void setSubNetworkInterface(AttachSubNetworkInterfaceOption subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachSubNetworkInterfaceRequestBody that = (AttachSubNetworkInterfaceRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun)
            && Objects.equals(this.subNetworkInterface, that.subNetworkInterface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, subNetworkInterface);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachSubNetworkInterfaceRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    subNetworkInterface: ").append(toIndentedString(subNetworkInterface)).append("\n");
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
