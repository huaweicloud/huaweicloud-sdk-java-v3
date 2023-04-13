package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AzCodeInfo
 */
public class AzCodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    public AzCodeInfo withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区编码。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AzCodeInfo azCodeInfo = (AzCodeInfo) o;
        return Objects.equals(this.azCode, azCodeInfo.azCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzCodeInfo {\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
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
