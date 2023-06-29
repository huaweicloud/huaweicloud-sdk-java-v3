package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowResourcesDetailResponseBody
 */
public class ShowResourcesDetailResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public ShowResourcesDetailResponseBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 配额资源类型，当前配额类型仅支持实例类型（instance）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowResourcesDetailResponseBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 实例类型： - 若值为“Single”，则表示单节点实例配额信息。 - 若值为“ReplicaSet”，则表示副本集实例配额信息。 - 若值为“Sharding”，则表示集群实例配额信息。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ShowResourcesDetailResponseBody withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 当前配额值。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ShowResourcesDetailResponseBody withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用的资源数。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourcesDetailResponseBody that = (ShowResourcesDetailResponseBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.quota, that.quota) && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, mode, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourcesDetailResponseBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
