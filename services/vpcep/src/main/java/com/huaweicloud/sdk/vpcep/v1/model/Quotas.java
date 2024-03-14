package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建配额接口请求结构体
 */
public class Quotas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    public Quotas withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型。支持根据资源类型过滤查询指定类型的配额。  - endpoint_service：终端节点服务  - endpoint：终端节点
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Quotas withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已创建的资源个数。 取值范围：0~quota数。
     * minimum: 0
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Quotas withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 资源的最大配额数。 取值范围：各类型资源默认配额数的最大值。
     * minimum: 0
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quotas that = (Quotas) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.used, that.used)
            && Objects.equals(this.quota, that.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quotas {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
