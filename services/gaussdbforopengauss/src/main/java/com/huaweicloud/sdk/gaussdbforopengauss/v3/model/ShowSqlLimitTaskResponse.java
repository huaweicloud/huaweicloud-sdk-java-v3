package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSqlLimitTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_count")

    private Integer limitCount;

    public ShowSqlLimitTaskResponse withLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
        return this;
    }

    /**
     * **参数解释**: 限流任务拦截次数。 **取值范围**: 不涉及。
     * @return limitCount
     */
    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlLimitTaskResponse that = (ShowSqlLimitTaskResponse) obj;
        return Objects.equals(this.limitCount, that.limitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlLimitTaskResponse {\n");
        sb.append("    limitCount: ").append(toIndentedString(limitCount)).append("\n");
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
