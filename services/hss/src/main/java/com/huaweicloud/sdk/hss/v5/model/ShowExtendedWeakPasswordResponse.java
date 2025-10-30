package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowExtendedWeakPasswordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended_weak_password")

    private List<String> extendedWeakPassword = null;

    public ShowExtendedWeakPasswordResponse withExtendedWeakPassword(List<String> extendedWeakPassword) {
        this.extendedWeakPassword = extendedWeakPassword;
        return this;
    }

    public ShowExtendedWeakPasswordResponse addExtendedWeakPasswordItem(String extendedWeakPasswordItem) {
        if (this.extendedWeakPassword == null) {
            this.extendedWeakPassword = new ArrayList<>();
        }
        this.extendedWeakPassword.add(extendedWeakPasswordItem);
        return this;
    }

    public ShowExtendedWeakPasswordResponse withExtendedWeakPassword(
        Consumer<List<String>> extendedWeakPasswordSetter) {
        if (this.extendedWeakPassword == null) {
            this.extendedWeakPassword = new ArrayList<>();
        }
        extendedWeakPasswordSetter.accept(this.extendedWeakPassword);
        return this;
    }

    /**
     * **参数解释**: 自定义弱口令，选填，可编辑 **取值范围**: 最小值0，最大值1000000 
     * @return extendedWeakPassword
     */
    public List<String> getExtendedWeakPassword() {
        return extendedWeakPassword;
    }

    public void setExtendedWeakPassword(List<String> extendedWeakPassword) {
        this.extendedWeakPassword = extendedWeakPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExtendedWeakPasswordResponse that = (ShowExtendedWeakPasswordResponse) obj;
        return Objects.equals(this.extendedWeakPassword, that.extendedWeakPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendedWeakPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExtendedWeakPasswordResponse {\n");
        sb.append("    extendedWeakPassword: ").append(toIndentedString(extendedWeakPassword)).append("\n");
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
