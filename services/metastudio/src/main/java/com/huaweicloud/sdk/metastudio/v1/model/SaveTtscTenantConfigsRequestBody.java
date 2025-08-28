package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SaveTtscTenantConfigsRequestBody
 */
public class SaveTtscTenantConfigsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public SaveTtscTenantConfigsRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SaveTtscTenantConfigsRequestBody withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 租户级的配置项，当前只用于词表
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SaveTtscTenantConfigsRequestBody withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 租户级的配置项的值
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
        SaveTtscTenantConfigsRequestBody that = (SaveTtscTenantConfigsRequestBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.key, that.key)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveTtscTenantConfigsRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
