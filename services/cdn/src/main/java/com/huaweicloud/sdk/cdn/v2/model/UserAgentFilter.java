package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UA黑白名单设置。
 */
public class UserAgentFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ua_list")

    private List<String> uaList = null;

    public UserAgentFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * UA黑白名单类型 off：关闭UA黑白名单; black：UA黑名单; white：UA白名单;
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserAgentFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 配置UA黑白名单，当type=off时，非必传。最多配置10条规则，单条规则不超过100个字符，多条规则用“,”分割。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UserAgentFilter withUaList(List<String> uaList) {
        this.uaList = uaList;
        return this;
    }

    public UserAgentFilter addUaListItem(String uaListItem) {
        if (this.uaList == null) {
            this.uaList = new ArrayList<>();
        }
        this.uaList.add(uaListItem);
        return this;
    }

    public UserAgentFilter withUaList(Consumer<List<String>> uaListSetter) {
        if (this.uaList == null) {
            this.uaList = new ArrayList<>();
        }
        uaListSetter.accept(this.uaList);
        return this;
    }

    /**
     * 配置UA黑白名单，当type=off时，非必传。最多配置10条规则，单条规则不超过100个字符,同时配置value和ua_list时，ua_list生效。 
     * @return uaList
     */
    public List<String> getUaList() {
        return uaList;
    }

    public void setUaList(List<String> uaList) {
        this.uaList = uaList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAgentFilter userAgentFilter = (UserAgentFilter) o;
        return Objects.equals(this.type, userAgentFilter.type) && Objects.equals(this.value, userAgentFilter.value)
            && Objects.equals(this.uaList, userAgentFilter.uaList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, uaList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAgentFilter {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    uaList: ").append(toIndentedString(uaList)).append("\n");
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
