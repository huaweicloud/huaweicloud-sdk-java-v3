package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseInfoItem
 */
public class DatabaseInfoItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private String dataSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_size")

    private String storageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_num")

    private Integer collectionNum;

    public DatabaseInfoItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名称, config admin 库不做展示。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseInfoItem withDataSize(String dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * 数据库存储大小（以GB为单位）,保留两位小数。 存储大小: 实际磁盘上占用的物理空间大小，包括数据文件、日志文件、索引文件等。
     * @return dataSize
     */
    public String getDataSize() {
        return dataSize;
    }

    public void setDataSize(String dataSize) {
        this.dataSize = dataSize;
    }

    public DatabaseInfoItem withStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    /**
     * 数据库逻辑大小 （以GB为单位）,保留两位小数。 逻辑大小指的是数据库中实际存储的数据大小，不包括索引大小、日志大小等。
     * @return storageSize
     */
    public String getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }

    public DatabaseInfoItem withCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
        return this;
    }

    /**
     * 数据库中的集合数。
     * @return collectionNum
     */
    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseInfoItem that = (DatabaseInfoItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.dataSize, that.dataSize)
            && Objects.equals(this.storageSize, that.storageSize)
            && Objects.equals(this.collectionNum, that.collectionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataSize, storageSize, collectionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseInfoItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
        sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
        sb.append("    collectionNum: ").append(toIndentedString(collectionNum)).append("\n");
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
