package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEcsSpecificationNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_business_type")

    private Integer imageBusinessType;

    public ListEcsSpecificationNewRequest withImageBusinessType(Integer imageBusinessType) {
        this.imageBusinessType = imageBusinessType;
        return this;
    }

    /**
     * **参数解释**： 镜像类型。 **约束限制**： 以取值范围为准 **取值范围**： - 1：运维 - 2：加密 - 3：审计 **默认取值**：   不传则默认为审计 
     * @return imageBusinessType
     */
    public Integer getImageBusinessType() {
        return imageBusinessType;
    }

    public void setImageBusinessType(Integer imageBusinessType) {
        this.imageBusinessType = imageBusinessType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcsSpecificationNewRequest that = (ListEcsSpecificationNewRequest) obj;
        return Objects.equals(this.imageBusinessType, that.imageBusinessType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageBusinessType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcsSpecificationNewRequest {\n");
        sb.append("    imageBusinessType: ").append(toIndentedString(imageBusinessType)).append("\n");
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
