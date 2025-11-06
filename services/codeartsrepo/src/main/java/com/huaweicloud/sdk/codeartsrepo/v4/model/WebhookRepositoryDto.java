package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WebhookRepositoryDto
 */
public class WebhookRepositoryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    public WebhookRepositoryDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库ID
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

    public WebhookRepositoryDto withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释：** 仓库路径 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebhookRepositoryDto that = (WebhookRepositoryDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.namespace, that.namespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRepositoryDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
