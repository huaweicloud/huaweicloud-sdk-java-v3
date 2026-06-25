package com.huaweicloud.sdk.modelarts.v1.model;

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
public class BatchUpdatePoolNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successNodeNames")

    private List<String> successNodeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failNodeNames")

    private List<String> failNodeNames = null;

    public BatchUpdatePoolNodesResponse withSuccessNodeNames(List<String> successNodeNames) {
        this.successNodeNames = successNodeNames;
        return this;
    }

    public BatchUpdatePoolNodesResponse addSuccessNodeNamesItem(String successNodeNamesItem) {
        if (this.successNodeNames == null) {
            this.successNodeNames = new ArrayList<>();
        }
        this.successNodeNames.add(successNodeNamesItem);
        return this;
    }

    public BatchUpdatePoolNodesResponse withSuccessNodeNames(Consumer<List<String>> successNodeNamesSetter) {
        if (this.successNodeNames == null) {
            this.successNodeNames = new ArrayList<>();
        }
        successNodeNamesSetter.accept(this.successNodeNames);
        return this;
    }

    /**
     * **参数解释**：更新成功的节点名称列表。
     * @return successNodeNames
     */
    public List<String> getSuccessNodeNames() {
        return successNodeNames;
    }

    public void setSuccessNodeNames(List<String> successNodeNames) {
        this.successNodeNames = successNodeNames;
    }

    public BatchUpdatePoolNodesResponse withFailNodeNames(List<String> failNodeNames) {
        this.failNodeNames = failNodeNames;
        return this;
    }

    public BatchUpdatePoolNodesResponse addFailNodeNamesItem(String failNodeNamesItem) {
        if (this.failNodeNames == null) {
            this.failNodeNames = new ArrayList<>();
        }
        this.failNodeNames.add(failNodeNamesItem);
        return this;
    }

    public BatchUpdatePoolNodesResponse withFailNodeNames(Consumer<List<String>> failNodeNamesSetter) {
        if (this.failNodeNames == null) {
            this.failNodeNames = new ArrayList<>();
        }
        failNodeNamesSetter.accept(this.failNodeNames);
        return this;
    }

    /**
     * **参数解释**：更新失败的节点名称列表。
     * @return failNodeNames
     */
    public List<String> getFailNodeNames() {
        return failNodeNames;
    }

    public void setFailNodeNames(List<String> failNodeNames) {
        this.failNodeNames = failNodeNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdatePoolNodesResponse that = (BatchUpdatePoolNodesResponse) obj;
        return Objects.equals(this.successNodeNames, that.successNodeNames)
            && Objects.equals(this.failNodeNames, that.failNodeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successNodeNames, failNodeNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePoolNodesResponse {\n");
        sb.append("    successNodeNames: ").append(toIndentedString(successNodeNames)).append("\n");
        sb.append("    failNodeNames: ").append(toIndentedString(failNodeNames)).append("\n");
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
