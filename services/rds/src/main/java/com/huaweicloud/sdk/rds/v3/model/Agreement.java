package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Agreement
 */
public class Agreement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provision_url")

    private String provisionUrl;

    public Agreement withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 许可ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Agreement withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 许可名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agreement withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 许可语言类型。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Agreement withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 许可版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Agreement withProvisionUrl(String provisionUrl) {
        this.provisionUrl = provisionUrl;
        return this;
    }

    /**
     * 许可链接。
     * @return provisionUrl
     */
    public String getProvisionUrl() {
        return provisionUrl;
    }

    public void setProvisionUrl(String provisionUrl) {
        this.provisionUrl = provisionUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Agreement that = (Agreement) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.language, that.language) && Objects.equals(this.version, that.version)
            && Objects.equals(this.provisionUrl, that.provisionUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, language, version, provisionUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agreement {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    provisionUrl: ").append(toIndentedString(provisionUrl)).append("\n");
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
