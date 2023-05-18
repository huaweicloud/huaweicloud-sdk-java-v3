package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RefererConfig
 */
public class RefererConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_empty")

    private Boolean includeEmpty;

    public RefererConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Referer黑白名单类型 off：关闭Referer黑白名单; black：Referer黑名单; white：Referer白名单;
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RefererConfig withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 请输入域名或IP地址，以“,”进行分割，域名、IP地址可以混合输入，支持泛域名添加。输入的域名、IP地址总数不超过400个。当设置防盗链时，此项必填。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RefererConfig withIncludeEmpty(Boolean includeEmpty) {
        this.includeEmpty = includeEmpty;
        return this;
    }

    /**
     * 是否包含空Referer。如果是黑名单并开启该选项，则表示无referer不允许访问。如果是白名单并开启该选项，则表示无referer允许访问。默认值false。
     * @return includeEmpty
     */
    public Boolean getIncludeEmpty() {
        return includeEmpty;
    }

    public void setIncludeEmpty(Boolean includeEmpty) {
        this.includeEmpty = includeEmpty;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefererConfig refererConfig = (RefererConfig) o;
        return Objects.equals(this.type, refererConfig.type) && Objects.equals(this.value, refererConfig.value)
            && Objects.equals(this.includeEmpty, refererConfig.includeEmpty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, includeEmpty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefererConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    includeEmpty: ").append(toIndentedString(includeEmpty)).append("\n");
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
