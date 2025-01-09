package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowShareSpaceConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_show_share_space")

    private Boolean ifShowShareSpace;

    public ShowShareSpaceConfigResponse withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * 配置名称
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public ShowShareSpaceConfigResponse withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 配置值，使用Json字符串,'{\"share_space_name\":“协同空间”, \"use_share_password\":是否使用协同密码：true/false, \"allow_anonymous\":是否匿名加入协同:true/false, \"audio_and_video\":是否使用音频,\"AUDIO\"/\"NONE\"/\"AUDIO_AND_VIDEO\",\"keyboard_mouse_ctl\":云桌面是否可用键鼠true/false,\"anonymous_input_ctrl\":是否开启匿名用户键鼠输入权限true/false, \"is_user_confirm_enabled\":是否需要用户应答true/false,\"wait_confirm_time\":等待时间30-180s}'
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public ShowShareSpaceConfigResponse withIfShowShareSpace(Boolean ifShowShareSpace) {
        this.ifShowShareSpace = ifShowShareSpace;
        return this;
    }

    /**
     * 根据Apollo白名单去控制是否显示远程协助
     * @return ifShowShareSpace
     */
    public Boolean getIfShowShareSpace() {
        return ifShowShareSpace;
    }

    public void setIfShowShareSpace(Boolean ifShowShareSpace) {
        this.ifShowShareSpace = ifShowShareSpace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShareSpaceConfigResponse that = (ShowShareSpaceConfigResponse) obj;
        return Objects.equals(this.configName, that.configName) && Objects.equals(this.configValue, that.configValue)
            && Objects.equals(this.ifShowShareSpace, that.ifShowShareSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configName, configValue, ifShowShareSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShareSpaceConfigResponse {\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    ifShowShareSpace: ").append(toIndentedString(ifShowShareSpace)).append("\n");
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
