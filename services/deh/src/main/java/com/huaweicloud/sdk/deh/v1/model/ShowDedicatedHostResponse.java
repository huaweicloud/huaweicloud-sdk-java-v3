package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDedicatedHostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host")

    private RespDedicatedHost dedicatedHost;

    public ShowDedicatedHostResponse withDedicatedHost(RespDedicatedHost dedicatedHost) {
        this.dedicatedHost = dedicatedHost;
        return this;
    }

    public ShowDedicatedHostResponse withDedicatedHost(Consumer<RespDedicatedHost> dedicatedHostSetter) {
        if (this.dedicatedHost == null) {
            this.dedicatedHost = new RespDedicatedHost();
            dedicatedHostSetter.accept(this.dedicatedHost);
        }

        return this;
    }

    /**
     * Get dedicatedHost
     * @return dedicatedHost
     */
    public RespDedicatedHost getDedicatedHost() {
        return dedicatedHost;
    }

    public void setDedicatedHost(RespDedicatedHost dedicatedHost) {
        this.dedicatedHost = dedicatedHost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDedicatedHostResponse that = (ShowDedicatedHostResponse) obj;
        return Objects.equals(this.dedicatedHost, that.dedicatedHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDedicatedHostResponse {\n");
        sb.append("    dedicatedHost: ").append(toIndentedString(dedicatedHost)).append("\n");
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
