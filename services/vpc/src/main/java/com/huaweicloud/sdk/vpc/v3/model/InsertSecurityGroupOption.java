package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class InsertSecurityGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    public InsertSecurityGroupOption withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public InsertSecurityGroupOption addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public InsertSecurityGroupOption withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 功能说明：安全组的ID列表；例如：\"security_groups\": [\"a0608cbf-d047-4f54-8b28-cd7b59853fff\"]
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public InsertSecurityGroupOption withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 安全组插入的位置，从0开始计数。 举例： 1. 要插入到已关联安全组列表的首位，index=0； 2. 要插入到已关联安全组列表的第n个安全组后面，index=n。 默认插入到端口已关联的安全组列表末尾。
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InsertSecurityGroupOption that = (InsertSecurityGroupOption) obj;
        return Objects.equals(this.securityGroups, that.securityGroups) && Objects.equals(this.index, that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroups, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsertSecurityGroupOption {\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
