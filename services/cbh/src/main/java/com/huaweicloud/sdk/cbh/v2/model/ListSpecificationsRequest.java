package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSpecificationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    public ListSpecificationsRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 查询云堡垒机规格当前动作。 - create：查询可创建云堡垒机规格信息 - update：查询可变更云堡垒机规格信息
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListSpecificationsRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 云堡垒机规格信息，当action为update时此字段必填。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSpecificationsRequest that = (ListSpecificationsRequest) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.specCode, that.specCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, specCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecificationsRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
