package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreatePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool")

    @JacksonXmlProperty(localName = "pool")

    private CreatePoolReq pool;

    public CreatePoolRequestBody withPool(CreatePoolReq pool) {
        this.pool = pool;
        return this;
    }

    public CreatePoolRequestBody withPool(Consumer<CreatePoolReq> poolSetter) {
        if (this.pool == null) {
            this.pool = new CreatePoolReq();
            poolSetter.accept(this.pool);
        }

        return this;
    }

    /**
     * Get pool
     * @return pool
     */
    public CreatePoolReq getPool() {
        return pool;
    }

    public void setPool(CreatePoolReq pool) {
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
        CreatePoolRequestBody createPoolRequestBody = (CreatePoolRequestBody) o;
        return Objects.equals(this.pool, createPoolRequestBody.pool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolRequestBody {\n");
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
