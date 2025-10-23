package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateResourcesLevelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_id")

    private String resourceLevelId;

    public CreateResourcesLevelResponse withResourceLevelId(String resourceLevelId) {
        this.resourceLevelId = resourceLevelId;
        return this;
    }

    /**
     * 资源分级ID
     * @return resourceLevelId
     */
    public String getResourceLevelId() {
        return resourceLevelId;
    }

    public void setResourceLevelId(String resourceLevelId) {
        this.resourceLevelId = resourceLevelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResourcesLevelResponse that = (CreateResourcesLevelResponse) obj;
        return Objects.equals(this.resourceLevelId, that.resourceLevelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceLevelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourcesLevelResponse {\n");
        sb.append("    resourceLevelId: ").append(toIndentedString(resourceLevelId)).append("\n");
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
