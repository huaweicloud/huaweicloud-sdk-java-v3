package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 响应实体类。
 */
public class CreatePubInfoResponseModelData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_id")

    private String menuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portal_id")

    private String portalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    public CreatePubInfoResponseModelData withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 服务号申请记录ID。
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public CreatePubInfoResponseModelData withPubId(String pubId) {
        this.pubId = pubId;
        return this;
    }

    /**
     * 服务号ID。
     * @return pubId
     */
    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public CreatePubInfoResponseModelData withMenuId(String menuId) {
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

    public CreatePubInfoResponseModelData withPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }

    /**
     * 主页ID。
     * @return portalId
     */
    public String getPortalId() {
        return portalId;
    }

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    public CreatePubInfoResponseModelData withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称。
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePubInfoResponseModelData createPubInfoResponseModelData = (CreatePubInfoResponseModelData) o;
        return Objects.equals(this.logId, createPubInfoResponseModelData.logId)
            && Objects.equals(this.pubId, createPubInfoResponseModelData.pubId)
            && Objects.equals(this.menuId, createPubInfoResponseModelData.menuId)
            && Objects.equals(this.portalId, createPubInfoResponseModelData.portalId)
            && Objects.equals(this.pubName, createPubInfoResponseModelData.pubName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId, pubId, menuId, portalId, pubName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePubInfoResponseModelData {\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
        sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
        sb.append("    portalId: ").append(toIndentedString(portalId)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
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
