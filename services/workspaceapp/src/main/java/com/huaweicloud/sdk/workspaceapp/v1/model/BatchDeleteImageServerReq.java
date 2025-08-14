package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除镜像实例请求。 * 忽略不存在的镜像实例，响应正常。 * 不允许操作状态为 &#x60;创建中&#x60;、&#x60;镜像创建中&#x60;的实例，响应异常。 * 不支持资源关联发生变化后，请求删除镜像实例关联资源，任务响应异常。
 */
public class BatchDeleteImageServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<String> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recursive")

    private Boolean recursive;

    public BatchDeleteImageServerReq withItems(List<String> items) {
        this.items = items;
        return this;
    }

    public BatchDeleteImageServerReq addItemsItem(String itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public BatchDeleteImageServerReq withItems(Consumer<List<String>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 批量唯一标识请求列表，一次请求数量区间 [1, 20]。
     * @return items
     */
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public BatchDeleteImageServerReq withRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * 是否同时删除镜像实例关联资源： **⚠ 警告: 关联资源删除，对应的应用将不可用** * `true` 同时删除关联资源，包括APS服务器组，APS服务器，应用组相关资源。镜像产物相关信息保留。 * `false` 只删除镜像实例记录，保留关联资源。
     * @return recursive
     */
    public Boolean getRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteImageServerReq that = (BatchDeleteImageServerReq) obj;
        return Objects.equals(this.items, that.items) && Objects.equals(this.recursive, that.recursive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, recursive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteImageServerReq {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
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
