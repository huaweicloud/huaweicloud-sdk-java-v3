package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StorageMap
 */
public class StorageMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalStorage")

    private String totalStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalCount")

    private Integer totalCount;

    public StorageMap withTotalStorage(String totalStorage) {
        this.totalStorage = totalStorage;
        return this;
    }

    /**
     * **参数解释**： 存储大小。  **取值范围**： 不涉及。
     * @return totalStorage
     */
    public String getTotalStorage() {
        return totalStorage;
    }

    public void setTotalStorage(String totalStorage) {
        this.totalStorage = totalStorage;
    }

    public StorageMap withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**： 文件数量。  **取值范围**： 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageMap that = (StorageMap) obj;
        return Objects.equals(this.totalStorage, that.totalStorage) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalStorage, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageMap {\n");
        sb.append("    totalStorage: ").append(toIndentedString(totalStorage)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
