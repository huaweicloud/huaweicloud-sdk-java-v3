package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    @JacksonXmlProperty(localName = "pool")

    private PoolResp pool;

    public ShowPoolResponse withPool(PoolResp pool) {
        this.pool = pool;
        return this;
    }

    public ShowPoolResponse withPool(Consumer<PoolResp> poolSetter) {
        if (this.pool == null) {
            this.pool = new PoolResp();
            poolSetter.accept(this.pool);
        }

        return this;
    }

    /**
     * Get pool
     * @return pool
     */
    public PoolResp getPool() {
        return pool;
    }

    public void setPool(PoolResp pool) {
        this.pool = pool;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPoolResponse showPoolResponse = (ShowPoolResponse) o;
        return Objects.equals(this.pool, showPoolResponse.pool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPoolResponse {\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
