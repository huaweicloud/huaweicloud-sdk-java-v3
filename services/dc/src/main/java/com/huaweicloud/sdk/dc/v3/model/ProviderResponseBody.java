package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 运营商的返回体。
 */
public class ProviderResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_name")

    private String shortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_value")

    private ProviderValueBody providerValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ProviderResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 运营商id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProviderResponseBody withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * 运营商简写
     * @return shortName
     */
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public ProviderResponseBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 运营商类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProviderResponseBody withProviderValue(ProviderValueBody providerValue) {
        this.providerValue = providerValue;
        return this;
    }

    public ProviderResponseBody withProviderValue(Consumer<ProviderValueBody> providerValueSetter) {
        if (this.providerValue == null) {
            this.providerValue = new ProviderValueBody();
            providerValueSetter.accept(this.providerValue);
        }

        return this;
    }

    /**
     * Get providerValue
     * @return providerValue
     */
    public ProviderValueBody getProviderValue() {
        return providerValue;
    }

    public void setProviderValue(ProviderValueBody providerValue) {
        this.providerValue = providerValue;
    }

    public ProviderResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 运营商描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProviderResponseBody that = (ProviderResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.shortName, that.shortName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.providerValue, that.providerValue)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortName, type, providerValue, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    providerValue: ").append(toIndentedString(providerValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
