package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListNumberOfInstancesInDifferentStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_failure")

    private String includeFailure;

    public ListNumberOfInstancesInDifferentStatusRequest withIncludeFailure(String includeFailure) {
        this.includeFailure = includeFailure;
        return this;
    }

    /**
     * 是否返回创建失败的实例数。   - 当参数值为“true”时，返回的统计包括创建失败的实例数。   - 参数值为“false”或者其他值，返回的统计不包括创建失败的实例数。 
     * @return includeFailure
     */
    public String getIncludeFailure() {
        return includeFailure;
    }

    public void setIncludeFailure(String includeFailure) {
        this.includeFailure = includeFailure;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNumberOfInstancesInDifferentStatusRequest listNumberOfInstancesInDifferentStatusRequest =
            (ListNumberOfInstancesInDifferentStatusRequest) o;
        return Objects.equals(this.includeFailure, listNumberOfInstancesInDifferentStatusRequest.includeFailure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeFailure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNumberOfInstancesInDifferentStatusRequest {\n");
        sb.append("    includeFailure: ").append(toIndentedString(includeFailure)).append("\n");
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
