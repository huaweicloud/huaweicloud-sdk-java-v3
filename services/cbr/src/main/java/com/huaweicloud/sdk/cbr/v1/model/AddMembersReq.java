package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份共享目标用户的信息。
 */
public class AddMembersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<String> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    public AddMembersReq withMembers(List<String> members) {
        this.members = members;
        return this;
    }

    public AddMembersReq addMembersItem(String membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public AddMembersReq withMembers(Consumer<List<String>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 列表，待添加备份共享成员的project_id。
     * @return members
     */
    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public AddMembersReq withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public AddMembersReq addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public AddMembersReq withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 列表，待添加备份共享成员的domain_id。 > 该特性目前属于公测阶段，部分region可能无法使用.
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddMembersReq that = (AddMembersReq) obj;
        return Objects.equals(this.members, that.members) && Objects.equals(this.domains, that.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddMembersReq {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
