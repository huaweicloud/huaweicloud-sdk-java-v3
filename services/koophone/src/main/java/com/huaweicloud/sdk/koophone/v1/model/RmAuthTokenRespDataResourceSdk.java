package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * sdk信息
 */
public class RmAuthTokenRespDataResourceSdk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal")

    private RmAuthTokenRespDataResourceSdkInternal internal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external")

    private RmAuthTokenRespDataResourceSdkExternal external;

    public RmAuthTokenRespDataResourceSdk withInternal(RmAuthTokenRespDataResourceSdkInternal internal) {
        this.internal = internal;
        return this;
    }

    public RmAuthTokenRespDataResourceSdk withInternal(
        Consumer<RmAuthTokenRespDataResourceSdkInternal> internalSetter) {
        if (this.internal == null) {
            this.internal = new RmAuthTokenRespDataResourceSdkInternal();
            internalSetter.accept(this.internal);
        }

        return this;
    }

    /**
     * Get internal
     * @return internal
     */
    public RmAuthTokenRespDataResourceSdkInternal getInternal() {
        return internal;
    }

    public void setInternal(RmAuthTokenRespDataResourceSdkInternal internal) {
        this.internal = internal;
    }

    public RmAuthTokenRespDataResourceSdk withExternal(RmAuthTokenRespDataResourceSdkExternal external) {
        this.external = external;
        return this;
    }

    public RmAuthTokenRespDataResourceSdk withExternal(
        Consumer<RmAuthTokenRespDataResourceSdkExternal> externalSetter) {
        if (this.external == null) {
            this.external = new RmAuthTokenRespDataResourceSdkExternal();
            externalSetter.accept(this.external);
        }

        return this;
    }

    /**
     * Get external
     * @return external
     */
    public RmAuthTokenRespDataResourceSdkExternal getExternal() {
        return external;
    }

    public void setExternal(RmAuthTokenRespDataResourceSdkExternal external) {
        this.external = external;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmAuthTokenRespDataResourceSdk that = (RmAuthTokenRespDataResourceSdk) obj;
        return Objects.equals(this.internal, that.internal) && Objects.equals(this.external, that.external);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internal, external);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmAuthTokenRespDataResourceSdk {\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    external: ").append(toIndentedString(external)).append("\n");
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
