package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AgenciesPrimitiveTypeHolder
 */
public class AgenciesPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencies")

    private List<Agency> agencies = null;

    public AgenciesPrimitiveTypeHolder withAgencies(List<Agency> agencies) {
        this.agencies = agencies;
        return this;
    }

    public AgenciesPrimitiveTypeHolder addAgenciesItem(Agency agenciesItem) {
        if (this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        this.agencies.add(agenciesItem);
        return this;
    }

    public AgenciesPrimitiveTypeHolder withAgencies(Consumer<List<Agency>> agenciesSetter) {
        if (this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        agenciesSetter.accept(this.agencies);
        return this;
    }

    /**
     * 委托授权的信息。  RFS仅在创建资源栈（触发部署）、创建执行计划、部署资源栈、删除资源栈等涉及资源操作的请求中使用委托，且该委托仅作用于与之绑定的Provider对资源的操作中。如果委托中提供的权限不足，有可能导致相关资源操作失败。  [[创建委托及授权方式](https://support.huaweicloud.com/usermanual-iam/iam_06_0002.html)](tag:hws) [[创建委托及授权方式](https://support.huaweicloud.com/intl/zh-cn/usermanual-iam/iam_06_0002.html)](tag:hws_hk) [[创建委托及授权方式](https://support.huaweicloud.com/eu/usermanual-iam/iam_06_0002.html)](tag:hws_eu)
     * @return agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgenciesPrimitiveTypeHolder that = (AgenciesPrimitiveTypeHolder) obj;
        return Objects.equals(this.agencies, that.agencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgenciesPrimitiveTypeHolder {\n");
        sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
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
