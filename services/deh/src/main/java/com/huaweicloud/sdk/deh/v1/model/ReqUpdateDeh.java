package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新专属主机属性消息体。
 */
public class ReqUpdateDeh {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host")

    private ReqUpdateDehMessage dedicatedHost;

    public ReqUpdateDeh withDedicatedHost(ReqUpdateDehMessage dedicatedHost) {
        this.dedicatedHost = dedicatedHost;
        return this;
    }

    public ReqUpdateDeh withDedicatedHost(Consumer<ReqUpdateDehMessage> dedicatedHostSetter) {
        if (this.dedicatedHost == null) {
            this.dedicatedHost = new ReqUpdateDehMessage();
            dedicatedHostSetter.accept(this.dedicatedHost);
        }

        return this;
    }

    /**
     * Get dedicatedHost
     * @return dedicatedHost
     */
    public ReqUpdateDehMessage getDedicatedHost() {
        return dedicatedHost;
    }

    public void setDedicatedHost(ReqUpdateDehMessage dedicatedHost) {
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
        ReqUpdateDeh that = (ReqUpdateDeh) obj;
        return Objects.equals(this.dedicatedHost, that.dedicatedHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqUpdateDeh {\n");
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
