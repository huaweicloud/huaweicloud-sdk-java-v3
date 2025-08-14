package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 联邦配置
 */
public class ResponseConfigDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, ResponseSourceDetailsDto> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private ResponseSourceDetailsDto subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relay_state")

    private String relayState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private String ttl;

    public ResponseConfigDto withProperties(Map<String, ResponseSourceDetailsDto> properties) {
        this.properties = properties;
        return this;
    }

    public ResponseConfigDto putPropertiesItem(String key, ResponseSourceDetailsDto propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public ResponseConfigDto withProperties(Consumer<Map<String, ResponseSourceDetailsDto>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 额外添加的属性映射配置
     * @return properties
     */
    public Map<String, ResponseSourceDetailsDto> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, ResponseSourceDetailsDto> properties) {
        this.properties = properties;
    }

    public ResponseConfigDto withSubject(ResponseSourceDetailsDto subject) {
        this.subject = subject;
        return this;
    }

    public ResponseConfigDto withSubject(Consumer<ResponseSourceDetailsDto> subjectSetter) {
        if (this.subject == null) {
            this.subject = new ResponseSourceDetailsDto();
            subjectSetter.accept(this.subject);
        }

        return this;
    }

    /**
     * Get subject
     * @return subject
     */
    public ResponseSourceDetailsDto getSubject() {
        return subject;
    }

    public void setSubject(ResponseSourceDetailsDto subject) {
        this.subject = subject;
    }

    public ResponseConfigDto withRelayState(String relayState) {
        this.relayState = relayState;
        return this;
    }

    /**
     * 中继状态
     * @return relayState
     */
    public String getRelayState() {
        return relayState;
    }

    public void setRelayState(String relayState) {
        this.relayState = relayState;
    }

    public ResponseConfigDto withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 会话过期时间
     * @return ttl
     */
    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseConfigDto that = (ResponseConfigDto) obj;
        return Objects.equals(this.properties, that.properties) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.relayState, that.relayState) && Objects.equals(this.ttl, that.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties, subject, relayState, ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseConfigDto {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    relayState: ").append(toIndentedString(relayState)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
