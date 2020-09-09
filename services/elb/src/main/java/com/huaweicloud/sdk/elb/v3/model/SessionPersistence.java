package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 会话持久性对象。
 */
public class SessionPersistence  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cookie_name")
    
    private String cookieName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="persistence_timeout")
    
    private Integer persistenceTimeout;

    public SessionPersistence withCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }

    


    /**
     * cookie名称。 只有当type为APP_COOKIE时才支持。 格式要求：仅支持字母数字-_. 
     * @return cookieName
     */
    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public SessionPersistence withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 描述：类型，可以为SOURCE_IP、HTTP_COOKIE、APP_COOKIE。   约束：   1、当pool的protocol为TCP、UDP、QUIC时，只按SOURCE_IP生效；   2、当pool的protocol为HTTP、HTTPS时，只按HTTP_COOKIE、APP_COOKIE生效。  
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SessionPersistence withPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }

    


    /**
     * 会话保持的时间。当type为APP_COOKIE时不生效。 适用范围：如果pool的protocol为TCP、UDP和QUIC则范围为[1,60]（分钟），默认值1；如果pool的protocol为HTTP和HTTPS则范围为[1,1440]（分钟），默认值1440。
     * @return persistenceTimeout
     */
    public Integer getPersistenceTimeout() {
        return persistenceTimeout;
    }

    public void setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionPersistence sessionPersistence = (SessionPersistence) o;
        return Objects.equals(this.cookieName, sessionPersistence.cookieName) &&
            Objects.equals(this.type, sessionPersistence.type) &&
            Objects.equals(this.persistenceTimeout, sessionPersistence.persistenceTimeout);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cookieName, type, persistenceTimeout);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionPersistence {\n");
        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    persistenceTimeout: ").append(toIndentedString(persistenceTimeout)).append("\n");
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

