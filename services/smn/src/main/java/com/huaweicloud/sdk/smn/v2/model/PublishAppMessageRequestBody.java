package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * PublishAppMessageRequestBody
 */
public class PublishAppMessageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_structure")

    @JacksonXmlProperty(localName = "message_structure")

    private String messageStructure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_to_live")

    @JacksonXmlProperty(localName = "time_to_live")

    private String timeToLive;

    public PublishAppMessageRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     *  message与message_structure二者选其一。  message, App消息发布。  message_structure, 使用消息结构体方式的App消息发布。  app推送的消息内容，当前支持的推送平台有HMS、APNS、APNS_SANDBOX。  HMS是为开发者提供的消息推送平台。  APNS和APNS_SANDBOX是用于推送iOS消息的服务平台。  HMS平台指定的消息内容不超过2K。  APNS和APNS_SANDBOX平台的消息内容不能超过4K。  推送平台的消息内容格式要求详情见application消息体格式。  华为透传消息  {   \"hps\": {     \"msg\": {       \"type\": 1,       \"body\": {         \"key\": \"value\"       }     }   } }  华为系统通知栏消息  {   \"hps\": {     \"msg\": {       \"type\": 3,       \"body\": {         \"content\": \"Push message content\",         \"title\": \"Push message content\"       },       \"action\": {         \"type\": 1,         \"param\": {           \"intent\": \"#Intent;compo=com.rvr/.Activity;S.W=U;end\"         }       }     },     \"ext\": {       \"biTag\": \"Trump\",       \"icon\": \"http://upload.w.org/00/150pxsvg.png\"     }   } }  苹果平台消息格式 {   \"aps\": {     \"alert\": \"hello world\"   } }
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PublishAppMessageRequestBody withMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
        return this;
    }

    /**
     * app推送的消息内容，当前支持的推送平台有HMS、APNS、APNS_SANDBOX。  HMS是为开发者提供的消息推送平台。  APNS和APNS_SANDBOX是用于推送iOS消息的服务平台。  HMS平台指定的消息内容不超过2K。  APNS和APNS_SANDBOX平台的消息内容不能超过4K。  推送平台的消息内容格式要求详情见application消息体格式。  华为透传消息  {   \"HMS\": {     \"hps\": {       \"msg\": {         \"type\": 1,         \"body\": {           \"key\": \"value\"         }       }     }   } }  华为系统通知栏消息  {   \"HMS\": {     \"hps\": {       \"msg\": {         \"type\": 3,         \"body\": {           \"content\": \"Push message content\",           \"title\": \"Push message content\"         },         \"action\": {           \"type\": 1,           \"param\": {             \"intent\": \"#Intent;compo=com.rvr/.Activity;S.W=U;end\"           }         }       },       \"ext\": {         \"biTag\": \"Trump\",         \"icon\": \"http://upload.w.org/00/150pxsvg.png\"       }     }   } }  苹果平台消息格式  {   \"APNS\": {     \"aps\": {       \"alert\": \"hello world\"     }   } }
     * @return messageStructure
     */
    public String getMessageStructure() {
        return messageStructure;
    }

    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }

    public PublishAppMessageRequestBody withTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * 消息发送的生存时间，是相对于发布时间的。  SMN系统将移动推送消息转交给推送平台前，会计算该消息在系统消耗的时间。只有消耗的时间小于time_to_live时，SMN才会将消息转交给推送平台，并将time_to_live减去消耗的时间传递给推送平台，否则消息废弃。  time _to_live的单位是s，变量默认值是3600s，即一小时。值为正整数且小于等于3600*24。
     * @return timeToLive
     */
    public String getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishAppMessageRequestBody publishAppMessageRequestBody = (PublishAppMessageRequestBody) o;
        return Objects.equals(this.message, publishAppMessageRequestBody.message)
            && Objects.equals(this.messageStructure, publishAppMessageRequestBody.messageStructure)
            && Objects.equals(this.timeToLive, publishAppMessageRequestBody.timeToLive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, messageStructure, timeToLive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishAppMessageRequestBody {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    messageStructure: ").append(toIndentedString(messageStructure)).append("\n");
        sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
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
