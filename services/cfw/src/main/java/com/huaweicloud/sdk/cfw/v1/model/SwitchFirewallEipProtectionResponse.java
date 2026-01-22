package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SwitchFirewallEipProtectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private SwitchFirewallEipProtectionRespData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public SwitchFirewallEipProtectionResponse withData(SwitchFirewallEipProtectionRespData data) {
        this.data = data;
        return this;
    }

    public SwitchFirewallEipProtectionResponse withData(Consumer<SwitchFirewallEipProtectionRespData> dataSetter) {
        if (this.data == null) {
            this.data = new SwitchFirewallEipProtectionRespData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public SwitchFirewallEipProtectionRespData getData() {
        return data;
    }

    public void setData(SwitchFirewallEipProtectionRespData data) {
        this.data = data;
    }

    public SwitchFirewallEipProtectionResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 一键逃生失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchFirewallEipProtectionResponse that = (SwitchFirewallEipProtectionResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchFirewallEipProtectionResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
