package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetaDto
 */
public class MetaDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceType")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastModified")

    private String lastModified;

    public MetaDto withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public MetaDto withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 资源创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public MetaDto withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 资源最后更新时间
     * @return lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDto that = (MetaDto) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.created, that.created)
            && Objects.equals(this.lastModified, that.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, created, lastModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaDto {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
