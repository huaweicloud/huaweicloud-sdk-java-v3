package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 要添加请求头参数。
 */
public class CreateInsertHeaderConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CreateInsertHeaderConfig withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 参数解释：请求头参数名。  约束限制：不能是以下字符： connection、upgrade、content-length、transfer-encoding、keep-alive、te、host、cookie、remoteip、authority、x-forwarded-host、x-forwarded-for、x-forwarded-for-port、x-forwarded-tls-certificate-id、x-forwarded-tls-protocol、x-forwarded-tls-cipher、x-forwarded-elb-ip、x-forwarded-port、x-forwarded-elb-id、x-forwarded-elb-vip、x-real-ip、x-forwarded-proto、x-nuwa-trace-ne-in、x-nuwa-trace-ne-out。  取值范围：1-40个字符，字母a-z（不区分大小写）、数字，短划线-和下划线_。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateInsertHeaderConfig withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 参数解释：请求头参数类别。  取值范围：USER_DEFINED,REFERENCE_HEADER,SYSTEM_DEFINED。
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public CreateInsertHeaderConfig withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数解释：请求头参数的值。  约束限制：当value_type为SYSTEM_DEFINED时，value只可从CLIENT-PORT,CLIENT-IP, ELB-PROTOCOL, ELB-ID, ELB-PORT, ELB-EIP, ELB-VIP中取值。  取值范围：1-128个字符，支持ascii码值32<=ch<=127范围内可打印字符，*和英文问号?。不能以空格开头或结尾。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInsertHeaderConfig that = (CreateInsertHeaderConfig) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.valueType, that.valueType)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, valueType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInsertHeaderConfig {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
