package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchUpdateItemResult
 */
public class BatchUpdateItemResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_alias")

    private String resourceAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_status")

    private String retStatus;

    public BatchUpdateItemResult withResourceAlias(String resourceAlias) {
        this.resourceAlias = resourceAlias;
        return this;
    }

    /**
     * 资源名称别名。
     * @return resourceAlias
     */
    public String getResourceAlias() {
        return resourceAlias;
    }

    public void setResourceAlias(String resourceAlias) {
        this.resourceAlias = resourceAlias;
    }

    public BatchUpdateItemResult withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public BatchUpdateItemResult withRetStatus(String retStatus) {
        this.retStatus = retStatus;
        return this;
    }

    /**
     * 资源更新状态。
     * @return retStatus
     */
    public String getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(String retStatus) {
        this.retStatus = retStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateItemResult that = (BatchUpdateItemResult) obj;
        return Objects.equals(this.resourceAlias, that.resourceAlias)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.retStatus, that.retStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceAlias, resourceName, retStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateItemResult {\n");
        sb.append("    resourceAlias: ").append(toIndentedString(resourceAlias)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    retStatus: ").append(toIndentedString(retStatus)).append("\n");
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
