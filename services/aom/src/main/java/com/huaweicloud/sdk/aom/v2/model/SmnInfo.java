package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SMN信息
 */
@JacksonXmlRootElement(localName = "SmnInfo")
public class SmnInfo  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_notified_content")
    
    @JacksonXmlProperty(localName = "smn_notified_content")

    private String smnNotifiedContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_subscription_status")
    
    @JacksonXmlProperty(localName = "smn_subscription_status")

    private String smnSubscriptionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_subscription_type")
    
    @JacksonXmlProperty(localName = "smn_subscription_type")

    private String smnSubscriptionType;

    public SmnInfo withSmnNotifiedContent(String smnNotifiedContent) {
        this.smnNotifiedContent = smnNotifiedContent;
        return this;
    }

    


    /**
     * smn发送消息的内容
     * @return smnNotifiedContent
     */
    public String getSmnNotifiedContent() {
        return smnNotifiedContent;
    }

    public void setSmnNotifiedContent(String smnNotifiedContent) {
        this.smnNotifiedContent = smnNotifiedContent;
    }

    

    public SmnInfo withSmnSubscriptionStatus(String smnSubscriptionStatus) {
        this.smnSubscriptionStatus = smnSubscriptionStatus;
        return this;
    }

    


    /**
     * smn的订阅的状态
     * @return smnSubscriptionStatus
     */
    public String getSmnSubscriptionStatus() {
        return smnSubscriptionStatus;
    }

    public void setSmnSubscriptionStatus(String smnSubscriptionStatus) {
        this.smnSubscriptionStatus = smnSubscriptionStatus;
    }

    

    public SmnInfo withSmnSubscriptionType(String smnSubscriptionType) {
        this.smnSubscriptionType = smnSubscriptionType;
        return this;
    }

    


    /**
     * smn的订阅类型
     * @return smnSubscriptionType
     */
    public String getSmnSubscriptionType() {
        return smnSubscriptionType;
    }

    public void setSmnSubscriptionType(String smnSubscriptionType) {
        this.smnSubscriptionType = smnSubscriptionType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmnInfo smnInfo = (SmnInfo) o;
        return Objects.equals(this.smnNotifiedContent, smnInfo.smnNotifiedContent) &&
            Objects.equals(this.smnSubscriptionStatus, smnInfo.smnSubscriptionStatus) &&
            Objects.equals(this.smnSubscriptionType, smnInfo.smnSubscriptionType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(smnNotifiedContent, smnSubscriptionStatus, smnSubscriptionType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnInfo {\n");
        sb.append("    smnNotifiedContent: ").append(toIndentedString(smnNotifiedContent)).append("\n");
        sb.append("    smnSubscriptionStatus: ").append(toIndentedString(smnSubscriptionStatus)).append("\n");
        sb.append("    smnSubscriptionType: ").append(toIndentedString(smnSubscriptionType)).append("\n");
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

