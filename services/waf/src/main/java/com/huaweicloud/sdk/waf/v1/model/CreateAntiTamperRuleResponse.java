package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateAntiTamperRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public CreateAntiTamperRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAntiTamperRuleResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public CreateAntiTamperRuleResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 防篡改的域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CreateAntiTamperRuleResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 防篡改的url，
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateAntiTamperRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 创建规则的时间戳
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAntiTamperRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 规则状态标识，用于指定规则的启用或关闭状态 **约束限制：** 不涉及 **取值范围：**  - 0：关闭  - 1：开启 **默认取值：** 不涉及
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAntiTamperRuleResponse that = (CreateAntiTamperRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.policyid, that.policyid)
            && Objects.equals(this.hostname, that.hostname) && Objects.equals(this.url, that.url)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, hostname, url, description, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAntiTamperRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
