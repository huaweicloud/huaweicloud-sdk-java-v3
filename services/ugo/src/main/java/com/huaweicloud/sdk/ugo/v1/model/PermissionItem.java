package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 权限检查条目。
 */
public class PermissionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_type")

    @JacksonXmlProperty(localName = "permission_type")

    private String permissionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    @JacksonXmlProperty(localName = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    @JacksonXmlProperty(localName = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_detail")

    @JacksonXmlProperty(localName = "failed_detail")

    private String failedDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggest_solution")

    @JacksonXmlProperty(localName = "suggest_solution")

    private List<String> suggestSolution = null;

    public PermissionItem withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 权限类型。
     * @return permissionType
     */
    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public PermissionItem withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public PermissionItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 权限描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PermissionItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 是否通过。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PermissionItem withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public PermissionItem withFailedDetail(String failedDetail) {
        this.failedDetail = failedDetail;
        return this;
    }

    /**
     * 失败详情。
     * @return failedDetail
     */
    public String getFailedDetail() {
        return failedDetail;
    }

    public void setFailedDetail(String failedDetail) {
        this.failedDetail = failedDetail;
    }

    public PermissionItem withSuggestSolution(List<String> suggestSolution) {
        this.suggestSolution = suggestSolution;
        return this;
    }

    public PermissionItem addSuggestSolutionItem(String suggestSolutionItem) {
        if (this.suggestSolution == null) {
            this.suggestSolution = new ArrayList<>();
        }
        this.suggestSolution.add(suggestSolutionItem);
        return this;
    }

    public PermissionItem withSuggestSolution(Consumer<List<String>> suggestSolutionSetter) {
        if (this.suggestSolution == null) {
            this.suggestSolution = new ArrayList<>();
        }
        suggestSolutionSetter.accept(this.suggestSolution);
        return this;
    }

    /**
     * 解决建议。
     * @return suggestSolution
     */
    public List<String> getSuggestSolution() {
        return suggestSolution;
    }

    public void setSuggestSolution(List<String> suggestSolution) {
        this.suggestSolution = suggestSolution;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionItem permissionItem = (PermissionItem) o;
        return Objects.equals(this.permissionType, permissionItem.permissionType)
            && Objects.equals(this.schemaName, permissionItem.schemaName)
            && Objects.equals(this.description, permissionItem.description)
            && Objects.equals(this.status, permissionItem.status)
            && Objects.equals(this.failedReason, permissionItem.failedReason)
            && Objects.equals(this.failedDetail, permissionItem.failedDetail)
            && Objects.equals(this.suggestSolution, permissionItem.suggestSolution);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(permissionType, schemaName, description, status, failedReason, failedDetail, suggestSolution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionItem {\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedDetail: ").append(toIndentedString(failedDetail)).append("\n");
        sb.append("    suggestSolution: ").append(toIndentedString(suggestSolution)).append("\n");
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
