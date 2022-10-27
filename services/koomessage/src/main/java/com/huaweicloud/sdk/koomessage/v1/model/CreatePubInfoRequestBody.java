package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建服务号一站式请求体。
 */
public class CreatePubInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_request_body")

    private PubInfoRequestBody pubRequestBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portal_request_body")

    private PortalInfoRequestBody portalRequestBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_request_body")

    private MenuInfoRequestBody menuRequestBody;

    public CreatePubInfoRequestBody withPubRequestBody(PubInfoRequestBody pubRequestBody) {
        this.pubRequestBody = pubRequestBody;
        return this;
    }

    public CreatePubInfoRequestBody withPubRequestBody(Consumer<PubInfoRequestBody> pubRequestBodySetter) {
        if (this.pubRequestBody == null) {
            this.pubRequestBody = new PubInfoRequestBody();
            pubRequestBodySetter.accept(this.pubRequestBody);
        }

        return this;
    }

    /**
     * Get pubRequestBody
     * @return pubRequestBody
     */
    public PubInfoRequestBody getPubRequestBody() {
        return pubRequestBody;
    }

    public void setPubRequestBody(PubInfoRequestBody pubRequestBody) {
        this.pubRequestBody = pubRequestBody;
    }

    public CreatePubInfoRequestBody withPortalRequestBody(PortalInfoRequestBody portalRequestBody) {
        this.portalRequestBody = portalRequestBody;
        return this;
    }

    public CreatePubInfoRequestBody withPortalRequestBody(Consumer<PortalInfoRequestBody> portalRequestBodySetter) {
        if (this.portalRequestBody == null) {
            this.portalRequestBody = new PortalInfoRequestBody();
            portalRequestBodySetter.accept(this.portalRequestBody);
        }

        return this;
    }

    /**
     * Get portalRequestBody
     * @return portalRequestBody
     */
    public PortalInfoRequestBody getPortalRequestBody() {
        return portalRequestBody;
    }

    public void setPortalRequestBody(PortalInfoRequestBody portalRequestBody) {
        this.portalRequestBody = portalRequestBody;
    }

    public CreatePubInfoRequestBody withMenuRequestBody(MenuInfoRequestBody menuRequestBody) {
        this.menuRequestBody = menuRequestBody;
        return this;
    }

    public CreatePubInfoRequestBody withMenuRequestBody(Consumer<MenuInfoRequestBody> menuRequestBodySetter) {
        if (this.menuRequestBody == null) {
            this.menuRequestBody = new MenuInfoRequestBody();
            menuRequestBodySetter.accept(this.menuRequestBody);
        }

        return this;
    }

    /**
     * Get menuRequestBody
     * @return menuRequestBody
     */
    public MenuInfoRequestBody getMenuRequestBody() {
        return menuRequestBody;
    }

    public void setMenuRequestBody(MenuInfoRequestBody menuRequestBody) {
        this.menuRequestBody = menuRequestBody;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePubInfoRequestBody createPubInfoRequestBody = (CreatePubInfoRequestBody) o;
        return Objects.equals(this.pubRequestBody, createPubInfoRequestBody.pubRequestBody)
            && Objects.equals(this.portalRequestBody, createPubInfoRequestBody.portalRequestBody)
            && Objects.equals(this.menuRequestBody, createPubInfoRequestBody.menuRequestBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubRequestBody, portalRequestBody, menuRequestBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePubInfoRequestBody {\n");
        sb.append("    pubRequestBody: ").append(toIndentedString(pubRequestBody)).append("\n");
        sb.append("    portalRequestBody: ").append(toIndentedString(portalRequestBody)).append("\n");
        sb.append("    menuRequestBody: ").append(toIndentedString(menuRequestBody)).append("\n");
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
