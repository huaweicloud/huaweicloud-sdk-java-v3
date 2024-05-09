package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库更新请求体
 */
public class UpdateDrugDatabaseReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private Boolean shareable;

    public UpdateDrugDatabaseReq withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    /**
     * 是否共享
     * @return shareable
     */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDrugDatabaseReq that = (UpdateDrugDatabaseReq) obj;
        return Objects.equals(this.shareable, that.shareable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDrugDatabaseReq {\n");
        sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
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
