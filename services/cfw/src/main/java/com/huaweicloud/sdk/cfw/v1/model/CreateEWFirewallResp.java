package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateEWFirewallResp
 */
public class CreateEWFirewallResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er")

    private Er er;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspertion_vpc")

    private CreateEWFirewallInspectVpcResp inspertionVpc;

    public CreateEWFirewallResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 东西向防护id，对应object_id字段 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateEWFirewallResp withEr(Er er) {
        this.er = er;
        return this;
    }

    public CreateEWFirewallResp withEr(Consumer<Er> erSetter) {
        if (this.er == null) {
            this.er = new Er();
            erSetter.accept(this.er);
        }

        return this;
    }

    /**
     * Get er
     * @return er
     */
    public Er getEr() {
        return er;
    }

    public void setEr(Er er) {
        this.er = er;
    }

    public CreateEWFirewallResp withInspertionVpc(CreateEWFirewallInspectVpcResp inspertionVpc) {
        this.inspertionVpc = inspertionVpc;
        return this;
    }

    public CreateEWFirewallResp withInspertionVpc(Consumer<CreateEWFirewallInspectVpcResp> inspertionVpcSetter) {
        if (this.inspertionVpc == null) {
            this.inspertionVpc = new CreateEWFirewallInspectVpcResp();
            inspertionVpcSetter.accept(this.inspertionVpc);
        }

        return this;
    }

    /**
     * Get inspertionVpc
     * @return inspertionVpc
     */
    public CreateEWFirewallInspectVpcResp getInspertionVpc() {
        return inspertionVpc;
    }

    public void setInspertionVpc(CreateEWFirewallInspectVpcResp inspertionVpc) {
        this.inspertionVpc = inspertionVpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEWFirewallResp that = (CreateEWFirewallResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.er, that.er)
            && Objects.equals(this.inspertionVpc, that.inspertionVpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, er, inspertionVpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEWFirewallResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    er: ").append(toIndentedString(er)).append("\n");
        sb.append("    inspertionVpc: ").append(toIndentedString(inspertionVpc)).append("\n");
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
