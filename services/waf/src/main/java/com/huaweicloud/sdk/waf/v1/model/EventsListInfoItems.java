package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 攻击类型
 */
public class EventsListInfoItems  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private Long time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sip")
    
    private String sip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attack")
    
    private String attack;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule")
    
    private String rule;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="payload")
    
    private String payload;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public EventsListInfoItems withTime(Long time) {
        this.time = time;
        return this;
    }

    


    /**
     * 次数
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    

    public EventsListInfoItems withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    


    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    

    public EventsListInfoItems withSip(String sip) {
        this.sip = sip;
        return this;
    }

    


    /**
     * 源ip
     * @return sip
     */
    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    

    public EventsListInfoItems withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 域名
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public EventsListInfoItems withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 攻击的url链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public EventsListInfoItems withAttack(String attack) {
        this.attack = attack;
        return this;
    }

    


    /**
     * 攻击类型
     * @return attack
     */
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    

    public EventsListInfoItems withRule(String rule) {
        this.rule = rule;
        return this;
    }

    


    /**
     * 命中的规则id
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    

    public EventsListInfoItems withPayload(String payload) {
        this.payload = payload;
        return this;
    }

    


    /**
     * 命中的载荷
     * @return payload
     */
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    

    public EventsListInfoItems withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 防护动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public EventsListInfoItems withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventsListInfoItems eventsListInfoItems = (EventsListInfoItems) o;
        return Objects.equals(this.time, eventsListInfoItems.time) &&
            Objects.equals(this.policyid, eventsListInfoItems.policyid) &&
            Objects.equals(this.sip, eventsListInfoItems.sip) &&
            Objects.equals(this.host, eventsListInfoItems.host) &&
            Objects.equals(this.url, eventsListInfoItems.url) &&
            Objects.equals(this.attack, eventsListInfoItems.attack) &&
            Objects.equals(this.rule, eventsListInfoItems.rule) &&
            Objects.equals(this.payload, eventsListInfoItems.payload) &&
            Objects.equals(this.action, eventsListInfoItems.action) &&
            Objects.equals(this.timestamp, eventsListInfoItems.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(time, policyid, sip, host, url, attack, rule, payload, action, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventsListInfoItems {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

