package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 磁盘扩容后单节点有效存储容量（GB / 节点），集群总容量 &#x3D; 单节点容量 x 节点数量。
 */
public class ExpandInstanceStorage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_size")

    private Integer newSize;

    public ExpandInstanceStorage withNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }

    /**
     * 磁盘扩容后单节点有效存储容量（GB / 节点）。该容量必须大于当前单节点有效容量，小于等于集群规格支持的单节点最大容量，扩容容量为规格支持的步长倍数。集群规格配置详情可根据“查询节点类型”查询。
     * @return newSize
     */
    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandInstanceStorage expandInstanceStorage = (ExpandInstanceStorage) o;
        return Objects.equals(this.newSize, expandInstanceStorage.newSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandInstanceStorage {\n");
        sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
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
