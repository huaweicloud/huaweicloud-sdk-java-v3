package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateNameRequestBody */
public class UpdateNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_instance_name")

    private String newInstanceName;

    public UpdateNameRequestBody withNewInstanceName(String newInstanceName) {
        this.newInstanceName = newInstanceName;
        return this;
    }

    /** 新实例名称。用于表示实例的名称，允许和已有名称重复。取值范围：长度为4~64位，必须以字母开头（A~Z或a~z），区分大小写，可以包含字母、数字（0~9）、中划线（-）或者下划线（_），不能包含其他特殊字符。
     * 
     * @return newInstanceName */
    public String getNewInstanceName() {
        return newInstanceName;
    }

    public void setNewInstanceName(String newInstanceName) {
        this.newInstanceName = newInstanceName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNameRequestBody updateNameRequestBody = (UpdateNameRequestBody) o;
        return Objects.equals(this.newInstanceName, updateNameRequestBody.newInstanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newInstanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNameRequestBody {\n");
        sb.append("    newInstanceName: ").append(toIndentedString(newInstanceName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
