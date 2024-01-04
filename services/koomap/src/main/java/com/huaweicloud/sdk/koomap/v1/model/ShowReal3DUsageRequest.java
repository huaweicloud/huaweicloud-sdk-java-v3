package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowReal3DUsageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type")

    private String usageType;

    public ShowReal3DUsageRequest withUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    /**
     * 查询的用量类型。  - DATA：时空专属存储占用空间大小。 - REAL3D：统计实景三维生产服务完成的建模的倾斜影像的像素点数量（单位为“GP”，即十亿像素）以及次数。
     * @return usageType
     */
    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReal3DUsageRequest that = (ShowReal3DUsageRequest) obj;
        return Objects.equals(this.usageType, that.usageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReal3DUsageRequest {\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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
