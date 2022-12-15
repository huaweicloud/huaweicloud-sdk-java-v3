package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 简单配额资源，没有已使用值。
 */
public class SimpleResourceNoUsed {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    public SimpleResourceNoUsed withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类别。 general_instances：普通桌面 ram：内存 cores：CPU volumes：磁盘数量 volume_gigabytes：磁盘容量 gpu_instances：GPU桌面 deh：云办公主机 users：用户 policy_groups: 策略组 Cores: CPU(配额工具使用)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SimpleResourceNoUsed withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额数
     * minimum: 0
     * maximum: 2147483647
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleResourceNoUsed simpleResourceNoUsed = (SimpleResourceNoUsed) o;
        return Objects.equals(this.type, simpleResourceNoUsed.type)
            && Objects.equals(this.quota, simpleResourceNoUsed.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleResourceNoUsed {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
