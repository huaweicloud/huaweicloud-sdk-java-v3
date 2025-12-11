package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ValidateConfigurationNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_existed")

    private Boolean isExisted;

    public ValidateConfigurationNameResponse withIsExisted(Boolean isExisted) {
        this.isExisted = isExisted;
        return this;
    }

    /**
     * **参数解释：** 参数组名称是否存在。 **取值范围：** - true：参数组名称存在。 - false：参数组名称不存在。
     * @return isExisted
     */
    public Boolean getIsExisted() {
        return isExisted;
    }

    public void setIsExisted(Boolean isExisted) {
        this.isExisted = isExisted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateConfigurationNameResponse that = (ValidateConfigurationNameResponse) obj;
        return Objects.equals(this.isExisted, that.isExisted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExisted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateConfigurationNameResponse {\n");
        sb.append("    isExisted: ").append(toIndentedString(isExisted)).append("\n");
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
