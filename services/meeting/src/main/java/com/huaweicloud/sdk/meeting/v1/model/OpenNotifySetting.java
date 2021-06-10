package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 通知配置
 */
public class OpenNotifySetting  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableCalendar")
    
    private String enableCalendar;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableSms")
    
    private String enableSms;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableEmail")
    
    private String enableEmail;

    public OpenNotifySetting withEnableCalendar(String enableCalendar) {
        this.enableCalendar = enableCalendar;
        return this;
    }

    


    /**
     * 发送邮件日历是否开启，\"Y\" 开启，\"N\" 不开启。
     * @return enableCalendar
     */
    public String getEnableCalendar() {
        return enableCalendar;
    }

    public void setEnableCalendar(String enableCalendar) {
        this.enableCalendar = enableCalendar;
    }

    

    public OpenNotifySetting withEnableSms(String enableSms) {
        this.enableSms = enableSms;
        return this;
    }

    


    /**
     * 短信通知是否开启，\"Y\" 开启，\"N\" 不开启。
     * @return enableSms
     */
    public String getEnableSms() {
        return enableSms;
    }

    public void setEnableSms(String enableSms) {
        this.enableSms = enableSms;
    }

    

    public OpenNotifySetting withEnableEmail(String enableEmail) {
        this.enableEmail = enableEmail;
        return this;
    }

    


    /**
     * 短信通知是否开启，\"Y\" 开启，\"N\" 不开启。
     * @return enableEmail
     */
    public String getEnableEmail() {
        return enableEmail;
    }

    public void setEnableEmail(String enableEmail) {
        this.enableEmail = enableEmail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenNotifySetting openNotifySetting = (OpenNotifySetting) o;
        return Objects.equals(this.enableCalendar, openNotifySetting.enableCalendar) &&
            Objects.equals(this.enableSms, openNotifySetting.enableSms) &&
            Objects.equals(this.enableEmail, openNotifySetting.enableEmail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enableCalendar, enableSms, enableEmail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenNotifySetting {\n");
        sb.append("    enableCalendar: ").append(toIndentedString(enableCalendar)).append("\n");
        sb.append("    enableSms: ").append(toIndentedString(enableSms)).append("\n");
        sb.append("    enableEmail: ").append(toIndentedString(enableEmail)).append("\n");
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

