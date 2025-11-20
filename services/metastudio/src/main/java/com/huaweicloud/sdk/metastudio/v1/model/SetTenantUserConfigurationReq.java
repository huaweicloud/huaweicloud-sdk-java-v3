package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置租户个性化配置请求
 */
public class SetTenantUserConfigurationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "my_collections")

    private List<CollectionInfo> myCollections = null;

    public SetTenantUserConfigurationReq withMyCollections(List<CollectionInfo> myCollections) {
        this.myCollections = myCollections;
        return this;
    }

    public SetTenantUserConfigurationReq addMyCollectionsItem(CollectionInfo myCollectionsItem) {
        if (this.myCollections == null) {
            this.myCollections = new ArrayList<>();
        }
        this.myCollections.add(myCollectionsItem);
        return this;
    }

    public SetTenantUserConfigurationReq withMyCollections(Consumer<List<CollectionInfo>> myCollectionsSetter) {
        if (this.myCollections == null) {
            this.myCollections = new ArrayList<>();
        }
        myCollectionsSetter.accept(this.myCollections);
        return this;
    }

    /**
     * 我的收藏列表
     * @return myCollections
     */
    public List<CollectionInfo> getMyCollections() {
        return myCollections;
    }

    public void setMyCollections(List<CollectionInfo> myCollections) {
        this.myCollections = myCollections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetTenantUserConfigurationReq that = (SetTenantUserConfigurationReq) obj;
        return Objects.equals(this.myCollections, that.myCollections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myCollections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetTenantUserConfigurationReq {\n");
        sb.append("    myCollections: ").append(toIndentedString(myCollections)).append("\n");
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
