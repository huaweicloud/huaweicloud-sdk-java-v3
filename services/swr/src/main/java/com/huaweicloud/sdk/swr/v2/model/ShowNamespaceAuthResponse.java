package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNamespaceAuthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_auth")

    private UserAuth selfAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "others_auths")

    private List<UserAuth> othersAuths = null;

    public ShowNamespaceAuthResponse withId(Integer id) {
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

    public ShowNamespaceAuthResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组织名称。小写字母开头，后面跟小写字母、数字、小数点、下划线或中划线（其中下划线最多允许连续两个，小数点、下划线、中划线不能直接相连），小写字母或数字结尾，1-64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNamespaceAuthResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 组织创建者
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowNamespaceAuthResponse withSelfAuth(UserAuth selfAuth) {
        this.selfAuth = selfAuth;
        return this;
    }

    public ShowNamespaceAuthResponse withSelfAuth(Consumer<UserAuth> selfAuthSetter) {
        if (this.selfAuth == null) {
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

    public ShowNamespaceAuthResponse withOthersAuths(List<UserAuth> othersAuths) {
        this.othersAuths = othersAuths;
        return this;
    }

    public ShowNamespaceAuthResponse addOthersAuthsItem(UserAuth othersAuthsItem) {
        if (this.othersAuths == null) {
            this.othersAuths = new ArrayList<>();
        }
        this.othersAuths.add(othersAuthsItem);
        return this;
    }

    public ShowNamespaceAuthResponse withOthersAuths(Consumer<List<UserAuth>> othersAuthsSetter) {
        if (this.othersAuths == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNamespaceAuthResponse that = (ShowNamespaceAuthResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.selfAuth, that.selfAuth)
            && Objects.equals(this.othersAuths, that.othersAuths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creatorName, selfAuth, othersAuths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNamespaceAuthResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
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
