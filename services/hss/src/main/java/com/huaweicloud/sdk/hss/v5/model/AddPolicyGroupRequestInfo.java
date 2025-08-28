package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 复制的策略组信息
 */
public class AddPolicyGroupRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public AddPolicyGroupRequestInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 策略组的描述信息 **约束限制**: 不涉及 **取值范围**: 字符长度1-64，只能由中文字符、英文字母、数字、逗号、句号、空格及\"_\"、\"-\"组成 **默认取值**: 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddPolicyGroupRequestInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 策略组名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-32，只能由中文字符、英文字母、数字、逗号、句号、空格及\"_\"、\"-\"组成，且不能以default_policy_group开头 **默认取值**: 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddPolicyGroupRequestInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**: 需要被复制的策略组的策略组ID，仅旗舰版和容器版策略组支持复制 **约束限制**: 需要使用 ListPolicyGroup 接口查询旗舰版和容器版策略组，在 ListPolicyGroup 接口的响应体中，support_version 等于 hss.version.container.enterprise 或 hss.version.premium 的 group_id 是可以被复制的策略组ID **取值范围**: 字符长度36-64 **默认取值**: 不涉及
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddPolicyGroupRequestInfo that = (AddPolicyGroupRequestInfo) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPolicyGroupRequestInfo {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
