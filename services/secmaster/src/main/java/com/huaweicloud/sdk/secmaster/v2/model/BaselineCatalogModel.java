package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BaselineCatalogModel
 */
public class BaselineCatalogModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private Integer serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_number")

    private Integer levelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root")

    private String root;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent")

    private String parent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_leaf")

    private Boolean isLeaf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_items")

    private List<CheckitemCatalogModel> checkItems = null;

    public BaselineCatalogModel withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 目录ID唯一标识，UUID
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BaselineCatalogModel withSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 目录的位置顺序
     * minimum: 0
     * maximum: 99
     * @return serialNumber
     */
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BaselineCatalogModel withLevelNumber(Integer levelNumber) {
        this.levelNumber = levelNumber;
        return this;
    }

    /**
     * 目录的层级关系
     * minimum: 0
     * maximum: 99
     * @return levelNumber
     */
    public Integer getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(Integer levelNumber) {
        this.levelNumber = levelNumber;
    }

    public BaselineCatalogModel withRoot(String root) {
        this.root = root;
        return this;
    }

    /**
     * 该目录所在遵从包UUID
     * @return root
     */
    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public BaselineCatalogModel withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * 该目录的父目录UUID，如果等于为第一层目录，则为遵从包UUID
     * @return parent
     */
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public BaselineCatalogModel withIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
        return this;
    }

    /**
     * 该目录是否是叶子节点 0：不是 1：是
     * @return isLeaf
     */
    public Boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public BaselineCatalogModel withCheckItems(List<CheckitemCatalogModel> checkItems) {
        this.checkItems = checkItems;
        return this;
    }

    public BaselineCatalogModel addCheckItemsItem(CheckitemCatalogModel checkItemsItem) {
        if (this.checkItems == null) {
            this.checkItems = new ArrayList<>();
        }
        this.checkItems.add(checkItemsItem);
        return this;
    }

    public BaselineCatalogModel withCheckItems(Consumer<List<CheckitemCatalogModel>> checkItemsSetter) {
        if (this.checkItems == null) {
            this.checkItems = new ArrayList<>();
        }
        checkItemsSetter.accept(this.checkItems);
        return this;
    }

    /**
     * 目录关联的检查项
     * @return checkItems
     */
    public List<CheckitemCatalogModel> getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(List<CheckitemCatalogModel> checkItems) {
        this.checkItems = checkItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaselineCatalogModel that = (BaselineCatalogModel) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.levelNumber, that.levelNumber) && Objects.equals(this.root, that.root)
            && Objects.equals(this.parent, that.parent) && Objects.equals(this.isLeaf, that.isLeaf)
            && Objects.equals(this.checkItems, that.checkItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, serialNumber, levelNumber, root, parent, isLeaf, checkItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaselineCatalogModel {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    levelNumber: ").append(toIndentedString(levelNumber)).append("\n");
        sb.append("    root: ").append(toIndentedString(root)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    isLeaf: ").append(toIndentedString(isLeaf)).append("\n");
        sb.append("    checkItems: ").append(toIndentedString(checkItems)).append("\n");
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
