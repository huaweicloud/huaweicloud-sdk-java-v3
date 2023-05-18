package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建设备组请求结构体
 */
public class AddDeviceGroupDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_group_id")

    private String superGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamic_group_rule")

    private String dynamicGroupRule;

    public AddDeviceGroupDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：设备组名称，单个资源空间下不可重复。 **取值范围**：长度不超过64，只允许中文、字母、数字、以及_? '#().,&%@!-等字符的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddDeviceGroupDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：设备组描述。 **取值范围**：长度不超过64，只允许中文、字母、数字、以及_? '#().,&%@!-等字符的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddDeviceGroupDTO withSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
        return this;
    }

    /**
     * **参数说明**：父设备组ID，携带该参数时表示在该设备组下创建一个子设备组。 **取值范围**：长度不超过36，十六进制字符串和连接符（-）的组合。
     * @return superGroupId
     */
    public String getSuperGroupId() {
        return superGroupId;
    }

    public void setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
    }

    public AddDeviceGroupDTO withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的设备组归属到哪个资源空间下，否则创建的设备组将会归属到[[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)](tag:hws)[[默认资源空间](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_0006.html#section0)](tag:hws_hk)下。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AddDeviceGroupDTO withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * **参数说明**：设备组类型，默认为静态设备组；当设备组类型为动态设备组时，需要填写动态设备组组规则
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public AddDeviceGroupDTO withDynamicGroupRule(String dynamicGroupRule) {
        this.dynamicGroupRule = dynamicGroupRule;
        return this;
    }

    /**
     * **参数说明**：动态设备组规则语法和高级搜索保持一致，只需要填写where 子句内容，其余子句无需填写，todo补充说明
     * @return dynamicGroupRule
     */
    public String getDynamicGroupRule() {
        return dynamicGroupRule;
    }

    public void setDynamicGroupRule(String dynamicGroupRule) {
        this.dynamicGroupRule = dynamicGroupRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDeviceGroupDTO addDeviceGroupDTO = (AddDeviceGroupDTO) o;
        return Objects.equals(this.name, addDeviceGroupDTO.name)
            && Objects.equals(this.description, addDeviceGroupDTO.description)
            && Objects.equals(this.superGroupId, addDeviceGroupDTO.superGroupId)
            && Objects.equals(this.appId, addDeviceGroupDTO.appId)
            && Objects.equals(this.groupType, addDeviceGroupDTO.groupType)
            && Objects.equals(this.dynamicGroupRule, addDeviceGroupDTO.dynamicGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, superGroupId, appId, groupType, dynamicGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDeviceGroupDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    superGroupId: ").append(toIndentedString(superGroupId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    dynamicGroupRule: ").append(toIndentedString(dynamicGroupRule)).append("\n");
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
