package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTaskArchivedStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IdDto body;

    public UpdateTaskArchivedStatusRequest withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * 是否归档。 -  false：否   - true：是
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public UpdateTaskArchivedStatusRequest withBody(IdDto body) {
        this.body = body;
        return this;
    }

    public UpdateTaskArchivedStatusRequest withBody(Consumer<IdDto> bodySetter) {
        if (this.body == null) {
            this.body = new IdDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IdDto getBody() {
        return body;
    }

    public void setBody(IdDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskArchivedStatusRequest that = (UpdateTaskArchivedStatusRequest) obj;
        return Objects.equals(this.archived, that.archived) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archived, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskArchivedStatusRequest {\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
