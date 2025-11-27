package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class EnableFederationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clustergroupid")

    private String clustergroupid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryjoinall")

    private Boolean retryjoinall;

    public EnableFederationRequest withClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
        return this;
    }

    /**
     * 容器舰队id
     * @return clustergroupid
     */
    public String getClustergroupid() {
        return clustergroupid;
    }

    public void setClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
    }

    public EnableFederationRequest withRetryjoinall(Boolean retryjoinall) {
        this.retryjoinall = retryjoinall;
        return this;
    }

    /**
     * 是否重试集群加入联邦
     * @return retryjoinall
     */
    public Boolean getRetryjoinall() {
        return retryjoinall;
    }

    public void setRetryjoinall(Boolean retryjoinall) {
        this.retryjoinall = retryjoinall;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableFederationRequest that = (EnableFederationRequest) obj;
        return Objects.equals(this.clustergroupid, that.clustergroupid)
            && Objects.equals(this.retryjoinall, that.retryjoinall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clustergroupid, retryjoinall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableFederationRequest {\n");
        sb.append("    clustergroupid: ").append(toIndentedString(clustergroupid)).append("\n");
        sb.append("    retryjoinall: ").append(toIndentedString(retryjoinall)).append("\n");
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
