package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * obs并行文件系统输出。
 */
public class PFSSummaryResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs_path")

    private String pfsPath;

    public PFSSummaryResp withPfsPath(String pfsPath) {
        this.pfsPath = pfsPath;
        return this;
    }

    /**
     * **参数解释**：obs并行文件系统路径url。 **取值范围**：不涉及。
     * @return pfsPath
     */
    public String getPfsPath() {
        return pfsPath;
    }

    public void setPfsPath(String pfsPath) {
        this.pfsPath = pfsPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PFSSummaryResp that = (PFSSummaryResp) obj;
        return Objects.equals(this.pfsPath, that.pfsPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pfsPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PFSSummaryResp {\n");
        sb.append("    pfsPath: ").append(toIndentedString(pfsPath)).append("\n");
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
