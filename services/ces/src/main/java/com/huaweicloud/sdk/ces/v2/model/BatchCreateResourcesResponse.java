package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class BatchCreateResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeed_count")

    private Integer succeedCount;

    public BatchCreateResourcesResponse withSucceedCount(Integer succeedCount) {
        this.succeedCount = succeedCount;
        return this;
    }

    /**
     * 成功添加的资源数目
     * minimum: 0
     * maximum: 1000
     * @return succeedCount
     */
    public Integer getSucceedCount() {
        return succeedCount;
    }

    public void setSucceedCount(Integer succeedCount) {
        this.succeedCount = succeedCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateResourcesResponse batchCreateResourcesResponse = (BatchCreateResourcesResponse) o;
        return Objects.equals(this.succeedCount, batchCreateResourcesResponse.succeedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(succeedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateResourcesResponse {\n");
        sb.append("    succeedCount: ").append(toIndentedString(succeedCount)).append("\n");
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
