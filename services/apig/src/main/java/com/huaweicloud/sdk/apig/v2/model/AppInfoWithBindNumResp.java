package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppInfoWithBindNumResp
 */
public class AppInfoWithBindNumResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creator")
    
    private String creator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    
    private String appKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_secret")
    
    private String appSecret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_time")
    
    private OffsetDateTime registerTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_num")
    
    private Integer bindNum;

    public AppInfoWithBindNumResp withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    


    /**
     * APP的创建者 - USER：用户自行创建 - MARKET：云市场分配
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    

    public AppInfoWithBindNumResp withUpdateTime(OffsetDateTime updateTime) {
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

    

    public AppInfoWithBindNumResp withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    


    /**
     * APP的key
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    

    public AppInfoWithBindNumResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public AppInfoWithBindNumResp withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public AppInfoWithBindNumResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public AppInfoWithBindNumResp withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    


    /**
     * 密钥
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    

    public AppInfoWithBindNumResp withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    


    /**
     * 注册时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    

    public AppInfoWithBindNumResp withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态   - 1： 有效
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public AppInfoWithBindNumResp withBindNum(Integer bindNum) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppInfoWithBindNumResp appInfoWithBindNumResp = (AppInfoWithBindNumResp) o;
        return Objects.equals(this.creator, appInfoWithBindNumResp.creator) &&
            Objects.equals(this.updateTime, appInfoWithBindNumResp.updateTime) &&
            Objects.equals(this.appKey, appInfoWithBindNumResp.appKey) &&
            Objects.equals(this.name, appInfoWithBindNumResp.name) &&
            Objects.equals(this.remark, appInfoWithBindNumResp.remark) &&
            Objects.equals(this.id, appInfoWithBindNumResp.id) &&
            Objects.equals(this.appSecret, appInfoWithBindNumResp.appSecret) &&
            Objects.equals(this.registerTime, appInfoWithBindNumResp.registerTime) &&
            Objects.equals(this.status, appInfoWithBindNumResp.status) &&
            Objects.equals(this.bindNum, appInfoWithBindNumResp.bindNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(creator, updateTime, appKey, name, remark, id, appSecret, registerTime, status, bindNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppInfoWithBindNumResp {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
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

