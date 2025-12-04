package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞CVE白名单列表
 */
public class CVEAllowlist {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private Integer expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<CVEAllowlistItem> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private String creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public CVEAllowlist withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 白名单ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CVEAllowlist withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 漏洞白名单列表所属的命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public CVEAllowlist withExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * 漏洞白名单的有效期时间，如果没有配置，则永不过期
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    public CVEAllowlist withItems(List<CVEAllowlistItem> items) {
        this.items = items;
        return this;
    }

    public CVEAllowlist addItemsItem(CVEAllowlistItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public CVEAllowlist withItems(Consumer<List<CVEAllowlistItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 漏洞列表
     * @return items
     */
    public List<CVEAllowlistItem> getItems() {
        return items;
    }

    public void setItems(List<CVEAllowlistItem> items) {
        this.items = items;
    }

    public CVEAllowlist withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 漏洞白名单的创建时间
     * @return creationTime
     */
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public CVEAllowlist withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 漏洞白名单的更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CVEAllowlist that = (CVEAllowlist) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.namespaceId, that.namespaceId)
            && Objects.equals(this.expiresAt, that.expiresAt) && Objects.equals(this.items, that.items)
            && Objects.equals(this.creationTime, that.creationTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namespaceId, expiresAt, items, creationTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CVEAllowlist {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
