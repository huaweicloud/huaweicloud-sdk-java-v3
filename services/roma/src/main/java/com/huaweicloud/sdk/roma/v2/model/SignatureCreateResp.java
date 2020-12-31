package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SignatureCreateResp
 */
public class SignatureCreateResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_secret")
    
    private String signSecret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_key")
    
    private String signKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_type")
    
    private String signType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_num")
    
    private Integer bindNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ldapi_bind_num")
    
    private Integer ldapiBindNum;

    public SignatureCreateResp withSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    


    /**
     * 签名密钥的密钥
     * @return signSecret
     */
    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    public SignatureCreateResp withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public SignatureCreateResp withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public SignatureCreateResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 签名密钥的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SignatureCreateResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 签名密钥的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SignatureCreateResp withSignKey(String signKey) {
        this.signKey = signKey;
        return this;
    }

    


    /**
     * 签名密钥的key
     * @return signKey
     */
    public String getSignKey() {
        return signKey;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public SignatureCreateResp withSignType(String signType) {
        this.signType = signType;
        return this;
    }

    


    /**
     * 签名密钥的类型
     * @return signType
     */
    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public SignatureCreateResp withBindNum(Integer bindNum) {
        this.bindNum = bindNum;
        return this;
    }

    


    /**
     * 绑定的API数量
     * @return bindNum
     */
    public Integer getBindNum() {
        return bindNum;
    }

    public void setBindNum(Integer bindNum) {
        this.bindNum = bindNum;
    }

    public SignatureCreateResp withLdapiBindNum(Integer ldapiBindNum) {
        this.ldapiBindNum = ldapiBindNum;
        return this;
    }

    


    /**
     * 绑定的自定义后端数量  暂不支持
     * @return ldapiBindNum
     */
    public Integer getLdapiBindNum() {
        return ldapiBindNum;
    }

    public void setLdapiBindNum(Integer ldapiBindNum) {
        this.ldapiBindNum = ldapiBindNum;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignatureCreateResp signatureCreateResp = (SignatureCreateResp) o;
        return Objects.equals(this.signSecret, signatureCreateResp.signSecret) &&
            Objects.equals(this.updateTime, signatureCreateResp.updateTime) &&
            Objects.equals(this.createTime, signatureCreateResp.createTime) &&
            Objects.equals(this.name, signatureCreateResp.name) &&
            Objects.equals(this.id, signatureCreateResp.id) &&
            Objects.equals(this.signKey, signatureCreateResp.signKey) &&
            Objects.equals(this.signType, signatureCreateResp.signType) &&
            Objects.equals(this.bindNum, signatureCreateResp.bindNum) &&
            Objects.equals(this.ldapiBindNum, signatureCreateResp.ldapiBindNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(signSecret, updateTime, createTime, name, id, signKey, signType, bindNum, ldapiBindNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignatureCreateResp {\n");
        sb.append("    signSecret: ").append(toIndentedString(signSecret)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    signKey: ").append(toIndentedString(signKey)).append("\n");
        sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
        sb.append("    ldapiBindNum: ").append(toIndentedString(ldapiBindNum)).append("\n");
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

