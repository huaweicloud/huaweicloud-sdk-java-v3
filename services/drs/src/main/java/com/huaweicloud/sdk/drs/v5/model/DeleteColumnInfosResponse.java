package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteColumnInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_result")

    private Boolean deleteResult;

    public DeleteColumnInfosResponse withDeleteResult(Boolean deleteResult) {
        this.deleteResult = deleteResult;
        return this;
    }

    /**
     * 删除结果
     * @return deleteResult
     */
    public Boolean getDeleteResult() {
        return deleteResult;
    }

    public void setDeleteResult(Boolean deleteResult) {
        this.deleteResult = deleteResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteColumnInfosResponse that = (DeleteColumnInfosResponse) obj;
        return Objects.equals(this.deleteResult, that.deleteResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteColumnInfosResponse {\n");
        sb.append("    deleteResult: ").append(toIndentedString(deleteResult)).append("\n");
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
