package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class NeutronInsertFirewallRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule_id")

    @JacksonXmlProperty(localName = "firewall_rule_id")

    private String firewallRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_after")

    @JacksonXmlProperty(localName = "insert_after")

    private String insertAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_before")

    @JacksonXmlProperty(localName = "insert_before")

    private String insertBefore;

    public NeutronInsertFirewallRuleRequestBody withFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
        return this;
    }

    /**
     * 功能说明：网络ACL规则ID
     * @return firewallRuleId
     */
    public String getFirewallRuleId() {
        return firewallRuleId;
    }

    public void setFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
    }

    public NeutronInsertFirewallRuleRequestBody withInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
        return this;
    }

    /**
     * insert_after参数表示已经和某个policy关联的rule，新的rule将会直接被插入到insert_after参数指定的rule后面。如果insert_after和insert_before都被指定了，insert_after参数值将被忽略。
     * @return insertAfter
     */
    public String getInsertAfter() {
        return insertAfter;
    }

    public void setInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
    }

    public NeutronInsertFirewallRuleRequestBody withInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
        return this;
    }

    /**
     * insert_before参数表示已经和某个policy关联的rule，新的firewall rule将会直接被插入到insert_ before参数指定的firewall rule前面。如果insert_after和insert_before都被指定了，insert_after参数值将被忽略。
     * @return insertBefore
     */
    public String getInsertBefore() {
        return insertBefore;
    }

    public void setInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronInsertFirewallRuleRequestBody neutronInsertFirewallRuleRequestBody =
            (NeutronInsertFirewallRuleRequestBody) o;
        return Objects.equals(this.firewallRuleId, neutronInsertFirewallRuleRequestBody.firewallRuleId)
            && Objects.equals(this.insertAfter, neutronInsertFirewallRuleRequestBody.insertAfter)
            && Objects.equals(this.insertBefore, neutronInsertFirewallRuleRequestBody.insertBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRuleId, insertAfter, insertBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronInsertFirewallRuleRequestBody {\n");
        sb.append("    firewallRuleId: ").append(toIndentedString(firewallRuleId)).append("\n");
        sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
        sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
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
