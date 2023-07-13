package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SendVeriCodeForChangePwdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire")

    private Integer expire;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bindPhone")

    private String bindPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bindEmail")

    private String bindEmail;

    public SendVeriCodeForChangePwdResponse withExpire(Integer expire) {
        this.expire = expire;
        return this;
    }

    /**
     * 过期时间，单位：秒。
     * @return expire
     */
    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public SendVeriCodeForChangePwdResponse withBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
        return this;
    }

    /**
     * 如果通过手机发送验证码，则该字段携带该用户绑定的手机号（手机号经过处理，屏蔽中间几位，如+8618****12345）。
     * @return bindPhone
     */
    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    public SendVeriCodeForChangePwdResponse withBindEmail(String bindEmail) {
        this.bindEmail = bindEmail;
        return this;
    }

    /**
     * 如果通过邮箱发送验证码，则该字段携带用户绑定的邮箱帐号（邮箱帐号经过处理，屏蔽中间几位，如tes****ount@huawei.com）。
     * @return bindEmail
     */
    public String getBindEmail() {
        return bindEmail;
    }

    public void setBindEmail(String bindEmail) {
        this.bindEmail = bindEmail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendVeriCodeForChangePwdResponse that = (SendVeriCodeForChangePwdResponse) obj;
        return Objects.equals(this.expire, that.expire) && Objects.equals(this.bindPhone, that.bindPhone)
            && Objects.equals(this.bindEmail, that.bindEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expire, bindPhone, bindEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendVeriCodeForChangePwdResponse {\n");
        sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
        sb.append("    bindPhone: ").append(toIndentedString(bindPhone)).append("\n");
        sb.append("    bindEmail: ").append(toIndentedString(bindEmail)).append("\n");
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
