package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MenusRsp
 */
public class MenusRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_id")

    private String menuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_img")

    private String logoImg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_url")

    private String logoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu")

    private Menus menu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_state")

    private Integer menuState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_state")

    private Integer approveState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_time")

    private String onlineTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_time")

    private String operTime;

    public MenusRsp withMenuId(String menuId) {
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

    public MenusRsp withPubId(String pubId) {
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

    public MenusRsp withPubName(String pubName) {
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

    public MenusRsp withLogoImg(String logoImg) {
        this.logoImg = logoImg;
        return this;
    }

    /**
     * LOGO图片资源ID。
     * @return logoImg
     */
    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public MenusRsp withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * LOGO图片资源URL。
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public MenusRsp withMenu(Menus menu) {
        this.menu = menu;
        return this;
    }

    public MenusRsp withMenu(Consumer<Menus> menuSetter) {
        if (this.menu == null) {
            this.menu = new Menus();
            menuSetter.accept(this.menu);
        }

        return this;
    }

    /**
     * Get menu
     * @return menu
     */
    public Menus getMenu() {
        return menu;
    }

    public void setMenu(Menus menu) {
        this.menu = menu;
    }

    public MenusRsp withMenuState(Integer menuState) {
        this.menuState = menuState;
        return this;
    }

    /**
     * 资源状态。  - 1：未生效 - 2：已生效 - 3：已失效  - 4：已冻结  
     * @return menuState
     */
    public Integer getMenuState() {
        return menuState;
    }

    public void setMenuState(Integer menuState) {
        this.menuState = menuState;
    }

    public MenusRsp withApproveState(Integer approveState) {
        this.approveState = approveState;
        return this;
    }

    /**
     * 审核状态。 - 1：待审核  - 2：通过  - 3：驳回  
     * @return approveState
     */
    public Integer getApproveState() {
        return approveState;
    }

    public void setApproveState(Integer approveState) {
        this.approveState = approveState;
    }

    public MenusRsp withOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
        return this;
    }

    /**
     * 上线时间。格式为：2020-12-12T12:00:00Z。
     * @return onlineTime
     */
    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public MenusRsp withOperTime(String operTime) {
        this.operTime = operTime;
        return this;
    }

    /**
     * 最新操作时间。格式为：2020-12-12T12:00:00Z。
     * @return operTime
     */
    public String getOperTime() {
        return operTime;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MenusRsp that = (MenusRsp) obj;
        return Objects.equals(this.menuId, that.menuId) && Objects.equals(this.pubId, that.pubId)
            && Objects.equals(this.pubName, that.pubName) && Objects.equals(this.logoImg, that.logoImg)
            && Objects.equals(this.logoUrl, that.logoUrl) && Objects.equals(this.menu, that.menu)
            && Objects.equals(this.menuState, that.menuState) && Objects.equals(this.approveState, that.approveState)
            && Objects.equals(this.onlineTime, that.onlineTime) && Objects.equals(this.operTime, that.operTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(menuId, pubId, pubName, logoImg, logoUrl, menu, menuState, approveState, onlineTime, operTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MenusRsp {\n");
        sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    logoImg: ").append(toIndentedString(logoImg)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
        sb.append("    menuState: ").append(toIndentedString(menuState)).append("\n");
        sb.append("    approveState: ").append(toIndentedString(approveState)).append("\n");
        sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
        sb.append("    operTime: ").append(toIndentedString(operTime)).append("\n");
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
