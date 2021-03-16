package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateAppReq
 */
public class CreateAppReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret")
    
    private String secret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="favorite")
    
    private Boolean favorite;

    public CreateAppReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 应用名称 - 字符集：支持中文、英文字母、数字、中划线、下划线、点、空格和中英文圆括号 - 约束：实例下唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateAppReq withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 应用描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public CreateAppReq withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 应用认证访问KEY,未提供时随机生成 - 字符集：支持中文、英文字母、数字、中划线、下划线、@号和点，以字母或中文或数字开头 - 约束：实例下唯一
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public CreateAppReq withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    


    /**
     * 应用认证访问SECRET,未提供（字段不存在或值为null）时随机生成 - 字符集：英文字母、数字、！、@、#、$、%、+、=、点、中划线、斜线/ - 复杂度：满足大小写字母、数字、特殊字符的复杂度组合，考虑兼容性暂时可不做
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    

    public CreateAppReq withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    


    /**
     * 是否收藏应用，收藏的应用会在列表里优先显示
     * @return favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAppReq createAppReq = (CreateAppReq) o;
        return Objects.equals(this.name, createAppReq.name) &&
            Objects.equals(this.remark, createAppReq.remark) &&
            Objects.equals(this.key, createAppReq.key) &&
            Objects.equals(this.secret, createAppReq.secret) &&
            Objects.equals(this.favorite, createAppReq.favorite);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, remark, key, secret, favorite);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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

