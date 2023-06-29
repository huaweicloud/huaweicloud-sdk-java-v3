package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOriginHostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_host")

    private DomainOriginHost originHost;

    public ShowOriginHostResponse withOriginHost(DomainOriginHost originHost) {
        this.originHost = originHost;
        return this;
    }

    public ShowOriginHostResponse withOriginHost(Consumer<DomainOriginHost> originHostSetter) {
        if (this.originHost == null) {
            this.originHost = new DomainOriginHost();
            originHostSetter.accept(this.originHost);
        }

        return this;
    }

    /**
     * Get originHost
     * @return originHost
     */
    public DomainOriginHost getOriginHost() {
        return originHost;
    }

    public void setOriginHost(DomainOriginHost originHost) {
        this.originHost = originHost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOriginHostResponse that = (ShowOriginHostResponse) obj;
        return Objects.equals(this.originHost, that.originHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOriginHostResponse {\n");
        sb.append("    originHost: ").append(toIndentedString(originHost)).append("\n");
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
