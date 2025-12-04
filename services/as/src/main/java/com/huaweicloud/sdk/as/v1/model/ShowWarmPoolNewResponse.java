package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWarmPoolNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warm_pool")

    private WarmPoolInfo warmPool;

    public ShowWarmPoolNewResponse withWarmPool(WarmPoolInfo warmPool) {
        this.warmPool = warmPool;
        return this;
    }

    public ShowWarmPoolNewResponse withWarmPool(Consumer<WarmPoolInfo> warmPoolSetter) {
        if (this.warmPool == null) {
            this.warmPool = new WarmPoolInfo();
            warmPoolSetter.accept(this.warmPool);
        }

        return this;
    }

    /**
     * Get warmPool
     * @return warmPool
     */
    public WarmPoolInfo getWarmPool() {
        return warmPool;
    }

    public void setWarmPool(WarmPoolInfo warmPool) {
        this.warmPool = warmPool;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWarmPoolNewResponse that = (ShowWarmPoolNewResponse) obj;
        return Objects.equals(this.warmPool, that.warmPool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warmPool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWarmPoolNewResponse {\n");
        sb.append("    warmPool: ").append(toIndentedString(warmPool)).append("\n");
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
