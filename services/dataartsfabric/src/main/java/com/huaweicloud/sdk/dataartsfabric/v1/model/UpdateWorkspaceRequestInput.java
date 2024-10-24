package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新Workspace的请求体。
 */
public class UpdateWorkspaceRequestInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metastore_id")

    private String metastoreId;

    public UpdateWorkspaceRequestInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作空间名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateWorkspaceRequestInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。用户输入的描述，最长为255个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateWorkspaceRequestInput withMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    /**
     * Metastore信息，LakeFormation服务的实例Id，即MetaStoreId。
     * @return metastoreId
     */
    public String getMetastoreId() {
        return metastoreId;
    }

    public void setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWorkspaceRequestInput that = (UpdateWorkspaceRequestInput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.metastoreId, that.metastoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, metastoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkspaceRequestInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    metastoreId: ").append(toIndentedString(metastoreId)).append("\n");
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
