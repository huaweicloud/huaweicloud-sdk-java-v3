package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradePathsResult
 */
public class UpgradePathsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_version")

    private String startVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_version")

    private String endVersion;

    public UpgradePathsResult withStartVersion(String startVersion) {
        this.startVersion = startVersion;
        return this;
    }

    /**
     * **参数解释**: 源引擎版本号。 **取值范围**: 不涉及 
     * @return startVersion
     */
    public String getStartVersion() {
        return startVersion;
    }

    public void setStartVersion(String startVersion) {
        this.startVersion = startVersion;
    }

    public UpgradePathsResult withEndVersion(String endVersion) {
        this.endVersion = endVersion;
        return this;
    }

    /**
     * **参数解释**: 目标引擎版本号。 **取值范围**: 不涉及 
     * @return endVersion
     */
    public String getEndVersion() {
        return endVersion;
    }

    public void setEndVersion(String endVersion) {
        this.endVersion = endVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradePathsResult that = (UpgradePathsResult) obj;
        return Objects.equals(this.startVersion, that.startVersion) && Objects.equals(this.endVersion, that.endVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startVersion, endVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradePathsResult {\n");
        sb.append("    startVersion: ").append(toIndentedString(startVersion)).append("\n");
        sb.append("    endVersion: ").append(toIndentedString(endVersion)).append("\n");
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
