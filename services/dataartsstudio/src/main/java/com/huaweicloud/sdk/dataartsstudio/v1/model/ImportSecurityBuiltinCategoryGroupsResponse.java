package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ImportSecurityBuiltinCategoryGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ImportDefaultCategoryResultDto> result = null;

    public ImportSecurityBuiltinCategoryGroupsResponse withResult(List<ImportDefaultCategoryResultDto> result) {
        this.result = result;
        return this;
    }

    public ImportSecurityBuiltinCategoryGroupsResponse addResultItem(ImportDefaultCategoryResultDto resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ImportSecurityBuiltinCategoryGroupsResponse withResult(
        Consumer<List<ImportDefaultCategoryResultDto>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 导入结果。
     * @return result
     */
    public List<ImportDefaultCategoryResultDto> getResult() {
        return result;
    }

    public void setResult(List<ImportDefaultCategoryResultDto> result) {
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
        ImportSecurityBuiltinCategoryGroupsResponse that = (ImportSecurityBuiltinCategoryGroupsResponse) obj;
        return Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportSecurityBuiltinCategoryGroupsResponse {\n");
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
