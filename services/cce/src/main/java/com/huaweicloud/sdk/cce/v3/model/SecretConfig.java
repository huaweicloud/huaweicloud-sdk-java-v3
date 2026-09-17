package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecretConfig
 */
public class SecretConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disableDefaultAddonCredSecret")

    private Boolean disableDefaultAddonCredSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disableNodeAgencyCredSecret")

    private Boolean disableNodeAgencyCredSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disableDefaultImagePullSecret")

    private Boolean disableDefaultImagePullSecret;

    public SecretConfig withDisableDefaultAddonCredSecret(Boolean disableDefaultAddonCredSecret) {
        this.disableDefaultAddonCredSecret = disableDefaultAddonCredSecret;
        return this;
    }

    /**
     * **参数解释：** 是否在集群中禁用默认插件凭证（paas.elb、paas.aksk secret）。该Secret的data内容是临时AK/SK数据，部分插件在未配置自定义委托时会使用它作为IAM凭证访问其他云服务。 [更多信息请参见[禁用集群中静态存储的临时凭据说明](https://support.huaweicloud.com/usermanual-cce/cce_10_1111.html)。](tag:hws) [更多信息请参见[禁用集群中静态存储的临时凭据说明](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_1111.html)。](tag:hws_hk) **约束限制：** 仅当集群中所有需要访问云服务的插件均已配置自定义委托后，才能禁用该Secret。 **取值范围：** - true: 禁用 - false: 启用  **默认取值：** 新建集群默认true 
     * @return disableDefaultAddonCredSecret
     */
    public Boolean getDisableDefaultAddonCredSecret() {
        return disableDefaultAddonCredSecret;
    }

    public void setDisableDefaultAddonCredSecret(Boolean disableDefaultAddonCredSecret) {
        this.disableDefaultAddonCredSecret = disableDefaultAddonCredSecret;
    }

    public SecretConfig withDisableNodeAgencyCredSecret(Boolean disableNodeAgencyCredSecret) {
        this.disableNodeAgencyCredSecret = disableNodeAgencyCredSecret;
        return this;
    }

    /**
     * **参数解释：** 是否在集群中禁用节点凭证（node-agency-cred secret）。该Secret的data内容是临时AK/SK数据，节点上安装的系统组件默认使用该凭证。 [更多信息请参见[禁用集群中静态存储的临时凭据说明](https://support.huaweicloud.com/usermanual-cce/cce_10_1111.html)。](tag:hws) [更多信息请参见[禁用集群中静态存储的临时凭据说明](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_1111.html)。](tag:hws_hk) **约束限制：** 需确保已为每个节点/节点池配置委托，且委托至少具备cce:node:get、cce::assumeAgencyForPodIdentity权限，否则禁用该Secret会导致节点安装、运行异常。 **取值范围：** - true: 禁用 - false: 启用  **默认取值：** false 
     * @return disableNodeAgencyCredSecret
     */
    public Boolean getDisableNodeAgencyCredSecret() {
        return disableNodeAgencyCredSecret;
    }

    public void setDisableNodeAgencyCredSecret(Boolean disableNodeAgencyCredSecret) {
        this.disableNodeAgencyCredSecret = disableNodeAgencyCredSecret;
    }

    public SecretConfig withDisableDefaultImagePullSecret(Boolean disableDefaultImagePullSecret) {
        this.disableDefaultImagePullSecret = disableDefaultImagePullSecret;
        return this;
    }

    /**
     * **参数解释：** 是否在集群中禁用默认镜像访问凭证（default-secret secret）。该Secret的data内容是SWR临时登录指令，用于SWR的私有镜像拉取。 [更多信息请参见[禁用集群中静态存储的临时凭据说明](https://support.huaweicloud.com/usermanual-cce/cce_10_1111.html)。](tag:hws) [更多信息请参见[禁用集群中静态存储的临时凭据说明](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_1111.html)。](tag:hws_hk) **约束限制：** 需确保集群中的工作负载不使用default-secret作为镜像拉取凭证（配置了镜像免密下载或者使用自定义镜像拉取凭证），否则禁用该Secret后可能会导致镜像拉取失败。 **取值范围：** - true: 禁用 - false: 启用  **默认取值：** false 
     * @return disableDefaultImagePullSecret
     */
    public Boolean getDisableDefaultImagePullSecret() {
        return disableDefaultImagePullSecret;
    }

    public void setDisableDefaultImagePullSecret(Boolean disableDefaultImagePullSecret) {
        this.disableDefaultImagePullSecret = disableDefaultImagePullSecret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecretConfig that = (SecretConfig) obj;
        return Objects.equals(this.disableDefaultAddonCredSecret, that.disableDefaultAddonCredSecret)
            && Objects.equals(this.disableNodeAgencyCredSecret, that.disableNodeAgencyCredSecret)
            && Objects.equals(this.disableDefaultImagePullSecret, that.disableDefaultImagePullSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disableDefaultAddonCredSecret, disableNodeAgencyCredSecret, disableDefaultImagePullSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretConfig {\n");
        sb.append("    disableDefaultAddonCredSecret: ")
            .append(toIndentedString(disableDefaultAddonCredSecret))
            .append("\n");
        sb.append("    disableNodeAgencyCredSecret: ")
            .append(toIndentedString(disableNodeAgencyCredSecret))
            .append("\n");
        sb.append("    disableDefaultImagePullSecret: ")
            .append(toIndentedString(disableDefaultImagePullSecret))
            .append("\n");
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
