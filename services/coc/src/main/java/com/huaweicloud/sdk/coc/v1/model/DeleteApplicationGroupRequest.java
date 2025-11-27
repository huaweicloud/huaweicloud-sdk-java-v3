package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteApplicationGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_delete")

    private Boolean forceDelete;

    public DeleteApplicationGroupRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 分组id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteApplicationGroupRequest withForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }

    /**
     * 是否强制删除。
     * @return forceDelete
     */
    public Boolean getForceDelete() {
        return forceDelete;
    }

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteApplicationGroupRequest that = (DeleteApplicationGroupRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.forceDelete, that.forceDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, forceDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteApplicationGroupRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
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
