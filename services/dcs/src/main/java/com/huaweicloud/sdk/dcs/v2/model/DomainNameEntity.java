package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DomainNameEntity
 */
public class DomainNameEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_readonly")

    private Boolean isReadonly;

    public DomainNameEntity withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 实例历史域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainNameEntity withIsReadonly(Boolean isReadonly) {
        this.isReadonly = isReadonly;
        return this;
    }

    /**
     * 是否只读域名 - true：是 - false：否 
     * @return isReadonly
     */
    public Boolean getIsReadonly() {
        return isReadonly;
    }

    public void setIsReadonly(Boolean isReadonly) {
        this.isReadonly = isReadonly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainNameEntity domainNameEntity = (DomainNameEntity) o;
        return Objects.equals(this.domainName, domainNameEntity.domainName)
            && Objects.equals(this.isReadonly, domainNameEntity.isReadonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, isReadonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainNameEntity {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    isReadonly: ").append(toIndentedString(isReadonly)).append("\n");
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
