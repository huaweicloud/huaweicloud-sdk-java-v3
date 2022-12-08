package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AppModel传输对象
 */
public class ModifyV2XEdgeAppDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    public ModifyV2XEdgeAppDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数说明**：应用版本，比如1.0.0，升级边缘应用版本时应确保应用版本状态为发布（PUBLISHED），查询应用版本状态方法参见：[查询应用版本详情](https://support.huaweicloud.com/api-v2x/v2x_04_0104.html)，更新应用版本状态方法参见：[更新应用版本状态](https://support.huaweicloud.com/api-v2x/v2x_04_0105.html)。  **取值范围**：只允许小写字母、数字、连接符（-）、点（.）的组合且要以小写字母或数字开头和结尾。
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyV2XEdgeAppDTO modifyV2XEdgeAppDTO = (ModifyV2XEdgeAppDTO) o;
        return Objects.equals(this.appVersion, modifyV2XEdgeAppDTO.appVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyV2XEdgeAppDTO {\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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
