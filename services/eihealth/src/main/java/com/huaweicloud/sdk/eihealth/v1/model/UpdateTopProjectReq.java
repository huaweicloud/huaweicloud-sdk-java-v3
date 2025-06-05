package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 置顶和取消置顶空间请求体。
 */
public class UpdateTopProjectReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_top")

    private Boolean isTop;

    public UpdateTopProjectReq withIsTop(Boolean isTop) {
        this.isTop = isTop;
        return this;
    }

    /**
     * 是否置顶，true表示置顶，false表示取消置顶。
     * @return isTop
     */
    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTopProjectReq that = (UpdateTopProjectReq) obj;
        return Objects.equals(this.isTop, that.isTop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopProjectReq {\n");
        sb.append("    isTop: ").append(toIndentedString(isTop)).append("\n");
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
