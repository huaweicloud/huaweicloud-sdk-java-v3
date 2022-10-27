package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateMenuRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_id")

    private String menuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateMenuRequestBody body;

    public UpdateMenuRequest withMenuId(String menuId) {
        this.menuId = menuId;
        return this;
    }

    /**
     * 菜单ID。
     * @return menuId
     */
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public UpdateMenuRequest withBody(UpdateMenuRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateMenuRequest withBody(Consumer<UpdateMenuRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateMenuRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateMenuRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateMenuRequestBody body) {
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
        UpdateMenuRequest updateMenuRequest = (UpdateMenuRequest) o;
        return Objects.equals(this.menuId, updateMenuRequest.menuId)
            && Objects.equals(this.body, updateMenuRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMenuRequest {\n");
        sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
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
