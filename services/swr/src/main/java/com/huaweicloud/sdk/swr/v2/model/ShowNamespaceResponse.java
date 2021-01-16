package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowNamespaceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator_name")
    
    private String creatorName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth")
    
    private Integer auth;

    public ShowNamespaceResponse withId(Integer id) {
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

    public ShowNamespaceResponse withName(String name) {
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

    public ShowNamespaceResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    


    /**
     * IAM用户名
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowNamespaceResponse withAuth(Integer auth) {
        this.auth = auth;
        return this;
    }

    


    /**
     * 用户权限。7表示管理权限，3表示编辑权限，1表示读取权限。
     * @return auth
     */
    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNamespaceResponse showNamespaceResponse = (ShowNamespaceResponse) o;
        return Objects.equals(this.id, showNamespaceResponse.id) &&
            Objects.equals(this.name, showNamespaceResponse.name) &&
            Objects.equals(this.creatorName, showNamespaceResponse.creatorName) &&
            Objects.equals(this.auth, showNamespaceResponse.auth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, creatorName, auth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNamespaceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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

