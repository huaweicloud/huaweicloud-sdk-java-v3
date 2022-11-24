package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMenusRequest {

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
    @JsonProperty(value = "online_begin_time")

    private String onlineBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_end_time")

    private String onlineEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "menu_name")

    private String menuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListMenusRequest withMenuId(String menuId) {
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

    public ListMenusRequest withPubId(String pubId) {
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

    public ListMenusRequest withPubName(String pubName) {
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

    public ListMenusRequest withOnlineBeginTime(String onlineBeginTime) {
        this.onlineBeginTime = onlineBeginTime;
        return this;
    }

    /**
     * 上线开始时间。格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return onlineBeginTime
     */
    public String getOnlineBeginTime() {
        return onlineBeginTime;
    }

    public void setOnlineBeginTime(String onlineBeginTime) {
        this.onlineBeginTime = onlineBeginTime;
    }

    public ListMenusRequest withOnlineEndTime(String onlineEndTime) {
        this.onlineEndTime = onlineEndTime;
        return this;
    }

    /**
     * 上线结束时间。格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return onlineEndTime
     */
    public String getOnlineEndTime() {
        return onlineEndTime;
    }

    public void setOnlineEndTime(String onlineEndTime) {
        this.onlineEndTime = onlineEndTime;
    }

    public ListMenusRequest withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 菜单状态。  - 1：未生效  - 2：已生效  - 3：已失效  - 4：服务号已冻结 
     * minimum: 1
     * maximum: 4
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public ListMenusRequest withMenuName(String menuName) {
        this.menuName = menuName;
        return this;
    }

    /**
     * 一级菜单名称。
     * @return menuName
     */
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public ListMenusRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListMenusRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMenusRequest listMenusRequest = (ListMenusRequest) o;
        return Objects.equals(this.menuId, listMenusRequest.menuId)
            && Objects.equals(this.pubId, listMenusRequest.pubId)
            && Objects.equals(this.pubName, listMenusRequest.pubName)
            && Objects.equals(this.onlineBeginTime, listMenusRequest.onlineBeginTime)
            && Objects.equals(this.onlineEndTime, listMenusRequest.onlineEndTime)
            && Objects.equals(this.state, listMenusRequest.state)
            && Objects.equals(this.menuName, listMenusRequest.menuName)
            && Objects.equals(this.offset, listMenusRequest.offset)
            && Objects.equals(this.limit, listMenusRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, pubId, pubName, onlineBeginTime, onlineEndTime, state, menuName, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMenusRequest {\n");
        sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    onlineBeginTime: ").append(toIndentedString(onlineBeginTime)).append("\n");
        sb.append("    onlineEndTime: ").append(toIndentedString(onlineEndTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    menuName: ").append(toIndentedString(menuName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
