package com.huaweicloud.sdk.dss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_id")

    private String dssId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Boolean usage;

    public ShowPoolRequest withDssId(String dssId) {
        this.dssId = dssId;
        return this;
    }

    /**
     * 专属分布式存储池ID。
     * @return dssId
     */
    public String getDssId() {
        return dssId;
    }

    public void setDssId(String dssId) {
        this.dssId = dssId;
    }

    public ShowPoolRequest withUsage(Boolean usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 当usage=true时，返回值带有专属分布式存储池容量信息，默认为false。
     * @return usage
     */
    public Boolean getUsage() {
        return usage;
    }

    public void setUsage(Boolean usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPoolRequest that = (ShowPoolRequest) obj;
        return Objects.equals(this.dssId, that.dssId) && Objects.equals(this.usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dssId, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPoolRequest {\n");
        sb.append("    dssId: ").append(toIndentedString(dssId)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
