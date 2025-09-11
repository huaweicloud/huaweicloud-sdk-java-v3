package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterAccessKeyListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ShowClusterAccessKeyListResponseBodyResult> result = null;

    public ShowClusterAccessKeyListResponse withResult(List<ShowClusterAccessKeyListResponseBodyResult> result) {
        this.result = result;
        return this;
    }

    public ShowClusterAccessKeyListResponse addResultItem(ShowClusterAccessKeyListResponseBodyResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ShowClusterAccessKeyListResponse withResult(
        Consumer<List<ShowClusterAccessKeyListResponseBodyResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 已授权的访问密钥列表
     * @return result
     */
    public List<ShowClusterAccessKeyListResponseBodyResult> getResult() {
        return result;
    }

    public void setResult(List<ShowClusterAccessKeyListResponseBodyResult> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterAccessKeyListResponse that = (ShowClusterAccessKeyListResponse) obj;
        return Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterAccessKeyListResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
