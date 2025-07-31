package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弱口令的账号信息
 */
public class WeakPwdAccountInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desensitized_weak_passwords")

    private String desensitizedWeakPasswords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    public WeakPwdAccountInfoResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 弱口令账号名称 **取值范围**: 不涉及 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WeakPwdAccountInfoResponseInfo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释**: 账号类型 **取值范围**: - system : 系统账号 - mysql  : mysql账号 - redis  : redis账号 
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public WeakPwdAccountInfoResponseInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**: 弱口令使用时长，单位天 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public WeakPwdAccountInfoResponseInfo withDesensitizedWeakPasswords(String desensitizedWeakPasswords) {
        this.desensitizedWeakPasswords = desensitizedWeakPasswords;
        return this;
    }

    /**
     * **参数解释**: 脱敏弱口令 **取值范围**: 不涉及 
     * @return desensitizedWeakPasswords
     */
    public String getDesensitizedWeakPasswords() {
        return desensitizedWeakPasswords;
    }

    public void setDesensitizedWeakPasswords(String desensitizedWeakPasswords) {
        this.desensitizedWeakPasswords = desensitizedWeakPasswords;
    }

    public WeakPwdAccountInfoResponseInfo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * **参数解释**: 修改建议 **取值范围**: 不涉及 
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WeakPwdAccountInfoResponseInfo that = (WeakPwdAccountInfoResponseInfo) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.desensitizedWeakPasswords, that.desensitizedWeakPasswords)
            && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, serviceType, duration, desensitizedWeakPasswords, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeakPwdAccountInfoResponseInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    desensitizedWeakPasswords: ").append(toIndentedString(desensitizedWeakPasswords)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
