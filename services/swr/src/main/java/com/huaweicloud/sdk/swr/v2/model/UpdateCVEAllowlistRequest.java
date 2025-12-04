package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新漏洞CVE白名单列表的请求
 */
public class UpdateCVEAllowlistRequest {

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

    public UpdateCVEAllowlistRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 白名单ID，查询命名空间信息时，会返回白名单ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateCVEAllowlistRequest withNamespaceId(Integer namespaceId) {
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

    public UpdateCVEAllowlistRequest withExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * 漏洞白名单的有效期时间，以自 1970 年 1 月 1 日以来的秒数表示；如果没有配置，则永不过期
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    public UpdateCVEAllowlistRequest withItems(List<CVEAllowlistItem> items) {
        this.items = items;
        return this;
    }

    public UpdateCVEAllowlistRequest addItemsItem(CVEAllowlistItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public UpdateCVEAllowlistRequest withItems(Consumer<List<CVEAllowlistItem>> itemsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCVEAllowlistRequest that = (UpdateCVEAllowlistRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.namespaceId, that.namespaceId)
            && Objects.equals(this.expiresAt, that.expiresAt) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namespaceId, expiresAt, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCVEAllowlistRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
