package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 敏感信息选项里，各个类型的描述 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class AntileakageMapResponseBodyLocale {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card")

    private String idCard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive")

    private String sensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responseCode")

    private String responseCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    public AntileakageMapResponseBodyLocale withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 响应码拦截，用于捕获和处理特定HTTP响应码的机制 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AntileakageMapResponseBodyLocale withIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    /**
     * **参数解释：** 身份证号，用于识别个人身份的唯一编码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public AntileakageMapResponseBodyLocale withSensitive(String sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * **参数解释：** 敏感信息过滤，用于检测和处理敏感信息的模块 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sensitive
     */
    public String getSensitive() {
        return sensitive;
    }

    public void setSensitive(String sensitive) {
        this.sensitive = sensitive;
    }

    public AntileakageMapResponseBodyLocale withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * **参数解释：** 电话号码，用于联系的数字编码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AntileakageMapResponseBodyLocale withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * **参数解释：** 选项涉及的各种响应码，示例值400，401,404 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public AntileakageMapResponseBodyLocale withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * **参数解释：** 电子邮箱，用于电子通信的地址 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntileakageMapResponseBodyLocale that = (AntileakageMapResponseBodyLocale) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.idCard, that.idCard)
            && Objects.equals(this.sensitive, that.sensitive) && Objects.equals(this.phone, that.phone)
            && Objects.equals(this.responseCode, that.responseCode) && Objects.equals(this.email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, idCard, sensitive, phone, responseCode, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntileakageMapResponseBodyLocale {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    idCard: ").append(toIndentedString(idCard)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
