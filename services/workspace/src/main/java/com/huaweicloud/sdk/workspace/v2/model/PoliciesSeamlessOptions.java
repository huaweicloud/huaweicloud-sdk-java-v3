package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 通用音视频设置项。
 */
public class PoliciesSeamlessOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seamless_apply_path")

    private String seamlessApplyPath;

    public PoliciesSeamlessOptions withSeamlessApplyPath(String seamlessApplyPath) {
        this.seamlessApplyPath = seamlessApplyPath;
        return this;
    }

    /**
     * 软件路径。长度不能超过1000个字符。
     * @return seamlessApplyPath
     */
    public String getSeamlessApplyPath() {
        return seamlessApplyPath;
    }

    public void setSeamlessApplyPath(String seamlessApplyPath) {
        this.seamlessApplyPath = seamlessApplyPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesSeamlessOptions that = (PoliciesSeamlessOptions) obj;
        return Objects.equals(this.seamlessApplyPath, that.seamlessApplyPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seamlessApplyPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesSeamlessOptions {\n");
        sb.append("    seamlessApplyPath: ").append(toIndentedString(seamlessApplyPath)).append("\n");
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
