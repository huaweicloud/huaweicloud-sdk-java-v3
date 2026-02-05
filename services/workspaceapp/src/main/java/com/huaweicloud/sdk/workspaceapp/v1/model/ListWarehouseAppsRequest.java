package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWarehouseAppsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_status")

    private String verifyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_category")

    private String appCategory;

    public ListWarehouseAppsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的大小[1-100]，默认值10。
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

    public ListWarehouseAppsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量，默认值0。
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

    public ListWarehouseAppsRequest withVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }

    /**
     * 审核状态： - VERIFYING：审核中 - VERIFY_PASS：审核通过 - Verify_FAIL：审核不通过
     * @return verifyStatus
     */
    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public ListWarehouseAppsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用仓库中的应用记录ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListWarehouseAppsRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListWarehouseAppsRequest withAppCategory(String appCategory) {
        this.appCategory = appCategory;
        return this;
    }

    /**
     * 应用分类： * `GAME`-  `游戏`。 * `BUSSINESS_INTELLIGENCE`- `商业智能`。 * `SECURE_STORAGE`-  `安全与存储`。 * `MULTIMEDIA_AND_CODING`- `多媒体与编解码`。 * `PROJECT_MANAGEMENT`- `项目管理`, * `PRODUCTIVITY_AND_COLLABORATION`-  `生产力与协作`。 * `WEB_ADN_APPLICATION`-  `网页与应用开发`。 * `GRAPHIC_DESIGN`-  `图形设计`。 * `OTHER`-  `其它`。
     * @return appCategory
     */
    public String getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(String appCategory) {
        this.appCategory = appCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWarehouseAppsRequest that = (ListWarehouseAppsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.verifyStatus, that.verifyStatus) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.appCategory, that.appCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, verifyStatus, appId, appName, appCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWarehouseAppsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    verifyStatus: ").append(toIndentedString(verifyStatus)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appCategory: ").append(toIndentedString(appCategory)).append("\n");
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
