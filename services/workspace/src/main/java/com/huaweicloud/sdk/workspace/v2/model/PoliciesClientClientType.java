package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端类型登录管控。
 */
public class PoliciesClientClientType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_type_limit")

    private Boolean clientTypeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesClientClientTypeOptions options;

    public PoliciesClientClientType withClientTypeLimit(Boolean clientTypeLimit) {
        this.clientTypeLimit = clientTypeLimit;
        return this;
    }

    /**
     * 是否开启终端类型登录管控。 false：表示关闭。 true：表示开启。
     * @return clientTypeLimit
     */
    public Boolean getClientTypeLimit() {
        return clientTypeLimit;
    }

    public void setClientTypeLimit(Boolean clientTypeLimit) {
        this.clientTypeLimit = clientTypeLimit;
    }

    public PoliciesClientClientType withOptions(PoliciesClientClientTypeOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesClientClientType withOptions(Consumer<PoliciesClientClientTypeOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesClientClientTypeOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesClientClientTypeOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesClientClientTypeOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesClientClientType that = (PoliciesClientClientType) obj;
        return Objects.equals(this.clientTypeLimit, that.clientTypeLimit) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientTypeLimit, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesClientClientType {\n");
        sb.append("    clientTypeLimit: ").append(toIndentedString(clientTypeLimit)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
