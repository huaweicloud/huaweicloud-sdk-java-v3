package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SessionPersistence
 */
public class SessionPersistence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie_name")

    private String cookieName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "persistence_timeout")

    private Integer persistenceTimeout;

    public SessionPersistence withCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }

    /**
     * **参数解释**：cookie名称。  **取值范围**：最大长度1024个字符。  [不支持该字段，请勿使用。](tag:hws_eu,hcso_dt)
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
     * **参数解释**：会话保持类型。  **取值范围**：SOURCE_IP、HTTP_COOKIE、APP_COOKIE。  [荷兰region不支持QUIC。](tag:dt) [不支持QUIC。](tag:tm)
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
     * **参数解释**：会话保持的时间。当type为APP_COOKIE时不生效。  **取值范围**： - 若pool的protocol为TCP、UDP和QUIC则范围为[1,60]（分钟），默认值1。 - 若pool的protocol为HTTP和HTTPS则范围为[1,1440]（分钟），默认值1440。  [荷兰region不支持QUIC。](tag:dt)
     * @return persistenceTimeout
     */
    public Integer getPersistenceTimeout() {
        return persistenceTimeout;
    }

    public void setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionPersistence that = (SessionPersistence) obj;
        return Objects.equals(this.cookieName, that.cookieName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.persistenceTimeout, that.persistenceTimeout);
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
