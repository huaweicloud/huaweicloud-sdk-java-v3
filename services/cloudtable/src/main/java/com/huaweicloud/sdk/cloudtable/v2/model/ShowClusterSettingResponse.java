package com.huaweicloud.sdk.cloudtable.v2.model;

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
public class ShowClusterSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parm_status")

    private Integer parmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_info")

    private List<ParameterInfo> parameterInfo = null;

    public ShowClusterSettingResponse withParmStatus(Integer parmStatus) {
        this.parmStatus = parmStatus;
        return this;
    }

    /**
     * 集群参数生效状态：0、未更改 1、未应用 2、应用中 3、已应用 4、应用失败
     * @return parmStatus
     */
    public Integer getParmStatus() {
        return parmStatus;
    }

    public void setParmStatus(Integer parmStatus) {
        this.parmStatus = parmStatus;
    }

    public ShowClusterSettingResponse withParameterInfo(List<ParameterInfo> parameterInfo) {
        this.parameterInfo = parameterInfo;
        return this;
    }

    public ShowClusterSettingResponse addParameterInfoItem(ParameterInfo parameterInfoItem) {
        if (this.parameterInfo == null) {
            this.parameterInfo = new ArrayList<>();
        }
        this.parameterInfo.add(parameterInfoItem);
        return this;
    }

    public ShowClusterSettingResponse withParameterInfo(Consumer<List<ParameterInfo>> parameterInfoSetter) {
        if (this.parameterInfo == null) {
            this.parameterInfo = new ArrayList<>();
        }
        parameterInfoSetter.accept(this.parameterInfo);
        return this;
    }

    /**
     * 参数列表
     * @return parameterInfo
     */
    public List<ParameterInfo> getParameterInfo() {
        return parameterInfo;
    }

    public void setParameterInfo(List<ParameterInfo> parameterInfo) {
        this.parameterInfo = parameterInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClusterSettingResponse showClusterSettingResponse = (ShowClusterSettingResponse) o;
        return Objects.equals(this.parmStatus, showClusterSettingResponse.parmStatus)
            && Objects.equals(this.parameterInfo, showClusterSettingResponse.parameterInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parmStatus, parameterInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterSettingResponse {\n");
        sb.append("    parmStatus: ").append(toIndentedString(parmStatus)).append("\n");
        sb.append("    parameterInfo: ").append(toIndentedString(parameterInfo)).append("\n");
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
