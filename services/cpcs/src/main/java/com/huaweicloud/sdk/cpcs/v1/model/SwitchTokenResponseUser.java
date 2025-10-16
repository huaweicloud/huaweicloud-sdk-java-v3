package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户信息
 */
public class SwitchTokenResponseUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private SwitchTokenResponseUserDomain domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public SwitchTokenResponseUser withDomain(SwitchTokenResponseUserDomain domain) {
        this.domain = domain;
        return this;
    }

    public SwitchTokenResponseUser withDomain(Consumer<SwitchTokenResponseUserDomain> domainSetter) {
        if (this.domain == null) {
            this.domain = new SwitchTokenResponseUserDomain();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public SwitchTokenResponseUserDomain getDomain() {
        return domain;
    }

    public void setDomain(SwitchTokenResponseUserDomain domain) {
        this.domain = domain;
    }

    public SwitchTokenResponseUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SwitchTokenResponseUser withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchTokenResponseUser that = (SwitchTokenResponseUser) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, name, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchTokenResponseUser {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
