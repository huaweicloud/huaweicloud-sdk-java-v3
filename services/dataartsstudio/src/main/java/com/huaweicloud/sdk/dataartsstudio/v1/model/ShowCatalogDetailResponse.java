package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCatalogDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_id")

    private String catalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_total")

    private Integer catalogTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_total")

    private Integer apiTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    public ShowCatalogDetailResponse withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * 目录编号
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public ShowCatalogDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCatalogDetailResponse withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowCatalogDetailResponse withCatalogTotal(Integer catalogTotal) {
        this.catalogTotal = catalogTotal;
        return this;
    }

    /**
     * 子目录数
     * @return catalogTotal
     */
    public Integer getCatalogTotal() {
        return catalogTotal;
    }

    public void setCatalogTotal(Integer catalogTotal) {
        this.catalogTotal = catalogTotal;
    }

    public ShowCatalogDetailResponse withApiTotal(Integer apiTotal) {
        this.apiTotal = apiTotal;
        return this;
    }

    /**
     * 子API数
     * @return apiTotal
     */
    public Integer getApiTotal() {
        return apiTotal;
    }

    public void setApiTotal(Integer apiTotal) {
        this.apiTotal = apiTotal;
    }

    public ShowCatalogDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCatalogDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowCatalogDetailResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowCatalogDetailResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowCatalogDetailResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新者
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCatalogDetailResponse showCatalogDetailResponse = (ShowCatalogDetailResponse) o;
        return Objects.equals(this.catalogId, showCatalogDetailResponse.catalogId)
            && Objects.equals(this.name, showCatalogDetailResponse.name)
            && Objects.equals(this.path, showCatalogDetailResponse.path)
            && Objects.equals(this.catalogTotal, showCatalogDetailResponse.catalogTotal)
            && Objects.equals(this.apiTotal, showCatalogDetailResponse.apiTotal)
            && Objects.equals(this.description, showCatalogDetailResponse.description)
            && Objects.equals(this.createTime, showCatalogDetailResponse.createTime)
            && Objects.equals(this.createUser, showCatalogDetailResponse.createUser)
            && Objects.equals(this.updateTime, showCatalogDetailResponse.updateTime)
            && Objects.equals(this.updateUser, showCatalogDetailResponse.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId,
            name,
            path,
            catalogTotal,
            apiTotal,
            description,
            createTime,
            createUser,
            updateTime,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCatalogDetailResponse {\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    catalogTotal: ").append(toIndentedString(catalogTotal)).append("\n");
        sb.append("    apiTotal: ").append(toIndentedString(apiTotal)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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
