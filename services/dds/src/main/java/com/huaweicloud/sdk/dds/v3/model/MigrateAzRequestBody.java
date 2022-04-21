package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MigrateAzRequestBody
 */
public class MigrateAzRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_azs")

    private String targetAzs;

    public MigrateAzRequestBody withTargetAzs(String targetAzs) {
        this.targetAzs = targetAzs;
        return this;
    }

    /**
     * 迁移到的目标单az或者多az，请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)。
     * @return targetAzs
     */
    public String getTargetAzs() {
        return targetAzs;
    }

    public void setTargetAzs(String targetAzs) {
        this.targetAzs = targetAzs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateAzRequestBody migrateAzRequestBody = (MigrateAzRequestBody) o;
        return Objects.equals(this.targetAzs, migrateAzRequestBody.targetAzs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetAzs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateAzRequestBody {\n");
        sb.append("    targetAzs: ").append(toIndentedString(targetAzs)).append("\n");
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
