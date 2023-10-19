package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAccessControlRequestBody
 */
public class CreateAccessControlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<AccessControlRule> ipList = null;

    public CreateAccessControlRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 访问控制方式。 取值： - white：表示白名单。 - black：表示黑名单。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateAccessControlRequestBody withIpList(List<AccessControlRule> ipList) {
        this.ipList = ipList;
        return this;
    }

    public CreateAccessControlRequestBody addIpListItem(AccessControlRule ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public CreateAccessControlRequestBody withIpList(Consumer<List<AccessControlRule>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * 控制访问的IP地址数组，最多可添加300个IP地址或网段。
     * @return ipList
     */
    public List<AccessControlRule> getIpList() {
        return ipList;
    }

    public void setIpList(List<AccessControlRule> ipList) {
        this.ipList = ipList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccessControlRequestBody that = (CreateAccessControlRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.ipList, that.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessControlRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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
