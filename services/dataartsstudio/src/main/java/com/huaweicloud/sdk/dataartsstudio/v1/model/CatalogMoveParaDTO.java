package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CatalogMoveParaDTO
 */
public class CatalogMoveParaDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_pid")

    private String targetPid;

    public CatalogMoveParaDTO withTargetPid(String targetPid) {
        this.targetPid = targetPid;
        return this;
    }

    /**
     * 父目录编号
     * @return targetPid
     */
    public String getTargetPid() {
        return targetPid;
    }

    public void setTargetPid(String targetPid) {
        this.targetPid = targetPid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogMoveParaDTO catalogMoveParaDTO = (CatalogMoveParaDTO) o;
        return Objects.equals(this.targetPid, catalogMoveParaDTO.targetPid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetPid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogMoveParaDTO {\n");
        sb.append("    targetPid: ").append(toIndentedString(targetPid)).append("\n");
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
