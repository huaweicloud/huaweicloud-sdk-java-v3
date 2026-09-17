package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 敏感操作开关请求体
 */
public class UpdateSensitiveOperationSwitchRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    private Boolean isOpen;

    public UpdateSensitiveOperationSwitchRequestBody withIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * 是否开启
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSensitiveOperationSwitchRequestBody that = (UpdateSensitiveOperationSwitchRequestBody) obj;
        return Objects.equals(this.isOpen, that.isOpen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSensitiveOperationSwitchRequestBody {\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
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
