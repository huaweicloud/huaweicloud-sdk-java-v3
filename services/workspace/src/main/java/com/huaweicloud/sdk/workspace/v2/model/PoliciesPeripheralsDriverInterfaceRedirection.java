package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 驱动接口重定向。
 */
public class PoliciesPeripheralsDriverInterfaceRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_redir_driver_list")

    private String apiRedirDriverList;

    public PoliciesPeripheralsDriverInterfaceRedirection withApiRedirDriverList(String apiRedirDriverList) {
        this.apiRedirDriverList = apiRedirDriverList;
        return this;
    }

    /**
     * 自定义驱动列表。（填写安装在终端的驱动文件名或驱动文件的全路径，支持配置多个，多个之间以\";\"隔开），长度不能超过1000个字符。
     * @return apiRedirDriverList
     */
    public String getApiRedirDriverList() {
        return apiRedirDriverList;
    }

    public void setApiRedirDriverList(String apiRedirDriverList) {
        this.apiRedirDriverList = apiRedirDriverList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsDriverInterfaceRedirection that = (PoliciesPeripheralsDriverInterfaceRedirection) obj;
        return Objects.equals(this.apiRedirDriverList, that.apiRedirDriverList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiRedirDriverList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDriverInterfaceRedirection {\n");
        sb.append("    apiRedirDriverList: ").append(toIndentedString(apiRedirDriverList)).append("\n");
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
