package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateBlackWhiteListUsingPutRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_id")

    private String listId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateBlackWhiteListDto body;

    public UpdateBlackWhiteListUsingPutRequest withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * 黑白名单列表id
     * @return listId
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public UpdateBlackWhiteListUsingPutRequest withBody(UpdateBlackWhiteListDto body) {
        this.body = body;
        return this;
    }

    public UpdateBlackWhiteListUsingPutRequest withBody(Consumer<UpdateBlackWhiteListDto> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateBlackWhiteListDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateBlackWhiteListDto getBody() {
        return body;
    }

    public void setBody(UpdateBlackWhiteListDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBlackWhiteListUsingPutRequest updateBlackWhiteListUsingPutRequest =
            (UpdateBlackWhiteListUsingPutRequest) o;
        return Objects.equals(this.listId, updateBlackWhiteListUsingPutRequest.listId)
            && Objects.equals(this.body, updateBlackWhiteListUsingPutRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlackWhiteListUsingPutRequest {\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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
