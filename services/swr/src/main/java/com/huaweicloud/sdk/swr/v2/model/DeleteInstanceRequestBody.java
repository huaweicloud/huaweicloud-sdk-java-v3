package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteInstanceRequestBody
 */
public class DeleteInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_obs")

    private Boolean deleteObs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_dns")

    private Boolean deleteDns;

    public DeleteInstanceRequestBody withDeleteObs(Boolean deleteObs) {
        this.deleteObs = deleteObs;
        return this;
    }

    /**
     * 是否删除obs桶
     * @return deleteObs
     */
    public Boolean getDeleteObs() {
        return deleteObs;
    }

    public void setDeleteObs(Boolean deleteObs) {
        this.deleteObs = deleteObs;
    }

    public DeleteInstanceRequestBody withDeleteDns(Boolean deleteDns) {
        this.deleteDns = deleteDns;
        return this;
    }

    /**
     * 是否删除DNS域名信息
     * @return deleteDns
     */
    public Boolean getDeleteDns() {
        return deleteDns;
    }

    public void setDeleteDns(Boolean deleteDns) {
        this.deleteDns = deleteDns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteInstanceRequestBody that = (DeleteInstanceRequestBody) obj;
        return Objects.equals(this.deleteObs, that.deleteObs) && Objects.equals(this.deleteDns, that.deleteDns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteObs, deleteDns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstanceRequestBody {\n");
        sb.append("    deleteObs: ").append(toIndentedString(deleteObs)).append("\n");
        sb.append("    deleteDns: ").append(toIndentedString(deleteDns)).append("\n");
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
