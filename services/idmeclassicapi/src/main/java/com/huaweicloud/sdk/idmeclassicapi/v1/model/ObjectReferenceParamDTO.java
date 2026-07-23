package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ObjectReferenceParamDTO
 */
public class ObjectReferenceParamDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clazz")

    private String clazz;

    public ObjectReferenceParamDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  数据实例ID，用于唯一标识引用的数据实例。 获取方法请参见[分页查询实例 - ShowFindUsingPost](https://support.huaweicloud.com/api-idme/ShowFindUsingPost.html)。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectReferenceParamDTO withClazz(String clazz) {
        this.clazz = clazz;
        return this;
    }

    /**
     * **参数解释：**  类名，用于指定引用对象的类类型。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return clazz
     */
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectReferenceParamDTO that = (ObjectReferenceParamDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.clazz, that.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clazz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectReferenceParamDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clazz: ").append(toIndentedString(clazz)).append("\n");
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
