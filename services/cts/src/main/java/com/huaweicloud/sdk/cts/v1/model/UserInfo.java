package com.huaweicloud.sdk.cts.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cts.v1.model.BaseUser;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 用户信息。
 */
public class UserInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private BaseUser domain = null;

    public UserInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 账号ID，参见《云审计服务API参考》“获取账号ID和项目ID”章节。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 账号名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserInfo withDomain(BaseUser domain) {
        this.domain = domain;
        return this;
    }

    public UserInfo withDomain(Consumer<BaseUser> domainSetter) {
        if(this.domain == null ){
            this.domain = new BaseUser();
        }
        domainSetter.accept(this.domain);
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public BaseUser getDomain() {
        return domain;
    }

    public void setDomain(BaseUser domain) {
        this.domain = domain;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(this.id, userInfo.id) &&
            Objects.equals(this.name, userInfo.name) &&
            Objects.equals(this.domain, userInfo.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInfo {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

