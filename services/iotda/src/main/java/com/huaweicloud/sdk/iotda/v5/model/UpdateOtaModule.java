package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改OTA模块对象结构体
 */
public class UpdateOtaModule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateOtaModule withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * **参数说明**：OTA模块别名。 **取值范围**：长度不超过64，只允许中文、英文字母、数字、下划线（_）、连接符（-）、英文点（.）的组合。
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public UpdateOtaModule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：用于描述模块的功能等信息。 **取值范围**：长度不超过1024。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOtaModule that = (UpdateOtaModule) obj;
        return Objects.equals(this.aliasName, that.aliasName) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliasName, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOtaModule {\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
