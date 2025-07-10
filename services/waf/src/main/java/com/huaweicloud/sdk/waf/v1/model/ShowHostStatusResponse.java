package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHostStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_instance_id")

    private String wafInstanceId;

    public ShowHostStatusResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 域名 **取值范围：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowHostStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 域名的防护状态 **取值范围：** - enabled：防护中，WAF根据您配置的策略进行攻击检测 - disabled：未防护，WAF只转发该域名的请求，不做攻击检测 - bypassed：该域名的请求直接到达其后端服务器，不再经过WAF
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowHostStatusResponse withWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * **参数解释：** 域名ID **取值范围：** 不涉及
     * @return wafInstanceId
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHostStatusResponse that = (ShowHostStatusResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.wafInstanceId, that.wafInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, wafInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHostStatusResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    wafInstanceId: ").append(toIndentedString(wafInstanceId)).append("\n");
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
