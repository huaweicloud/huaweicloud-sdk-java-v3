package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MysqlVolume
 */
public class MysqlVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public MysqlVolume withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：  磁盘大小，单位GB。  **约束限制**：  必须为10的整数倍。创建按需实例时不可选。  **取值范围**：  10-128000。  **默认取值**：  10。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public MysqlVolume withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  磁盘存储类型。  **约束限制**：  不涉及。  **取值范围**：  - DL6：DL6存储类型。 - DL5：DL5存储类型。  **默认取值**：  DL6。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlVolume that = (MysqlVolume) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlVolume {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
