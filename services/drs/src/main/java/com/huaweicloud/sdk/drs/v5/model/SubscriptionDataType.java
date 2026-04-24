package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅的数据类型是否包含DDL/DML语句，返回值： true：是。 false：否。
 */
public class SubscriptionDataType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dml_subscribed")

    private Boolean isDmlSubscribed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ddl_subscribed")

    private Boolean isDdlSubscribed;

    public SubscriptionDataType withIsDmlSubscribed(Boolean isDmlSubscribed) {
        this.isDmlSubscribed = isDmlSubscribed;
        return this;
    }

    /**
     * 数据操作语言，取值： true：订阅DML false：不订阅DML
     * @return isDmlSubscribed
     */
    public Boolean getIsDmlSubscribed() {
        return isDmlSubscribed;
    }

    public void setIsDmlSubscribed(Boolean isDmlSubscribed) {
        this.isDmlSubscribed = isDmlSubscribed;
    }

    public SubscriptionDataType withIsDdlSubscribed(Boolean isDdlSubscribed) {
        this.isDdlSubscribed = isDdlSubscribed;
        return this;
    }

    /**
     * 数据定义语言，取值： true：订阅DDL false：不订阅DDL
     * @return isDdlSubscribed
     */
    public Boolean getIsDdlSubscribed() {
        return isDdlSubscribed;
    }

    public void setIsDdlSubscribed(Boolean isDdlSubscribed) {
        this.isDdlSubscribed = isDdlSubscribed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionDataType that = (SubscriptionDataType) obj;
        return Objects.equals(this.isDmlSubscribed, that.isDmlSubscribed)
            && Objects.equals(this.isDdlSubscribed, that.isDdlSubscribed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDmlSubscribed, isDdlSubscribed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionDataType {\n");
        sb.append("    isDmlSubscribed: ").append(toIndentedString(isDmlSubscribed)).append("\n");
        sb.append("    isDdlSubscribed: ").append(toIndentedString(isDdlSubscribed)).append("\n");
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
