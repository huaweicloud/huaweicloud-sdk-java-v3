package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EsdbCheckRdsConnectionRequestV3
 */
public class EsdbCheckRdsConnectionRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_instance_id")

    private String rdsInstanceId;

    public EsdbCheckRdsConnectionRequestV3 withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * **参数解释**：  内网地址以及端口号。  格式为xx.xx.xx.xx:xx。  **约束限制**：  不涉及  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public EsdbCheckRdsConnectionRequestV3 withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释**：  数据节点的账号名称。  **约束限制**：  不涉及  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public EsdbCheckRdsConnectionRequestV3 withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**：  数据节点的账号密码。  **约束限制**：  不涉及  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EsdbCheckRdsConnectionRequestV3 withRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }

    /**
     * **参数解释**：  rds实例ID，此参数是实例的唯一标识。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，后缀为in01，长度为36个字符。  **默认取值**：  不涉及。
     * @return rdsInstanceId
     */
    public String getRdsInstanceId() {
        return rdsInstanceId;
    }

    public void setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EsdbCheckRdsConnectionRequestV3 that = (EsdbCheckRdsConnectionRequestV3) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.username, that.username)
            && Objects.equals(this.password, that.password) && Objects.equals(this.rdsInstanceId, that.rdsInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, username, password, rdsInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsdbCheckRdsConnectionRequestV3 {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    rdsInstanceId: ").append(toIndentedString(rdsInstanceId)).append("\n");
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
