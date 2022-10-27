package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateIpRequestBody
 */
public class CreateIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public CreateIpRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 待打开IP开关的对象类型。 - 扩容shard组时，取值为“shard”。 - 扩容config组时，取值为“config”。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateIpRequestBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * Shard组ID 注意：   1. 第一次添加Shard/Config IP时，该参数不传。   2. 对于已经添加过Shard IP的实例，需要传入该参数为新扩容的Shard组添加IP。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public CreateIpRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 打开集群开关设置的密码。 注意：该密码暂不支持修改，请谨慎操作。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIpRequestBody createIpRequestBody = (CreateIpRequestBody) o;
        return Objects.equals(this.type, createIpRequestBody.type)
            && Objects.equals(this.targetId, createIpRequestBody.targetId)
            && Objects.equals(this.password, createIpRequestBody.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, targetId, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIpRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
