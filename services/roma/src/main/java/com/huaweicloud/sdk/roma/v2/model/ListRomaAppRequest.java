package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRomaAppRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="favorite")
    
    private Boolean favorite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_role")
    
    private String authRole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private Boolean owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;

    public ListRomaAppRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListRomaAppRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，大于等于0
     * minimum: 0
     * maximum: 10
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListRomaAppRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListRomaAppRequest withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    


    /**
     * 查询收藏的应用 - 未提供时，查询当前用户有权限的所有应用 - 为true时，获取收藏的应用 - 为false时，获取未被收藏的应用products
     * @return favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    

    public ListRomaAppRequest withAuthRole(String authRole) {
        this.authRole = authRole;
        return this;
    }

    


    /**
     * 获取拥有指定权限应用
     * @return authRole
     */
    public String getAuthRole() {
        return authRole;
    }

    public void setAuthRole(String authRole) {
        this.authRole = authRole;
    }

    

    public ListRomaAppRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 应用名称，模糊匹配
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListRomaAppRequest withOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 查询有权限访问的应用 - 未提供时，查询当前用户有权限的所有应用 - 为true时，查询当前用户创建的应用 - 为false时，查询非当前用户创建的有权限的应用，比如其它人共享的应用
     * @return owner
     */
    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    

    public ListRomaAppRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 从当前调用者有权限的所有应用中过滤出指定用户名有权限的应用
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRomaAppRequest listRomaAppRequest = (ListRomaAppRequest) o;
        return Objects.equals(this.instanceId, listRomaAppRequest.instanceId) &&
            Objects.equals(this.offset, listRomaAppRequest.offset) &&
            Objects.equals(this.limit, listRomaAppRequest.limit) &&
            Objects.equals(this.favorite, listRomaAppRequest.favorite) &&
            Objects.equals(this.authRole, listRomaAppRequest.authRole) &&
            Objects.equals(this.name, listRomaAppRequest.name) &&
            Objects.equals(this.owner, listRomaAppRequest.owner) &&
            Objects.equals(this.userName, listRomaAppRequest.userName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, favorite, authRole, name, owner, userName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRomaAppRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
        sb.append("    authRole: ").append(toIndentedString(authRole)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

