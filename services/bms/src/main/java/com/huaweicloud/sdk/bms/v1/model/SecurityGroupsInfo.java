package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * security_groups字段数据结构说明
 */
public class SecurityGroupsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    public SecurityGroupsInfo withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * 裸金属服务器对应的安全组ID，对创建裸金属服务器中配置的所有网卡生效。当该参数未指定时默认给裸金属服务器绑定default安全组。当该参数传值（UUID格式）时需要指定已有安全组的ID。获取已有安全组的方法请参见《虚拟私有云API参考》的“查询安全组列表”章节。
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityGroupsInfo securityGroupsInfo = (SecurityGroupsInfo) o;
        return Objects.equals(this.id, securityGroupsInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupsInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
