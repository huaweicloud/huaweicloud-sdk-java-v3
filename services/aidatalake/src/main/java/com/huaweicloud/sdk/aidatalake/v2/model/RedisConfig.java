package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Redis集群配置，目前仅支持DCS。
 */
public class RedisConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dew_secret_name")

    private String dewSecretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_id")

    private String dcsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_service_id")

    private String vpcepServiceId;

    public RedisConfig withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释**：账号名称。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字及特殊字符，长度为1~64个字符。 **默认取值**：default。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RedisConfig withDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
        return this;
    }

    /**
     * **参数解释**：DEW的凭据名称。存储着DCS账号的密码，格式为：凭据键为password，值为实际的密码。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字及特殊字符，长度为1~64个字符。 **默认取值**：不涉及。
     * @return dewSecretName
     */
    public String getDewSecretName() {
        return dewSecretName;
    }

    public void setDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
    }

    public RedisConfig withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * **参数解释**：是否开启SSL。 **约束限制**：不涉及。 **取值范围**：   - true：开启SSL。   - false：关闭SSL。 **默认取值**：true。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public RedisConfig withDcsId(String dcsId) {
        this.dcsId = dcsId;
        return this;
    }

    /**
     * **参数解释**：DCS实例的ID。获取方式：在DCS控制台实例详情页查看，或通过调用查询DCS实例列表接口获取。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字及中划线，长度为4~1024个字符。 **默认取值**：不涉及。
     * @return dcsId
     */
    public String getDcsId() {
        return dcsId;
    }

    public void setDcsId(String dcsId) {
        this.dcsId = dcsId;
    }

    public RedisConfig withVpcepServiceId(String vpcepServiceId) {
        this.vpcepServiceId = vpcepServiceId;
        return this;
    }

    /**
     * **参数解释**：VPCEP服务端ID，用于连接客户侧网络。获取方式：在VPCEP控制台查看，或通过调用查询VPCEP服务列表接口获取。开启GCS高可用时必填，用于通过VPCEP方式连接客户侧DCS。 **约束限制**：开启GCS高可用时必填。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return vpcepServiceId
     */
    public String getVpcepServiceId() {
        return vpcepServiceId;
    }

    public void setVpcepServiceId(String vpcepServiceId) {
        this.vpcepServiceId = vpcepServiceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisConfig that = (RedisConfig) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.dewSecretName, that.dewSecretName)
            && Objects.equals(this.sslEnable, that.sslEnable) && Objects.equals(this.dcsId, that.dcsId)
            && Objects.equals(this.vpcepServiceId, that.vpcepServiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, dewSecretName, sslEnable, dcsId, vpcepServiceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisConfig {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    dewSecretName: ").append(toIndentedString(dewSecretName)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    dcsId: ").append(toIndentedString(dcsId)).append("\n");
        sb.append("    vpcepServiceId: ").append(toIndentedString(vpcepServiceId)).append("\n");
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
