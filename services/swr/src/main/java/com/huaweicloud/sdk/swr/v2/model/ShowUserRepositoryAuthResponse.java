package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.UserAuth;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowUserRepositoryAuthResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="self_auth")
    
    private UserAuth selfAuth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="others_auths")
    
    private List<UserAuth> othersAuths = null;
    
    public ShowUserRepositoryAuthResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public ShowUserRepositoryAuthResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 组织名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowUserRepositoryAuthResponse withSelfAuth(UserAuth selfAuth) {
        this.selfAuth = selfAuth;
        return this;
    }

    public ShowUserRepositoryAuthResponse withSelfAuth(Consumer<UserAuth> selfAuthSetter) {
        if(this.selfAuth == null ){
            this.selfAuth = new UserAuth();
            selfAuthSetter.accept(this.selfAuth);
        }
        
        return this;
    }


    /**
     * Get selfAuth
     * @return selfAuth
     */
    public UserAuth getSelfAuth() {
        return selfAuth;
    }

    public void setSelfAuth(UserAuth selfAuth) {
        this.selfAuth = selfAuth;
    }

    

    public ShowUserRepositoryAuthResponse withOthersAuths(List<UserAuth> othersAuths) {
        this.othersAuths = othersAuths;
        return this;
    }

    
    public ShowUserRepositoryAuthResponse addOthersAuthsItem(UserAuth othersAuthsItem) {
        this.othersAuths.add(othersAuthsItem);
        return this;
    }

    public ShowUserRepositoryAuthResponse withOthersAuths(Consumer<List<UserAuth>> othersAuthsSetter) {
        if(this.othersAuths == null ){
            this.othersAuths = new ArrayList<>();
        }
        othersAuthsSetter.accept(this.othersAuths);
        return this;
    }

    /**
     * 其他用户的权限
     * @return othersAuths
     */
    public List<UserAuth> getOthersAuths() {
        return othersAuths;
    }

    public void setOthersAuths(List<UserAuth> othersAuths) {
        this.othersAuths = othersAuths;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowUserRepositoryAuthResponse showUserRepositoryAuthResponse = (ShowUserRepositoryAuthResponse) o;
        return Objects.equals(this.id, showUserRepositoryAuthResponse.id) &&
            Objects.equals(this.name, showUserRepositoryAuthResponse.name) &&
            Objects.equals(this.selfAuth, showUserRepositoryAuthResponse.selfAuth) &&
            Objects.equals(this.othersAuths, showUserRepositoryAuthResponse.othersAuths);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, selfAuth, othersAuths);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserRepositoryAuthResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    selfAuth: ").append(toIndentedString(selfAuth)).append("\n");
        sb.append("    othersAuths: ").append(toIndentedString(othersAuths)).append("\n");
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

