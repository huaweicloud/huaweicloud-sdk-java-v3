package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享目录分配关联对象。
 */
public class AssignShareFolderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_claim_id")

    private String storageClaimId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_items")

    private List<Assignment> addItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_items")

    private List<Attachment> delItems = null;

    public AssignShareFolderReq withStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
        return this;
    }

    /**
     * WKS存储目录声明ID。
     * @return storageClaimId
     */
    public String getStorageClaimId() {
        return storageClaimId;
    }

    public void setStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
    }

    public AssignShareFolderReq withAddItems(List<Assignment> addItems) {
        this.addItems = addItems;
        return this;
    }

    public AssignShareFolderReq addAddItemsItem(Assignment addItemsItem) {
        if (this.addItems == null) {
            this.addItems = new ArrayList<>();
        }
        this.addItems.add(addItemsItem);
        return this;
    }

    public AssignShareFolderReq withAddItems(Consumer<List<Assignment>> addItemsSetter) {
        if (this.addItems == null) {
            this.addItems = new ArrayList<>();
        }
        addItemsSetter.accept(this.addItems);
        return this;
    }

    /**
     * 增加的成员列表。
     * @return addItems
     */
    public List<Assignment> getAddItems() {
        return addItems;
    }

    public void setAddItems(List<Assignment> addItems) {
        this.addItems = addItems;
    }

    public AssignShareFolderReq withDelItems(List<Attachment> delItems) {
        this.delItems = delItems;
        return this;
    }

    public AssignShareFolderReq addDelItemsItem(Attachment delItemsItem) {
        if (this.delItems == null) {
            this.delItems = new ArrayList<>();
        }
        this.delItems.add(delItemsItem);
        return this;
    }

    public AssignShareFolderReq withDelItems(Consumer<List<Attachment>> delItemsSetter) {
        if (this.delItems == null) {
            this.delItems = new ArrayList<>();
        }
        delItemsSetter.accept(this.delItems);
        return this;
    }

    /**
     * 移除的成员列表。
     * @return delItems
     */
    public List<Attachment> getDelItems() {
        return delItems;
    }

    public void setDelItems(List<Attachment> delItems) {
        this.delItems = delItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssignShareFolderReq that = (AssignShareFolderReq) obj;
        return Objects.equals(this.storageClaimId, that.storageClaimId) && Objects.equals(this.addItems, that.addItems)
            && Objects.equals(this.delItems, that.delItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageClaimId, addItems, delItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignShareFolderReq {\n");
        sb.append("    storageClaimId: ").append(toIndentedString(storageClaimId)).append("\n");
        sb.append("    addItems: ").append(toIndentedString(addItems)).append("\n");
        sb.append("    delItems: ").append(toIndentedString(delItems)).append("\n");
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
