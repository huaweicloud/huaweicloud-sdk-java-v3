package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryIdentityDto
 */
public class RepositoryIdentityDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_with_namespace")

    private String pathWithNamespace;

    public RepositoryIdentityDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 项目ID。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RepositoryIdentityDto withPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 项目路径。 **约束限制：** 不涉及。
     * @return pathWithNamespace
     */
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryIdentityDto that = (RepositoryIdentityDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.pathWithNamespace, that.pathWithNamespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pathWithNamespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryIdentityDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pathWithNamespace: ").append(toIndentedString(pathWithNamespace)).append("\n");
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
