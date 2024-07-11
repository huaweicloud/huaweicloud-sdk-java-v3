package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 禁用/取消禁用应用请求体
 */
public class UpdateAppDisableStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_disable")

    private Boolean isDisable;

    public UpdateAppDisableStatusRequestBody withIsDisable(Boolean isDisable) {
        this.isDisable = isDisable;
        return this;
    }

    /**
     * 是否禁用， true禁用， false取消禁用
     * @return isDisable
     */
    public Boolean getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Boolean isDisable) {
        this.isDisable = isDisable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAppDisableStatusRequestBody that = (UpdateAppDisableStatusRequestBody) obj;
        return Objects.equals(this.isDisable, that.isDisable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDisable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppDisableStatusRequestBody {\n");
        sb.append("    isDisable: ").append(toIndentedString(isDisable)).append("\n");
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
