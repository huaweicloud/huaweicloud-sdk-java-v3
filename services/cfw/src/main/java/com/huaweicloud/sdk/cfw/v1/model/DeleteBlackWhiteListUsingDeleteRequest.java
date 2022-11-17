package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteBlackWhiteListUsingDeleteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_id")

    private String listId;

    public DeleteBlackWhiteListUsingDeleteRequest withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * 黑白名单id
     * @return listId
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteBlackWhiteListUsingDeleteRequest deleteBlackWhiteListUsingDeleteRequest =
            (DeleteBlackWhiteListUsingDeleteRequest) o;
        return Objects.equals(this.listId, deleteBlackWhiteListUsingDeleteRequest.listId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBlackWhiteListUsingDeleteRequest {\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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
