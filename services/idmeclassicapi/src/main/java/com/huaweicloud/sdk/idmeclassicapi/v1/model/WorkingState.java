package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WorkingState
 */
public class WorkingState {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cnName")

    private String cnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enName")

    private String enName;

    public WorkingState withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public WorkingState withCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }

    /**
     * 中文名称。
     * @return cnName
     */
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public WorkingState withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WorkingState withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 英文名称。
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkingState that = (WorkingState) obj;
        return Objects.equals(this.alias, that.alias) && Objects.equals(this.cnName, that.cnName)
            && Objects.equals(this.code, that.code) && Objects.equals(this.enName, that.enName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, cnName, code, enName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkingState {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
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
