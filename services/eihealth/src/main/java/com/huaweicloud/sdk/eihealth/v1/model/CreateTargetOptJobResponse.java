package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateTargetOptJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_concurrency")

    private Integer limitConcurrency;

    public CreateTargetOptJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateTargetOptJobResponse withLimitConcurrency(Integer limitConcurrency) {
        this.limitConcurrency = limitConcurrency;
        return this;
    }

    /**
     * 限制的并发量
     * @return limitConcurrency
     */
    public Integer getLimitConcurrency() {
        return limitConcurrency;
    }

    public void setLimitConcurrency(Integer limitConcurrency) {
        this.limitConcurrency = limitConcurrency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTargetOptJobResponse that = (CreateTargetOptJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.limitConcurrency, that.limitConcurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, limitConcurrency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTargetOptJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    limitConcurrency: ").append(toIndentedString(limitConcurrency)).append("\n");
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
