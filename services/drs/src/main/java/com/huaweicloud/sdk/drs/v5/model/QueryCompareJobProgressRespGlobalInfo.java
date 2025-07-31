package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 全局对比信息。
 */
public class QueryCompareJobProgressRespGlobalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_speed")

    private String srcSpeed;

    public QueryCompareJobProgressRespGlobalInfo withSrcSpeed(String srcSpeed) {
        this.srcSpeed = srcSpeed;
        return this;
    }

    /**
     * 全局对比速率。
     * @return srcSpeed
     */
    public String getSrcSpeed() {
        return srcSpeed;
    }

    public void setSrcSpeed(String srcSpeed) {
        this.srcSpeed = srcSpeed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryCompareJobProgressRespGlobalInfo that = (QueryCompareJobProgressRespGlobalInfo) obj;
        return Objects.equals(this.srcSpeed, that.srcSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCompareJobProgressRespGlobalInfo {\n");
        sb.append("    srcSpeed: ").append(toIndentedString(srcSpeed)).append("\n");
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
